package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTemplateActiveVersionResponse extends StObject {
  
  var MessageBody: typingsSlinky.awsSdk.pinpointMod.MessageBody = js.native
}
object UpdateTemplateActiveVersionResponse {
  
  @scala.inline
  def apply(MessageBody: MessageBody): UpdateTemplateActiveVersionResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplateActiveVersionResponse]
  }
  
  @scala.inline
  implicit class UpdateTemplateActiveVersionResponseMutableBuilder[Self <: UpdateTemplateActiveVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageBody(value: MessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
  }
}
