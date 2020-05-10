package typingsSlinky.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectedMetric extends js.Object {
  /**
    * The name of the projected utilization metric.  Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling Memory Utilization with the CloudWatch Agent. 
    */
  var name: js.UndefOr[MetricName] = js.native
  /**
    * The time stamps of the projected utilization metric.
    */
  var timestamps: js.UndefOr[Timestamps] = js.native
  /**
    * The values of the projected utilization metrics.
    */
  var values: js.UndefOr[MetricValues] = js.native
}

object ProjectedMetric {
  @scala.inline
  def apply(): ProjectedMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectedMetric]
  }
  @scala.inline
  implicit class ProjectedMetricOps[Self <: ProjectedMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: MetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamps(value: Timestamps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamps")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: MetricValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

