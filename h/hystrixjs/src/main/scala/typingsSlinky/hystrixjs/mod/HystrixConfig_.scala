package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HystrixConfig_ extends js.Object {
  def circuitBreakerErrorThresholdPercentage(): Double = js.native
  def circuitBreakerForceClosed(): Boolean = js.native
  def circuitBreakerForceOpened(): Boolean = js.native
  def circuitBreakerRequestVolumeThreshold(): Double = js.native
  def circuitBreakerRequestVolumeThresholdForceOverride(): Boolean = js.native
  def circuitBreakerRequestVolumeThresholdOverride(): Double = js.native
  def circuitBreakerSleepWindowInMilliseconds(): Double = js.native
  def executionTimeoutInMilliseconds(): Double = js.native
  def init(properties: HystrixProperties): Unit = js.native
  def metricsPercentileWindowBuckets(): Double = js.native
  def metricsPercentileWindowInMilliseconds(): Double = js.native
  def metricsStatisticalWindowBuckets(): Double = js.native
  def metricsStatisticalWindowInMilliseconds(): Double = js.native
  def requestVolumeRejectionThreshold(): Double = js.native
  def resetProperties(): Unit = js.native
}

object HystrixConfig_ {
  @scala.inline
  def apply(
    circuitBreakerErrorThresholdPercentage: () => Double,
    circuitBreakerForceClosed: () => Boolean,
    circuitBreakerForceOpened: () => Boolean,
    circuitBreakerRequestVolumeThreshold: () => Double,
    circuitBreakerRequestVolumeThresholdForceOverride: () => Boolean,
    circuitBreakerRequestVolumeThresholdOverride: () => Double,
    circuitBreakerSleepWindowInMilliseconds: () => Double,
    executionTimeoutInMilliseconds: () => Double,
    init: HystrixProperties => Unit,
    metricsPercentileWindowBuckets: () => Double,
    metricsPercentileWindowInMilliseconds: () => Double,
    metricsStatisticalWindowBuckets: () => Double,
    metricsStatisticalWindowInMilliseconds: () => Double,
    requestVolumeRejectionThreshold: () => Double,
    resetProperties: () => Unit
  ): HystrixConfig_ = {
    val __obj = js.Dynamic.literal(circuitBreakerErrorThresholdPercentage = js.Any.fromFunction0(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction0(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction0(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction0(circuitBreakerRequestVolumeThreshold), circuitBreakerRequestVolumeThresholdForceOverride = js.Any.fromFunction0(circuitBreakerRequestVolumeThresholdForceOverride), circuitBreakerRequestVolumeThresholdOverride = js.Any.fromFunction0(circuitBreakerRequestVolumeThresholdOverride), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction0(circuitBreakerSleepWindowInMilliseconds), executionTimeoutInMilliseconds = js.Any.fromFunction0(executionTimeoutInMilliseconds), init = js.Any.fromFunction1(init), metricsPercentileWindowBuckets = js.Any.fromFunction0(metricsPercentileWindowBuckets), metricsPercentileWindowInMilliseconds = js.Any.fromFunction0(metricsPercentileWindowInMilliseconds), metricsStatisticalWindowBuckets = js.Any.fromFunction0(metricsStatisticalWindowBuckets), metricsStatisticalWindowInMilliseconds = js.Any.fromFunction0(metricsStatisticalWindowInMilliseconds), requestVolumeRejectionThreshold = js.Any.fromFunction0(requestVolumeRejectionThreshold), resetProperties = js.Any.fromFunction0(resetProperties))
    __obj.asInstanceOf[HystrixConfig_]
  }
  @scala.inline
  implicit class HystrixConfig_Ops[Self <: HystrixConfig_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircuitBreakerErrorThresholdPercentage(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerErrorThresholdPercentage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceClosed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceClosed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerForceOpened(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceOpened")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerRequestVolumeThreshold(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerRequestVolumeThreshold")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerRequestVolumeThresholdForceOverride(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerRequestVolumeThresholdForceOverride")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerRequestVolumeThresholdOverride(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerRequestVolumeThresholdOverride")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCircuitBreakerSleepWindowInMilliseconds(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerSleepWindowInMilliseconds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExecutionTimeoutInMilliseconds(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionTimeoutInMilliseconds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: HystrixProperties => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMetricsPercentileWindowBuckets(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsPercentileWindowBuckets")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMetricsPercentileWindowInMilliseconds(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsPercentileWindowInMilliseconds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMetricsStatisticalWindowBuckets(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsStatisticalWindowBuckets")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMetricsStatisticalWindowInMilliseconds(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsStatisticalWindowInMilliseconds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequestVolumeRejectionThreshold(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestVolumeRejectionThreshold")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResetProperties(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetProperties")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

