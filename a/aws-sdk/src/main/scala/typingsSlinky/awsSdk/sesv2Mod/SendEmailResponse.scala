package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendEmailResponse extends StObject {
  
  /**
    * A unique identifier for the message that is generated when the message is accepted.  It's possible for Amazon SES to accept a message without sending it. This can happen when the message that you're trying to send has an attachment contains a virus, or when you send a templated email that contains invalid personalization content, for example. 
    */
  var MessageId: js.UndefOr[OutboundMessageId] = js.native
}
object SendEmailResponse {
  
  @scala.inline
  def apply(): SendEmailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendEmailResponse]
  }
  
  @scala.inline
  implicit class SendEmailResponseMutableBuilder[Self <: SendEmailResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageId(value: OutboundMessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
