package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandBuilderA5[R, T, U, V, W, X] extends js.Object {
  def build(): CommandA5[R, T, U, V, W, X] = js.native
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA5[R, T, U, V, W, X] = js.native
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA5[R, T, U, V, W, X] = js.native
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  def context(value: js.Any): CommandBuilderA5[R, T, U, V, W, X] = js.native
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA5[R, T, U, V, W, X] = js.native
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple5[T, U, V, W, X], js.Thenable[R]]): CommandBuilderA5[R, T, U, V, W, X] = js.native
  def percentileWindowLength(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  def run(value: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, js.Thenable[R]]): CommandBuilderA5[R, T, U, V, W, X] = js.native
  def statisticalWindowLength(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  def timeout(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
}

object CommandBuilderA5 {
  @scala.inline
  def apply[R, T, U, V, W, X](
    build: () => CommandA5[R, T, U, V, W, X],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerForceClosed: Boolean => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerForceOpened: Boolean => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA5[R, T, U, V, W, X],
    context: js.Any => CommandBuilderA5[R, T, U, V, W, X],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA5[R, T, U, V, W, X],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple5[T, U, V, W, X], js.Thenable[R]] => CommandBuilderA5[R, T, U, V, W, X],
    percentileWindowLength: Double => CommandBuilderA5[R, T, U, V, W, X],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA5[R, T, U, V, W, X],
    requestVolumeRejectionThreshold: Double => CommandBuilderA5[R, T, U, V, W, X],
    run: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, js.Thenable[R]] => CommandBuilderA5[R, T, U, V, W, X],
    statisticalWindowLength: Double => CommandBuilderA5[R, T, U, V, W, X],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA5[R, T, U, V, W, X],
    timeout: Double => CommandBuilderA5[R, T, U, V, W, X]
  ): CommandBuilderA5[R, T, U, V, W, X] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA5[R, T, U, V, W, X]]
  }
  @scala.inline
  implicit class CommandBuilderA5Ops[Self[r, t, u, v, w, x] <: CommandBuilderA5[r, t, u, v, w, x], R, T, U, V, W, X] (val x: Self[R, T, U, V, W, X]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T, U, V, W, X] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T, U, V, W, X]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T, U, V, W, X]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T, U, V, W, X]) with Other]
    @scala.inline
    def withBuild(value: () => CommandA5[R, T, U, V, W, X]): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceClosed(value: Boolean => CommandBuilderA5[R, T, U, V, W, X]): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceOpened(value: Boolean => CommandBuilderA5[R, T, U, V, W, X]): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: js.Any => CommandBuilderA5[R, T, U, V, W, X]): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA5[R, T, U, V, W, X]): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.Tuple5[T, U, V, W, X], js.Thenable[R]] => CommandBuilderA5[R, T, U, V, W, X]
    ): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowLength(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestVolumeRejectionThreshold(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun(
      value: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, js.Thenable[R]] => CommandBuilderA5[R, T, U, V, W, X]
    ): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowLength(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeout(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self[R, T, U, V, W, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

