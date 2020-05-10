package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactsDic extends js.Object {
  /**
  		 * 账号的头像链接
  		 */
  var avatar: String = js.native
  /**
  		 * 账号的显示名称：也即支付宝设置的备注名称，默认为朋友圈里面的昵称
  		 */
  var displayName: String = js.native
  /**
  		 * 账号对应的手机号码
  		 */
  var mobile: String = js.native
  /**
  		 * 账号的真实姓名
  		 */
  var realName: String = js.native
  /**
  		 * 支付宝账号唯一 userId
  		 */
  var userId: String = js.native
}

object ContactsDic {
  @scala.inline
  def apply(avatar: String, displayName: String, mobile: String, realName: String, userId: String): ContactsDic = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], realName = realName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactsDic]
  }
  @scala.inline
  implicit class ContactsDicOps[Self <: ContactsDic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

