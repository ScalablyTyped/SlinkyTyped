package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalHyperParameterTuningJobObjectiveMetric extends js.Object {
  /**
    * The name of the objective metric.
    */
  var MetricName: typingsSlinky.awsSdk.sagemakerMod.MetricName = js.native
  /**
    * Whether to minimize or maximize the objective metric. Valid values are Minimize and Maximize.
    */
  var Type: js.UndefOr[HyperParameterTuningJobObjectiveType] = js.native
  /**
    * The value of the objective metric.
    */
  var Value: MetricValue = js.native
}

object FinalHyperParameterTuningJobObjectiveMetric {
  @scala.inline
  def apply(MetricName: MetricName, Value: MetricValue): FinalHyperParameterTuningJobObjectiveMetric = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalHyperParameterTuningJobObjectiveMetric]
  }
  @scala.inline
  implicit class FinalHyperParameterTuningJobObjectiveMetricOps[Self <: FinalHyperParameterTuningJobObjectiveMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricName(value: MetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: MetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: HyperParameterTuningJobObjectiveType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

