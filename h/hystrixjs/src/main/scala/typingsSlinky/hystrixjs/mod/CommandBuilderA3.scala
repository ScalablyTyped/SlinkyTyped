package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandBuilderA3[R, T, U, V] extends js.Object {
  def build(): CommandA3[R, T, U, V] = js.native
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA3[R, T, U, V] = js.native
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA3[R, T, U, V] = js.native
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  def context(value: js.Any): CommandBuilderA3[R, T, U, V] = js.native
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA3[R, T, U, V] = js.native
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple3[T, U, V], js.Thenable[R]]): CommandBuilderA3[R, T, U, V] = js.native
  def percentileWindowLength(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  def run(value: js.Function3[/* t */ T, /* u */ U, /* v */ V, js.Thenable[R]]): CommandBuilderA3[R, T, U, V] = js.native
  def statisticalWindowLength(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  def timeout(value: Double): CommandBuilderA3[R, T, U, V] = js.native
}

object CommandBuilderA3 {
  @scala.inline
  def apply[R, T, U, V](
    build: () => CommandA3[R, T, U, V],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA3[R, T, U, V],
    circuitBreakerForceClosed: Boolean => CommandBuilderA3[R, T, U, V],
    circuitBreakerForceOpened: Boolean => CommandBuilderA3[R, T, U, V],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA3[R, T, U, V],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA3[R, T, U, V],
    context: js.Any => CommandBuilderA3[R, T, U, V],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA3[R, T, U, V],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple3[T, U, V], js.Thenable[R]] => CommandBuilderA3[R, T, U, V],
    percentileWindowLength: Double => CommandBuilderA3[R, T, U, V],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA3[R, T, U, V],
    requestVolumeRejectionThreshold: Double => CommandBuilderA3[R, T, U, V],
    run: js.Function3[/* t */ T, /* u */ U, /* v */ V, js.Thenable[R]] => CommandBuilderA3[R, T, U, V],
    statisticalWindowLength: Double => CommandBuilderA3[R, T, U, V],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA3[R, T, U, V],
    timeout: Double => CommandBuilderA3[R, T, U, V]
  ): CommandBuilderA3[R, T, U, V] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA3[R, T, U, V]]
  }
  @scala.inline
  implicit class CommandBuilderA3Ops[Self[r, t, u, v] <: CommandBuilderA3[r, t, u, v], R, T, U, V] (val x: Self[R, T, U, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T, U, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T, U, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T, U, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T, U, V]) with Other]
    @scala.inline
    def withBuild(value: () => CommandA3[R, T, U, V]): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA3[R, T, U, V]): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceClosed(value: Boolean => CommandBuilderA3[R, T, U, V]): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceOpened(value: Boolean => CommandBuilderA3[R, T, U, V]): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA3[R, T, U, V]): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA3[R, T, U, V]): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: js.Any => CommandBuilderA3[R, T, U, V]): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA3[R, T, U, V]): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.Tuple3[T, U, V], js.Thenable[R]] => CommandBuilderA3[R, T, U, V]
    ): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowLength(value: Double => CommandBuilderA3[R, T, U, V]): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA3[R, T, U, V]): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestVolumeRejectionThreshold(value: Double => CommandBuilderA3[R, T, U, V]): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun(
      value: js.Function3[/* t */ T, /* u */ U, /* v */ V, js.Thenable[R]] => CommandBuilderA3[R, T, U, V]
    ): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowLength(value: Double => CommandBuilderA3[R, T, U, V]): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA3[R, T, U, V]): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeout(value: Double => CommandBuilderA3[R, T, U, V]): Self[R, T, U, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

