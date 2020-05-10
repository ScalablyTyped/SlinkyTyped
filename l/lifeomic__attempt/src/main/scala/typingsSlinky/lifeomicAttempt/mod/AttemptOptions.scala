package typingsSlinky.lifeomicAttempt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttemptOptions[T] extends js.Object {
  val beforeAttempt: BeforeAttempt[T] | Null = js.native
  val calculateDelay: CalculateDelay[T] | Null = js.native
  val delay: Double = js.native
  val factor: Double = js.native
  val handleError: HandleError[T] | Null = js.native
  val handleTimeout: HandleTimeout[T] | Null = js.native
  val initialDelay: Double = js.native
  val jitter: Boolean = js.native
  val maxAttempts: Double = js.native
  val maxDelay: Double = js.native
  val minDelay: Double = js.native
  val timeout: Double = js.native
}

object AttemptOptions {
  @scala.inline
  def apply[T](
    delay: Double,
    factor: Double,
    initialDelay: Double,
    jitter: Boolean,
    maxAttempts: Double,
    maxDelay: Double,
    minDelay: Double,
    timeout: Double
  ): AttemptOptions[T] = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], initialDelay = initialDelay.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], maxAttempts = maxAttempts.asInstanceOf[js.Any], maxDelay = maxDelay.asInstanceOf[js.Any], minDelay = minDelay.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttemptOptions[T]]
  }
  @scala.inline
  implicit class AttemptOptionsOps[Self[t] <: AttemptOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDelay(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFactor(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialDelay(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJitter(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxAttempts(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDelay(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDelay(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeAttempt(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAttempt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBeforeAttemptNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAttempt")(null)
        ret
    }
    @scala.inline
    def withCalculateDelay(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateDelay")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCalculateDelayNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateDelay")(null)
        ret
    }
    @scala.inline
    def withHandleError(value: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[T]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleError")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHandleErrorNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleError")(null)
        ret
    }
    @scala.inline
    def withHandleTimeout(value: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => js.Promise[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTimeout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHandleTimeoutNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTimeout")(null)
        ret
    }
  }
  
}

