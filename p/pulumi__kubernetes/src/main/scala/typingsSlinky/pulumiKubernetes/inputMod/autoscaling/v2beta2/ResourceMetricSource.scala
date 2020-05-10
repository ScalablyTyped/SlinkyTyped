package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as
  * specified in requests and limits, describing each pod in the current scale target (e.g. CPU
  * or memory).  The values will be averaged together before being compared to the target.  Such
  * metrics are built in to Kubernetes, and have special scaling options on top of those
  * available to normal per-pod metrics using the "pods" source.  Only one "target" type should
  * be set.
  */
@js.native
trait ResourceMetricSource extends js.Object {
  /**
    * name is the name of the resource in question.
    */
  var name: Input[String] = js.native
  /**
    * target specifies the target value for the given metric
    */
  var target: Input[MetricTarget] = js.native
}

object ResourceMetricSource {
  @scala.inline
  def apply(name: Input[String], target: Input[MetricTarget]): ResourceMetricSource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceMetricSource]
  }
  @scala.inline
  implicit class ResourceMetricSourceOps[Self <: ResourceMetricSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Input[MetricTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

