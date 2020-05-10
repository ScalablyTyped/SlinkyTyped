package typingsSlinky.lifeomicAttempt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {readonly [ P in keyof @lifeomic/attempt.@lifeomic/attempt.AttemptOptions<T> ]:? @lifeomic/attempt.@lifeomic/attempt.AttemptOptions<T>[P]} */
@js.native
trait PartialAttemptOptions[T] extends js.Object {
  val beforeAttempt: js.UndefOr[BeforeAttempt[T]] = js.native
  val calculateDelay: js.UndefOr[CalculateDelay[T]] = js.native
  val delay: js.UndefOr[Double] = js.native
  val factor: js.UndefOr[Double] = js.native
  val handleError: js.UndefOr[HandleError[T]] = js.native
  val handleTimeout: js.UndefOr[HandleTimeout[T]] = js.native
  val initialDelay: js.UndefOr[Double] = js.native
  val jitter: js.UndefOr[Boolean] = js.native
  val maxAttempts: js.UndefOr[Double] = js.native
  val maxDelay: js.UndefOr[Double] = js.native
  val minDelay: js.UndefOr[Double] = js.native
  val timeout: js.UndefOr[Double] = js.native
}

object PartialAttemptOptions {
  @scala.inline
  def apply[T](): PartialAttemptOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAttemptOptions[T]]
  }
  @scala.inline
  implicit class PartialAttemptOptionsOps[Self[t] <: PartialAttemptOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBeforeAttempt(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAttempt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeAttempt: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAttempt")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculateDelay(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateDelay")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCalculateDelay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withFactor(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleError(value: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleError")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHandleError: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleError")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleTimeout(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => js.Promise[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTimeout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHandleTimeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialDelay(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDelay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withJitter(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJitter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitter")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAttempts(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAttempts: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDelay(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDelay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDelay(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDelay: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

