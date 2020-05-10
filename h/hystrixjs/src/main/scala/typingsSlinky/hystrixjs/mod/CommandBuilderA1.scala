package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandBuilderA1[R, T] extends js.Object {
  def build(): CommandA1[R, T] = js.native
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA1[R, T] = js.native
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA1[R, T] = js.native
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA1[R, T] = js.native
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA1[R, T] = js.native
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA1[R, T] = js.native
  def context(value: js.Any): CommandBuilderA1[R, T] = js.native
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA1[R, T] = js.native
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Array[T], js.Thenable[R]]): CommandBuilderA1[R, T] = js.native
  def percentileWindowLength(value: Double): CommandBuilderA1[R, T] = js.native
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA1[R, T] = js.native
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA1[R, T] = js.native
  def run(value: js.Function1[/* t */ T, js.Thenable[R]]): CommandBuilderA1[R, T] = js.native
  def statisticalWindowLength(value: Double): CommandBuilderA1[R, T] = js.native
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA1[R, T] = js.native
  def timeout(value: Double): CommandBuilderA1[R, T] = js.native
}

object CommandBuilderA1 {
  @scala.inline
  def apply[R, T](
    build: () => CommandA1[R, T],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA1[R, T],
    circuitBreakerForceClosed: Boolean => CommandBuilderA1[R, T],
    circuitBreakerForceOpened: Boolean => CommandBuilderA1[R, T],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA1[R, T],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA1[R, T],
    context: js.Any => CommandBuilderA1[R, T],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA1[R, T],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Array[T], js.Thenable[R]] => CommandBuilderA1[R, T],
    percentileWindowLength: Double => CommandBuilderA1[R, T],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA1[R, T],
    requestVolumeRejectionThreshold: Double => CommandBuilderA1[R, T],
    run: js.Function1[/* t */ T, js.Thenable[R]] => CommandBuilderA1[R, T],
    statisticalWindowLength: Double => CommandBuilderA1[R, T],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA1[R, T],
    timeout: Double => CommandBuilderA1[R, T]
  ): CommandBuilderA1[R, T] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA1[R, T]]
  }
  @scala.inline
  implicit class CommandBuilderA1Ops[Self[r, t] <: CommandBuilderA1[r, t], R, T] (val x: Self[R, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T]) with Other]
    @scala.inline
    def withBuild(value: () => CommandA1[R, T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA1[R, T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceClosed(value: Boolean => CommandBuilderA1[R, T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceOpened(value: Boolean => CommandBuilderA1[R, T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA1[R, T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA1[R, T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: js.Any => CommandBuilderA1[R, T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA1[R, T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.Array[T], js.Thenable[R]] => CommandBuilderA1[R, T]
    ): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowLength(value: Double => CommandBuilderA1[R, T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA1[R, T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestVolumeRejectionThreshold(value: Double => CommandBuilderA1[R, T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun(value: js.Function1[/* t */ T, js.Thenable[R]] => CommandBuilderA1[R, T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowLength(value: Double => CommandBuilderA1[R, T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA1[R, T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeout(value: Double => CommandBuilderA1[R, T]): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

