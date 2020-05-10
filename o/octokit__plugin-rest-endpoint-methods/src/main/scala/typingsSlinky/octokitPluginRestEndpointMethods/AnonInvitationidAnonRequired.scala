package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInvitationidAnonRequired extends js.Object {
  var invitation_id: AnonRequired = js.native
}

object AnonInvitationidAnonRequired {
  @scala.inline
  def apply(invitation_id: AnonRequired): AnonInvitationidAnonRequired = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInvitationidAnonRequired]
  }
  @scala.inline
  implicit class AnonInvitationidAnonRequiredOps[Self <: AnonInvitationidAnonRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvitation_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitation_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

