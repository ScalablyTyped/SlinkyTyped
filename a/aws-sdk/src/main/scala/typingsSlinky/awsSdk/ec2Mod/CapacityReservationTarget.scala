package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapacityReservationTarget extends StObject {
  
  /**
    * The ID of the Capacity Reservation in which to run the instance.
    */
  var CapacityReservationId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.CapacityReservationId] = js.native
  
  /**
    * The ARN of the Capacity Reservation resource group in which to run the instance.
    */
  var CapacityReservationResourceGroupArn: js.UndefOr[String] = js.native
}
object CapacityReservationTarget {
  
  @scala.inline
  def apply(): CapacityReservationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationTarget]
  }
  
  @scala.inline
  implicit class CapacityReservationTargetMutableBuilder[Self <: CapacityReservationTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityReservationId(value: CapacityReservationId): Self = StObject.set(x, "CapacityReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationIdUndefined: Self = StObject.set(x, "CapacityReservationId", js.undefined)
    
    @scala.inline
    def setCapacityReservationResourceGroupArn(value: String): Self = StObject.set(x, "CapacityReservationResourceGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationResourceGroupArnUndefined: Self = StObject.set(x, "CapacityReservationResourceGroupArn", js.undefined)
  }
}
