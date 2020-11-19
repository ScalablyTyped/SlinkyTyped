package typingsSlinky.blueprintjsDatetime

import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typingsSlinky.blueprintjsDatetime.dateRangeMod.DateRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", JSImport.Namespace)
@js.native
object dateUtilsMod extends js.Object {
  
  def areEqual(date1: js.Date, date2: js.Date): Boolean = js.native
  
  def areRangesEqual(dateRange1: DateRange, dateRange2: DateRange): Boolean = js.native
  
  def areSameDay(date1: js.Date, date2: js.Date): Boolean = js.native
  
  def areSameMonth(date1: js.Date, date2: js.Date): Boolean = js.native
  
  def areSameTime(date1: js.Date, date2: js.Date): Boolean = js.native
  
  def clone(d: js.Date): js.Date = js.native
  
  def convert24HourMeridiem(hour: Double, toPm: Boolean): Double = js.native
  
  def get12HourFrom24Hour(hour: Double): Double = js.native
  
  def get24HourFrom12Hour(hour: Double, isPm: Boolean): Double = js.native
  
  def getDateBetween(dateRange: DateRange): js.Date = js.native
  
  def getDateNextMonth(date: js.Date): js.Date = js.native
  
  def getDateOnlyWithTime(date: js.Date): js.Date = js.native
  
  def getDatePreviousMonth(date: js.Date): js.Date = js.native
  
  def getDateTime(): js.Date = js.native
  def getDateTime(date: Null, time: js.Date): js.Date = js.native
  def getDateTime(date: js.Date): js.Date = js.native
  def getDateTime(date: js.Date, time: js.Date): js.Date = js.native
  
  def getIsPmFrom24Hour(hour: Double): Boolean = js.native
  
  def getTimeInRange(time: js.Date, minTime: js.Date, maxTime: js.Date): js.Date = js.native
  
  def isDateValid(): /* is std.Date */ Boolean = js.native
  def isDateValid(date: js.Date): /* is std.Date */ Boolean = js.native
  @JSName("isDateValid")
  def isDateValid_false(date: `false`): /* is std.Date */ Boolean = js.native
  
  def isDayInRange(date: js.Date, dateRange: DateRange): Boolean = js.native
  def isDayInRange(date: js.Date, dateRange: DateRange, exclusive: Boolean): Boolean = js.native
  
  def isDayRangeInRange(innerRange: DateRange, outerRange: DateRange): Boolean = js.native
  
  def isMonthInRange(date: js.Date, dateRange: DateRange): Boolean = js.native
  
  def isTimeEqualOrGreaterThan(time: js.Date, timeToCompare: js.Date): Boolean = js.native
  
  def isTimeEqualOrSmallerThan(time: js.Date, timeToCompare: js.Date): Boolean = js.native
  
  def isTimeInRange(date: js.Date, minDate: js.Date, maxDate: js.Date): Boolean = js.native
  
  def isTimeSameOrAfter(date: js.Date, dateToCompare: js.Date): Boolean = js.native
}
