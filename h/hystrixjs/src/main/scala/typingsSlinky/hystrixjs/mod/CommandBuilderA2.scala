package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandBuilderA2[R, T, U] extends js.Object {
  def build(): CommandA2[R, T, U] = js.native
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA2[R, T, U] = js.native
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA2[R, T, U] = js.native
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA2[R, T, U] = js.native
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA2[R, T, U] = js.native
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA2[R, T, U] = js.native
  def context(value: js.Any): CommandBuilderA2[R, T, U] = js.native
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA2[R, T, U] = js.native
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple2[T, U], js.Thenable[R]]): CommandBuilderA2[R, T, U] = js.native
  def percentileWindowLength(value: Double): CommandBuilderA2[R, T, U] = js.native
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA2[R, T, U] = js.native
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA2[R, T, U] = js.native
  def run(value: js.Function2[/* t */ T, /* u */ U, js.Thenable[R]]): CommandBuilderA2[R, T, U] = js.native
  def statisticalWindowLength(value: Double): CommandBuilderA2[R, T, U] = js.native
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA2[R, T, U] = js.native
  def timeout(value: Double): CommandBuilderA2[R, T, U] = js.native
}

object CommandBuilderA2 {
  @scala.inline
  def apply[R, T, U](
    build: () => CommandA2[R, T, U],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA2[R, T, U],
    circuitBreakerForceClosed: Boolean => CommandBuilderA2[R, T, U],
    circuitBreakerForceOpened: Boolean => CommandBuilderA2[R, T, U],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA2[R, T, U],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA2[R, T, U],
    context: js.Any => CommandBuilderA2[R, T, U],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA2[R, T, U],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple2[T, U], js.Thenable[R]] => CommandBuilderA2[R, T, U],
    percentileWindowLength: Double => CommandBuilderA2[R, T, U],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA2[R, T, U],
    requestVolumeRejectionThreshold: Double => CommandBuilderA2[R, T, U],
    run: js.Function2[/* t */ T, /* u */ U, js.Thenable[R]] => CommandBuilderA2[R, T, U],
    statisticalWindowLength: Double => CommandBuilderA2[R, T, U],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA2[R, T, U],
    timeout: Double => CommandBuilderA2[R, T, U]
  ): CommandBuilderA2[R, T, U] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA2[R, T, U]]
  }
  @scala.inline
  implicit class CommandBuilderA2Ops[Self[r, t, u] <: CommandBuilderA2[r, t, u], R, T, U] (val x: Self[R, T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T, U]) with Other]
    @scala.inline
    def withBuild(value: () => CommandA2[R, T, U]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA2[R, T, U]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceClosed(value: Boolean => CommandBuilderA2[R, T, U]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceOpened(value: Boolean => CommandBuilderA2[R, T, U]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA2[R, T, U]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA2[R, T, U]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: js.Any => CommandBuilderA2[R, T, U]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA2[R, T, U]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.Tuple2[T, U], js.Thenable[R]] => CommandBuilderA2[R, T, U]
    ): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowLength(value: Double => CommandBuilderA2[R, T, U]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA2[R, T, U]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestVolumeRejectionThreshold(value: Double => CommandBuilderA2[R, T, U]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun(value: js.Function2[/* t */ T, /* u */ U, js.Thenable[R]] => CommandBuilderA2[R, T, U]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowLength(value: Double => CommandBuilderA2[R, T, U]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA2[R, T, U]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeout(value: Double => CommandBuilderA2[R, T, U]): Self[R, T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

