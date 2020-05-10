package typingsSlinky.pulumiKubernetes.outputMod.autoscaling.v2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for
  * example, hits-per-second on an Ingress object).
  */
@js.native
trait ObjectMetricSource extends js.Object {
  val describedObject: CrossVersionObjectReference = js.native
  /**
    * metric identifies the target metric by name and selector
    */
  val metric: MetricIdentifier = js.native
  /**
    * target specifies the target value for the given metric
    */
  val target: MetricTarget = js.native
}

object ObjectMetricSource {
  @scala.inline
  def apply(describedObject: CrossVersionObjectReference, metric: MetricIdentifier, target: MetricTarget): ObjectMetricSource = {
    val __obj = js.Dynamic.literal(describedObject = describedObject.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricSource]
  }
  @scala.inline
  implicit class ObjectMetricSourceOps[Self <: ObjectMetricSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescribedObject(value: CrossVersionObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describedObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetric(value: MetricIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: MetricTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

