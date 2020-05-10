package typingsSlinky.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectResourceShareInvitationResponse extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * Information about the invitation.
    */
  var resourceShareInvitation: js.UndefOr[ResourceShareInvitation] = js.native
}

object RejectResourceShareInvitationResponse {
  @scala.inline
  def apply(): RejectResourceShareInvitationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectResourceShareInvitationResponse]
  }
  @scala.inline
  implicit class RejectResourceShareInvitationResponseOps[Self <: RejectResourceShareInvitationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceShareInvitation(value: ResourceShareInvitation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareInvitation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceShareInvitation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareInvitation")(js.undefined)
        ret
    }
  }
  
}

