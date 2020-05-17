package typingsSlinky.arangodb.queuesMod

import typingsSlinky.arangodb.anon.DocumentJob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobOptions extends js.Object {
  var backOff: js.UndefOr[(js.Function1[/* failureCount */ Double, Double]) | Double] = js.native
  var delayUntil: js.UndefOr[Double | js.Date] = js.native
  var failure: js.UndefOr[JobCallback] = js.native
  var maxFailures: js.UndefOr[Double] = js.native
  var repeatDelay: js.UndefOr[Double] = js.native
  var repeatTimes: js.UndefOr[Double] = js.native
  var repeatUntil: js.UndefOr[Double | js.Date] = js.native
  var success: js.UndefOr[JobCallback] = js.native
}

object JobOptions {
  @scala.inline
  def apply(): JobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobOptions]
  }
  @scala.inline
  implicit class JobOptionsOps[Self <: JobOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackOffFunction1(value: /* failureCount */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backOff")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBackOff(value: (js.Function1[/* failureCount */ Double, Double]) | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backOff")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayUntilDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelayUntil(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayUntil")(js.undefined)
        ret
    }
    @scala.inline
    def withFailure(value: (/* result */ js.Any, /* jobData */ js.Any, /* job */ DocumentJob) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFailures")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatTimes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatTimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatTimes")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatUntilDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatUntil(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatUntil")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: (/* result */ js.Any, /* jobData */ js.Any, /* job */ DocumentJob) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

