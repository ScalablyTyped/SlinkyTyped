package typingsSlinky.reactDayPicker

import typingsSlinky.reactDayPicker.dateUtilsMod.DateUtils
import typingsSlinky.reactDayPicker.localeUtilsMod.LocaleUtils
import typingsSlinky.reactDayPicker.modifiersMod.DayModifiers
import typingsSlinky.reactDayPicker.modifiersMod.Modifier
import typingsSlinky.reactDayPicker.modifiersMod.Modifiers
import typingsSlinky.reactDayPicker.modifiersMod.ModifiersUtils
import typingsSlinky.reactDayPicker.modifiersMod.RangeModifier
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-day-picker", JSImport.Default)
  @js.native
  class default ()
    extends typingsSlinky.reactDayPicker.dayPickerMod.default
  /* static members */
  object default {
    
    @JSImport("react-day-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-day-picker", "default.DateUtils")
    @js.native
    def DateUtils: typingsSlinky.reactDayPicker.dateUtilsMod.DateUtils = js.native
    @scala.inline
    def DateUtils_=(x: DateUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateUtils")(x.asInstanceOf[js.Any])
    
    @JSImport("react-day-picker", "default.DayModifiers")
    @js.native
    def DayModifiers: typingsSlinky.reactDayPicker.modifiersMod.DayModifiers = js.native
    @scala.inline
    def DayModifiers_=(x: DayModifiers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DayModifiers")(x.asInstanceOf[js.Any])
    
    @JSImport("react-day-picker", "default.LocaleUtils")
    @js.native
    def LocaleUtils: typingsSlinky.reactDayPicker.localeUtilsMod.LocaleUtils = js.native
    @scala.inline
    def LocaleUtils_=(x: LocaleUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocaleUtils")(x.asInstanceOf[js.Any])
    
    @JSImport("react-day-picker", "default.Modifiers")
    @js.native
    def Modifiers: typingsSlinky.reactDayPicker.modifiersMod.Modifiers = js.native
    
    @JSImport("react-day-picker", "default.ModifiersUtils")
    @js.native
    def ModifiersUtils: typingsSlinky.reactDayPicker.modifiersMod.ModifiersUtils = js.native
    @scala.inline
    def ModifiersUtils_=(x: ModifiersUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ModifiersUtils")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Modifiers_=(x: Modifiers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Modifiers")(x.asInstanceOf[js.Any])
    
    @JSImport("react-day-picker", "default.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  object DateUtils {
    
    @JSImport("react-day-picker", "DateUtils.addDayToRange")
    @js.native
    def addDayToRange(day: js.Date, range: RangeModifier): RangeModifier = js.native
    
    @JSImport("react-day-picker", "DateUtils.addMonths")
    @js.native
    def addMonths(d: js.Date, n: Double): js.Date = js.native
    
    @JSImport("react-day-picker", "DateUtils.clone")
    @js.native
    def clone_(d: js.Date): js.Date = js.native
    
    @JSImport("react-day-picker", "DateUtils.isDate")
    @js.native
    def isDate(d: js.Date): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isDayAfter")
    @js.native
    def isDayAfter(day1: js.Date, day2: js.Date): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isDayBefore")
    @js.native
    def isDayBefore(day1: js.Date, day2: js.Date): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isDayBetween")
    @js.native
    def isDayBetween(day: js.Date, begin: js.Date, end: js.Date): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isDayInRange")
    @js.native
    def isDayInRange(day: js.Date, range: RangeModifier): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isFutureDay")
    @js.native
    def isFutureDay(day: js.Date): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isPastDay")
    @js.native
    def isPastDay(day: js.Date): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isSameDay")
    @js.native
    def isSameDay(day1: js.Date, day2: js.Date): Boolean = js.native
    
    @JSImport("react-day-picker", "DateUtils.isSameMonth")
    @js.native
    def isSameMonth(day1: js.Date, day2: js.Date): Boolean = js.native
  }
  
  object LocaleUtils {
    
    @JSImport("react-day-picker", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: js.Date): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: js.Date, format: js.UndefOr[scala.Nothing], locale: String): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: js.Date, format: String): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: js.Date, format: String, locale: String): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: js.Date, format: js.Array[String]): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatDate")
    @js.native
    def formatDate(date: js.Date, format: js.Array[String], locale: String): String = js.native
    
    @JSImport("react-day-picker", "LocaleUtils.formatDay")
    @js.native
    def formatDay(day: js.Date): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatDay")
    @js.native
    def formatDay(day: js.Date, locale: String): String = js.native
    
    @JSImport("react-day-picker", "LocaleUtils.formatMonthTitle")
    @js.native
    def formatMonthTitle(month: js.Date): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatMonthTitle")
    @js.native
    def formatMonthTitle(month: js.Date, locale: String): String = js.native
    
    @JSImport("react-day-picker", "LocaleUtils.formatWeekdayLong")
    @js.native
    def formatWeekdayLong(weekday: Double): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatWeekdayLong")
    @js.native
    def formatWeekdayLong(weekday: Double, locale: String): String = js.native
    
    @JSImport("react-day-picker", "LocaleUtils.formatWeekdayShort")
    @js.native
    def formatWeekdayShort(weekday: Double): String = js.native
    @JSImport("react-day-picker", "LocaleUtils.formatWeekdayShort")
    @js.native
    def formatWeekdayShort(weekday: Double, locale: String): String = js.native
    
    @JSImport("react-day-picker", "LocaleUtils.getFirstDayOfWeek")
    @js.native
    def getFirstDayOfWeek(): Double = js.native
    @JSImport("react-day-picker", "LocaleUtils.getFirstDayOfWeek")
    @js.native
    def getFirstDayOfWeek(locale: String): Double = js.native
    
    @JSImport("react-day-picker", "LocaleUtils.getMonths")
    @js.native
    def getMonths(): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
    @JSImport("react-day-picker", "LocaleUtils.getMonths")
    @js.native
    def getMonths(locale: String): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
    
    @JSImport("react-day-picker", "LocaleUtils.parseDate")
    @js.native
    def parseDate(str: String): js.Date = js.native
    @JSImport("react-day-picker", "LocaleUtils.parseDate")
    @js.native
    def parseDate(str: String, format: js.UndefOr[scala.Nothing], locale: String): js.Date = js.native
    @JSImport("react-day-picker", "LocaleUtils.parseDate")
    @js.native
    def parseDate(str: String, format: String): js.Date = js.native
    @JSImport("react-day-picker", "LocaleUtils.parseDate")
    @js.native
    def parseDate(str: String, format: String, locale: String): js.Date = js.native
  }
  
  object ModifiersUtils {
    
    @JSImport("react-day-picker", "ModifiersUtils.dayMatchesModifier")
    @js.native
    def dayMatchesModifier(day: js.Date): Boolean = js.native
    @JSImport("react-day-picker", "ModifiersUtils.dayMatchesModifier")
    @js.native
    def dayMatchesModifier(day: js.Date, modifier: js.Array[Modifier]): Boolean = js.native
    @JSImport("react-day-picker", "ModifiersUtils.dayMatchesModifier")
    @js.native
    def dayMatchesModifier(day: js.Date, modifier: Modifier): Boolean = js.native
    
    @JSImport("react-day-picker", "ModifiersUtils.getModifiersForDay")
    @js.native
    def getModifiersForDay(day: js.Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = js.native
  }
}
