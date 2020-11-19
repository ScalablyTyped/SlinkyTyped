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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDay(value: day): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour(value: hour): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: minute): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: month): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: second): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeek(value: week): Self = this.set("week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: year): Self = this.set("year", value.asInstanceOf[js.Any])
  }
}
