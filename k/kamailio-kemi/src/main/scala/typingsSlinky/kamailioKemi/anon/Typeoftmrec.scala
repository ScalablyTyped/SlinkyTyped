package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftmrec extends js.Object {
  def is_leap_year(y: Double): Double = js.native
  def is_leap_year_now(): Double = js.native
  def `match`(rv: String): Double = js.native
  def match_timestamp(rv: String, ti: Double): Double = js.native
  def time_period_match(period: String): Double = js.native
  def time_period_match_timestamp(period: String, ti: Double): Double = js.native
}

object Typeoftmrec {
  @scala.inline
  def apply(
    is_leap_year: Double => Double,
    is_leap_year_now: () => Double,
    `match`: String => Double,
    match_timestamp: (String, Double) => Double,
    time_period_match: String => Double,
    time_period_match_timestamp: (String, Double) => Double
  ): Typeoftmrec = {
    val __obj = js.Dynamic.literal(is_leap_year = js.Any.fromFunction1(is_leap_year), is_leap_year_now = js.Any.fromFunction0(is_leap_year_now), match_timestamp = js.Any.fromFunction2(match_timestamp), time_period_match = js.Any.fromFunction1(time_period_match), time_period_match_timestamp = js.Any.fromFunction2(time_period_match_timestamp))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Typeoftmrec]
  }
  @scala.inline
  implicit class TypeoftmrecOps[Self <: Typeoftmrec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs_leap_year(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_leap_year")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIs_leap_year_now(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_leap_year_now")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMatch(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatch_timestamp(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match_timestamp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTime_period_match(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_period_match")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTime_period_match_timestamp(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_period_match_timestamp")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

