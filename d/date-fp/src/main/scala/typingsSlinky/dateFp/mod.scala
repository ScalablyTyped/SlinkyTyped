package typingsSlinky.dateFp

import typingsSlinky.dateFp.dateFpStrings.date
import typingsSlinky.dateFp.dateFpStrings.day
import typingsSlinky.dateFp.dateFpStrings.days
import typingsSlinky.dateFp.dateFpStrings.hours
import typingsSlinky.dateFp.dateFpStrings.milliseconds
import typingsSlinky.dateFp.dateFpStrings.minutes
import typingsSlinky.dateFp.dateFpStrings.month
import typingsSlinky.dateFp.dateFpStrings.months
import typingsSlinky.dateFp.dateFpStrings.seconds
import typingsSlinky.dateFp.dateFpStrings.week
import typingsSlinky.dateFp.dateFpStrings.year
import typingsSlinky.dateFp.dateFpStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fp", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @JSName("add")
  def add_days(unit: days, value: Double, date: js.Date): js.Date = js.native
  @JSName("add")
  def add_hours(unit: hours, value: Double, date: js.Date): js.Date = js.native
  @JSName("add")
  def add_milliseconds(unit: milliseconds, value: Double, date: js.Date): js.Date = js.native
  @JSName("add")
  def add_minutes(unit: minutes, value: Double, date: js.Date): js.Date = js.native
  @JSName("add")
  def add_months(unit: months, value: Double, date: js.Date): js.Date = js.native
  @JSName("add")
  def add_seconds(unit: seconds, value: Double, date: js.Date): js.Date = js.native
  @JSName("add")
  def add_years(unit: years, value: Double, date: js.Date): js.Date = js.native
  def clone(date: js.Date): js.Date = js.native
  @JSName("convertTo")
  def convertTo_days(unit: days, date: js.Date): Double = js.native
  @JSName("convertTo")
  def convertTo_hours(unit: hours, date: js.Date): Double = js.native
  @JSName("convertTo")
  def convertTo_milliseconds(unit: milliseconds, date: js.Date): Double = js.native
  @JSName("convertTo")
  def convertTo_minutes(unit: minutes, date: js.Date): Double = js.native
  @JSName("convertTo")
  def convertTo_seconds(unit: seconds, date: js.Date): Double = js.native
  @JSName("diff")
  def diff_days(unit: days, a: js.Date, b: js.Date): Double = js.native
  @JSName("diff")
  def diff_hours(unit: hours, a: js.Date, b: js.Date): Double = js.native
  @JSName("diff")
  def diff_milliseconds(unit: milliseconds, a: js.Date, b: js.Date): Double = js.native
  @JSName("diff")
  def diff_minutes(unit: minutes, a: js.Date, b: js.Date): Double = js.native
  @JSName("diff")
  def diff_months(unit: months, a: js.Date, b: js.Date): Double = js.native
  @JSName("diff")
  def diff_seconds(unit: seconds, a: js.Date, b: js.Date): Double = js.native
  @JSName("diff")
  def diff_years(unit: years, a: js.Date, b: js.Date): Double = js.native
  def equals(a: js.Date, b: js.Date): Boolean = js.native
  def format(format: String, date: js.Date): String = js.native
  def fromTime(time: Double): js.Date = js.native
  @JSName("get")
  def get_date(property: date, date: js.Date): Double = js.native
  @JSName("get")
  def get_day(property: day, date: js.Date): Double = js.native
  @JSName("get")
  def get_hours(property: hours, date: js.Date): Double = js.native
  @JSName("get")
  def get_milliseconds(property: milliseconds, date: js.Date): Double = js.native
  @JSName("get")
  def get_minutes(property: minutes, date: js.Date): Double = js.native
  @JSName("get")
  def get_month(property: month, date: js.Date): Double = js.native
  @JSName("get")
  def get_seconds(property: seconds, date: js.Date): Double = js.native
  @JSName("get")
  def get_week(property: week, date: js.Date): Double = js.native
  @JSName("get")
  def get_year(property: year, date: js.Date): Double = js.native
  def isLeapYear(date: js.Date): Boolean = js.native
  def isValid(date: js.Date): Boolean = js.native
  def max(dates: js.Array[js.Date]): js.Date = js.native
  def min(dates: js.Array[js.Date]): js.Date = js.native
  def of(dateParts: js.Array[Double]): js.Date = js.native
  def parse(format: String, date: String): js.Date = js.native
  @JSName("set")
  def set_date(property: date, value: Double, date: js.Date): js.Date = js.native
  @JSName("set")
  def set_hours(property: hours, value: Double, date: js.Date): js.Date = js.native
  @JSName("set")
  def set_milliseconds(property: milliseconds, value: Double, date: js.Date): js.Date = js.native
  @JSName("set")
  def set_minutes(property: minutes, value: Double, date: js.Date): js.Date = js.native
  @JSName("set")
  def set_month(property: month, value: Double, date: js.Date): js.Date = js.native
  @JSName("set")
  def set_seconds(property: seconds, value: Double, date: js.Date): js.Date = js.native
  @JSName("set")
  def set_week(property: week, value: Double, date: js.Date): js.Date = js.native
  @JSName("set")
  def set_year(property: year, value: Double, date: js.Date): js.Date = js.native
  @JSName("sub")
  def sub_days(unit: days, value: Double, date: js.Date): js.Date = js.native
  @JSName("sub")
  def sub_hours(unit: hours, value: Double, date: js.Date): js.Date = js.native
  @JSName("sub")
  def sub_milliseconds(unit: milliseconds, value: Double, date: js.Date): js.Date = js.native
  @JSName("sub")
  def sub_minutes(unit: minutes, value: Double, date: js.Date): js.Date = js.native
  @JSName("sub")
  def sub_months(unit: months, value: Double, date: js.Date): js.Date = js.native
  @JSName("sub")
  def sub_seconds(unit: seconds, value: Double, date: js.Date): js.Date = js.native
  @JSName("sub")
  def sub_years(unit: years, value: Double, date: js.Date): js.Date = js.native
  def unixTime(date: js.Date): Double = js.native
}

