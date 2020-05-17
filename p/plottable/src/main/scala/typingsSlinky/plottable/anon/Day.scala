package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.day
import typingsSlinky.plottable.plottableStrings.hour
import typingsSlinky.plottable.plottableStrings.minute
import typingsSlinky.plottable.plottableStrings.month
import typingsSlinky.plottable.plottableStrings.second
import typingsSlinky.plottable.plottableStrings.week
import typingsSlinky.plottable.plottableStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Day extends js.Object {
  var day: typingsSlinky.plottable.plottableStrings.day = js.native
  var hour: typingsSlinky.plottable.plottableStrings.hour = js.native
  var minute: typingsSlinky.plottable.plottableStrings.minute = js.native
  var month: typingsSlinky.plottable.plottableStrings.month = js.native
  var second: typingsSlinky.plottable.plottableStrings.second = js.native
  var week: typingsSlinky.plottable.plottableStrings.week = js.native
  var year: typingsSlinky.plottable.plottableStrings.year = js.native
}

object Day {
  @scala.inline
  def apply(day: day, hour: hour, minute: minute, month: month, second: second, week: week, year: year): Day = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Day]
  }
  @scala.inline
  implicit class DayOps[Self <: Day] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: day): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHour(value: hour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinute(value: minute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: month): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond(value: second): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeek(value: week): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYear(value: year): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

