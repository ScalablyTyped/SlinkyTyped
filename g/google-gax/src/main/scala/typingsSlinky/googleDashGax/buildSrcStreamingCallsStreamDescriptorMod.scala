package typingsSlinky.googleDashGax

import typingsSlinky.googleDashGax.buildSrcApiCallerMod.APICaller
import typingsSlinky.googleDashGax.buildSrcDescriptorMod.Descriptor
import typingsSlinky.googleDashGax.buildSrcGaxMod.CallSettings
import typingsSlinky.googleDashGax.buildSrcStreamingCallsStreamingMod.StreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/streamingCalls/streamDescriptor", JSImport.Namespace)
@js.native
object buildSrcStreamingCallsStreamDescriptorMod extends js.Object {
  @js.native
  class StreamDescriptor protected () extends Descriptor {
    def this(streamType: StreamType) = this()
    var streaming: Boolean = js.native
    var `type`: StreamType = js.native
    /* CompleteClass */
    override def getApiCaller(settings: CallSettings): APICaller = js.native
  }
  
}

