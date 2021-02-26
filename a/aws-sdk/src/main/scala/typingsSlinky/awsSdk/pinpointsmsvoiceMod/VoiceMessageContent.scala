package typingsSlinky.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceMessageContent extends StObject {
  
  var CallInstructionsMessage: js.UndefOr[CallInstructionsMessageType] = js.native
  
  var PlainTextMessage: js.UndefOr[PlainTextMessageType] = js.native
  
  var SSMLMessage: js.UndefOr[SSMLMessageType] = js.native
}
object VoiceMessageContent {
  
  @scala.inline
  def apply(): VoiceMessageContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceMessageContent]
  }
  
  @scala.inline
  implicit class VoiceMessageContentMutableBuilder[Self <: VoiceMessageContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallInstructionsMessage(value: CallInstructionsMessageType): Self = StObject.set(x, "CallInstructionsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallInstructionsMessageUndefined: Self = StObject.set(x, "CallInstructionsMessage", js.undefined)
    
    @scala.inline
    def setPlainTextMessage(value: PlainTextMessageType): Self = StObject.set(x, "PlainTextMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlainTextMessageUndefined: Self = StObject.set(x, "PlainTextMessage", js.undefined)
    
    @scala.inline
    def setSSMLMessage(value: SSMLMessageType): Self = StObject.set(x, "SSMLMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSMLMessageUndefined: Self = StObject.set(x, "SSMLMessage", js.undefined)
  }
}
