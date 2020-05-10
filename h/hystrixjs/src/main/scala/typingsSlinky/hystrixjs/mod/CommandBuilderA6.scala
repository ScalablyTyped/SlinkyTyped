package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandBuilderA6[R, T, U, V, W, X, Y] extends js.Object {
  def build(): CommandA6[R, T, U, V, W, X, Y] = js.native
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  def context(value: js.Any): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple6[T, U, V, W, X, Y], js.Thenable[R]]): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  def percentileWindowLength(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  def run(
    value: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, js.Thenable[R]]
  ): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  def statisticalWindowLength(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
  def timeout(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y] = js.native
}

object CommandBuilderA6 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y](
    build: () => CommandA6[R, T, U, V, W, X, Y],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerForceClosed: Boolean => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerForceOpened: Boolean => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    context: js.Any => CommandBuilderA6[R, T, U, V, W, X, Y],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA6[R, T, U, V, W, X, Y],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple6[T, U, V, W, X, Y], js.Thenable[R]] => CommandBuilderA6[R, T, U, V, W, X, Y],
    percentileWindowLength: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    requestVolumeRejectionThreshold: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    run: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, js.Thenable[R]] => CommandBuilderA6[R, T, U, V, W, X, Y],
    statisticalWindowLength: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    timeout: Double => CommandBuilderA6[R, T, U, V, W, X, Y]
  ): CommandBuilderA6[R, T, U, V, W, X, Y] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA6[R, T, U, V, W, X, Y]]
  }
  @scala.inline
  implicit class CommandBuilderA6Ops[Self[r, t, u, v, w, x, y] <: CommandBuilderA6[r, t, u, v, w, x, y], R, T, U, V, W, X, Y] (val x: Self[R, T, U, V, W, X, Y]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T, U, V, W, X, Y] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T, U, V, W, X, Y]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T, U, V, W, X, Y]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T, U, V, W, X, Y]) with Other]
    @scala.inline
    def withBuild(value: () => CommandA6[R, T, U, V, W, X, Y]): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceClosed(value: Boolean => CommandBuilderA6[R, T, U, V, W, X, Y]): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceOpened(value: Boolean => CommandBuilderA6[R, T, U, V, W, X, Y]): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: js.Any => CommandBuilderA6[R, T, U, V, W, X, Y]): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA6[R, T, U, V, W, X, Y]): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.Tuple6[T, U, V, W, X, Y], js.Thenable[R]] => CommandBuilderA6[R, T, U, V, W, X, Y]
    ): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowLength(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestVolumeRejectionThreshold(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun(
      value: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, js.Thenable[R]] => CommandBuilderA6[R, T, U, V, W, X, Y]
    ): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowLength(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeout(value: Double => CommandBuilderA6[R, T, U, V, W, X, Y]): Self[R, T, U, V, W, X, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

