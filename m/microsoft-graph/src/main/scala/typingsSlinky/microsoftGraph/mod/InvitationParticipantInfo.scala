package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvitationParticipantInfo extends ParticipantInfo {
  var replacesCallId: js.UndefOr[String] = js.native
}

object InvitationParticipantInfo {
  @scala.inline
  def apply(): InvitationParticipantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationParticipantInfo]
  }
  @scala.inline
  implicit class InvitationParticipantInfoOps[Self <: InvitationParticipantInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplacesCallId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacesCallId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacesCallId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacesCallId")(js.undefined)
        ret
    }
  }
  
}

