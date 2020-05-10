package typingsSlinky.pulumiKubernetes.outputMod.autoscaling.v2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes
  * object (for example length of queue in cloud messaging service, or QPS from loadbalancer
  * running outside of cluster).
  */
@js.native
trait ExternalMetricSource extends js.Object {
  /**
    * metric identifies the target metric by name and selector
    */
  val metric: MetricIdentifier = js.native
  /**
    * target specifies the target value for the given metric
    */
  val target: MetricTarget = js.native
}

object ExternalMetricSource {
  @scala.inline
  def apply(metric: MetricIdentifier, target: MetricTarget): ExternalMetricSource = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricSource]
  }
  @scala.inline
  implicit class ExternalMetricSourceOps[Self <: ExternalMetricSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

