package typingsSlinky.dateDashAndDashTime

import typingsSlinky.dateDashAndDashTime.dateDashAndDashTimeMod.Subtract
import typingsSlinky.dateDashAndDashTime.dateDashAndDashTimeMod.getDelta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-and-time", JSImport.Namespace)
@js.native
object dateDashAndDashTimeMod extends js.Object {
  @js.native
  trait Subtract extends js.Object {
    @JSName("toDays")
    var toDays_Original: getDelta = js.native
    @JSName("toHours")
    var toHours_Original: getDelta = js.native
    @JSName("toMilliseconds")
    var toMilliseconds_Original: getDelta = js.native
    @JSName("toMinutes")
    var toMinutes_Original: getDelta = js.native
    @JSName("toSeconds")
    var toSeconds_Original: getDelta = js.native
    def toDays(): Double = js.native
    def toHours(): Double = js.native
    def toMilliseconds(): Double = js.native
    def toMinutes(): Double = js.native
    def toSeconds(): Double = js.native
  }
  
  def addDays(dateObj: js.Date, days: Double): js.Date = js.native
  def addHours(dateObj: js.Date, hours: Double): js.Date = js.native
  def addMilliseconds(dateObj: js.Date, milliseconds: Double): js.Date = js.native
  def addMinutes(dateObj: js.Date, minutes: Double): js.Date = js.native
  def addMonths(dateObj: js.Date, months: Double): js.Date = js.native
  def addSeconds(dateObj: js.Date, seconds: Double): js.Date = js.native
  def addYears(dateObj: js.Date, years: Double): js.Date = js.native
  def format(dateObj: js.Date, formatString: String): String = js.native
  def format(dateObj: js.Date, formatString: String, utc: Boolean): String = js.native
  def getLocales(): js.Any = js.native
  def getLocales(code: String): js.Any = js.native
  def isLeapYear(dateObj: js.Date): Boolean = js.native
  def isSameDay(date1: js.Date, date2: js.Date): Boolean = js.native
  def isValid(dateString: String, formatString: String): Boolean = js.native
  def locale(): String = js.native
  def locale(code: String): String = js.native
  def parse(dateString: String, formatString: String): js.Date | Double = js.native
  def parse(dateString: String, formatString: String, utc: Boolean): js.Date | Double = js.native
  def setLocales(code: String, options: js.Any): Unit = js.native
  def subtract(date1: js.Date, date2: js.Date): Subtract = js.native
  type getDelta = js.Function0[Double]
}

