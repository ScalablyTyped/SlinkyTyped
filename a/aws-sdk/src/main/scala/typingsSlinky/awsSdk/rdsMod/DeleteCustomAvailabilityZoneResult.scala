package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCustomAvailabilityZoneResult extends StObject {
  
  var CustomAvailabilityZone: js.UndefOr[typingsSlinky.awsSdk.rdsMod.CustomAvailabilityZone] = js.native
}
object DeleteCustomAvailabilityZoneResult {
  
  @scala.inline
  def apply(): DeleteCustomAvailabilityZoneResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCustomAvailabilityZoneResult]
  }
  
  @scala.inline
  implicit class DeleteCustomAvailabilityZoneResultMutableBuilder[Self <: DeleteCustomAvailabilityZoneResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomAvailabilityZone(value: CustomAvailabilityZone): Self = StObject.set(x, "CustomAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAvailabilityZoneUndefined: Self = StObject.set(x, "CustomAvailabilityZone", js.undefined)
  }
}
