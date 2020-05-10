package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnabledMetric extends js.Object {
  /**
    * The granularity of the metric. The only valid value is 1Minute.
    */
  var Granularity: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * One of the following metrics:    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances   
    */
  var Metric: js.UndefOr[XmlStringMaxLen255] = js.native
}

object EnabledMetric {
  @scala.inline
  def apply(): EnabledMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnabledMetric]
  }
  @scala.inline
  implicit class EnabledMetricOps[Self <: EnabledMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGranularity(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Granularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Granularity")(js.undefined)
        ret
    }
    @scala.inline
    def withMetric(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metric")(js.undefined)
        ret
    }
  }
  
}

