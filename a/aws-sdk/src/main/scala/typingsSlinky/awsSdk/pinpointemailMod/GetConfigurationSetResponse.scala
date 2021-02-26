package typingsSlinky.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConfigurationSetResponse extends StObject {
  
  /**
    * The name of the configuration set.
    */
  var ConfigurationSetName: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.ConfigurationSetName] = js.native
  
  /**
    * An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
    */
  var DeliveryOptions: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.DeliveryOptions] = js.native
  
  /**
    * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the emails that you send that use the configuration set.
    */
  var ReputationOptions: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.ReputationOptions] = js.native
  
  /**
    * An object that defines whether or not Amazon Pinpoint can send email that you send using the configuration set.
    */
  var SendingOptions: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.SendingOptions] = js.native
  
  /**
    * An array of objects that define the tags (keys and values) that are associated with the configuration set.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * An object that defines the open and click tracking options for emails that you send using the configuration set.
    */
  var TrackingOptions: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.TrackingOptions] = js.native
}
object GetConfigurationSetResponse {
  
  @scala.inline
  def apply(): GetConfigurationSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConfigurationSetResponse]
  }
  
  @scala.inline
  implicit class GetConfigurationSetResponseMutableBuilder[Self <: GetConfigurationSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    @scala.inline
    def setDeliveryOptions(value: DeliveryOptions): Self = StObject.set(x, "DeliveryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryOptionsUndefined: Self = StObject.set(x, "DeliveryOptions", js.undefined)
    
    @scala.inline
    def setReputationOptions(value: ReputationOptions): Self = StObject.set(x, "ReputationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReputationOptionsUndefined: Self = StObject.set(x, "ReputationOptions", js.undefined)
    
    @scala.inline
    def setSendingOptions(value: SendingOptions): Self = StObject.set(x, "SendingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendingOptionsUndefined: Self = StObject.set(x, "SendingOptions", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTrackingOptions(value: TrackingOptions): Self = StObject.set(x, "TrackingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingOptionsUndefined: Self = StObject.set(x, "TrackingOptions", js.undefined)
  }
}
