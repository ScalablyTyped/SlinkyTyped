package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersGetGpgKeyResponseEmailsItem extends js.Object {
  var email: String = js.native
  var verified: Boolean = js.native
}

object UsersGetGpgKeyResponseEmailsItem {
  @scala.inline
  def apply(email: String, verified: Boolean): UsersGetGpgKeyResponseEmailsItem = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetGpgKeyResponseEmailsItem]
  }
  @scala.inline
  implicit class UsersGetGpgKeyResponseEmailsItemOps[Self <: UsersGetGpgKeyResponseEmailsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

