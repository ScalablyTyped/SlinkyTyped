package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotFleetRequestLaunchTemplateConfigOverride extends StObject {
  
  /**
    * The availability zone in which to place the request.
    */
  var availabilityZone: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of instance to request.
    */
  var instanceType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The priority for the launch template override. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority.
    */
  var priority: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The maximum spot bid for this override request.
    */
  var spotPrice: js.UndefOr[Input[String]] = js.native
  
  /**
    * The subnet in which to launch the requested instance.
    */
  var subnetId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The capacity added to the fleet by a fulfilled request.
    */
  var weightedCapacity: js.UndefOr[Input[Double]] = js.native
}
object SpotFleetRequestLaunchTemplateConfigOverride {
  
  @scala.inline
  def apply(): SpotFleetRequestLaunchTemplateConfigOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotFleetRequestLaunchTemplateConfigOverride]
  }
  
  @scala.inline
  implicit class SpotFleetRequestLaunchTemplateConfigOverrideMutableBuilder[Self <: SpotFleetRequestLaunchTemplateConfigOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    @scala.inline
    def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setSpotPrice(value: Input[String]): Self = StObject.set(x, "spotPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotPriceUndefined: Self = StObject.set(x, "spotPrice", js.undefined)
    
    @scala.inline
    def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    
    @scala.inline
    def setWeightedCapacity(value: Input[Double]): Self = StObject.set(x, "weightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedCapacityUndefined: Self = StObject.set(x, "weightedCapacity", js.undefined)
  }
}
