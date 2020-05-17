package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvitationidRequired extends js.Object {
  var invitation_id: Required = js.native
}

object InvitationidRequired {
  @scala.inline
  def apply(invitation_id: Required): InvitationidRequired = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvitationidRequired]
  }
  @scala.inline
  implicit class InvitationidRequiredOps[Self <: InvitationidRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvitation_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitation_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

