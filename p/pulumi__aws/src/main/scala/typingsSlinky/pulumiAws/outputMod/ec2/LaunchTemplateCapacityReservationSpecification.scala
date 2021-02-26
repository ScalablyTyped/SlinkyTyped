package typingsSlinky.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateCapacityReservationSpecification extends StObject {
  
  /**
    * Indicates the instance's Capacity Reservation preferences. Can be `open` or `none`. (Default `none`).
    */
  var capacityReservationPreference: js.UndefOr[String] = js.native
  
  /**
    * Used to target a specific Capacity Reservation:
    */
  var capacityReservationTarget: js.UndefOr[LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget] = js.native
}
object LaunchTemplateCapacityReservationSpecification {
  
  @scala.inline
  def apply(): LaunchTemplateCapacityReservationSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateCapacityReservationSpecification]
  }
  
  @scala.inline
  implicit class LaunchTemplateCapacityReservationSpecificationMutableBuilder[Self <: LaunchTemplateCapacityReservationSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityReservationPreference(value: String): Self = StObject.set(x, "capacityReservationPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationPreferenceUndefined: Self = StObject.set(x, "capacityReservationPreference", js.undefined)
    
    @scala.inline
    def setCapacityReservationTarget(value: LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget): Self = StObject.set(x, "capacityReservationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationTargetUndefined: Self = StObject.set(x, "capacityReservationTarget", js.undefined)
  }
}
