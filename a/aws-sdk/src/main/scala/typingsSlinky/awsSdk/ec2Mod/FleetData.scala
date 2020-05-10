package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetData extends js.Object {
  /**
    * The progress of the EC2 Fleet. If there is an error, the status is error. After all requests are placed, the status is pending_fulfillment. If the size of the EC2 Fleet is equal to or greater than its target capacity, the status is fulfilled. If the size of the EC2 Fleet is decreased, the status is pending_termination while instances are terminating.
    */
  var ActivityStatus: js.UndefOr[FleetActivityStatus] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency. Constraints: Maximum 64 ASCII characters
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The creation date and time of the EC2 Fleet.
    */
  var CreateTime: js.UndefOr[js.Date] = js.native
  /**
    * Information about the instances that could not be launched by the fleet. Valid only when Type is set to instant.
    */
  var Errors: js.UndefOr[DescribeFleetsErrorSet] = js.native
  /**
    * Indicates whether running instances should be terminated if the target capacity of the EC2 Fleet is decreased below the current size of the EC2 Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy] = js.native
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.FleetId] = js.native
  /**
    * The state of the EC2 Fleet.
    */
  var FleetState: js.UndefOr[FleetStateCode] = js.native
  /**
    * The number of units fulfilled by this request compared to the set target capacity.
    */
  var FulfilledCapacity: js.UndefOr[Double] = js.native
  /**
    * The number of units fulfilled by this request compared to the set target On-Demand capacity.
    */
  var FulfilledOnDemandCapacity: js.UndefOr[Double] = js.native
  /**
    * Information about the instances that were launched by the fleet. Valid only when Type is set to instant.
    */
  var Instances: js.UndefOr[DescribeFleetsInstancesSet] = js.native
  /**
    * The launch template and overrides.
    */
  var LaunchTemplateConfigs: js.UndefOr[FleetLaunchTemplateConfigList] = js.native
  /**
    * The allocation strategy of On-Demand Instances in an EC2 Fleet.
    */
  var OnDemandOptions: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.OnDemandOptions] = js.native
  /**
    * Indicates whether EC2 Fleet should replace unhealthy instances.
    */
  var ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.native
  /**
    * The configuration of Spot Instances in an EC2 Fleet.
    */
  var SpotOptions: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.SpotOptions] = js.native
  /**
    * The tags for an EC2 Fleet resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The number of units to request. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is maintain, you can specify a target capacity of 0 and add capacity later.
    */
  var TargetCapacitySpecification: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TargetCapacitySpecification] = js.native
  /**
    * Indicates whether running instances should be terminated when the EC2 Fleet expires. 
    */
  var TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.native
  /**
    * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. If you request a certain target capacity, EC2 Fleet only places the required requests; it does not attempt to replenish instances if capacity is diminished, and it does not submit requests in alternative capacity pools if capacity is unavailable. To maintain a certain target capacity, EC2 Fleet places the required requests to meet this target capacity. It also automatically replenishes any interrupted Spot Instances. Default: maintain.
    */
  var Type: js.UndefOr[FleetType] = js.native
  /**
    * The start date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately. 
    */
  var ValidFrom: js.UndefOr[js.Date] = js.native
  /**
    * The end date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new instance requests are placed or able to fulfill the request. The default end date is 7 days from the current date. 
    */
  var ValidUntil: js.UndefOr[js.Date] = js.native
}

object FleetData {
  @scala.inline
  def apply(): FleetData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetData]
  }
  @scala.inline
  implicit class FleetDataOps[Self <: FleetData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityStatus(value: FleetActivityStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivityStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: DescribeFleetsErrorSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(js.undefined)
        ret
    }
    @scala.inline
    def withExcessCapacityTerminationPolicy(value: FleetExcessCapacityTerminationPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcessCapacityTerminationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcessCapacityTerminationPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcessCapacityTerminationPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withFleetId(value: FleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(js.undefined)
        ret
    }
    @scala.inline
    def withFleetState(value: FleetStateCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetState")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfilledCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FulfilledCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfilledCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FulfilledCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfilledOnDemandCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FulfilledOnDemandCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfilledOnDemandCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FulfilledOnDemandCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withInstances(value: DescribeFleetsInstancesSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTemplateConfigs(value: FleetLaunchTemplateConfigList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplateConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandOptions(value: OnDemandOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceUnhealthyInstances(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceUnhealthyInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceUnhealthyInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceUnhealthyInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotOptions(value: SpotOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCapacitySpecification(value: TargetCapacitySpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetCapacitySpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCapacitySpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetCapacitySpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminateInstancesWithExpiration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminateInstancesWithExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminateInstancesWithExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminateInstancesWithExpiration")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: FleetType): Self = {
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
    @scala.inline
    def withValidFrom(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withValidUntil(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidUntil")(js.undefined)
        ret
    }
  }
  
}

