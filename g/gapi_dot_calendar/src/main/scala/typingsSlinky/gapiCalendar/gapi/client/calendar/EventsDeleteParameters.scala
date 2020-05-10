package typingsSlinky.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// calendarId: 'primary' or the calendar from which the event to be deleted
// eventId: the event that need to be deleted from calendar (Event.id from the list/insert response)
@js.native
trait EventsDeleteParameters extends js.Object {
  var calendarId: String = js.native
  var eventId: String = js.native
  var sendNotifications: js.UndefOr[Boolean] = js.native
}

object EventsDeleteParameters {
  @scala.inline
  def apply(calendarId: String, eventId: String): EventsDeleteParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsDeleteParameters]
  }
  @scala.inline
  implicit class EventsDeleteParametersOps[Self <: EventsDeleteParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendarId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendNotifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendNotifications")(js.undefined)
        ret
    }
  }
  
}

