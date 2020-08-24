package typingsSlinky.reactDayPicker

import typingsSlinky.reactDayPicker.modifiersMod.Modifier
import typingsSlinky.reactDayPicker.modifiersMod.RangeModifier
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-day-picker", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default ()
    extends typingsSlinky.reactDayPicker.dayPickerMod.default
  
  @js.native
  object DateUtils extends js.Object {
    def addDayToRange(day: js.Date, range: RangeModifier): RangeModifier = js.native
    def addMonths(d: js.Date, n: Double): js.Date = js.native
    def clone(d: js.Date): js.Date = js.native
    def isDate(d: js.Date): Boolean = js.native
    def isDayAfter(day1: js.Date, day2: js.Date): Boolean = js.native
    def isDayBefore(day1: js.Date, day2: js.Date): Boolean = js.native
    def isDayBetween(day: js.Date, begin: js.Date, end: js.Date): Boolean = js.native
    def isDayInRange(day: js.Date, range: RangeModifier): Boolean = js.native
    def isFutureDay(day: js.Date): Boolean = js.native
    def isPastDay(day: js.Date): Boolean = js.native
    def isSameDay(day1: js.Date, day2: js.Date): Boolean = js.native
    def isSameMonth(day1: js.Date, day2: js.Date): Boolean = js.native
  }
  
  @js.native
  object LocaleUtils extends js.Object {
    def formatDate(date: js.Date): String = js.native
    def formatDate(date: js.Date, format: js.UndefOr[scala.Nothing], locale: String): String = js.native
    def formatDate(date: js.Date, format: String): String = js.native
    def formatDate(date: js.Date, format: String, locale: String): String = js.native
    def formatDate(date: js.Date, format: js.Array[String]): String = js.native
    def formatDate(date: js.Date, format: js.Array[String], locale: String): String = js.native
    def formatDay(day: js.Date): String = js.native
    def formatDay(day: js.Date, locale: String): String = js.native
    def formatMonthTitle(month: js.Date): String = js.native
    def formatMonthTitle(month: js.Date, locale: String): String = js.native
    def formatWeekdayLong(weekday: Double): String = js.native
    def formatWeekdayLong(weekday: Double, locale: String): String = js.native
    def formatWeekdayShort(weekday: Double): String = js.native
    def formatWeekdayShort(weekday: Double, locale: String): String = js.native
    def getFirstDayOfWeek(): Double = js.native
    def getFirstDayOfWeek(locale: String): Double = js.native
    def getMonths(): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
    def getMonths(locale: String): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
    def parseDate(str: String): js.Date = js.native
    def parseDate(str: String, format: js.UndefOr[scala.Nothing], locale: String): js.Date = js.native
    def parseDate(str: String, format: String): js.Date = js.native
    def parseDate(str: String, format: String, locale: String): js.Date = js.native
  }
  
  @js.native
  object ModifiersUtils extends js.Object {
    def dayMatchesModifier(day: js.Date): Boolean = js.native
    def dayMatchesModifier(day: js.Date, modifier: js.Array[Modifier]): Boolean = js.native
    def dayMatchesModifier(day: js.Date, modifier: Modifier): Boolean = js.native
    def getModifiersForDay(day: js.Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var DateUtils: typingsSlinky.reactDayPicker.dateUtilsMod.DateUtils = js.native
    var DayModifiers: typingsSlinky.reactDayPicker.modifiersMod.DayModifiers = js.native
    var LocaleUtils: typingsSlinky.reactDayPicker.localeUtilsMod.LocaleUtils = js.native
    var Modifiers: typingsSlinky.reactDayPicker.modifiersMod.Modifiers = js.native
    var ModifiersUtils: typingsSlinky.reactDayPicker.modifiersMod.ModifiersUtils = js.native
    var VERSION: String = js.native
  }
  
}

