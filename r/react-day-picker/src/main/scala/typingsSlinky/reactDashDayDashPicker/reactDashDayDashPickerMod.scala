package typingsSlinky.reactDashDayDashPicker

import typingsSlinky.reactDashDayDashPicker.typesCommonMod.Modifier
import typingsSlinky.reactDashDayDashPicker.typesCommonMod.RangeModifier
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-day-picker", JSImport.Namespace)
@js.native
object reactDashDayDashPickerMod extends js.Object {
  @js.native
  class default ()
    extends typingsSlinky.reactDashDayDashPicker.typesDayPickerMod.default
  
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
  object ModifiersUtils extends js.Object {
    def dayMatchesModifier(day: js.Date): Boolean = js.native
    def dayMatchesModifier(day: js.Date, modifier: js.Array[Modifier]): Boolean = js.native
    def dayMatchesModifier(day: js.Date, modifier: Modifier): Boolean = js.native
    def getModifiersForDay(day: js.Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var DateUtils: Anon_AddDayToRange = js.native
    var DayModifiers: typingsSlinky.reactDashDayDashPicker.typesCommonMod.DayModifiers = js.native
    var LocaleUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = js.native
    var Modifiers: typingsSlinky.reactDashDayDashPicker.typesCommonMod.Modifiers = js.native
    var ModifiersUtils: Anon_Day = js.native
    var VERSION: String = js.native
  }
  
}

