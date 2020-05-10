package typingsSlinky.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsRemoveMemberRequest extends js.Object {
  /** Fully-qualified URLs of the User resources to remove. */
  var users: js.UndefOr[js.Array[String]] = js.native
}

object GroupsRemoveMemberRequest {
  @scala.inline
  def apply(): GroupsRemoveMemberRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupsRemoveMemberRequest]
  }
  @scala.inline
  implicit class GroupsRemoveMemberRequestOps[Self <: GroupsRemoveMemberRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(js.undefined)
        ret
    }
  }
  
}

