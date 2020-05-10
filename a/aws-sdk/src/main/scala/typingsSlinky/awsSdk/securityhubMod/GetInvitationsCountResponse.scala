package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInvitationsCountResponse extends js.Object {
  /**
    * The number of all membership invitations sent to this Security Hub member account, not including the currently accepted invitation.
    */
  var InvitationsCount: js.UndefOr[Integer] = js.native
}

object GetInvitationsCountResponse {
  @scala.inline
  def apply(): GetInvitationsCountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInvitationsCountResponse]
  }
  @scala.inline
  implicit class GetInvitationsCountResponseOps[Self <: GetInvitationsCountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvitationsCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitationsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitationsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitationsCount")(js.undefined)
        ret
    }
  }
  
}

