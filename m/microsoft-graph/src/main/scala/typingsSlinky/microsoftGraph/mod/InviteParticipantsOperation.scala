package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteParticipantsOperation extends CommsOperation {
  var participants: js.UndefOr[js.Array[InvitationParticipantInfo]] = js.native
}

object InviteParticipantsOperation {
  @scala.inline
  def apply(): InviteParticipantsOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteParticipantsOperation]
  }
  @scala.inline
  implicit class InviteParticipantsOperationOps[Self <: InviteParticipantsOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParticipants(value: js.Array[InvitationParticipantInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticipants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participants")(js.undefined)
        ret
    }
  }
  
}

