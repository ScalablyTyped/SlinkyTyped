package typingsSlinky.awsSdkEventstreamMarshaller

import typingsSlinky.awsSdkTypes.eventStreamMod.MessageHeaders
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/eventstream-marshaller/dist/cjs/HeaderMarshaller", JSImport.Namespace)
@js.native
object headerMarshallerMod extends js.Object {
  
  @js.native
  class HeaderMarshaller protected () extends js.Object {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
    
    def format(headers: MessageHeaders): js.typedarray.Uint8Array = js.native
    
    var formatHeaderValue: js.Any = js.native
    
    val fromUtf8: js.Any = js.native
    
    def parse(headers: js.typedarray.DataView): MessageHeaders = js.native
    
    val toUtf8: js.Any = js.native
  }
}
