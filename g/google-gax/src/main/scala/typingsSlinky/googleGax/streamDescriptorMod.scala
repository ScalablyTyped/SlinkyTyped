package typingsSlinky.googleGax

import typingsSlinky.googleGax.descriptorMod.Descriptor
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
  }
  
}

