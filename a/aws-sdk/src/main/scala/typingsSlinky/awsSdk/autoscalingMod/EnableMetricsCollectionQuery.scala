package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableMetricsCollectionQuery extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The granularity to associate with the metrics to collect. The only valid value is 1Minute.
    */
  var Granularity: XmlStringMaxLen255 = js.native
  /**
    * One or more of the following metrics. If you omit this parameter, all metrics are enabled.    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances   
    */
  var Metrics: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.Metrics] = js.native
}

object EnableMetricsCollectionQuery {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, Granularity: XmlStringMaxLen255): EnableMetricsCollectionQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], Granularity = Granularity.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableMetricsCollectionQuery]
  }
  @scala.inline
  implicit class EnableMetricsCollectionQueryOps[Self <: EnableMetricsCollectionQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingGroupName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGranularity(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Granularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetrics(value: Metrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(js.undefined)
        ret
    }
  }
  
}

