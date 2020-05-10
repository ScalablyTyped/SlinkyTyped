package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterTuningJobObjective extends js.Object {
  /**
    * The name of the metric to use for the objective metric.
    */
  var MetricName: typingsSlinky.awsSdk.sagemakerMod.MetricName = js.native
  /**
    * Whether to minimize or maximize the objective metric.
    */
  var Type: HyperParameterTuningJobObjectiveType = js.native
}

object HyperParameterTuningJobObjective {
  @scala.inline
  def apply(MetricName: MetricName, Type: HyperParameterTuningJobObjectiveType): HyperParameterTuningJobObjective = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobObjective]
  }
  @scala.inline
  implicit class HyperParameterTuningJobObjectiveOps[Self <: HyperParameterTuningJobObjective] (val x: Self) extends AnyVal {
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
    def withType(value: HyperParameterTuningJobObjectiveType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

