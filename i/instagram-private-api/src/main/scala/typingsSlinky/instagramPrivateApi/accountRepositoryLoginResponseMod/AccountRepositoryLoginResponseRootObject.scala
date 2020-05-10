package typingsSlinky.instagramPrivateApi.accountRepositoryLoginResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRepositoryLoginResponseRootObject extends js.Object {
  var logged_in_user: AccountRepositoryLoginResponseLoggedInUser = js.native
  var status: String = js.native
}

object AccountRepositoryLoginResponseRootObject {
  @scala.inline
  def apply(logged_in_user: AccountRepositoryLoginResponseLoggedInUser, status: String): AccountRepositoryLoginResponseRootObject = {
    val __obj = js.Dynamic.literal(logged_in_user = logged_in_user.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRepositoryLoginResponseRootObject]
  }
  @scala.inline
  implicit class AccountRepositoryLoginResponseRootObjectOps[Self <: AccountRepositoryLoginResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogged_in_user(value: AccountRepositoryLoginResponseLoggedInUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logged_in_user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

