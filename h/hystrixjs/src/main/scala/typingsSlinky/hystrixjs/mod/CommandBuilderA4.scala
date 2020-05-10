package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandBuilderA4[R, T, U, V, W] extends js.Object {
  def build(): CommandA4[R, T, U, V, W] = js.native
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA4[R, T, U, V, W] = js.native
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA4[R, T, U, V, W] = js.native
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  def context(value: js.Any): CommandBuilderA4[R, T, U, V, W] = js.native
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA4[R, T, U, V, W] = js.native
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple4[T, U, V, W], js.Thenable[R]]): CommandBuilderA4[R, T, U, V, W] = js.native
  def percentileWindowLength(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  def run(value: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, js.Thenable[R]]): CommandBuilderA4[R, T, U, V, W] = js.native
  def statisticalWindowLength(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
  def timeout(value: Double): CommandBuilderA4[R, T, U, V, W] = js.native
}

object CommandBuilderA4 {
  @scala.inline
  def apply[R, T, U, V, W](
    build: () => CommandA4[R, T, U, V, W],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerForceClosed: Boolean => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerForceOpened: Boolean => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA4[R, T, U, V, W],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA4[R, T, U, V, W],
    context: js.Any => CommandBuilderA4[R, T, U, V, W],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA4[R, T, U, V, W],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple4[T, U, V, W], js.Thenable[R]] => CommandBuilderA4[R, T, U, V, W],
    percentileWindowLength: Double => CommandBuilderA4[R, T, U, V, W],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA4[R, T, U, V, W],
    requestVolumeRejectionThreshold: Double => CommandBuilderA4[R, T, U, V, W],
    run: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, js.Thenable[R]] => CommandBuilderA4[R, T, U, V, W],
    statisticalWindowLength: Double => CommandBuilderA4[R, T, U, V, W],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA4[R, T, U, V, W],
    timeout: Double => CommandBuilderA4[R, T, U, V, W]
  ): CommandBuilderA4[R, T, U, V, W] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA4[R, T, U, V, W]]
  }
  @scala.inline
  implicit class CommandBuilderA4Ops[Self[r, t, u, v, w] <: CommandBuilderA4[r, t, u, v, w], R, T, U, V, W] (val x: Self[R, T, U, V, W]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T, U, V, W] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T, U, V, W]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T, U, V, W]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T, U, V, W]) with Other]
    @scala.inline
    def withBuild(value: () => CommandA4[R, T, U, V, W]): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA4[R, T, U, V, W]): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceClosed(value: Boolean => CommandBuilderA4[R, T, U, V, W]): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceOpened(value: Boolean => CommandBuilderA4[R, T, U, V, W]): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA4[R, T, U, V, W]): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA4[R, T, U, V, W]): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: js.Any => CommandBuilderA4[R, T, U, V, W]): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA4[R, T, U, V, W]): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.Tuple4[T, U, V, W], js.Thenable[R]] => CommandBuilderA4[R, T, U, V, W]
    ): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowLength(value: Double => CommandBuilderA4[R, T, U, V, W]): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA4[R, T, U, V, W]): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestVolumeRejectionThreshold(value: Double => CommandBuilderA4[R, T, U, V, W]): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun(
      value: js.Function4[/* t */ T, /* u */ U, /* v */ V, /* w */ W, js.Thenable[R]] => CommandBuilderA4[R, T, U, V, W]
    ): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowLength(value: Double => CommandBuilderA4[R, T, U, V, W]): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA4[R, T, U, V, W]): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeout(value: Double => CommandBuilderA4[R, T, U, V, W]): Self[R, T, U, V, W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

