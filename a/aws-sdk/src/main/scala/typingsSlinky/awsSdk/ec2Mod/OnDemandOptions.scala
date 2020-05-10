package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDemandOptions extends js.Object {
  /**
    * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify lowest-price, EC2 Fleet uses price to determine the order, launching the lowest price first. If you specify prioritized, EC2 Fleet uses the priority that you assigned to each launch template override, launching the highest priority first. If you do not specify a value, EC2 Fleet defaults to lowest-price.
    */
  var AllocationStrategy: js.UndefOr[FleetOnDemandAllocationStrategy] = js.native
  /**
    * The strategy for using unused Capacity Reservations for fulfilling On-Demand capacity. Supported only for fleets of type instant.
    */
  var CapacityReservationOptions: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.CapacityReservationOptions] = js.native
  /**
    * The maximum amount per hour for On-Demand Instances that you're willing to pay.
    */
  var MaxTotalPrice: js.UndefOr[String] = js.native
  /**
    * The minimum target capacity for On-Demand Instances in the fleet. If the minimum target capacity is not reached, the fleet launches no instances.
    */
  var MinTargetCapacity: js.UndefOr[Integer] = js.native
  /**
    * Indicates that the fleet launches all On-Demand Instances into a single Availability Zone. Supported only for fleets of type instant.
    */
  var SingleAvailabilityZone: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that the fleet uses a single instance type to launch all On-Demand Instances in the fleet. Supported only for fleets of type instant.
    */
  var SingleInstanceType: js.UndefOr[Boolean] = js.native
}

object OnDemandOptions {
  @scala.inline
  def apply(): OnDemandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnDemandOptions]
  }
  @scala.inline
  implicit class OnDemandOptionsOps[Self <: OnDemandOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocationStrategy(value: FleetOnDemandAllocationStrategy): Self = {
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
    def withCapacityReservationOptions(value: CapacityReservationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityReservationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityReservationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityReservationOptions")(js.undefined)
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

