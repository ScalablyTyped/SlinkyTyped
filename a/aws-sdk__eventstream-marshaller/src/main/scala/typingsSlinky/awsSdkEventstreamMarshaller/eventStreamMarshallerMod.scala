package typingsSlinky.awsSdkEventstreamMarshaller

import typingsSlinky.awsSdkTypes.eventStreamMod.Message
import typingsSlinky.awsSdkTypes.eventStreamMod.MessageHeaders
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventStreamMarshallerMod {
  
  @JSImport("@aws-sdk/eventstream-marshaller/dist/cjs/EventStreamMarshaller", "EventStreamMarshaller")
  @js.native
  class EventStreamMarshaller protected () extends StObject {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
    
    /**
      * Convert a structured JavaScript object with tagged headers into a binary
      * event stream message header.
      */
    def formatHeaders(rawHeaders: MessageHeaders): js.typedarray.Uint8Array = js.native
    
    val headerMarshaller: js.Any = js.native
    
    /**
      * Convert a structured JavaScript object with tagged headers into a binary
      * event stream message.
      */
    def marshall(hasHeadersBody: Message): js.typedarray.Uint8Array = js.native
    
    /**
      * Convert a binary event stream message into a JavaScript object with an
      * opaque, binary body and tagged, parsed headers.
      */
    def unmarshall(message: js.typedarray.ArrayBufferView): Message = js.native
  }
}
