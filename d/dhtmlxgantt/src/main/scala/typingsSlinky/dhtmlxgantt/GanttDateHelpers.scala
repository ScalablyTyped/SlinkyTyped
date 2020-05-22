package typingsSlinky.dhtmlxgantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttDateHelpers extends js.Object {
  def add(origin: js.Date, count: Double, unit: String): js.Date
  def convert_to_utc(origin: js.Date): js.Date
  def copy(origin: js.Date): js.Date
  def date_part(origin: js.Date): js.Date
  def date_to_str(format: String): js.Any
  def day_start(origin: js.Date): js.Date
  def getISOWeek(origin: js.Date): Double
  def getUTCISOWeek(origin: js.Date): Double
  def month_start(origin: js.Date): js.Date
  def str_to_date(format: String): js.Any
  def time_part(origin: js.Date): js.Date
  def to_fixed(value: Double): String
  def week_start(origin: js.Date): js.Date
  def year_start(origin: js.Date): js.Date
}

object GanttDateHelpers {
  @scala.inline
  def apply(
    add: (js.Date, Double, String) => js.Date,
    convert_to_utc: js.Date => js.Date,
    copy: js.Date => js.Date,
    date_part: js.Date => js.Date,
    date_to_str: String => js.Any,
    day_start: js.Date => js.Date,
    getISOWeek: js.Date => Double,
    getUTCISOWeek: js.Date => Double,
    month_start: js.Date => js.Date,
    str_to_date: String => js.Any,
    time_part: js.Date => js.Date,
    to_fixed: Double => String,
    week_start: js.Date => js.Date,
    year_start: js.Date => js.Date
  ): GanttDateHelpers = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), convert_to_utc = js.Any.fromFunction1(convert_to_utc), copy = js.Any.fromFunction1(copy), date_part = js.Any.fromFunction1(date_part), date_to_str = js.Any.fromFunction1(date_to_str), day_start = js.Any.fromFunction1(day_start), getISOWeek = js.Any.fromFunction1(getISOWeek), getUTCISOWeek = js.Any.fromFunction1(getUTCISOWeek), month_start = js.Any.fromFunction1(month_start), str_to_date = js.Any.fromFunction1(str_to_date), time_part = js.Any.fromFunction1(time_part), to_fixed = js.Any.fromFunction1(to_fixed), week_start = js.Any.fromFunction1(week_start), year_start = js.Any.fromFunction1(year_start))
    __obj.asInstanceOf[GanttDateHelpers]
  }
}

