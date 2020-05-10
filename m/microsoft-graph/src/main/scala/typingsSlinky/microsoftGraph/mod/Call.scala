package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Call extends Entity {
  var callbackUri: js.UndefOr[String] = js.native
  var chatInfo: js.UndefOr[ChatInfo] = js.native
  var direction: js.UndefOr[CallDirection] = js.native
  var mediaConfig: js.UndefOr[MediaConfig] = js.native
  var mediaState: js.UndefOr[CallMediaState] = js.native
  var meetingInfo: js.UndefOr[MeetingInfo] = js.native
  var myParticipantId: js.UndefOr[String] = js.native
  var operations: js.UndefOr[js.Array[CommsOperation]] = js.native
  var participants: js.UndefOr[js.Array[Participant]] = js.native
  var requestedModalities: js.UndefOr[js.Array[Modality]] = js.native
  var resultInfo: js.UndefOr[ResultInfo] = js.native
  var source: js.UndefOr[ParticipantInfo] = js.native
  var state: js.UndefOr[CallState] = js.native
  var subject: js.UndefOr[String] = js.native
  var targets: js.UndefOr[js.Array[ParticipantInfo]] = js.native
  var tenantId: js.UndefOr[String] = js.native
  var toneInfo: js.UndefOr[ToneInfo] = js.native
}

object Call {
  @scala.inline
  def apply(): Call = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Call]
  }
  @scala.inline
  implicit class CallOps[Self <: Call] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackUri")(js.undefined)
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
    def withDirection(value: CallDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaConfig(value: MediaConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaState(value: CallMediaState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaState")(js.undefined)
        ret
    }
    @scala.inline
    def withMeetingInfo(value: MeetingInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meetingInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeetingInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meetingInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withMyParticipantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("myParticipantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMyParticipantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("myParticipantId")(js.undefined)
        ret
    }
    @scala.inline
    def withOperations(value: js.Array[CommsOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
        ret
    }
    @scala.inline
    def withParticipants(value: js.Array[Participant]): Self = {
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
    def withRequestedModalities(value: js.Array[Modality]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedModalities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedModalities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedModalities")(js.undefined)
        ret
    }
    @scala.inline
    def withResultInfo(value: ResultInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: ParticipantInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: CallState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
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
    def withTargets(value: js.Array[ParticipantInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
    @scala.inline
    def withTenantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(js.undefined)
        ret
    }
    @scala.inline
    def withToneInfo(value: ToneInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toneInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToneInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toneInfo")(js.undefined)
        ret
    }
  }
  
}

