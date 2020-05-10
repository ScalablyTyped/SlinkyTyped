package typingsSlinky.angularBootstrapCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCalendarDayView extends js.Object {
  var calendarDayView: String = js.native
  var calendarHourList: String = js.native
  var calendarMonthCell: String = js.native
  var calendarMonthCellEvents: String = js.native
  var calendarMonthView: String = js.native
  var calendarSlideBox: String = js.native
  var calendarWeekView: String = js.native
  var calendarYearView: String = js.native
}

object AnonCalendarDayView {
  @scala.inline
  def apply(
    calendarDayView: String,
    calendarHourList: String,
    calendarMonthCell: String,
    calendarMonthCellEvents: String,
    calendarMonthView: String,
    calendarSlideBox: String,
    calendarWeekView: String,
    calendarYearView: String
  ): AnonCalendarDayView = {
    val __obj = js.Dynamic.literal(calendarDayView = calendarDayView.asInstanceOf[js.Any], calendarHourList = calendarHourList.asInstanceOf[js.Any], calendarMonthCell = calendarMonthCell.asInstanceOf[js.Any], calendarMonthCellEvents = calendarMonthCellEvents.asInstanceOf[js.Any], calendarMonthView = calendarMonthView.asInstanceOf[js.Any], calendarSlideBox = calendarSlideBox.asInstanceOf[js.Any], calendarWeekView = calendarWeekView.asInstanceOf[js.Any], calendarYearView = calendarYearView.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalendarDayView]
  }
  @scala.inline
  implicit class AnonCalendarDayViewOps[Self <: AnonCalendarDayView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendarDayView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarDayView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarHourList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarHourList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarMonthCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarMonthCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarMonthCellEvents(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarMonthCellEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarMonthView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarMonthView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarSlideBox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarSlideBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarWeekView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarWeekView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarYearView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarYearView")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

