package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta1

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
    * currentAverageUtilization is the current value of the average of the resource metric across
    * all relevant pods, represented as a percentage of the requested value of the resource for
    * the pods.  It will only be present if `targetAverageValue` was set in the corresponding
    * metric specification.
    */
  var currentAverageUtilization: js.UndefOr[Input[Double]] = js.native
  /**
    * currentAverageValue is the current value of the average of the resource metric across all
    * relevant pods, as a raw value (instead of as a percentage of the request), similar to the
    * "pods" metric source type. It will always be set, regardless of the corresponding metric
    * specification.
    */
  var currentAverageValue: Input[String] = js.native
  /**
    * name is the name of the resource in question.
    */
  var name: Input[String] = js.native
}

object ResourceMetricStatus {
  @scala.inline
  def apply(currentAverageValue: Input[String], name: Input[String]): ResourceMetricStatus = {
    val __obj = js.Dynamic.literal(currentAverageValue = currentAverageValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceMetricStatus]
  }
  @scala.inline
  implicit class ResourceMetricStatusOps[Self <: ResourceMetricStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentAverageValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentAverageValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentAverageUtilization(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentAverageUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentAverageUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentAverageUtilization")(js.undefined)
        ret
    }
  }
  
}

