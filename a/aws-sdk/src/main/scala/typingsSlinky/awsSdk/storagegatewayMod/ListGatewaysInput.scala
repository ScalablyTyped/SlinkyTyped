package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGatewaysInput extends StObject {
  
  /**
    * Specifies that the list of gateways returned be limited to the specified number of items.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.native
  
  /**
    * An opaque string that indicates the position at which to begin the returned list of gateways.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Marker] = js.native
}
object ListGatewaysInput {
  
  @scala.inline
  def apply(): ListGatewaysInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGatewaysInput]
  }
  
  @scala.inline
  implicit class ListGatewaysInputMutableBuilder[Self <: ListGatewaysInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: PositiveIntObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
