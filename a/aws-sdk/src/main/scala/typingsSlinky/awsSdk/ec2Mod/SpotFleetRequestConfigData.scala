package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetRequestConfigData extends js.Object {
  /**
    * Indicates how to allocate the target Spot Instance capacity across the Spot Instance pools specified by the Spot Fleet request. If the allocation strategy is lowestPrice, Spot Fleet launches instances from the Spot Instance pools with the lowest price. This is the default allocation strategy. If the allocation strategy is diversified, Spot Fleet launches instances from all the Spot Instance pools that you specify. If the allocation strategy is capacityOptimized, Spot Fleet launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching.
    */
  var AllocationStrategy: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.AllocationStrategy] = js.native
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of your listings. This helps to avoid duplicate listings. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Indicates whether running Spot Instances should be terminated if you decrease the target capacity of the Spot Fleet request below the current size of the Spot Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ExcessCapacityTerminationPolicy] = js.native
  /**
    * The number of units fulfilled by this request compared to the set target capacity. You cannot set this value.
    */
  var FulfilledCapacity: js.UndefOr[Double] = js.native
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that grants the Spot Fleet the permission to request, launch, terminate, and tag instances on your behalf. For more information, see Spot Fleet Prerequisites in the Amazon EC2 User Guide for Linux Instances. Spot Fleet can terminate Spot Instances on your behalf when you cancel its Spot Fleet request using CancelSpotFleetRequests or when the Spot Fleet request expires, if you set TerminateInstancesWithExpiration.
    */
  var IamFleetRole: String = js.native
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceInterruptionBehavior] = js.native
  /**
    * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot AllocationStrategy is set to lowest-price. Spot Fleet selects the cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
    */
  var InstancePoolsToUseCount: js.UndefOr[Integer] = js.native
  /**
    * The launch specifications for the Spot Fleet request. If you specify LaunchSpecifications, you can't specify LaunchTemplateConfigs. If you include On-Demand capacity in your request, you must use LaunchTemplateConfigs.
    */
  var LaunchSpecifications: js.UndefOr[LaunchSpecsList] = js.native
  /**
    * The launch template and overrides. If you specify LaunchTemplateConfigs, you can't specify LaunchSpecifications. If you include On-Demand capacity in your request, you must use LaunchTemplateConfigs.
    */
  var LaunchTemplateConfigs: js.UndefOr[LaunchTemplateConfigList] = js.native
  /**
    * One or more Classic Load Balancers and target groups to attach to the Spot Fleet request. Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers and target groups. With Network Load Balancers, Spot Fleet cannot register instances that have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
    */
  var LoadBalancersConfig: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LoadBalancersConfig] = js.native
  /**
    * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify lowestPrice, Spot Fleet uses price to determine the order, launching the lowest price first. If you specify prioritized, Spot Fleet uses the priority that you assign to each Spot Fleet launch template override, launching the highest priority first. If you do not specify a value, Spot Fleet defaults to lowestPrice.
    */
  var OnDemandAllocationStrategy: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.OnDemandAllocationStrategy] = js.native
  /**
    * The number of On-Demand units fulfilled by this request compared to the set target On-Demand capacity.
    */
  var OnDemandFulfilledCapacity: js.UndefOr[Double] = js.native
  /**
    * The maximum amount per hour for On-Demand Instances that you're willing to pay. You can use the onDemandMaxTotalPrice parameter, the spotMaxTotalPrice parameter, or both parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will launch instances until it reaches the maximum amount you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
    */
  var OnDemandMaxTotalPrice: js.UndefOr[String] = js.native
  /**
    * The number of On-Demand units to request. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is maintain, you can specify a target capacity of 0 and add capacity later.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.native
  /**
    * Indicates whether Spot Fleet should replace unhealthy instances.
    */
  var ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.native
  /**
    * The maximum amount per hour for Spot Instances that you're willing to pay. You can use the spotdMaxTotalPrice parameter, the onDemandMaxTotalPrice parameter, or both parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will launch instances until it reaches the maximum amount you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
    */
  var SpotMaxTotalPrice: js.UndefOr[String] = js.native
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance. The default is the On-Demand price.
    */
  var SpotPrice: js.UndefOr[String] = js.native
  /**
    * The key-value pair for tagging the Spot Fleet request on creation. The value for ResourceType must be spot-fleet-request, otherwise the Spot Fleet request fails. To tag instances at launch, specify the tags in the launch template (valid only if you use LaunchTemplateConfigs) or in the  SpotFleetTagSpecification  (valid only if you use LaunchSpecifications). For information about tagging after launch, see Tagging Your Resources.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The number of units to request for the Spot Fleet. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is maintain, you can specify a target capacity of 0 and add capacity later.
    */
  var TargetCapacity: Integer = js.native
  /**
    * Indicates whether running Spot Instances are terminated when the Spot Fleet request expires.
    */
  var TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.native
  /**
    * The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts to maintain it. When this value is request, the Spot Fleet only places the required requests. It does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in alternative Spot pools if capacity is not available. When this value is maintain, the Spot Fleet maintains the target capacity. The Spot Fleet places the required requests to meet capacity and automatically replenishes any interrupted instances. Default: maintain. instant is listed but is not used by Spot Fleet.
    */
  var Type: js.UndefOr[FleetType] = js.native
  /**
    * The start date and time of the request, in UTC format (YYYY-MM-DDTHH:MM:SSZ). By default, Amazon EC2 starts fulfilling the request immediately.
    */
  var ValidFrom: js.UndefOr[js.Date] = js.native
  /**
    * The end date and time of the request, in UTC format (YYYY-MM-DDTHH:MM:SSZ). After the end date and time, no new Spot Instance requests are placed or able to fulfill the request. If no value is specified, the Spot Fleet request remains until you cancel it.
    */
  var ValidUntil: js.UndefOr[js.Date] = js.native
}

object SpotFleetRequestConfigData {
  @scala.inline
  def apply(IamFleetRole: String, TargetCapacity: Integer): SpotFleetRequestConfigData = {
    val __obj = js.Dynamic.literal(IamFleetRole = IamFleetRole.asInstanceOf[js.Any], TargetCapacity = TargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestConfigData]
  }
  @scala.inline
  implicit class SpotFleetRequestConfigDataOps[Self <: SpotFleetRequestConfigData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamFleetRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamFleetRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetCapacity(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllocationStrategy(value: AllocationStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocationStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocationStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocationStrategy")(js.undefined)
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
    def withExcessCapacityTerminationPolicy(value: ExcessCapacityTerminationPolicy): Self = {
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
    def withInstanceInterruptionBehavior(value: InstanceInterruptionBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInterruptionBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceInterruptionBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInterruptionBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withInstancePoolsToUseCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancePoolsToUseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancePoolsToUseCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancePoolsToUseCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchSpecifications(value: LaunchSpecsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchSpecifications")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTemplateConfigs(value: LaunchTemplateConfigList): Self = {
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
    def withLoadBalancersConfig(value: LoadBalancersConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancersConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancersConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancersConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandAllocationStrategy(value: OnDemandAllocationStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandAllocationStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandAllocationStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandAllocationStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandFulfilledCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandFulfilledCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandFulfilledCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandFulfilledCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandMaxTotalPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandMaxTotalPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandMaxTotalPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandMaxTotalPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandTargetCapacity(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandTargetCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandTargetCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandTargetCapacity")(js.undefined)
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
    def withSpotMaxTotalPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotMaxTotalPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotMaxTotalPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotMaxTotalPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withTagSpecifications(value: TagSpecificationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(js.undefined)
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

