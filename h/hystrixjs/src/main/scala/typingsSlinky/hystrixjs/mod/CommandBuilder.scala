package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandBuilder extends js.Object {
  def build(): Command = js.native
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilder = js.native
  def circuitBreakerForceClosed(value: Boolean): CommandBuilder = js.native
  def circuitBreakerForceOpened(value: Boolean): CommandBuilder = js.native
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilder = js.native
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilder = js.native
  def context(value: js.Any): CommandBuilder = js.native
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilder = js.native
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.UndefOr[js.Array[_]], js.Thenable[_]]): CommandBuilder = js.native
  def percentileWindowLength(value: Double): CommandBuilder = js.native
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilder = js.native
  def requestVolumeRejectionThreshold(value: Double): CommandBuilder = js.native
  def run(value: js.Function1[/* repeated */ js.Any, js.Thenable[_]]): CommandBuilder = js.native
  def statisticalWindowLength(value: Double): CommandBuilder = js.native
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilder = js.native
  def timeout(value: Double): CommandBuilder = js.native
}

object CommandBuilder {
  @scala.inline
  def apply(
    build: () => Command,
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilder,
    circuitBreakerForceClosed: Boolean => CommandBuilder,
    circuitBreakerForceOpened: Boolean => CommandBuilder,
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilder,
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilder,
    context: js.Any => CommandBuilder,
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilder,
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.UndefOr[js.Array[_]], js.Thenable[_]] => CommandBuilder,
    percentileWindowLength: Double => CommandBuilder,
    percentileWindowNumberOfBuckets: Double => CommandBuilder,
    requestVolumeRejectionThreshold: Double => CommandBuilder,
    run: js.Function1[/* repeated */ js.Any, js.Thenable[_]] => CommandBuilder,
    statisticalWindowLength: Double => CommandBuilder,
    statisticalWindowNumberOfBuckets: Double => CommandBuilder,
    timeout: Double => CommandBuilder
  ): CommandBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilder]
  }
  @scala.inline
  implicit class CommandBuilderOps[Self <: CommandBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: () => Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceClosed(value: Boolean => CommandBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceOpened(value: Boolean => CommandBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: js.Any => CommandBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.UndefOr[js.Array[_]], js.Thenable[_]] => CommandBuilder
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowLength(value: Double => CommandBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentileWindowNumberOfBuckets(value: Double => CommandBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestVolumeRejectionThreshold(value: Double => CommandBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun(value: js.Function1[/* repeated */ js.Any, js.Thenable[_]] => CommandBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowLength(value: Double => CommandBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatisticalWindowNumberOfBuckets(value: Double => CommandBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowNumberOfBuckets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeout(value: Double => CommandBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

