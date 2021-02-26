package typingsSlinky.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 登录授权用户信息
  * 用于保存登录授权用户的信息。
  *     此对象仅定义标准属性，登录授权认证服务可扩展自定义数据。
  *     例如“微信”登录授权服务，可能包括以下自定义数据：
  *     privilege - 用户特权信息，json数组，如微信沃卡用户为（chinaunicom）；
  *     unionid - 用户统一标识，针对一个微信开放平台帐号下的应用，同一用户的unionid是唯一的。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
  */
@js.native
trait PlusOauthUserInfo extends StObject {
  
  /**
    * 登录授权用户注册的城市信息
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var city: js.UndefOr[String] = js.native
  
  /**
    * 登录授权用户注册的国家信息
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * 登录授权用户的邮箱地址
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * 登录授权用户的头像图片地址
    * 要求为"http://"或"https://"开头的地址，如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var headimgurl: js.UndefOr[String] = js.native
  
  /**
    * 登录授权用户的昵称
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var nickname: js.UndefOr[String] = js.native
  
  /**
    * 登录授权用户的唯一标识
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var openid: js.UndefOr[String] = js.native
  
  /**
    * 登录授权用户的电话号码
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var phonenumber: js.UndefOr[String] = js.native
  
  /**
    * 登录授权用户注册的省份信息
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var province: js.UndefOr[String] = js.native
  
  /**
    * 登录授权用户的性别
    * 1为男性，2为女性。
    *     如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var sex: js.UndefOr[String] = js.native
}
object PlusOauthUserInfo {
  
  @scala.inline
  def apply(): PlusOauthUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusOauthUserInfo]
  }
  
  @scala.inline
  implicit class PlusOauthUserInfoMutableBuilder[Self <: PlusOauthUserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setHeadimgurl(value: String): Self = StObject.set(x, "headimgurl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadimgurlUndefined: Self = StObject.set(x, "headimgurl", js.undefined)
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    @scala.inline
    def setOpenid(value: String): Self = StObject.set(x, "openid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenidUndefined: Self = StObject.set(x, "openid", js.undefined)
    
    @scala.inline
    def setPhonenumber(value: String): Self = StObject.set(x, "phonenumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhonenumberUndefined: Self = StObject.set(x, "phonenumber", js.undefined)
    
    @scala.inline
    def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvinceUndefined: Self = StObject.set(x, "province", js.undefined)
    
    @scala.inline
    def setSex(value: String): Self = StObject.set(x, "sex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSexUndefined: Self = StObject.set(x, "sex", js.undefined)
  }
}
