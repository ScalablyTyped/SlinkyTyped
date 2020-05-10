package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale
  * target (for example, transactions-processed-per-second). The values will be averaged together
  * before being compared to the target value.
  */
@js.native
trait PodsMetricSource extends js.Object {
  /**
    * metricName is the name of the metric in question
    */
  var metricName: Input[String] = js.native
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given
    * metric When set, it is passed as an additional parameter to the metrics server for more
    * specific metrics scoping When unset, just the metricName will be used to gather metrics.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.native
  /**
    * targetAverageValue is the target value of the average of the metric across all relevant
    * pods (as a quantity)
    */
  var targetAverageValue: Input[String] = js.native
}

object PodsMetricSource {
  @scala.inline
  def apply(metricName: Input[String], targetAverageValue: Input[String]): PodsMetricSource = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], targetAverageValue = targetAverageValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodsMetricSource]
  }
  @scala.inline
  implicit class PodsMetricSourceOps[Self <: PodsMetricSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetAverageValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetAverageValue")(value.asInstanceOf[js.Any])
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

