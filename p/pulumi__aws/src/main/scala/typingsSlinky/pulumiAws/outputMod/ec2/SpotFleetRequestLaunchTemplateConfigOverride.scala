package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotFleetRequestLaunchTemplateConfigOverride extends js.Object {
  
  /**
    * The availability zone in which to place the request.
    */
  var availabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The type of instance to request.
    */
  var instanceType: js.UndefOr[String] = js.native
  
  /**
    * The priority for the launch template override. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority.
    */
  var priority: Double = js.native
  
  /**
    * The maximum spot bid for this override request.
    */
  var spotPrice: String = js.native
  
  /**
    * The subnet in which to launch the requested instance.
    */
  var subnetId: String = js.native
  
  /**
    * The capacity added to the fleet by a fulfilled request.
    */
  var weightedCapacity: Double = js.native
}
object SpotFleetRequestLaunchTemplateConfigOverride {
  
  @scala.inline
  def apply(priority: Double, spotPrice: String, subnetId: String, weightedCapacity: Double): SpotFleetRequestLaunchTemplateConfigOverride = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], spotPrice = spotPrice.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], weightedCapacity = weightedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchTemplateConfigOverride]
  }
  
  @scala.inline
  implicit class SpotFleetRequestLaunchTemplateConfigOverrideOps[Self <: SpotFleetRequestLaunchTemplateConfigOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotPrice(value: String): Self = this.set("spotPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: String): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedCapacity(value: Double): Self = this.set("weightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
  }
}
