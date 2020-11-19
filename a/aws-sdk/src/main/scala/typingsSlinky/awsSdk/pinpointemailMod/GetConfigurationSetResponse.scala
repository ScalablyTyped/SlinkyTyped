package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConfigurationSetResponse extends js.Object {
  
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
  implicit class GetConfigurationSetResponseOps[Self <: GetConfigurationSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = this.set("ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationSetName: Self = this.set("ConfigurationSetName", js.undefined)
    
    @scala.inline
    def setDeliveryOptions(value: DeliveryOptions): Self = this.set("DeliveryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryOptions: Self = this.set("DeliveryOptions", js.undefined)
    
    @scala.inline
    def setReputationOptions(value: ReputationOptions): Self = this.set("ReputationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReputationOptions: Self = this.set("ReputationOptions", js.undefined)
    
    @scala.inline
    def setSendingOptions(value: SendingOptions): Self = this.set("SendingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendingOptions: Self = this.set("SendingOptions", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTrackingOptions(value: TrackingOptions): Self = this.set("TrackingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackingOptions: Self = this.set("TrackingOptions", js.undefined)
  }
}
