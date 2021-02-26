package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationSetResponse extends StObject {
  
  /**
    * The configuration set object associated with the specified configuration set.
    */
  var ConfigurationSet: js.UndefOr[typingsSlinky.awsSdk.sesMod.ConfigurationSet] = js.native
  
  var DeliveryOptions: js.UndefOr[typingsSlinky.awsSdk.sesMod.DeliveryOptions] = js.native
  
  /**
    * A list of event destinations associated with the configuration set. 
    */
  var EventDestinations: js.UndefOr[typingsSlinky.awsSdk.sesMod.EventDestinations] = js.native
  
  /**
    * An object that represents the reputation settings for the configuration set. 
    */
  var ReputationOptions: js.UndefOr[typingsSlinky.awsSdk.sesMod.ReputationOptions] = js.native
  
  /**
    * The name of the custom open and click tracking domain associated with the configuration set.
    */
  var TrackingOptions: js.UndefOr[typingsSlinky.awsSdk.sesMod.TrackingOptions] = js.native
}
object DescribeConfigurationSetResponse {
  
  @scala.inline
  def apply(): DescribeConfigurationSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationSetResponse]
  }
  
  @scala.inline
  implicit class DescribeConfigurationSetResponseMutableBuilder[Self <: DescribeConfigurationSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSet(value: ConfigurationSet): Self = StObject.set(x, "ConfigurationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSetUndefined: Self = StObject.set(x, "ConfigurationSet", js.undefined)
    
    @scala.inline
    def setDeliveryOptions(value: DeliveryOptions): Self = StObject.set(x, "DeliveryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryOptionsUndefined: Self = StObject.set(x, "DeliveryOptions", js.undefined)
    
    @scala.inline
    def setEventDestinations(value: EventDestinations): Self = StObject.set(x, "EventDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDestinationsUndefined: Self = StObject.set(x, "EventDestinations", js.undefined)
    
    @scala.inline
    def setEventDestinationsVarargs(value: EventDestination*): Self = StObject.set(x, "EventDestinations", js.Array(value :_*))
    
    @scala.inline
    def setReputationOptions(value: ReputationOptions): Self = StObject.set(x, "ReputationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReputationOptionsUndefined: Self = StObject.set(x, "ReputationOptions", js.undefined)
    
    @scala.inline
    def setTrackingOptions(value: TrackingOptions): Self = StObject.set(x, "TrackingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingOptionsUndefined: Self = StObject.set(x, "TrackingOptions", js.undefined)
  }
}
