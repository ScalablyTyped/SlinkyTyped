package typingsSlinky.blueprintjsDatetime

import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typingsSlinky.blueprintjsDatetime.dateRangeMod.DateRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateUtilsMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "areEqual")
  @js.native
  def areEqual(date1: js.Date, date2: js.Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "areRangesEqual")
  @js.native
  def areRangesEqual(dateRange1: DateRange, dateRange2: DateRange): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "areSameDay")
  @js.native
  def areSameDay(date1: js.Date, date2: js.Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "areSameMonth")
  @js.native
  def areSameMonth(date1: js.Date, date2: js.Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "areSameTime")
  @js.native
  def areSameTime(date1: js.Date, date2: js.Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "clone")
  @js.native
  def clone_(d: js.Date): js.Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "convert24HourMeridiem")
  @js.native
  def convert24HourMeridiem(hour: Double, toPm: Boolean): Double = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "get12HourFrom24Hour")
  @js.native
  def get12HourFrom24Hour(hour: Double): Double = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "get24HourFrom12Hour")
  @js.native
  def get24HourFrom12Hour(hour: Double, isPm: Boolean): Double = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDateBetween")
  @js.native
  def getDateBetween(dateRange: DateRange): js.Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDateNextMonth")
  @js.native
  def getDateNextMonth(date: js.Date): js.Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDateOnlyWithTime")
  @js.native
  def getDateOnlyWithTime(date: js.Date): js.Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDatePreviousMonth")
  @js.native
  def getDatePreviousMonth(date: js.Date): js.Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDateTime")
  @js.native
  def getDateTime(): js.Date = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDateTime")
  @js.native
  def getDateTime(date: js.Date): js.Date = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDateTime")
  @js.native
  def getDateTime(date: js.Date, time: js.Date): js.Date = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getDateTime")
  @js.native
  def getDateTime(date: Null, time: js.Date): js.Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getIsPmFrom24Hour")
  @js.native
  def getIsPmFrom24Hour(hour: Double): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "getTimeInRange")
  @js.native
  def getTimeInRange(time: js.Date, minTime: js.Date, maxTime: js.Date): js.Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isDateValid")
  @js.native
  def isDateValid(): /* is std.Date */ Boolean = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isDateValid")
  @js.native
  def isDateValid(date: js.Date): /* is std.Date */ Boolean = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isDateValid")
  @js.native
  def isDateValid_false(date: `false`): /* is std.Date */ Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isDayInRange")
  @js.native
  def isDayInRange(date: js.Date, dateRange: DateRange): Boolean = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isDayInRange")
  @js.native
  def isDayInRange(date: js.Date, dateRange: DateRange, exclusive: Boolean): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isDayRangeInRange")
  @js.native
  def isDayRangeInRange(innerRange: DateRange, outerRange: DateRange): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isMonthInRange")
  @js.native
  def isMonthInRange(date: js.Date, dateRange: DateRange): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isTimeEqualOrGreaterThan")
  @js.native
  def isTimeEqualOrGreaterThan(time: js.Date, timeToCompare: js.Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isTimeEqualOrSmallerThan")
  @js.native
  def isTimeEqualOrSmallerThan(time: js.Date, timeToCompare: js.Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isTimeInRange")
  @js.native
  def isTimeInRange(date: js.Date, minDate: js.Date, maxDate: js.Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isTimeSameOrAfter")
  @js.native
  def isTimeSameOrAfter(date: js.Date, dateToCompare: js.Date): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/dateUtils", "isToday")
  @js.native
  def isToday(date: js.Date): Boolean = js.native
}
