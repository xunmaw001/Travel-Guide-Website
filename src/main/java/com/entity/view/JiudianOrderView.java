package com.entity.view;

import com.entity.JiudianOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 酒店订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-02
 */
@TableName("jiudian_order")
public class JiudianOrderView extends JiudianOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 jiudian
			/**
			* 酒店名称
			*/
			private String jiudianName;
			/**
			* 酒店星级
			*/
			private Integer jiudianTypes;
				/**
				* 酒店星级的值
				*/
				private String jiudianValue;
			/**
			* 酒店位置
			*/
			private String jiudianWeizhi;
			/**
			* 酒店缩略图
			*/
			private String jiudianPhoto;
			/**
			* 酒店每日单价
			*/
			private Integer jiudianNewMoney;
			/**
			* 酒店详情
			*/
			private String jiudianContent;

		//级联表 yonghu
			/**
			* 账户
			*/
			private String username;
			/**
			* 密码
			*/
			private String password;
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String idNumber;
			/**
			* 手机号
			*/
			private String phone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public JiudianOrderView() {

	}

	public JiudianOrderView(JiudianOrderEntity jiudianOrderEntity) {
		try {
			BeanUtils.copyProperties(this, jiudianOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set jiudian
					/**
					* 获取： 酒店名称
					*/
					public String getJiudianName() {
						return jiudianName;
					}
					/**
					* 设置： 酒店名称
					*/
					public void setJiudianName(String jiudianName) {
						this.jiudianName = jiudianName;
					}
					/**
					* 获取： 酒店星级
					*/
					public Integer getJiudianTypes() {
						return jiudianTypes;
					}
					/**
					* 设置： 酒店星级
					*/
					public void setJiudianTypes(Integer jiudianTypes) {
						this.jiudianTypes = jiudianTypes;
					}


						/**
						* 获取： 酒店星级的值
						*/
						public String getJiudianValue() {
							return jiudianValue;
						}
						/**
						* 设置： 酒店星级的值
						*/
						public void setJiudianValue(String jiudianValue) {
							this.jiudianValue = jiudianValue;
						}
					/**
					* 获取： 酒店位置
					*/
					public String getJiudianWeizhi() {
						return jiudianWeizhi;
					}
					/**
					* 设置： 酒店位置
					*/
					public void setJiudianWeizhi(String jiudianWeizhi) {
						this.jiudianWeizhi = jiudianWeizhi;
					}
					/**
					* 获取： 酒店缩略图
					*/
					public String getJiudianPhoto() {
						return jiudianPhoto;
					}
					/**
					* 设置： 酒店缩略图
					*/
					public void setJiudianPhoto(String jiudianPhoto) {
						this.jiudianPhoto = jiudianPhoto;
					}
					/**
					* 获取： 酒店每日单价
					*/
					public Integer getJiudianNewMoney() {
						return jiudianNewMoney;
					}
					/**
					* 设置： 酒店每日单价
					*/
					public void setJiudianNewMoney(Integer jiudianNewMoney) {
						this.jiudianNewMoney = jiudianNewMoney;
					}
					/**
					* 获取： 酒店详情
					*/
					public String getJiudianContent() {
						return jiudianContent;
					}
					/**
					* 设置： 酒店详情
					*/
					public void setJiudianContent(String jiudianContent) {
						this.jiudianContent = jiudianContent;
					}



















				//级联表的get和set yonghu
					/**
					* 获取： 账户
					*/
					public String getUsername() {
						return username;
					}
					/**
					* 设置： 账户
					*/
					public void setUsername(String username) {
						this.username = username;
					}
					/**
					* 获取： 密码
					*/
					public String getPassword() {
						return password;
					}
					/**
					* 设置： 密码
					*/
					public void setPassword(String password) {
						this.password = password;
					}
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getIdNumber() {
						return idNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setIdNumber(String idNumber) {
						this.idNumber = idNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getPhone() {
						return phone;
					}
					/**
					* 设置： 手机号
					*/
					public void setPhone(String phone) {
						this.phone = phone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}



}
