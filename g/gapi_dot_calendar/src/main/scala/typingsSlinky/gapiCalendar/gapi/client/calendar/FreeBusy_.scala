package typingsSlinky.gapiCalendar.gapi.client.calendar

import typingsSlinky.gapiCalendar.AnonBusy
import typingsSlinky.gapiCalendar.AnonCalendars
import typingsSlinky.gapiCalendar.gapiCalendarStrings.calendarNumbersignfreeBusy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeBusy_ extends js.Object {
  var kind: calendarNumbersignfreeBusy = js.native
  var timeMax: datetime = js.native
  var timeMin: datetime = js.native
  def calendars(key: String): AnonBusy = js.native
  def groups(key: String): AnonCalendars = js.native
}

object FreeBusy_ {
  @scala.inline
  def apply(
    calendars: String => AnonBusy,
    groups: String => AnonCalendars,
    kind: calendarNumbersignfreeBusy,
    timeMax: datetime,
    timeMin: datetime
  ): FreeBusy_ = {
    val __obj = js.Dynamic.literal(calendars = js.Any.fromFunction1(calendars), groups = js.Any.fromFunction1(groups), kind = kind.asInstanceOf[js.Any], timeMax = timeMax.asInstanceOf[js.Any], timeMin = timeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusy_]
  }
  @scala.inline
  implicit class FreeBusy_Ops[Self <: FreeBusy_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendars(value: String => AnonBusy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendars")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroups(value: String => AnonCalendars): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKind(value: calendarNumbersignfreeBusy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeMax(value: datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeMin(value: datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

