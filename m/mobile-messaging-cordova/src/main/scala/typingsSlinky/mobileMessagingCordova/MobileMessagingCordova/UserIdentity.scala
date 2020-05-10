package typingsSlinky.mobileMessagingCordova.MobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserIdentity extends js.Object {
  var emails: js.UndefOr[js.Array[String]] = js.native
  var externalUserId: String = js.native
  var phones: js.UndefOr[js.Array[String]] = js.native
}

object UserIdentity {
  @scala.inline
  def apply(externalUserId: String): UserIdentity = {
    val __obj = js.Dynamic.literal(externalUserId = externalUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentity]
  }
  @scala.inline
  implicit class UserIdentityOps[Self <: UserIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternalUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emails")(js.undefined)
        ret
    }
    @scala.inline
    def withPhones(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phones")(js.undefined)
        ret
    }
  }
  
}

