package typingsSlinky.instagramPrivateApi.anon

import typingsSlinky.lifeomicAttempt.mod.AttemptContext
import typingsSlinky.lifeomicAttempt.mod.AttemptOptions
import typingsSlinky.lifeomicAttempt.mod.BeforeAttempt
import typingsSlinky.lifeomicAttempt.mod.CalculateDelay
import typingsSlinky.lifeomicAttempt.mod.HandleError
import typingsSlinky.lifeomicAttempt.mod.HandleTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@lifeomic/attempt.@lifeomic/attempt.AttemptOptions<any>> */
@js.native
trait PartialAttemptOptionsany extends js.Object {
  var beforeAttempt: js.UndefOr[BeforeAttempt[_]] = js.native
  var calculateDelay: js.UndefOr[CalculateDelay[_]] = js.native
  var delay: js.UndefOr[Double] = js.native
  var factor: js.UndefOr[Double] = js.native
  var handleError: js.UndefOr[HandleError[_]] = js.native
  var handleTimeout: js.UndefOr[HandleTimeout[_]] = js.native
  var initialDelay: js.UndefOr[Double] = js.native
  var jitter: js.UndefOr[Boolean] = js.native
  var maxAttempts: js.UndefOr[Double] = js.native
  var maxDelay: js.UndefOr[Double] = js.native
  var minDelay: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object PartialAttemptOptionsany {
  @scala.inline
  def apply(): PartialAttemptOptionsany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAttemptOptionsany]
  }
  @scala.inline
  implicit class PartialAttemptOptionsanyOps[Self <: PartialAttemptOptionsany] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeAttempt(value: (/* context */ AttemptContext, /* options */ AttemptOptions[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAttempt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeAttempt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAttempt")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculateDelay(value: (/* context */ AttemptContext, /* options */ AttemptOptions[_]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateDelay")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCalculateDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleError(value: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleError")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHandleError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleError")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleTimeout(value: (/* context */ AttemptContext, /* options */ AttemptOptions[_]) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTimeout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHandleTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withJitter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitter")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

