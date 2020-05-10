package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalAutoMLJobObjectiveMetric extends js.Object {
  /**
    * The name of the metric.
    */
  var MetricName: AutoMLMetricEnum = js.native
  /**
    * The metric type used.
    */
  var Type: js.UndefOr[AutoMLJobObjectiveType] = js.native
  /**
    * The value of the metric.
    */
  var Value: MetricValue = js.native
}

object FinalAutoMLJobObjectiveMetric {
  @scala.inline
  def apply(MetricName: AutoMLMetricEnum, Value: MetricValue): FinalAutoMLJobObjectiveMetric = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalAutoMLJobObjectiveMetric]
  }
  @scala.inline
  implicit class FinalAutoMLJobObjectiveMetricOps[Self <: FinalAutoMLJobObjectiveMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricName(value: AutoMLMetricEnum): Self = {
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
    def withType(value: AutoMLJobObjectiveType): Self = {
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

