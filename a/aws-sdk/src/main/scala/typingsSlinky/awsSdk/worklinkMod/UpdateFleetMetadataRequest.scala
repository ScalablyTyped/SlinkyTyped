package typingsSlinky.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFleetMetadataRequest extends StObject {
  
  /**
    * The fleet name to display. The existing DisplayName is unset if null is passed.
    */
  var DisplayName: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.DisplayName] = js.native
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsSdk.worklinkMod.FleetArn = js.native
  
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region.
    */
  var OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.native
}
object UpdateFleetMetadataRequest {
  
  @scala.inline
  def apply(FleetArn: FleetArn): UpdateFleetMetadataRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetMetadataRequest]
  }
  
  @scala.inline
  implicit class UpdateFleetMetadataRequestMutableBuilder[Self <: UpdateFleetMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeForEndUserLocation(value: Boolean): Self = StObject.set(x, "OptimizeForEndUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeForEndUserLocationUndefined: Self = StObject.set(x, "OptimizeForEndUserLocation", js.undefined)
  }
}
