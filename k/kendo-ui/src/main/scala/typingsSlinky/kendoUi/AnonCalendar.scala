package typingsSlinky.kendoUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCalendar extends js.Object {
  var calendar: Anon = js.native
  var calendars: AnonStandard = js.native
  var name: String = js.native
  var numberFormat: AnonCurrency = js.native
}

object AnonCalendar {
  @scala.inline
  def apply(calendar: Anon, calendars: AnonStandard, name: String, numberFormat: AnonCurrency): AnonCalendar = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], calendars = calendars.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalendar]
  }
  @scala.inline
  implicit class AnonCalendarOps[Self <: AnonCalendar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendar(value: Anon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendars(value: AnonStandard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberFormat(value: AnonCurrency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

