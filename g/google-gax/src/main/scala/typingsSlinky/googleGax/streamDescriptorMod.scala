package typingsSlinky.googleGax

import typingsSlinky.googleGax.apiCallerMod.APICaller
import typingsSlinky.googleGax.descriptorMod.Descriptor
import typingsSlinky.googleGax.gaxMod.CallSettings
import typingsSlinky.googleGax.streamingMod.StreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/streamingCalls/streamDescriptor", JSImport.Namespace)
@js.native
object streamDescriptorMod extends js.Object {
  @js.native
  class StreamDescriptor protected () extends Descriptor {
    def this(streamType: StreamType) = this()
    var streaming: Boolean = js.native
    var `type`: StreamType = js.native
    /* CompleteClass */
    override def getApiCaller(settings: CallSettings): APICaller = js.native
  }
  
}

