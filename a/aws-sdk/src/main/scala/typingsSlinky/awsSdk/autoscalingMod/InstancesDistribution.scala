package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesDistribution extends js.Object {
  /**
    * Indicates how to allocate instance types to fulfill On-Demand capacity. The only valid value is prioritized, which is also the default value. This strategy uses the order of instance type overrides for the LaunchTemplate to define the launch priority of each instance type. The first instance type in the array is prioritized higher than the last. If all your On-Demand capacity cannot be fulfilled using your highest priority instance, then the Auto Scaling groups launches the remaining capacity using the second priority instance type, and so on.
    */
  var OnDemandAllocationStrategy: js.UndefOr[XmlString] = js.native
  /**
    * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales. Default if not set is 0. If you leave it set to 0, On-Demand Instances are launched as a percentage of the Auto Scaling group's desired capacity, per the OnDemandPercentageAboveBaseCapacity setting.  An update to this setting means a gradual replacement of instances to maintain the specified number of On-Demand Instances for your base capacity. When replacing instances, Amazon EC2 Auto Scaling launches new instances before terminating the old ones. 
    */
  var OnDemandBaseCapacity: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.OnDemandBaseCapacity] = js.native
  /**
    * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity. Default if not set is 100. If you leave it set to 100, the percentages are 100% for On-Demand Instances and 0% for Spot Instances.  An update to this setting means a gradual replacement of instances to maintain the percentage of On-Demand Instances for your additional capacity above the base capacity. When replacing instances, Amazon EC2 Auto Scaling launches new instances before terminating the old ones.  Valid Range: Minimum value of 0. Maximum value of 100.
    */
  var OnDemandPercentageAboveBaseCapacity: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.OnDemandPercentageAboveBaseCapacity] = js.native
  /**
    * Indicates how to allocate instances across Spot Instance pools. If the allocation strategy is lowest-price, the Auto Scaling group launches instances using the Spot pools with the lowest price, and evenly allocates your instances across the number of Spot pools that you specify. If the allocation strategy is capacity-optimized, the Auto Scaling group launches instances using Spot pools that are optimally chosen based on the available Spot capacity. The default Spot allocation strategy for calls that you make through the API, the AWS CLI, or the AWS SDKs is lowest-price. The default Spot allocation strategy for the AWS Management Console is capacity-optimized. Valid values: lowest-price | capacity-optimized 
    */
  var SpotAllocationStrategy: js.UndefOr[XmlString] = js.native
  /**
    * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined from the different instance types in the Overrides array of LaunchTemplate. Default if not set is 2. Used only when the Spot allocation strategy is lowest-price. Valid Range: Minimum value of 1. Maximum value of 20.
    */
  var SpotInstancePools: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.SpotInstancePools] = js.native
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value of this parameter blank (which is the default), the maximum Spot price is set at the On-Demand price. To remove a value that you previously set, include the parameter but leave the value blank.
    */
  var SpotMaxPrice: js.UndefOr[MixedInstanceSpotPrice] = js.native
}

object InstancesDistribution {
  @scala.inline
  def apply(): InstancesDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesDistribution]
  }
  @scala.inline
  implicit class InstancesDistributionOps[Self <: InstancesDistribution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnDemandAllocationStrategy(value: XmlString): Self = {
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
    def withOnDemandBaseCapacity(value: OnDemandBaseCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandBaseCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandBaseCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandBaseCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandPercentageAboveBaseCapacity(value: OnDemandPercentageAboveBaseCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandPercentageAboveBaseCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandPercentageAboveBaseCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandPercentageAboveBaseCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotAllocationStrategy(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotAllocationStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotAllocationStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotAllocationStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotInstancePools(value: SpotInstancePools): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotInstancePools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotInstancePools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotInstancePools")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotMaxPrice(value: MixedInstanceSpotPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotMaxPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotMaxPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotMaxPrice")(js.undefined)
        ret
    }
  }
  
}

