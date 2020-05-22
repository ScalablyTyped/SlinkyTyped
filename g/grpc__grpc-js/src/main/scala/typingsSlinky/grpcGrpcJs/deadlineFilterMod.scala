package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.callStreamMod.Call
import typingsSlinky.grpcGrpcJs.channelMod.Channel
import typingsSlinky.grpcGrpcJs.filterMod.BaseFilter
import typingsSlinky.grpcGrpcJs.filterMod.FilterFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/deadline-filter", JSImport.Namespace)
@js.native
object deadlineFilterMod extends js.Object {
  @js.native
  class DeadlineFilter protected () extends BaseFilter {
    def this(channel: Channel, callStream: Call) = this()
    val callStream: js.Any = js.native
    val channel: js.Any = js.native
    var deadline: js.Any = js.native
    var timer: js.Any = js.native
  }
  
  @js.native
  class DeadlineFilterFactory protected () extends FilterFactory[DeadlineFilter] {
    def this(channel: Channel) = this()
    val channel: js.Any = js.native
    /* CompleteClass */
    override def createFilter(callStream: Call): DeadlineFilter = js.native
  }
  
}

