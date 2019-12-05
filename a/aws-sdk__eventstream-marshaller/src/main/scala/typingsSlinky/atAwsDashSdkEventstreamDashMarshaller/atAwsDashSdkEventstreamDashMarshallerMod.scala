package typingsSlinky.atAwsDashSdkEventstreamDashMarshaller

import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Decoder
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/eventstream-marshaller", JSImport.Namespace)
@js.native
object atAwsDashSdkEventstreamDashMarshallerMod extends js.Object {
  @js.native
  class EventStreamMarshaller protected ()
    extends typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.buildEventStreamMarshallerMod.EventStreamMarshaller {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
  }
  
  @js.native
  class Int64 protected ()
    extends typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.buildInt64Mod.Int64 {
    def this(bytes: scala.scalajs.js.typedarray.Uint8Array) = this()
  }
  
  /* static members */
  @js.native
  object Int64 extends js.Object {
    def fromNumber(number: Double): typingsSlinky.atAwsDashSdkEventstreamDashMarshaller.buildInt64Mod.Int64 = js.native
  }
  
}

