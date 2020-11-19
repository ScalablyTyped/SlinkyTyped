package typingsSlinky.awsSdkEventstreamMarshaller

import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/eventstream-marshaller", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class EventStreamMarshaller protected ()
    extends typingsSlinky.awsSdkEventstreamMarshaller.eventStreamMarshallerMod.EventStreamMarshaller {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
  }
  
  @js.native
  class Int64 protected ()
    extends typingsSlinky.awsSdkEventstreamMarshaller.int64Mod.Int64 {
    def this(bytes: js.typedarray.Uint8Array) = this()
  }
  /* static members */
  @js.native
  object Int64 extends js.Object {
    
    def fromNumber(number: Double): typingsSlinky.awsSdkEventstreamMarshaller.int64Mod.Int64 = js.native
  }
}
