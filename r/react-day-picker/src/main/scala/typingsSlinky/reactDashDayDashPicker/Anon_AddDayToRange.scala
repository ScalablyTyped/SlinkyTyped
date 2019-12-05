package typingsSlinky.reactDashDayDashPicker

import typingsSlinky.reactDashDayDashPicker.typesCommonMod.RangeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddDayToRange extends js.Object {
  def addDayToRange(day: js.Date, range: RangeModifier): RangeModifier
  def addMonths(d: js.Date, n: Double): js.Date
  def clone(d: js.Date): js.Date
  def isDate(d: js.Date): Boolean
  def isDayAfter(day1: js.Date, day2: js.Date): Boolean
  def isDayBefore(day1: js.Date, day2: js.Date): Boolean
  def isDayBetween(day: js.Date, begin: js.Date, end: js.Date): Boolean
  def isDayInRange(day: js.Date, range: RangeModifier): Boolean
  def isFutureDay(day: js.Date): Boolean
  def isPastDay(day: js.Date): Boolean
  def isSameDay(day1: js.Date, day2: js.Date): Boolean
  def isSameMonth(day1: js.Date, day2: js.Date): Boolean
}

object Anon_AddDayToRange {
  @scala.inline
  def apply(
    addDayToRange: (js.Date, RangeModifier) => RangeModifier,
    addMonths: (js.Date, Double) => js.Date,
    clone: js.Date => js.Date,
    isDate: js.Date => Boolean,
    isDayAfter: (js.Date, js.Date) => Boolean,
    isDayBefore: (js.Date, js.Date) => Boolean,
    isDayBetween: (js.Date, js.Date, js.Date) => Boolean,
    isDayInRange: (js.Date, RangeModifier) => Boolean,
    isFutureDay: js.Date => Boolean,
    isPastDay: js.Date => Boolean,
    isSameDay: (js.Date, js.Date) => Boolean,
    isSameMonth: (js.Date, js.Date) => Boolean
  ): Anon_AddDayToRange = {
    val __obj = js.Dynamic.literal(addDayToRange = js.Any.fromFunction2(addDayToRange), addMonths = js.Any.fromFunction2(addMonths), clone = js.Any.fromFunction1(clone), isDate = js.Any.fromFunction1(isDate), isDayAfter = js.Any.fromFunction2(isDayAfter), isDayBefore = js.Any.fromFunction2(isDayBefore), isDayBetween = js.Any.fromFunction3(isDayBetween), isDayInRange = js.Any.fromFunction2(isDayInRange), isFutureDay = js.Any.fromFunction1(isFutureDay), isPastDay = js.Any.fromFunction1(isPastDay), isSameDay = js.Any.fromFunction2(isSameDay), isSameMonth = js.Any.fromFunction2(isSameMonth))
  
    __obj.asInstanceOf[Anon_AddDayToRange]
  }
}

