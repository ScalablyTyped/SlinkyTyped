package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingThresholds extends js.Object {
  /**
    * Custom Cloudwatch auto scaling alarms, to be used as thresholds. This parameter takes a list of up to five alarm names, which are case sensitive and must be in the same region as the stack.  To use custom alarms, you must update your service role to allow cloudwatch:DescribeAlarms. You can either have AWS OpsWorks Stacks update the role for you when you first use this feature or you can edit the role manually. For more information, see Allowing AWS OpsWorks Stacks to Act on Your Behalf. 
    */
  var Alarms: js.UndefOr[Strings] = js.native
  /**
    * The CPU utilization threshold, as a percent of the available CPU. A value of -1 disables the threshold.
    */
  var CpuThreshold: js.UndefOr[Double] = js.native
  /**
    * The amount of time (in minutes) after a scaling event occurs that AWS OpsWorks Stacks should ignore metrics and suppress additional scaling events. For example, AWS OpsWorks Stacks adds new instances following an upscaling event but the instances won't start reducing the load until they have been booted and configured. There is no point in raising additional scaling events during that operation, which typically takes several minutes. IgnoreMetricsTime allows you to direct AWS OpsWorks Stacks to suppress scaling events long enough to get the new instances online.
    */
  var IgnoreMetricsTime: js.UndefOr[Minute] = js.native
  /**
    * The number of instances to add or remove when the load exceeds a threshold.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The load threshold. A value of -1 disables the threshold. For more information about how load is computed, see Load (computing).
    */
  var LoadThreshold: js.UndefOr[Double] = js.native
  /**
    * The memory utilization threshold, as a percent of the available memory. A value of -1 disables the threshold.
    */
  var MemoryThreshold: js.UndefOr[Double] = js.native
  /**
    * The amount of time, in minutes, that the load must exceed a threshold before more instances are added or removed.
    */
  var ThresholdsWaitTime: js.UndefOr[Minute] = js.native
}

object AutoScalingThresholds {
  @scala.inline
  def apply(): AutoScalingThresholds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingThresholds]
  }
  @scala.inline
  implicit class AutoScalingThresholdsOps[Self <: AutoScalingThresholds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlarms(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alarms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alarms")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpuThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpuThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreMetricsTime(value: Minute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IgnoreMetricsTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreMetricsTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IgnoreMetricsTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemoryThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemoryThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholdsWaitTime(value: Minute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThresholdsWaitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholdsWaitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThresholdsWaitTime")(js.undefined)
        ret
    }
  }
  
}

