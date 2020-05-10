package typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the recurrence settings for an event series.
  */
@js.native
trait EventRecurrence extends js.Object {
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
  def setTimeZone(timeZone: String): EventRecurrence = js.native
}

object EventRecurrence {
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
    setTimeZone: String => EventRecurrence
  ): EventRecurrence = {
    val __obj = js.Dynamic.literal(addDailyExclusion = js.Any.fromFunction0(addDailyExclusion), addDailyRule = js.Any.fromFunction0(addDailyRule), addDate = js.Any.fromFunction1(addDate), addDateExclusion = js.Any.fromFunction1(addDateExclusion), addMonthlyExclusion = js.Any.fromFunction0(addMonthlyExclusion), addMonthlyRule = js.Any.fromFunction0(addMonthlyRule), addWeeklyExclusion = js.Any.fromFunction0(addWeeklyExclusion), addWeeklyRule = js.Any.fromFunction0(addWeeklyRule), addYearlyExclusion = js.Any.fromFunction0(addYearlyExclusion), addYearlyRule = js.Any.fromFunction0(addYearlyRule), setTimeZone = js.Any.fromFunction1(setTimeZone))
    __obj.asInstanceOf[EventRecurrence]
  }
  @scala.inline
  implicit class EventRecurrenceOps[Self <: EventRecurrence] (val x: Self) extends AnyVal {
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
    def withSetTimeZone(value: String => EventRecurrence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeZone")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

