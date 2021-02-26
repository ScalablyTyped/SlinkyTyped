package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEmailTemplateResponse extends StObject {
  
  var EmailTemplateResponse: typingsSlinky.awsSdk.pinpointMod.EmailTemplateResponse = js.native
}
object GetEmailTemplateResponse {
  
  @scala.inline
  def apply(EmailTemplateResponse: EmailTemplateResponse): GetEmailTemplateResponse = {
    val __obj = js.Dynamic.literal(EmailTemplateResponse = EmailTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailTemplateResponse]
  }
  
  @scala.inline
  implicit class GetEmailTemplateResponseMutableBuilder[Self <: GetEmailTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailTemplateResponse(value: EmailTemplateResponse): Self = StObject.set(x, "EmailTemplateResponse", value.asInstanceOf[js.Any])
  }
}
