package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateAttendeeRequest extends js.Object {
  /**
    * The request containing the attendees to create.
    */
  var Attendees: CreateAttendeeRequestItemList = js.native
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString = js.native
}

object BatchCreateAttendeeRequest {
  @scala.inline
  def apply(Attendees: CreateAttendeeRequestItemList, MeetingId: GuidString): BatchCreateAttendeeRequest = {
    val __obj = js.Dynamic.literal(Attendees = Attendees.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateAttendeeRequest]
  }
  @scala.inline
  implicit class BatchCreateAttendeeRequestOps[Self <: BatchCreateAttendeeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttendees(value: CreateAttendeeRequestItemList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attendees")(value.asInstanceOf[js.Any])
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

