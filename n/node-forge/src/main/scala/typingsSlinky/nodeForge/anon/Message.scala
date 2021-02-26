package typingsSlinky.nodeForge.anon

import typingsSlinky.nodeForge.mod.pki.ed25519.NativeBuffer
import typingsSlinky.nodeForge.mod.pki.ed25519.ToNativeBufferParameters
import typingsSlinky.nodeForge.mod.util.ByteBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends ToNativeBufferParameters {
  
  var message: NativeBuffer | ByteBuffer = js.native
}
object Message {
  
  @scala.inline
  def apply(message: NativeBuffer | ByteBuffer): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: NativeBuffer | ByteBuffer): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
