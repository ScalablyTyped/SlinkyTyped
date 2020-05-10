package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAttendeeRequest extends js.Object {
  /**
    * The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
    */
  var ExternalUserId: ExternalUserIdType = js.native
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString = js.native
}

object CreateAttendeeRequest {
  @scala.inline
  def apply(ExternalUserId: ExternalUserIdType, MeetingId: GuidString): CreateAttendeeRequest = {
    val __obj = js.Dynamic.literal(ExternalUserId = ExternalUserId.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAttendeeRequest]
  }
  @scala.inline
  implicit class CreateAttendeeRequestOps[Self <: CreateAttendeeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternalUserId(value: ExternalUserIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeetingId(value: GuidString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeetingId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

