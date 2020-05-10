package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectInvitationInput extends js.Object {
  /**
    * The unique identifier of the invitation to reject.
    */
  var InvitationId: ResourceIdString = js.native
}

object RejectInvitationInput {
  @scala.inline
  def apply(InvitationId: ResourceIdString): RejectInvitationInput = {
    val __obj = js.Dynamic.literal(InvitationId = InvitationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectInvitationInput]
  }
  @scala.inline
  implicit class RejectInvitationInputOps[Self <: RejectInvitationInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvitationId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

