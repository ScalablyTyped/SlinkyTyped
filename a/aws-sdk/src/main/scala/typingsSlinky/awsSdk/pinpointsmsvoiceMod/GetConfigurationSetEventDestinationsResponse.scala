package typingsSlinky.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConfigurationSetEventDestinationsResponse extends StObject {
  
  var EventDestinations: js.UndefOr[typingsSlinky.awsSdk.pinpointsmsvoiceMod.EventDestinations] = js.native
}
object GetConfigurationSetEventDestinationsResponse {
  
  @scala.inline
  def apply(): GetConfigurationSetEventDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConfigurationSetEventDestinationsResponse]
  }
  
  @scala.inline
  implicit class GetConfigurationSetEventDestinationsResponseMutableBuilder[Self <: GetConfigurationSetEventDestinationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventDestinations(value: EventDestinations): Self = StObject.set(x, "EventDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDestinationsUndefined: Self = StObject.set(x, "EventDestinations", js.undefined)
    
    @scala.inline
    def setEventDestinationsVarargs(value: EventDestination*): Self = StObject.set(x, "EventDestinations", js.Array(value :_*))
  }
}
