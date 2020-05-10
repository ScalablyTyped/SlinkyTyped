package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMessage extends Message {
  /**
    * The event associated with the event message. The assumption for attendees or room resources is that the Calendar
    * Attendant is set to automatically update the calendar with an event when meeting request event messages arrive.
    * Navigation property. Read-only.
    */
  var event: js.UndefOr[Event] = js.native
  /**
    * The type of event message: none, meetingRequest, meetingCancelled, meetingAccepted, meetingTenativelyAccepted,
    * meetingDeclined.
    */
  var meetingMessageType: js.UndefOr[MeetingMessageType] = js.native
}

object EventMessage {
  @scala.inline
  def apply(): EventMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventMessage]
  }
  @scala.inline
  implicit class EventMessageOps[Self <: EventMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withMeetingMessageType(value: MeetingMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meetingMessageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeetingMessageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meetingMessageType")(js.undefined)
        ret
    }
  }
  
}

