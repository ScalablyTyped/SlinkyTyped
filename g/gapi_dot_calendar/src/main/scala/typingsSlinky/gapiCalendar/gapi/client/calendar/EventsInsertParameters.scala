package typingsSlinky.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsInsertParameters extends js.Object {
  var calendarId: String = js.native
  var maxAttendees: js.UndefOr[integer] = js.native
  // Event resource
  var resource: EventInput = js.native
  var sendNotifications: js.UndefOr[Boolean] = js.native
  var supportsAttachments: js.UndefOr[Boolean] = js.native
}

object EventsInsertParameters {
  @scala.inline
  def apply(calendarId: String, resource: EventInput): EventsInsertParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsInsertParameters]
  }
  @scala.inline
  implicit class EventsInsertParametersOps[Self <: EventsInsertParameters] (val x: Self) extends AnyVal {
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
    def withResource(value: EventInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxAttendees(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttendees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAttendees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttendees")(js.undefined)
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
    @scala.inline
    def withSupportsAttachments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsAttachments")(js.undefined)
        ret
    }
  }
  
}

