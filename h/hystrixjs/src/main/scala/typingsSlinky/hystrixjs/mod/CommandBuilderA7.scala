package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandBuilderA7[R, T, U, V, W, X, Y, Z] extends js.Object {
  def build(): CommandA7[R, T, U, V, W, X, Y, Z] = js.native
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  def context(value: js.Any): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  def fallbackTo(
    value: js.Function2[/* error */ js.Error, /* args */ js.Tuple7[T, U, V, W, X, Y, Z], js.Thenable[R]]
  ): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  def percentileWindowLength(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  def run(
    value: js.Function7[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, /* z */ Z, js.Thenable[R]]
  ): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  def statisticalWindowLength(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
  def timeout(value: Double): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = js.native
}

object CommandBuilderA7 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y, Z](
    build: () => CommandA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerForceClosed: Boolean => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerForceOpened: Boolean => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    context: js.Any => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple7[T, U, V, W, X, Y, Z], js.Thenable[R]] => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    percentileWindowLength: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    requestVolumeRejectionThreshold: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    run: js.Function7[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, /* z */ Z, js.Thenable[R]] => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    statisticalWindowLength: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z],
    timeout: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]
  ): CommandBuilderA7[R, T, U, V, W, X, Y, Z] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA7[R, T, U, V, W, X, Y, Z]]
  }
  @scala.inline
  implicit class CommandBuilderA7Ops[Self[r, t, u, v, w, x, y, z] <: CommandBuilderA7[r, t, u, v, w, x, y, z], R, T, U, V, W, X, Y, Z] (val x: Self[R, T, U, V, W, X, Y, Z]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T, U, V, W, X, Y, Z] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T, U, V, W, X, Y, Z]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T, U, V, W, X, Y, Z]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T, U, V, W, X, Y, Z]) with Other]
    @scala.inline
    def withBuild(value: () => CommandA7[R, T, U, V, W, X, Y, Z]): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceClosed(value: Boolean => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceOpened(value: Boolean => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: js.Any => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.Tuple7[T, U, V, W, X, Y, Z], js.Thenable[R]] => CommandBuilderA7[R, T, U, V, W, X, Y, Z]
    ): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowLength(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestVolumeRejectionThreshold(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun(
      value: js.Function7[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, /* z */ Z, js.Thenable[R]] => CommandBuilderA7[R, T, U, V, W, X, Y, Z]
    ): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowLength(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeout(value: Double => CommandBuilderA7[R, T, U, V, W, X, Y, Z]): Self[R, T, U, V, W, X, Y, Z] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

