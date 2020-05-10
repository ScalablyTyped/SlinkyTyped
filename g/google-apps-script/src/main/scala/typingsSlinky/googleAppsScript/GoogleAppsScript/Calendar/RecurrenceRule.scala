package typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Date
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Month
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Weekday
import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a recurrence rule for an event series.
  *
  * Note that this class also behaves like the EventRecurrence that it belongs to,
  * allowing you to chain rule creation together like so:
  *
  *     recurrence.addDailyRule().times(3).interval(2).addWeeklyExclusion().times(2);
  *
  * times(times)
  * interval(interval)
  */
@js.native
trait RecurrenceRule extends js.Object {
  def addDailyExclusion(): RecurrenceRule = js.native
  def addDailyRule(): RecurrenceRule = js.native
  def addDate(date: Date): EventRecurrence = js.native
  def addDateExclusion(date: Date): EventRecurrence = js.native
  def addMonthlyExclusion(): RecurrenceRule = js.native
  def addMonthlyRule(): RecurrenceRule = js.native
  def addWeeklyExclusion(): RecurrenceRule = js.native
  def addWeeklyRule(): RecurrenceRule = js.native
  def addYearlyExclusion(): RecurrenceRule = js.native
  def addYearlyRule(): RecurrenceRule = js.native
  def interval(interval: Integer): RecurrenceRule = js.native
  def onlyInMonth(month: Month): RecurrenceRule = js.native
  def onlyInMonths(months: js.Array[Month]): RecurrenceRule = js.native
  def onlyOnMonthDay(day: Integer): RecurrenceRule = js.native
  def onlyOnMonthDays(days: js.Array[Integer]): RecurrenceRule = js.native
  def onlyOnWeek(week: Integer): RecurrenceRule = js.native
  def onlyOnWeekday(day: Weekday): RecurrenceRule = js.native
  def onlyOnWeekdays(days: js.Array[Weekday]): RecurrenceRule = js.native
  def onlyOnWeeks(weeks: js.Array[Integer]): RecurrenceRule = js.native
  def onlyOnYearDay(day: Integer): RecurrenceRule = js.native
  def onlyOnYearDays(days: js.Array[Integer]): RecurrenceRule = js.native
  def setTimeZone(timeZone: String): EventRecurrence = js.native
  def times(times: Integer): RecurrenceRule = js.native
  def until(endDate: Date): RecurrenceRule = js.native
  def weekStartsOn(day: Weekday): RecurrenceRule = js.native
}

object RecurrenceRule {
  @scala.inline
  def apply(
    addDailyExclusion: () => RecurrenceRule,
    addDailyRule: () => RecurrenceRule,
    addDate: Date => EventRecurrence,
    addDateExclusion: Date => EventRecurrence,
    addMonthlyExclusion: () => RecurrenceRule,
    addMonthlyRule: () => RecurrenceRule,
    addWeeklyExclusion: () => RecurrenceRule,
    addWeeklyRule: () => RecurrenceRule,
    addYearlyExclusion: () => RecurrenceRule,
    addYearlyRule: () => RecurrenceRule,
    interval: Integer => RecurrenceRule,
    onlyInMonth: Month => RecurrenceRule,
    onlyInMonths: js.Array[Month] => RecurrenceRule,
    onlyOnMonthDay: Integer => RecurrenceRule,
    onlyOnMonthDays: js.Array[Integer] => RecurrenceRule,
    onlyOnWeek: Integer => RecurrenceRule,
    onlyOnWeekday: Weekday => RecurrenceRule,
    onlyOnWeekdays: js.Array[Weekday] => RecurrenceRule,
    onlyOnWeeks: js.Array[Integer] => RecurrenceRule,
    onlyOnYearDay: Integer => RecurrenceRule,
    onlyOnYearDays: js.Array[Integer] => RecurrenceRule,
    setTimeZone: String => EventRecurrence,
    times: Integer => RecurrenceRule,
    until: Date => RecurrenceRule,
    weekStartsOn: Weekday => RecurrenceRule
  ): RecurrenceRule = {
    val __obj = js.Dynamic.literal(addDailyExclusion = js.Any.fromFunction0(addDailyExclusion), addDailyRule = js.Any.fromFunction0(addDailyRule), addDate = js.Any.fromFunction1(addDate), addDateExclusion = js.Any.fromFunction1(addDateExclusion), addMonthlyExclusion = js.Any.fromFunction0(addMonthlyExclusion), addMonthlyRule = js.Any.fromFunction0(addMonthlyRule), addWeeklyExclusion = js.Any.fromFunction0(addWeeklyExclusion), addWeeklyRule = js.Any.fromFunction0(addWeeklyRule), addYearlyExclusion = js.Any.fromFunction0(addYearlyExclusion), addYearlyRule = js.Any.fromFunction0(addYearlyRule), interval = js.Any.fromFunction1(interval), onlyInMonth = js.Any.fromFunction1(onlyInMonth), onlyInMonths = js.Any.fromFunction1(onlyInMonths), onlyOnMonthDay = js.Any.fromFunction1(onlyOnMonthDay), onlyOnMonthDays = js.Any.fromFunction1(onlyOnMonthDays), onlyOnWeek = js.Any.fromFunction1(onlyOnWeek), onlyOnWeekday = js.Any.fromFunction1(onlyOnWeekday), onlyOnWeekdays = js.Any.fromFunction1(onlyOnWeekdays), onlyOnWeeks = js.Any.fromFunction1(onlyOnWeeks), onlyOnYearDay = js.Any.fromFunction1(onlyOnYearDay), onlyOnYearDays = js.Any.fromFunction1(onlyOnYearDays), setTimeZone = js.Any.fromFunction1(setTimeZone), times = js.Any.fromFunction1(times), until = js.Any.fromFunction1(until), weekStartsOn = js.Any.fromFunction1(weekStartsOn))
    __obj.asInstanceOf[RecurrenceRule]
  }
  @scala.inline
  implicit class RecurrenceRuleOps[Self <: RecurrenceRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDailyExclusion(value: () => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDailyExclusion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddDailyRule(value: () => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDailyRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddDate(value: Date => EventRecurrence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddDateExclusion(value: Date => EventRecurrence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDateExclusion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddMonthlyExclusion(value: () => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMonthlyExclusion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddMonthlyRule(value: () => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMonthlyRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddWeeklyExclusion(value: () => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addWeeklyExclusion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddWeeklyRule(value: () => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addWeeklyRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddYearlyExclusion(value: () => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addYearlyExclusion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddYearlyRule(value: () => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addYearlyRule")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInterval(value: Integer => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnlyInMonth(value: Month => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyInMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnlyInMonths(value: js.Array[Month] => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyInMonths")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnlyOnMonthDay(value: Integer => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyOnMonthDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnlyOnMonthDays(value: js.Array[Integer] => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyOnMonthDays")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnlyOnWeek(value: Integer => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyOnWeek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnlyOnWeekday(value: Weekday => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyOnWeekday")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnlyOnWeekdays(value: js.Array[Weekday] => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyOnWeekdays")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnlyOnWeeks(value: js.Array[Integer] => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyOnWeeks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnlyOnYearDay(value: Integer => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyOnYearDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnlyOnYearDays(value: js.Array[Integer] => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyOnYearDays")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTimeZone(value: String => EventRecurrence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeZone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimes(value: Integer => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("times")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUntil(value: Date => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("until")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWeekStartsOn(value: Weekday => RecurrenceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStartsOn")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

