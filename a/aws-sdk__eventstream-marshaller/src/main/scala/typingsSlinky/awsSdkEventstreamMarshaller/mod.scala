package typingsSlinky.awsSdkEventstreamMarshaller

import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/eventstream-marshaller", "EventStreamMarshaller")
  @js.native
  class EventStreamMarshaller protected ()
    extends typingsSlinky.awsSdkEventstreamMarshaller.eventStreamMarshallerMod.EventStreamMarshaller {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
  }
  
  @JSImport("@aws-sdk/eventstream-marshaller", "Int64")
  @js.native
  class Int64 protected ()
    extends typingsSlinky.awsSdkEventstreamMarshaller.int64Mod.Int64 {
    def this(bytes: js.typedarray.Uint8Array) = this()
  }
  /* static members */
  object Int64 {
    
    @JSImport("@aws-sdk/eventstream-marshaller", "Int64.fromNumber")
    @js.native
    def fromNumber(number: Double): typingsSlinky.awsSdkEventstreamMarshaller.int64Mod.Int64 = js.native
  }
}
