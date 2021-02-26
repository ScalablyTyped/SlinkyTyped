package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDemandOptions extends StObject {
  
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
  implicit class OnDemandOptionsMutableBuilder[Self <: OnDemandOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationStrategy(value: FleetOnDemandAllocationStrategy): Self = StObject.set(x, "AllocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationStrategyUndefined: Self = StObject.set(x, "AllocationStrategy", js.undefined)
    
    @scala.inline
    def setCapacityReservationOptions(value: CapacityReservationOptions): Self = StObject.set(x, "CapacityReservationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationOptionsUndefined: Self = StObject.set(x, "CapacityReservationOptions", js.undefined)
    
    @scala.inline
    def setMaxTotalPrice(value: String): Self = StObject.set(x, "MaxTotalPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTotalPriceUndefined: Self = StObject.set(x, "MaxTotalPrice", js.undefined)
    
    @scala.inline
    def setMinTargetCapacity(value: Integer): Self = StObject.set(x, "MinTargetCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTargetCapacityUndefined: Self = StObject.set(x, "MinTargetCapacity", js.undefined)
    
    @scala.inline
    def setSingleAvailabilityZone(value: Boolean): Self = StObject.set(x, "SingleAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleAvailabilityZoneUndefined: Self = StObject.set(x, "SingleAvailabilityZone", js.undefined)
    
    @scala.inline
    def setSingleInstanceType(value: Boolean): Self = StObject.set(x, "SingleInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleInstanceTypeUndefined: Self = StObject.set(x, "SingleInstanceType", js.undefined)
  }
}
