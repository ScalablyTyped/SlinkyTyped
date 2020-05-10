package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAttendeeRequest extends js.Object {
  /**
    * The Amazon Chime SDK attendee ID.
    */
  var AttendeeId: GuidString = js.native
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString = js.native
}

object GetAttendeeRequest {
  @scala.inline
  def apply(AttendeeId: GuidString, MeetingId: GuidString): GetAttendeeRequest = {
    val __obj = js.Dynamic.literal(AttendeeId = AttendeeId.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttendeeRequest]
  }
  @scala.inline
  implicit class GetAttendeeRequestOps[Self <: GetAttendeeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttendeeId(value: GuidString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttendeeId")(value.asInstanceOf[js.Any])
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

