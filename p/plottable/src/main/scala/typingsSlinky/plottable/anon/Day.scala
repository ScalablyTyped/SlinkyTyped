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

trait Day extends js.Object {
  var day: typingsSlinky.plottable.plottableStrings.day
  var hour: typingsSlinky.plottable.plottableStrings.hour
  var minute: typingsSlinky.plottable.plottableStrings.minute
  var month: typingsSlinky.plottable.plottableStrings.month
  var second: typingsSlinky.plottable.plottableStrings.second
  var week: typingsSlinky.plottable.plottableStrings.week
  var year: typingsSlinky.plottable.plottableStrings.year
}

object Day {
  @scala.inline
  def apply(day: day, hour: hour, minute: minute, month: month, second: second, week: week, year: year): Day = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Day]
  }
}

