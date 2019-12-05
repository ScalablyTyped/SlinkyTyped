package typingsSlinky.atAwsDashSdkEventstreamDashMarshaller

import typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.Message
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Decoder
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/eventstream-marshaller/build/EventStreamMarshaller", JSImport.Namespace)
@js.native
object buildEventStreamMarshallerMod extends js.Object {
  @js.native
  class EventStreamMarshaller protected () extends js.Object {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
    val headerMarshaller: js.Any = js.native
    /**
      * Convert a structured JavaScript object with tagged headers into a binary
      * event stream message.
      */
    def marshall(hasHeadersBody: Message): scala.scalajs.js.typedarray.Uint8Array = js.native
    /**
      * Convert a binary event stream message into a JavaScript object with an
      * opaque, binary body and tagged, parsed headers.
      */
    def unmarshall(message: scala.scalajs.js.typedarray.ArrayBufferView): Message = js.native
  }
  
}

