package typingsSlinky.atAwsDashSdkEventstreamDashMarshaller

import typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.buildMessageMod.MessageHeaders
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Decoder
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/eventstream-marshaller/build/HeaderMarshaller", JSImport.Namespace)
@js.native
object buildHeaderMarshallerMod extends js.Object {
  @js.native
  class HeaderMarshaller protected () extends js.Object {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
    var formatHeaderValue: js.Any = js.native
    val fromUtf8: js.Any = js.native
    val toUtf8: js.Any = js.native
    def format(headers: MessageHeaders): scala.scalajs.js.typedarray.Uint8Array = js.native
    def parse(headers: scala.scalajs.js.typedarray.DataView): MessageHeaders = js.native
  }
  
}

