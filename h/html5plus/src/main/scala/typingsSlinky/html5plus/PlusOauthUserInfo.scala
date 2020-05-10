package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 登录授权用户信息
  * 用于保存登录授权用户的信息。
  * 	此对象仅定义标准属性，登录授权认证服务可扩展自定义数据。
  * 	例如“微信”登录授权服务，可能包括以下自定义数据：
  * 	privilege - 用户特权信息，json数组，如微信沃卡用户为（chinaunicom）；
  * 	unionid - 用户统一标识，针对一个微信开放平台帐号下的应用，同一用户的unionid是唯一的。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
  */
@js.native
trait PlusOauthUserInfo extends js.Object {
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
    * 	如果登录授权服务不支持此属性，则返回"undefined"。
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
  implicit class PlusOauthUserInfoOps[Self <: PlusOauthUserInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadimgurl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headimgurl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadimgurl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headimgurl")(js.undefined)
        ret
    }
    @scala.inline
    def withNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNickname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openid")(js.undefined)
        ret
    }
    @scala.inline
    def withPhonenumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phonenumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhonenumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phonenumber")(js.undefined)
        ret
    }
    @scala.inline
    def withProvince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(js.undefined)
        ret
    }
    @scala.inline
    def withSex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sex")(js.undefined)
        ret
    }
  }
  
}

