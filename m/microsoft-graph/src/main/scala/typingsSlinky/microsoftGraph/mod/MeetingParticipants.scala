package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeetingParticipants extends js.Object {
  var attendees: js.UndefOr[js.Array[MeetingParticipantInfo]] = js.native
  var organizer: js.UndefOr[MeetingParticipantInfo] = js.native
}

object MeetingParticipants {
  @scala.inline
  def apply(): MeetingParticipants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingParticipants]
  }
  @scala.inline
  implicit class MeetingParticipantsOps[Self <: MeetingParticipants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttendees(value: js.Array[MeetingParticipantInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attendees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttendees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attendees")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizer(value: MeetingParticipantInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizer")(js.undefined)
        ret
    }
  }
  
}

