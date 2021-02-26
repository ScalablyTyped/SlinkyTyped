package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreatmentResource extends StObject {
  
  /**
    * The delivery configuration settings for sending the treatment through a custom channel. This object is required if the MessageConfiguration object for the treatment specifies a CustomMessage object.
    */
  var CustomDeliveryConfiguration: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.CustomDeliveryConfiguration] = js.native
  
  /**
    * The unique identifier for the treatment.
    */
  var Id: string = js.native
  
  /**
    * The message configuration settings for the treatment.
    */
  var MessageConfiguration: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.MessageConfiguration] = js.native
  
  /**
    * The schedule settings for the treatment.
    */
  var Schedule: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.Schedule] = js.native
  
  /**
    * The allocated percentage of users (segment members) that the treatment is sent to.
    */
  var SizePercent: integer = js.native
  
  /**
    * The current status of the treatment.
    */
  var State: js.UndefOr[CampaignState] = js.native
  
  /**
    * The message template to use for the treatment.
    */
  var TemplateConfiguration: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.TemplateConfiguration] = js.native
  
  /**
    * The custom description of the treatment.
    */
  var TreatmentDescription: js.UndefOr[string] = js.native
  
  /**
    * The custom name of the treatment.
    */
  var TreatmentName: js.UndefOr[string] = js.native
}
object TreatmentResource {
  
  @scala.inline
  def apply(Id: string, SizePercent: integer): TreatmentResource = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], SizePercent = SizePercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreatmentResource]
  }
  
  @scala.inline
  implicit class TreatmentResourceMutableBuilder[Self <: TreatmentResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomDeliveryConfiguration(value: CustomDeliveryConfiguration): Self = StObject.set(x, "CustomDeliveryConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDeliveryConfigurationUndefined: Self = StObject.set(x, "CustomDeliveryConfiguration", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageConfiguration(value: MessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageConfigurationUndefined: Self = StObject.set(x, "MessageConfiguration", js.undefined)
    
    @scala.inline
    def setSchedule(value: Schedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    @scala.inline
    def setSizePercent(value: integer): Self = StObject.set(x, "SizePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: CampaignState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTemplateConfiguration(value: TemplateConfiguration): Self = StObject.set(x, "TemplateConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateConfigurationUndefined: Self = StObject.set(x, "TemplateConfiguration", js.undefined)
    
    @scala.inline
    def setTreatmentDescription(value: string): Self = StObject.set(x, "TreatmentDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreatmentDescriptionUndefined: Self = StObject.set(x, "TreatmentDescription", js.undefined)
    
    @scala.inline
    def setTreatmentName(value: string): Self = StObject.set(x, "TreatmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreatmentNameUndefined: Self = StObject.set(x, "TreatmentName", js.undefined)
  }
}
