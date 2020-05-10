package typingsSlinky.datejs.sugarpak

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateElement extends js.Object {
  def day(): IDateElementEvaluator = js.native
  def days(): IDateElementEvaluator = js.native
  def hour(): IDateElementEvaluator = js.native
  def hours(): IDateElementEvaluator = js.native
  def millisecond(): IDateElementEvaluator = js.native
  def milliseconds(): IDateElementEvaluator = js.native
  def minute(): IDateElementEvaluator = js.native
  def minutes(): IDateElementEvaluator = js.native
  def month(): IDateElementEvaluator = js.native
  def months(): IDateElementEvaluator = js.native
  def second(): IDateElementEvaluator = js.native
  def seconds(): IDateElementEvaluator = js.native
  def week(): IDateElementEvaluator = js.native
  def weeks(): IDateElementEvaluator = js.native
  def year(): IDateElementEvaluator = js.native
  def years(): IDateElementEvaluator = js.native
}

object IDateElement {
  @scala.inline
  def apply(
    day: () => IDateElementEvaluator,
    days: () => IDateElementEvaluator,
    hour: () => IDateElementEvaluator,
    hours: () => IDateElementEvaluator,
    millisecond: () => IDateElementEvaluator,
    milliseconds: () => IDateElementEvaluator,
    minute: () => IDateElementEvaluator,
    minutes: () => IDateElementEvaluator,
    month: () => IDateElementEvaluator,
    months: () => IDateElementEvaluator,
    second: () => IDateElementEvaluator,
    seconds: () => IDateElementEvaluator,
    week: () => IDateElementEvaluator,
    weeks: () => IDateElementEvaluator,
    year: () => IDateElementEvaluator,
    years: () => IDateElementEvaluator
  ): IDateElement = {
    val __obj = js.Dynamic.literal(day = js.Any.fromFunction0(day), days = js.Any.fromFunction0(days), hour = js.Any.fromFunction0(hour), hours = js.Any.fromFunction0(hours), millisecond = js.Any.fromFunction0(millisecond), milliseconds = js.Any.fromFunction0(milliseconds), minute = js.Any.fromFunction0(minute), minutes = js.Any.fromFunction0(minutes), month = js.Any.fromFunction0(month), months = js.Any.fromFunction0(months), second = js.Any.fromFunction0(second), seconds = js.Any.fromFunction0(seconds), week = js.Any.fromFunction0(week), weeks = js.Any.fromFunction0(weeks), year = js.Any.fromFunction0(year), years = js.Any.fromFunction0(years))
    __obj.asInstanceOf[IDateElement]
  }
  @scala.inline
  implicit class IDateElementOps[Self <: IDateElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDays(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHour(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHours(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMillisecond(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecond")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMilliseconds(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milliseconds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMinute(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMinutes(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMonth(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMonths(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSecond(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSeconds(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWeek(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWeeks(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeks")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withYear(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withYears(value: () => IDateElementEvaluator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("years")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

