package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as
  * specified in requests and limits, describing each pod in the current scale target (e.g. CPU
  * or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top
  * of those available to normal per-pod metrics using the "pods" source.
  */
@js.native
trait ResourceMetricStatus extends js.Object {
  /**
    * current contains the current value for the given metric
    */
  var current: Input[MetricValueStatus] = js.native
  /**
    * Name is the name of the resource in question.
    */
  var name: Input[String] = js.native
}

object ResourceMetricStatus {
  @scala.inline
  def apply(current: Input[MetricValueStatus], name: Input[String]): ResourceMetricStatus = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceMetricStatus]
  }
  @scala.inline
  implicit class ResourceMetricStatusOps[Self <: ResourceMetricStatus] (val x: Self) extends AnyVal {
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
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

