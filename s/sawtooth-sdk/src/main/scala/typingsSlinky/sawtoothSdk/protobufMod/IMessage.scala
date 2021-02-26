package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.Message.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessage extends StObject {
  
  /** Message content */
  var content: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  
  /** Message correlationId */
  var correlationId: js.UndefOr[String | Null] = js.native
  
  /** Message messageType */
  var messageType: js.UndefOr[MessageType | Null] = js.native
}
object IMessage {
  
  @scala.inline
  def apply(): IMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessage]
  }
  
  @scala.inline
  implicit class IMessageMutableBuilder[Self <: IMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.typedarray.Uint8Array): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationIdNull: Self = StObject.set(x, "correlationId", null)
    
    @scala.inline
    def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    @scala.inline
    def setMessageType(value: MessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTypeNull: Self = StObject.set(x, "messageType", null)
    
    @scala.inline
    def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
  }
}
