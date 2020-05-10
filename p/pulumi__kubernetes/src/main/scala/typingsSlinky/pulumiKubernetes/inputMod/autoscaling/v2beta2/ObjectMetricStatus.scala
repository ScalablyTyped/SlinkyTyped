package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object
  * (for example, hits-per-second on an Ingress object).
  */
@js.native
trait ObjectMetricStatus extends js.Object {
  /**
    * current contains the current value for the given metric
    */
  var current: Input[MetricValueStatus] = js.native
  var describedObject: Input[CrossVersionObjectReference] = js.native
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: Input[MetricIdentifier] = js.native
}

object ObjectMetricStatus {
  @scala.inline
  def apply(
    current: Input[MetricValueStatus],
    describedObject: Input[CrossVersionObjectReference],
    metric: Input[MetricIdentifier]
  ): ObjectMetricStatus = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], describedObject = describedObject.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricStatus]
  }
  @scala.inline
  implicit class ObjectMetricStatusOps[Self <: ObjectMetricStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: Input[MetricValueStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescribedObject(value: Input[CrossVersionObjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describedObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetric(value: Input[MetricIdentifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

