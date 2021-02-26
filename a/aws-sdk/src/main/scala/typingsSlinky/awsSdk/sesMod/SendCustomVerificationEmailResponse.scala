package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendCustomVerificationEmailResponse extends StObject {
  
  /**
    * The unique message identifier returned from the SendCustomVerificationEmail operation.
    */
  var MessageId: js.UndefOr[typingsSlinky.awsSdk.sesMod.MessageId] = js.native
}
object SendCustomVerificationEmailResponse {
  
  @scala.inline
  def apply(): SendCustomVerificationEmailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendCustomVerificationEmailResponse]
  }
  
  @scala.inline
  implicit class SendCustomVerificationEmailResponseMutableBuilder[Self <: SendCustomVerificationEmailResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
