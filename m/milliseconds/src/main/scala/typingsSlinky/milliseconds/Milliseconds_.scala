package typingsSlinky.milliseconds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Milliseconds_ extends js.Object {
  def days(days: Double): Double = js.native
  def hours(hours: Double): Double = js.native
  def minutes(minutes: Double): Double = js.native
  def months(months: Double): Double = js.native
  def seconds(seconds: Double): Double = js.native
  def weeks(weeks: Double): Double = js.native
  def years(years: Double): Double = js.native
}

object Milliseconds_ {
  @scala.inline
  def apply(
    days: Double => Double,
    hours: Double => Double,
    minutes: Double => Double,
    months: Double => Double,
    seconds: Double => Double,
    weeks: Double => Double,
    years: Double => Double
  ): Milliseconds_ = {
    val __obj = js.Dynamic.literal(days = js.Any.fromFunction1(days), hours = js.Any.fromFunction1(hours), minutes = js.Any.fromFunction1(minutes), months = js.Any.fromFunction1(months), seconds = js.Any.fromFunction1(seconds), weeks = js.Any.fromFunction1(weeks), years = js.Any.fromFunction1(years))
    __obj.asInstanceOf[Milliseconds_]
  }
  @scala.inline
  implicit class Milliseconds_Ops[Self <: Milliseconds_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHours(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMinutes(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMonths(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSeconds(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWeeks(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withYears(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("years")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

