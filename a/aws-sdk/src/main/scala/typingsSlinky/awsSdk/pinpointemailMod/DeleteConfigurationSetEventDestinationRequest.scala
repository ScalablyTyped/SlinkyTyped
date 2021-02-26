package typingsSlinky.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConfigurationSetEventDestinationRequest extends StObject {
  
  /**
    * The name of the configuration set that contains the event destination that you want to delete.
    */
  var ConfigurationSetName: typingsSlinky.awsSdk.pinpointemailMod.ConfigurationSetName = js.native
  
  /**
    * The name of the event destination that you want to delete.
    */
  var EventDestinationName: typingsSlinky.awsSdk.pinpointemailMod.EventDestinationName = js.native
}
object DeleteConfigurationSetEventDestinationRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, EventDestinationName: EventDestinationName): DeleteConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationSetEventDestinationRequest]
  }
  
  @scala.inline
  implicit class DeleteConfigurationSetEventDestinationRequestMutableBuilder[Self <: DeleteConfigurationSetEventDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDestinationName(value: EventDestinationName): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
  }
}
