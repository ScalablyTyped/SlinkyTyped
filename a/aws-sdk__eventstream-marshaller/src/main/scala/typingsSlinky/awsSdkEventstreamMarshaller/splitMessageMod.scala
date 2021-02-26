package typingsSlinky.awsSdkEventstreamMarshaller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitMessageMod {
  
  @JSImport("@aws-sdk/eventstream-marshaller/dist/cjs/splitMessage", "splitMessage")
  @js.native
  def splitMessage(hasByteLengthByteOffsetBuffer: js.typedarray.ArrayBufferView): MessageParts = js.native
  
  @js.native
  trait MessageParts extends StObject {
    
    var body: js.typedarray.Uint8Array = js.native
    
    var headers: js.typedarray.DataView = js.native
  }
  object MessageParts {
    
    @scala.inline
    def apply(body: js.typedarray.Uint8Array, headers: js.typedarray.DataView): MessageParts = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageParts]
    }
    
    @scala.inline
    implicit class MessagePartsMutableBuilder[Self <: MessageParts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.typedarray.DataView): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
}
