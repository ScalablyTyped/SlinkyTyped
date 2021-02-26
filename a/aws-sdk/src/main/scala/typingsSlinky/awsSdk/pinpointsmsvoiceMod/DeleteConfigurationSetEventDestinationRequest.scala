package typingsSlinky.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConfigurationSetEventDestinationRequest extends StObject {
  
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: _String = js.native
  
  /**
    * EventDestinationName
    */
  var EventDestinationName: _String = js.native
}
object DeleteConfigurationSetEventDestinationRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: _String, EventDestinationName: _String): DeleteConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationSetEventDestinationRequest]
  }
  
  @scala.inline
  implicit class DeleteConfigurationSetEventDestinationRequestMutableBuilder[Self <: DeleteConfigurationSetEventDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: _String): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDestinationName(value: _String): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
  }
}
