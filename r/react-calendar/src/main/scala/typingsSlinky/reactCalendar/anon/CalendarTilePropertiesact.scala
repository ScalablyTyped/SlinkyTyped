package typingsSlinky.reactCalendar.anon

import typingsSlinky.reactCalendar.mod.Detail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-calendar.react-calendar.CalendarTileProperties & {  activeStartDate  :std.Date} */
@js.native
trait CalendarTilePropertiesact extends js.Object {
  var activeStartDate: js.Date = js.native
  var date: js.Date = js.native
  var view: Detail = js.native
}

object CalendarTilePropertiesact {
  @scala.inline
  def apply(activeStartDate: js.Date, date: js.Date, view: Detail): CalendarTilePropertiesact = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarTilePropertiesact]
  }
  @scala.inline
  implicit class CalendarTilePropertiesactOps[Self <: CalendarTilePropertiesact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: Detail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

