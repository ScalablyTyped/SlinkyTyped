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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("date-fp", "add")
  @js.native
  def add_days(unit: days, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "add")
  @js.native
  def add_hours(unit: hours, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "add")
  @js.native
  def add_milliseconds(unit: milliseconds, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "add")
  @js.native
  def add_minutes(unit: minutes, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "add")
  @js.native
  def add_months(unit: months, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "add")
  @js.native
  def add_seconds(unit: seconds, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "add")
  @js.native
  def add_years(unit: years, value: Double, date: js.Date): js.Date = js.native
  
  @JSImport("date-fp", "clone")
  @js.native
  def clone_(date: js.Date): js.Date = js.native
  
  @JSImport("date-fp", "convertTo")
  @js.native
  def convertTo_days(unit: days, date: js.Date): Double = js.native
  @JSImport("date-fp", "convertTo")
  @js.native
  def convertTo_hours(unit: hours, date: js.Date): Double = js.native
  @JSImport("date-fp", "convertTo")
  @js.native
  def convertTo_milliseconds(unit: milliseconds, date: js.Date): Double = js.native
  @JSImport("date-fp", "convertTo")
  @js.native
  def convertTo_minutes(unit: minutes, date: js.Date): Double = js.native
  @JSImport("date-fp", "convertTo")
  @js.native
  def convertTo_seconds(unit: seconds, date: js.Date): Double = js.native
  
  @JSImport("date-fp", "diff")
  @js.native
  def diff_days(unit: days, a: js.Date, b: js.Date): Double = js.native
  @JSImport("date-fp", "diff")
  @js.native
  def diff_hours(unit: hours, a: js.Date, b: js.Date): Double = js.native
  @JSImport("date-fp", "diff")
  @js.native
  def diff_milliseconds(unit: milliseconds, a: js.Date, b: js.Date): Double = js.native
  @JSImport("date-fp", "diff")
  @js.native
  def diff_minutes(unit: minutes, a: js.Date, b: js.Date): Double = js.native
  @JSImport("date-fp", "diff")
  @js.native
  def diff_months(unit: months, a: js.Date, b: js.Date): Double = js.native
  @JSImport("date-fp", "diff")
  @js.native
  def diff_seconds(unit: seconds, a: js.Date, b: js.Date): Double = js.native
  @JSImport("date-fp", "diff")
  @js.native
  def diff_years(unit: years, a: js.Date, b: js.Date): Double = js.native
  
  @JSImport("date-fp", "equals")
  @js.native
  def equals_(a: js.Date, b: js.Date): Boolean = js.native
  
  @JSImport("date-fp", "format")
  @js.native
  def format(format: String, date: js.Date): String = js.native
  
  @JSImport("date-fp", "fromTime")
  @js.native
  def fromTime(time: Double): js.Date = js.native
  
  @JSImport("date-fp", "get")
  @js.native
  def get_date(property: date, date: js.Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_day(property: day, date: js.Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_hours(property: hours, date: js.Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_milliseconds(property: milliseconds, date: js.Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_minutes(property: minutes, date: js.Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_month(property: month, date: js.Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_seconds(property: seconds, date: js.Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_week(property: week, date: js.Date): Double = js.native
  @JSImport("date-fp", "get")
  @js.native
  def get_year(property: year, date: js.Date): Double = js.native
  
  @JSImport("date-fp", "isLeapYear")
  @js.native
  def isLeapYear(date: js.Date): Boolean = js.native
  
  @JSImport("date-fp", "isValid")
  @js.native
  def isValid(date: js.Date): Boolean = js.native
  
  @JSImport("date-fp", "max")
  @js.native
  def max(dates: js.Array[js.Date]): js.Date = js.native
  
  @JSImport("date-fp", "min")
  @js.native
  def min(dates: js.Array[js.Date]): js.Date = js.native
  
  @JSImport("date-fp", "of")
  @js.native
  def of(dateParts: js.Array[Double]): js.Date = js.native
  
  @JSImport("date-fp", "parse")
  @js.native
  def parse(format: String, date: String): js.Date = js.native
  
  @JSImport("date-fp", "set")
  @js.native
  def set_date(property: date, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "set")
  @js.native
  def set_hours(property: hours, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "set")
  @js.native
  def set_milliseconds(property: milliseconds, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "set")
  @js.native
  def set_minutes(property: minutes, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "set")
  @js.native
  def set_month(property: month, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "set")
  @js.native
  def set_seconds(property: seconds, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "set")
  @js.native
  def set_week(property: week, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "set")
  @js.native
  def set_year(property: year, value: Double, date: js.Date): js.Date = js.native
  
  @JSImport("date-fp", "sub")
  @js.native
  def sub_days(unit: days, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "sub")
  @js.native
  def sub_hours(unit: hours, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "sub")
  @js.native
  def sub_milliseconds(unit: milliseconds, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "sub")
  @js.native
  def sub_minutes(unit: minutes, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "sub")
  @js.native
  def sub_months(unit: months, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "sub")
  @js.native
  def sub_seconds(unit: seconds, value: Double, date: js.Date): js.Date = js.native
  @JSImport("date-fp", "sub")
  @js.native
  def sub_years(unit: years, value: Double, date: js.Date): js.Date = js.native
  
  @JSImport("date-fp", "unixTime")
  @js.native
  def unixTime(date: js.Date): Double = js.native
}
