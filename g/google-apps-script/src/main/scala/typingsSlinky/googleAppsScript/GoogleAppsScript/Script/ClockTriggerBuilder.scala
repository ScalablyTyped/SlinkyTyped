package typingsSlinky.googleAppsScript.GoogleAppsScript.Script

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Date
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Weekday
import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for clock triggers.
  */
@js.native
trait ClockTriggerBuilder extends js.Object {
  def after(durationMilliseconds: Integer): ClockTriggerBuilder = js.native
  def at(date: Date): ClockTriggerBuilder = js.native
  def atDate(year: Integer, month: Integer, day: Integer): ClockTriggerBuilder = js.native
  def atHour(hour: Integer): ClockTriggerBuilder = js.native
  def create(): Trigger = js.native
  def everyDays(n: Integer): ClockTriggerBuilder = js.native
  def everyHours(n: Integer): ClockTriggerBuilder = js.native
  def everyMinutes(n: Integer): ClockTriggerBuilder = js.native
  def everyWeeks(n: Integer): ClockTriggerBuilder = js.native
  def inTimezone(timezone: String): ClockTriggerBuilder = js.native
  def nearMinute(minute: Integer): ClockTriggerBuilder = js.native
  def onMonthDay(day: Integer): ClockTriggerBuilder = js.native
  def onWeekDay(day: Weekday): ClockTriggerBuilder = js.native
}

object ClockTriggerBuilder {
  @scala.inline
  def apply(
    after: Integer => ClockTriggerBuilder,
    at: Date => ClockTriggerBuilder,
    atDate: (Integer, Integer, Integer) => ClockTriggerBuilder,
    atHour: Integer => ClockTriggerBuilder,
    create: () => Trigger,
    everyDays: Integer => ClockTriggerBuilder,
    everyHours: Integer => ClockTriggerBuilder,
    everyMinutes: Integer => ClockTriggerBuilder,
    everyWeeks: Integer => ClockTriggerBuilder,
    inTimezone: String => ClockTriggerBuilder,
    nearMinute: Integer => ClockTriggerBuilder,
    onMonthDay: Integer => ClockTriggerBuilder,
    onWeekDay: Weekday => ClockTriggerBuilder
  ): ClockTriggerBuilder = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), at = js.Any.fromFunction1(at), atDate = js.Any.fromFunction3(atDate), atHour = js.Any.fromFunction1(atHour), create = js.Any.fromFunction0(create), everyDays = js.Any.fromFunction1(everyDays), everyHours = js.Any.fromFunction1(everyHours), everyMinutes = js.Any.fromFunction1(everyMinutes), everyWeeks = js.Any.fromFunction1(everyWeeks), inTimezone = js.Any.fromFunction1(inTimezone), nearMinute = js.Any.fromFunction1(nearMinute), onMonthDay = js.Any.fromFunction1(onMonthDay), onWeekDay = js.Any.fromFunction1(onWeekDay))
    __obj.asInstanceOf[ClockTriggerBuilder]
  }
  @scala.inline
  implicit class ClockTriggerBuilderOps[Self <: ClockTriggerBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: Integer => ClockTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAt(value: Date => ClockTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAtDate(value: (Integer, Integer, Integer) => ClockTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atDate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAtHour(value: Integer => ClockTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atHour")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: () => Trigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEveryDays(value: Integer => ClockTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("everyDays")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEveryHours(value: Integer => ClockTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("everyHours")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEveryMinutes(value: Integer => ClockTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("everyMinutes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEveryWeeks(value: Integer => ClockTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("everyWeeks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInTimezone(value: String => ClockTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inTimezone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNearMinute(value: Integer => ClockTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearMinute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMonthDay(value: Integer => ClockTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnWeekDay(value: Weekday => ClockTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWeekDay")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

