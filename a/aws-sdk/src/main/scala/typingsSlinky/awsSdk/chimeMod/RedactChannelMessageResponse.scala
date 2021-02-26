package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedactChannelMessageResponse extends StObject {
  
  /**
    * The ARN of the channel containing the messages that you want to redact.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The ID of the message being redacted.
    */
  var MessageId: js.UndefOr[typingsSlinky.awsSdk.chimeMod.MessageId] = js.native
}
object RedactChannelMessageResponse {
  
  @scala.inline
  def apply(): RedactChannelMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedactChannelMessageResponse]
  }
  
  @scala.inline
  implicit class RedactChannelMessageResponseMutableBuilder[Self <: RedactChannelMessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
