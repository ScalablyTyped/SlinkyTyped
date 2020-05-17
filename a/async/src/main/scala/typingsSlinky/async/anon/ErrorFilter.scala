package typingsSlinky.async.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorFilter extends js.Object {
  var errorFilter: js.UndefOr[js.Function1[/* error */ js.Error, Boolean]] = js.native
  var interval: js.UndefOr[Double | (js.Function1[/* retryCount */ Double, Double])] = js.native
  var times: js.UndefOr[Double] = js.native
}

object ErrorFilter {
  @scala.inline
  def apply(): ErrorFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorFilter]
  }
  @scala.inline
  implicit class ErrorFilterOps[Self <: ErrorFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorFilter(value: /* error */ js.Error => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErrorFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervalFunction1(value: /* retryCount */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInterval(value: Double | (js.Function1[/* retryCount */ Double, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withTimes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("times")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("times")(js.undefined)
        ret
    }
  }
  
}

