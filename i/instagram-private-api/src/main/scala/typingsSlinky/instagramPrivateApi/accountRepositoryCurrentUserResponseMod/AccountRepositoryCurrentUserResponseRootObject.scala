package typingsSlinky.instagramPrivateApi.accountRepositoryCurrentUserResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRepositoryCurrentUserResponseRootObject extends js.Object {
  var status: String = js.native
  var user: AccountRepositoryCurrentUserResponseUser = js.native
}

object AccountRepositoryCurrentUserResponseRootObject {
  @scala.inline
  def apply(status: String, user: AccountRepositoryCurrentUserResponseUser): AccountRepositoryCurrentUserResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRepositoryCurrentUserResponseRootObject]
  }
  @scala.inline
  implicit class AccountRepositoryCurrentUserResponseRootObjectOps[Self <: AccountRepositoryCurrentUserResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: AccountRepositoryCurrentUserResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

