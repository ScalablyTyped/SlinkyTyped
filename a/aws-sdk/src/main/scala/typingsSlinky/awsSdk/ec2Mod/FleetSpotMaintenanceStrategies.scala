package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetSpotMaintenanceStrategies extends js.Object {
  
  /**
    * The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated risk of being interrupted.
    */
  var CapacityRebalance: js.UndefOr[FleetSpotCapacityRebalance] = js.native
}
object FleetSpotMaintenanceStrategies {
  
  @scala.inline
  def apply(): FleetSpotMaintenanceStrategies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetSpotMaintenanceStrategies]
  }
  
  @scala.inline
  implicit class FleetSpotMaintenanceStrategiesOps[Self <: FleetSpotMaintenanceStrategies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapacityRebalance(value: FleetSpotCapacityRebalance): Self = this.set("CapacityRebalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityRebalance: Self = this.set("CapacityRebalance", js.undefined)
  }
}
