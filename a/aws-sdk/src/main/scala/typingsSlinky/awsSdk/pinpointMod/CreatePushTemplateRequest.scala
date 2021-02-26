package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePushTemplateRequest extends StObject {
  
  var PushNotificationTemplateRequest: typingsSlinky.awsSdk.pinpointMod.PushNotificationTemplateRequest = js.native
  
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: string = js.native
}
object CreatePushTemplateRequest {
  
  @scala.inline
  def apply(PushNotificationTemplateRequest: PushNotificationTemplateRequest, TemplateName: string): CreatePushTemplateRequest = {
    val __obj = js.Dynamic.literal(PushNotificationTemplateRequest = PushNotificationTemplateRequest.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePushTemplateRequest]
  }
  
  @scala.inline
  implicit class CreatePushTemplateRequestMutableBuilder[Self <: CreatePushTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPushNotificationTemplateRequest(value: PushNotificationTemplateRequest): Self = StObject.set(x, "PushNotificationTemplateRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: string): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
