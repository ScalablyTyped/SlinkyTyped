package typingsSlinky.hystrixjs.mod

import typingsSlinky.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HystrixProperties extends js.Object {
  @JSName("hystrix.circuit.errorThresholdPercentage")
  var hystrixDotcircuitDoterrorThresholdPercentage: js.UndefOr[Double] = js.native
  @JSName("hystrix.circuit.sleepWindowInMilliseconds")
  var hystrixDotcircuitDotsleepWindowInMilliseconds: js.UndefOr[Double] = js.native
  @JSName("hystrix.circuit.volumeThreshold")
  var hystrixDotcircuitDotvolumeThreshold: js.UndefOr[Double] = js.native
  @JSName("hystrix.circuit.volumeThreshold.forceOverride")
  var hystrixDotcircuitDotvolumeThresholdDotforceOverride: js.UndefOr[Boolean] = js.native
  @JSName("hystrix.circuit.volumeThreshold.override")
  var hystrixDotcircuitDotvolumeThresholdDotoverride: js.UndefOr[Double] = js.native
  @JSName("hystrix.execution.timeoutInMilliseconds")
  var hystrixDotexecutionDottimeoutInMilliseconds: js.UndefOr[Double] = js.native
  @JSName("hystrix.force.circuit.closed")
  var hystrixDotforceDotcircuitDotclosed: js.UndefOr[Boolean] = js.native
  @JSName("hystrix.force.circuit.open")
  var hystrixDotforceDotcircuitDotopen: js.UndefOr[Boolean] = js.native
  @JSName("hystrix.metrics.percentile.window.bucketsNumber")
  var hystrixDotmetricsDotpercentileDotwindowDotbucketsNumber: js.UndefOr[Double] = js.native
  @JSName("hystrix.metrics.percentile.window.timeInMilliseconds")
  var hystrixDotmetricsDotpercentileDotwindowDottimeInMilliseconds: js.UndefOr[Double] = js.native
  @JSName("hystrix.metrics.statistical.window.bucketsNumber")
  var hystrixDotmetricsDotstatisticalDotwindowDotbucketsNumber: js.UndefOr[Double] = js.native
  @JSName("hystrix.metrics.statistical.window.timeInMilliseconds")
  var hystrixDotmetricsDotstatisticalDotwindowDottimeInMilliseconds: js.UndefOr[Double] = js.native
  @JSName("hystrix.promise.implementation")
  var hystrixDotpromiseDotimplementation: js.UndefOr[PromiseConstructorLike] = js.native
  @JSName("hystrix.request.volume.rejectionThreshold")
  var hystrixDotrequestDotvolumeDotrejectionThreshold: js.UndefOr[Double] = js.native
}

object HystrixProperties {
  @scala.inline
  def apply(): HystrixProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HystrixProperties]
  }
  @scala.inline
  implicit class HystrixPropertiesOps[Self <: HystrixProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHystrixDotcircuitDoterrorThresholdPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.circuit.errorThresholdPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHystrixDotcircuitDoterrorThresholdPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.circuit.errorThresholdPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withHystrixDotcircuitDotsleepWindowInMilliseconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.circuit.sleepWindowInMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHystrixDotcircuitDotsleepWindowInMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.circuit.sleepWindowInMilliseconds")(js.undefined)
        ret
    }
    @scala.inline
    def withHystrixDotcircuitDotvolumeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.circuit.volumeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHystrixDotcircuitDotvolumeThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.circuit.volumeThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withHystrixDotcircuitDotvolumeThresholdDotforceOverride(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.circuit.volumeThreshold.forceOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHystrixDotcircuitDotvolumeThresholdDotforceOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.circuit.volumeThreshold.forceOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withHystrixDotcircuitDotvolumeThresholdDotoverride(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.circuit.volumeThreshold.override")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHystrixDotcircuitDotvolumeThresholdDotoverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.circuit.volumeThreshold.override")(js.undefined)
        ret
    }
    @scala.inline
    def withHystrixDotexecutionDottimeoutInMilliseconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.execution.timeoutInMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHystrixDotexecutionDottimeoutInMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.execution.timeoutInMilliseconds")(js.undefined)
        ret
    }
    @scala.inline
    def withHystrixDotforceDotcircuitDotclosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.force.circuit.closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHystrixDotforceDotcircuitDotclosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.force.circuit.closed")(js.undefined)
        ret
    }
    @scala.inline
    def withHystrixDotforceDotcircuitDotopen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.force.circuit.open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHystrixDotforceDotcircuitDotopen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.force.circuit.open")(js.undefined)
        ret
    }
    @scala.inline
    def withHystrixDotmetricsDotpercentileDotwindowDotbucketsNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.metrics.percentile.window.bucketsNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHystrixDotmetricsDotpercentileDotwindowDotbucketsNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.metrics.percentile.window.bucketsNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withHystrixDotmetricsDotpercentileDotwindowDottimeInMilliseconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.metrics.percentile.window.timeInMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHystrixDotmetricsDotpercentileDotwindowDottimeInMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.metrics.percentile.window.timeInMilliseconds")(js.undefined)
        ret
    }
    @scala.inline
    def withHystrixDotmetricsDotstatisticalDotwindowDotbucketsNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.metrics.statistical.window.bucketsNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHystrixDotmetricsDotstatisticalDotwindowDotbucketsNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.metrics.statistical.window.bucketsNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withHystrixDotmetricsDotstatisticalDotwindowDottimeInMilliseconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.metrics.statistical.window.timeInMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHystrixDotmetricsDotstatisticalDotwindowDottimeInMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.metrics.statistical.window.timeInMilliseconds")(js.undefined)
        ret
    }
    @scala.inline
    def withHystrixDotpromiseDotimplementation(value: PromiseConstructorLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.promise.implementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHystrixDotpromiseDotimplementation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.promise.implementation")(js.undefined)
        ret
    }
    @scala.inline
    def withHystrixDotrequestDotvolumeDotrejectionThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.request.volume.rejectionThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHystrixDotrequestDotvolumeDotrejectionThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hystrix.request.volume.rejectionThreshold")(js.undefined)
        ret
    }
  }
  
}

