package typingsSlinky.datejs.sugarpak

import typingsSlinky.datejs.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAddOrientation extends js.Object {
  def day(): Date = js.native
  def days(): Date = js.native
  def hour(): Date = js.native
  def hours(): Date = js.native
  def millisecond(): Date = js.native
  def milliseconds(): Date = js.native
  def minute(): Date = js.native
  def minutes(): Date = js.native
  def month(): Date = js.native
  def months(): Date = js.native
  def second(): Date = js.native
  def seconds(): Date = js.native
  def week(): Date = js.native
  def weeks(): Date = js.native
  def year(): Date = js.native
  def years(): Date = js.native
}

object IAddOrientation {
  @scala.inline
  def apply(
    day: () => Date,
    days: () => Date,
    hour: () => Date,
    hours: () => Date,
    millisecond: () => Date,
    milliseconds: () => Date,
    minute: () => Date,
    minutes: () => Date,
    month: () => Date,
    months: () => Date,
    second: () => Date,
    seconds: () => Date,
    week: () => Date,
    weeks: () => Date,
    year: () => Date,
    years: () => Date
  ): IAddOrientation = {
    val __obj = js.Dynamic.literal(day = js.Any.fromFunction0(day), days = js.Any.fromFunction0(days), hour = js.Any.fromFunction0(hour), hours = js.Any.fromFunction0(hours), millisecond = js.Any.fromFunction0(millisecond), milliseconds = js.Any.fromFunction0(milliseconds), minute = js.Any.fromFunction0(minute), minutes = js.Any.fromFunction0(minutes), month = js.Any.fromFunction0(month), months = js.Any.fromFunction0(months), second = js.Any.fromFunction0(second), seconds = js.Any.fromFunction0(seconds), week = js.Any.fromFunction0(week), weeks = js.Any.fromFunction0(weeks), year = js.Any.fromFunction0(year), years = js.Any.fromFunction0(years))
    __obj.asInstanceOf[IAddOrientation]
  }
  @scala.inline
  implicit class IAddOrientationOps[Self <: IAddOrientation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDays(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHour(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHours(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMillisecond(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecond")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMilliseconds(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milliseconds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMinute(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMinutes(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMonth(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMonths(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSecond(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSeconds(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWeek(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWeeks(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeks")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withYear(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withYears(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("years")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

