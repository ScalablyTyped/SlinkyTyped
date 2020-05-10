package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodsMetricStatus indicates the current value of a metric describing each pod in the current
  * scale target (for example, transactions-processed-per-second).
  */
@js.native
trait PodsMetricStatus extends js.Object {
  /**
    * currentAverageValue is the current value of the average of the metric across all relevant
    * pods (as a quantity)
    */
  var currentAverageValue: Input[String] = js.native
  /**
    * metricName is the name of the metric in question
    */
  var metricName: Input[String] = js.native
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given
    * metric When set in the PodsMetricSource, it is passed as an additional parameter to the
    * metrics server for more specific metrics scoping. When unset, just the metricName will be
    * used to gather metrics.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.native
}

object PodsMetricStatus {
  @scala.inline
  def apply(currentAverageValue: Input[String], metricName: Input[String]): PodsMetricStatus = {
    val __obj = js.Dynamic.literal(currentAverageValue = currentAverageValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodsMetricStatus]
  }
  @scala.inline
  implicit class PodsMetricStatusOps[Self <: PodsMetricStatus] (val x: Self) extends AnyVal {
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
    def withMetricName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: Input[LabelSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

