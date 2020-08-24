package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.callStreamMod.Call
import typingsSlinky.grpcGrpcJs.channelMod.Channel
import typingsSlinky.grpcGrpcJs.filterMod.BaseFilter
import typingsSlinky.grpcGrpcJs.filterMod.FilterFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/call-credentials-filter", JSImport.Namespace)
@js.native
object callCredentialsFilterMod extends js.Object {
  @js.native
  class CallCredentialsFilter protected () extends BaseFilter {
    def this(channel: Channel, stream: Call) = this()
    val channel: js.Any = js.native
    var serviceUrl: js.Any = js.native
    val stream: js.Any = js.native
  }
  
  @js.native
  class CallCredentialsFilterFactory protected () extends FilterFactory[CallCredentialsFilter] {
    def this(channel: Channel) = this()
    val channel: js.Any = js.native
  }
  
}

