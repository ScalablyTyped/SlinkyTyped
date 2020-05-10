package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteUsersResponse extends js.Object {
  /**
    * The email invitation details.
    */
  var Invites: js.UndefOr[InviteList] = js.native
}

object InviteUsersResponse {
  @scala.inline
  def apply(): InviteUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteUsersResponse]
  }
  @scala.inline
  implicit class InviteUsersResponseOps[Self <: InviteUsersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvites(value: InviteList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Invites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Invites")(js.undefined)
        ret
    }
  }
  
}

