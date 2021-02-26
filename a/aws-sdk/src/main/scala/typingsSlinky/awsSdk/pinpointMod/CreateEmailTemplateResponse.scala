package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEmailTemplateResponse extends StObject {
  
  var CreateTemplateMessageBody: typingsSlinky.awsSdk.pinpointMod.CreateTemplateMessageBody = js.native
}
object CreateEmailTemplateResponse {
  
  @scala.inline
  def apply(CreateTemplateMessageBody: CreateTemplateMessageBody): CreateEmailTemplateResponse = {
    val __obj = js.Dynamic.literal(CreateTemplateMessageBody = CreateTemplateMessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEmailTemplateResponse]
  }
  
  @scala.inline
  implicit class CreateEmailTemplateResponseMutableBuilder[Self <: CreateEmailTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTemplateMessageBody(value: CreateTemplateMessageBody): Self = StObject.set(x, "CreateTemplateMessageBody", value.asInstanceOf[js.Any])
  }
}
