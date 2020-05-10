package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnlineMeeting extends Entity {
  var audioConferencing: js.UndefOr[AudioConferencing] = js.native
  var chatInfo: js.UndefOr[ChatInfo] = js.native
  var creationDateTime: js.UndefOr[String] = js.native
  var endDateTime: js.UndefOr[String] = js.native
  var joinUrl: js.UndefOr[String] = js.native
  var participants: js.UndefOr[MeetingParticipants] = js.native
  var startDateTime: js.UndefOr[String] = js.native
  var subject: js.UndefOr[String] = js.native
  var videoTeleconferenceId: js.UndefOr[String] = js.native
}

object OnlineMeeting {
  @scala.inline
  def apply(): OnlineMeeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlineMeeting]
  }
  @scala.inline
  implicit class OnlineMeetingOps[Self <: OnlineMeeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioConferencing(value: AudioConferencing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioConferencing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioConferencing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioConferencing")(js.undefined)
        ret
    }
    @scala.inline
    def withChatInfo(value: ChatInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chatInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChatInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chatInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withJoinUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoinUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withParticipants(value: MeetingParticipants): Self = {
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
    @scala.inline
    def withStartDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoTeleconferenceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoTeleconferenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoTeleconferenceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoTeleconferenceId")(js.undefined)
        ret
    }
  }
  
}

