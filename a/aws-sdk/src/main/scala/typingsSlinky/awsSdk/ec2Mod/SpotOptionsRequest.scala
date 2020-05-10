package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotOptionsRequest extends js.Object {
  /**
    * Indicates how to allocate the target Spot Instance capacity across the Spot Instance pools specified by the EC2 Fleet. If the allocation strategy is lowest-price, EC2 Fleet launches instances from the Spot Instance pools with the lowest price. This is the default allocation strategy. If the allocation strategy is diversified, EC2 Fleet launches instances from all of the Spot Instance pools that you specify. If the allocation strategy is capacity-optimized, EC2 Fleet launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching.
    */
  var AllocationStrategy: js.UndefOr[SpotAllocationStrategy] = js.native
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[SpotInstanceInterruptionBehavior] = js.native
  /**
    * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot AllocationStrategy is set to lowest-price. EC2 Fleet selects the cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
    */
  var InstancePoolsToUseCount: js.UndefOr[Integer] = js.native
  /**
    * The maximum amount per hour for Spot Instances that you're willing to pay.
    */
  var MaxTotalPrice: js.UndefOr[String] = js.native
  /**
    * The minimum target capacity for Spot Instances in the fleet. If the minimum target capacity is not reached, the fleet launches no instances.
    */
  var MinTargetCapacity: js.UndefOr[Integer] = js.native
  /**
    * Indicates that the fleet launches all Spot Instances into a single Availability Zone. Supported only for fleets of type instant.
    */
  var SingleAvailabilityZone: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that the fleet uses a single instance type to launch all Spot Instances in the fleet. Supported only for fleets of type instant.
    */
  var SingleInstanceType: js.UndefOr[Boolean] = js.native
}

object SpotOptionsRequest {
  @scala.inline
  def apply(): SpotOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotOptionsRequest]
  }
  @scala.inline
  implicit class SpotOptionsRequestOps[Self <: SpotOptionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocationStrategy(value: SpotAllocationStrategy): Self = {
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
    def withInstanceInterruptionBehavior(value: SpotInstanceInterruptionBehavior): Self = {
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
    def withMaxTotalPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxTotalPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTotalPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxTotalPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTargetCapacity(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinTargetCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTargetCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinTargetCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleAvailabilityZone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleAvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleAvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleInstanceType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleInstanceType")(js.undefined)
        ret
    }
  }
  
}

