package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroup extends js.Object {
  /**
    * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
    */
  var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.native
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
    */
  var BidPrice: js.UndefOr[String] = js.native
  /**
    *  Amazon EMR releases 4.x or later.  The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration for each instance group (master, core, and task).
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * The version number of the requested configuration specification for this instance group.
    */
  var ConfigurationsVersion: js.UndefOr[Long] = js.native
  /**
    * The EBS block devices that are mapped to this instance group.
    */
  var EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.native
  /**
    * If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration stack and provides additional, dedicated capacity for Amazon EBS I/O.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.native
  /**
    * The identifier of the instance group.
    */
  var Id: js.UndefOr[InstanceGroupId] = js.native
  /**
    * The type of the instance group. Valid values are MASTER, CORE or TASK.
    */
  var InstanceGroupType: js.UndefOr[typingsSlinky.awsSdk.emrMod.InstanceGroupType] = js.native
  /**
    * The EC2 instance type for all instances in the instance group.
    */
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.emrMod.InstanceType] = js.native
  /**
    * A list of configurations that were successfully applied for an instance group last time.
    */
  var LastSuccessfullyAppliedConfigurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * The version number of a configuration specification that was successfully applied for an instance group last time. 
    */
  var LastSuccessfullyAppliedConfigurationsVersion: js.UndefOr[Long] = js.native
  /**
    * The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
    */
  var Market: js.UndefOr[MarketType] = js.native
  /**
    * The name of the instance group.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The target number of instances for the instance group.
    */
  var RequestedInstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The number of instances currently running in this instance group.
    */
  var RunningInstanceCount: js.UndefOr[Integer] = js.native
  /**
    * Policy for customizing shrink operations.
    */
  var ShrinkPolicy: js.UndefOr[typingsSlinky.awsSdk.emrMod.ShrinkPolicy] = js.native
  /**
    * The current status of the instance group.
    */
  var Status: js.UndefOr[InstanceGroupStatus] = js.native
}

object InstanceGroup {
  @scala.inline
  def apply(): InstanceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroup]
  }
  @scala.inline
  implicit class InstanceGroupOps[Self <: InstanceGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingPolicy(value: AutoScalingPolicyDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withBidPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BidPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BidPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurations(value: ConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configurations")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationsVersion(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsBlockDevices(value: EbsBlockDeviceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsBlockDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsBlockDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsOptimized(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsOptimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsOptimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsOptimized")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: InstanceGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceGroupType(value: InstanceGroupType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroupType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceGroupType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroupType")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSuccessfullyAppliedConfigurations(value: ConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSuccessfullyAppliedConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSuccessfullyAppliedConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSuccessfullyAppliedConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSuccessfullyAppliedConfigurationsVersion(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSuccessfullyAppliedConfigurationsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSuccessfullyAppliedConfigurationsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSuccessfullyAppliedConfigurationsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMarket(value: MarketType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Market")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Market")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedInstanceCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedInstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRunningInstanceCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunningInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunningInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunningInstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withShrinkPolicy(value: ShrinkPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShrinkPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrinkPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShrinkPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: InstanceGroupStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

