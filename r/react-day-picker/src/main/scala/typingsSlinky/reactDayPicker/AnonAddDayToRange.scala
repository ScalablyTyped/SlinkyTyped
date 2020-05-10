package typingsSlinky.reactDayPicker

import typingsSlinky.reactDayPicker.commonMod.RangeModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddDayToRange extends js.Object {
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

object AnonAddDayToRange {
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
  ): AnonAddDayToRange = {
    val __obj = js.Dynamic.literal(addDayToRange = js.Any.fromFunction2(addDayToRange), addMonths = js.Any.fromFunction2(addMonths), clone = js.Any.fromFunction1(clone), isDate = js.Any.fromFunction1(isDate), isDayAfter = js.Any.fromFunction2(isDayAfter), isDayBefore = js.Any.fromFunction2(isDayBefore), isDayBetween = js.Any.fromFunction3(isDayBetween), isDayInRange = js.Any.fromFunction2(isDayInRange), isFutureDay = js.Any.fromFunction1(isFutureDay), isPastDay = js.Any.fromFunction1(isPastDay), isSameDay = js.Any.fromFunction2(isSameDay), isSameMonth = js.Any.fromFunction2(isSameMonth))
    __obj.asInstanceOf[AnonAddDayToRange]
  }
  @scala.inline
  implicit class AnonAddDayToRangeOps[Self <: AnonAddDayToRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDayToRange(value: (js.Date, RangeModifier) => RangeModifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDayToRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddMonths(value: (js.Date, Double) => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMonths")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClone(value: js.Date => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsDate(value: js.Date => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsDayAfter(value: (js.Date, js.Date) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDayAfter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsDayBefore(value: (js.Date, js.Date) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDayBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsDayBetween(value: (js.Date, js.Date, js.Date) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDayBetween")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIsDayInRange(value: (js.Date, RangeModifier) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDayInRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsFutureDay(value: js.Date => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFutureDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsPastDay(value: js.Date => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPastDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsSameDay(value: (js.Date, js.Date) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSameDay")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsSameMonth(value: (js.Date, js.Date) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSameMonth")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

