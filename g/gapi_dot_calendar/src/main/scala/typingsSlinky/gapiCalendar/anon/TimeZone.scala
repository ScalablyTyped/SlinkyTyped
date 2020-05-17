package typingsSlinky.gapiCalendar.anon

import typingsSlinky.gapiCalendar.gapi.client.calendar.date
import typingsSlinky.gapiCalendar.gapi.client.calendar.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeZone extends js.Object {
  var date: typingsSlinky.gapiCalendar.gapi.client.calendar.date = js.native
  var dateTime: datetime = js.native
  var timeZone: js.UndefOr[String] = js.native
}

object TimeZone {
  @scala.inline
  def apply(date: date, dateTime: datetime): TimeZone = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZone]
  }
  @scala.inline
  implicit class TimeZoneOps[Self <: TimeZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateTime(value: datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
  }
  
}

