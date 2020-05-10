package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandBuilderA0[R] extends js.Object {
  def build(): CommandA0[R] = js.native
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA0[R] = js.native
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA0[R] = js.native
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA0[R] = js.native
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA0[R] = js.native
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA0[R] = js.native
  def context(value: js.Any): CommandBuilderA0[R] = js.native
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA0[R] = js.native
  def fallbackTo(value: js.Function1[/* error */ js.Error, js.Thenable[R]]): CommandBuilderA0[R] = js.native
  def percentileWindowLength(value: Double): CommandBuilderA0[R] = js.native
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA0[R] = js.native
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA0[R] = js.native
  def run(value: js.Function0[js.Thenable[R]]): CommandBuilderA0[R] = js.native
  def statisticalWindowLength(value: Double): CommandBuilderA0[R] = js.native
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA0[R] = js.native
  def timeout(value: Double): CommandBuilderA0[R] = js.native
}

object CommandBuilderA0 {
  @scala.inline
  def apply[R](
    build: () => CommandA0[R],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA0[R],
    circuitBreakerForceClosed: Boolean => CommandBuilderA0[R],
    circuitBreakerForceOpened: Boolean => CommandBuilderA0[R],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA0[R],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA0[R],
    context: js.Any => CommandBuilderA0[R],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA0[R],
    fallbackTo: js.Function1[/* error */ js.Error, js.Thenable[R]] => CommandBuilderA0[R],
    percentileWindowLength: Double => CommandBuilderA0[R],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA0[R],
    requestVolumeRejectionThreshold: Double => CommandBuilderA0[R],
    run: js.Function0[js.Thenable[R]] => CommandBuilderA0[R],
    statisticalWindowLength: Double => CommandBuilderA0[R],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA0[R],
    timeout: Double => CommandBuilderA0[R]
  ): CommandBuilderA0[R] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA0[R]]
  }
  @scala.inline
  implicit class CommandBuilderA0Ops[Self[r] <: CommandBuilderA0[r], R] (val x: Self[R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[R] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[R] with Other]
    @scala.inline
    def withBuild(value: () => CommandA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceClosed(value: Boolean => CommandBuilderA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceOpened(value: Boolean => CommandBuilderA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: js.Any => CommandBuilderA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFallbackTo(value: js.Function1[/* error */ js.Error, js.Thenable[R]] => CommandBuilderA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowLength(value: Double => CommandBuilderA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestVolumeRejectionThreshold(value: Double => CommandBuilderA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun(value: js.Function0[js.Thenable[R]] => CommandBuilderA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowLength(value: Double => CommandBuilderA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeout(value: Double => CommandBuilderA0[R]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

