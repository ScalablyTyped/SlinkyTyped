package typingsSlinky.dateIoCore.mod

import typingsSlinky.dateIoCore.dateIoCoreStrings.am
import typingsSlinky.dateIoCore.dateIoCoreStrings.dayOfMonth
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullDate
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullDateTime
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullDateTime12h
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullDateTime24h
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullDateWithWeekday
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullTime
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullTime12h
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullTime24h
import typingsSlinky.dateIoCore.dateIoCoreStrings.hours12h
import typingsSlinky.dateIoCore.dateIoCoreStrings.hours24h
import typingsSlinky.dateIoCore.dateIoCoreStrings.keyboardDate
import typingsSlinky.dateIoCore.dateIoCoreStrings.keyboardDateTime
import typingsSlinky.dateIoCore.dateIoCoreStrings.keyboardDateTime12h
import typingsSlinky.dateIoCore.dateIoCoreStrings.keyboardDateTime24h
import typingsSlinky.dateIoCore.dateIoCoreStrings.minutes
import typingsSlinky.dateIoCore.dateIoCoreStrings.month
import typingsSlinky.dateIoCore.dateIoCoreStrings.monthAndDate
import typingsSlinky.dateIoCore.dateIoCoreStrings.monthAndYear
import typingsSlinky.dateIoCore.dateIoCoreStrings.monthShort
import typingsSlinky.dateIoCore.dateIoCoreStrings.normalDate
import typingsSlinky.dateIoCore.dateIoCoreStrings.normalDateWithWeekday
import typingsSlinky.dateIoCore.dateIoCoreStrings.pm
import typingsSlinky.dateIoCore.dateIoCoreStrings.seconds
import typingsSlinky.dateIoCore.dateIoCoreStrings.shortDate
import typingsSlinky.dateIoCore.dateIoCoreStrings.weekday
import typingsSlinky.dateIoCore.dateIoCoreStrings.weekdayShort
import typingsSlinky.dateIoCore.dateIoCoreStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUtils[TDate] extends js.Object {
  
  def addDays(value: TDate, count: Double): TDate = js.native
  
  def addHours(value: TDate, count: Double): TDate = js.native
  
  def addMinutes(value: TDate, count: Double): TDate = js.native
  
  def addMonths(value: TDate, count: Double): TDate = js.native
  
  def addSeconds(value: TDate, count: Double): TDate = js.native
  
  def addWeeks(value: TDate, count: Double): TDate = js.native
  
  // constructor (options?: { formats?: DateIOFormats, locale?: any, instance?: any });
  def date(): TDate | Null = js.native
  def date(value: js.Any): TDate | Null = js.native
  
  var dayjs: js.UndefOr[js.Any] = js.native
  
  def endOfDay(value: TDate): TDate = js.native
  
  def endOfMonth(value: TDate): TDate = js.native
  
  def endOfWeek(value: TDate): TDate = js.native
  
  def format(
    value: TDate,
    formatKey: /* keyof @date-io/core.@date-io/core/IUtils.DateIOFormats<string> */ fullDate | fullDateWithWeekday | normalDate | normalDateWithWeekday | shortDate | year | month | monthShort | monthAndYear | monthAndDate | weekday | weekdayShort | dayOfMonth | hours12h | hours24h | minutes | seconds | fullTime | fullTime12h | fullTime24h | fullDateTime | fullDateTime12h | fullDateTime24h | keyboardDate | keyboardDateTime | keyboardDateTime12h | keyboardDateTime24h
  ): String = js.native
  
  def formatByString(value: TDate, formatString: String): String = js.native
  
  def formatNumber(numberToFormat: String): String = js.native
  
  var formats: DateIOFormats[_] = js.native
  
  def getCurrentLocaleCode(): String = js.native
  
  def getDaysInMonth(value: TDate): Double = js.native
  
  def getDiff(value: TDate, comparing: TDate): Double = js.native
  def getDiff(value: TDate, comparing: TDate, unit: Unit): Double = js.native
  def getDiff(value: TDate, comparing: String): Double = js.native
  def getDiff(value: TDate, comparing: String, unit: Unit): Double = js.native
  
  /** Returns user readable format (taking into account localized format tokens), useful to render helper text for input (e.g. placeholder). For luxon always returns empty string. */
  def getFormatHelperText(format: String): String = js.native
  
  def getHours(value: TDate): Double = js.native
  
  /** Allow to customize displaying "am/pm" strings */
  @JSName("getMeridiemText")
  def getMeridiemText_am(ampm: am): String = js.native
  @JSName("getMeridiemText")
  def getMeridiemText_pm(ampm: pm): String = js.native
  
  def getMinutes(value: TDate): Double = js.native
  
  def getMonth(value: TDate): Double = js.native
  
  def getMonthArray(value: TDate): js.Array[TDate] = js.native
  
  def getNextMonth(value: TDate): TDate = js.native
  
  def getPreviousMonth(value: TDate): TDate = js.native
  
  def getSeconds(value: TDate): Double = js.native
  
  def getWeekArray(date: TDate): js.Array[js.Array[TDate]] = js.native
  
  def getWeekdays(): js.Array[String] = js.native
  
  def getYear(value: TDate): Double = js.native
  
  def getYearRange(start: TDate, end: TDate): js.Array[TDate] = js.native
  
  def is12HourCycleInCurrentLocale(): Boolean = js.native
  
  def isAfter(value: TDate, comparing: TDate): Boolean = js.native
  
  def isAfterDay(value: TDate, comparing: TDate): Boolean = js.native
  
  def isAfterYear(value: TDate, comparing: TDate): Boolean = js.native
  
  def isBefore(value: TDate, comparing: TDate): Boolean = js.native
  
  def isBeforeDay(value: TDate, comparing: TDate): Boolean = js.native
  
  def isBeforeYear(value: TDate, comparing: TDate): Boolean = js.native
  
  def isEqual(value: js.Any, comparing: js.Any): Boolean = js.native
  
  def isNull(): Boolean = js.native
  def isNull(value: TDate): Boolean = js.native
  
  def isSameDay(value: TDate, comparing: TDate): Boolean = js.native
  
  def isSameHour(value: TDate, comparing: TDate): Boolean = js.native
  
  def isSameMonth(value: TDate, comparing: TDate): Boolean = js.native
  
  def isSameYear(value: TDate, comparing: TDate): Boolean = js.native
  
  def isValid(value: js.Any): Boolean = js.native
  
  def isWithinRange(value: TDate, range: js.Tuple2[TDate, TDate]): Boolean = js.native
  
  /** Name of the library that is used right now */
  var lib: String = js.native
  
  var locale: js.UndefOr[js.Any] = js.native
  
  def mergeDateAndTime(date: TDate, time: TDate): TDate = js.native
  
  var moment: js.UndefOr[js.Any] = js.native
  
  def parse(value: String, format: String): TDate | Null = js.native
  
  def setHours(value: TDate, count: Double): TDate = js.native
  
  def setMinutes(value: TDate, count: Double): TDate = js.native
  
  def setMonth(value: TDate, count: Double): TDate = js.native
  
  def setSeconds(value: TDate, count: Double): TDate = js.native
  
  def setYear(value: TDate, count: Double): TDate = js.native
  
  def startOfDay(value: TDate): TDate = js.native
  
  def startOfMonth(value: TDate): TDate = js.native
  
  def startOfWeek(value: TDate): TDate = js.native
  
  def toJsDate(value: TDate): js.Date = js.native
}
