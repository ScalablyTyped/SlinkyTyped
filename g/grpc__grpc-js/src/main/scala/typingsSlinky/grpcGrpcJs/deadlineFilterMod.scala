package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.callStreamMod.Call
import typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject
import typingsSlinky.grpcGrpcJs.callStreamMod.WriteObject
import typingsSlinky.grpcGrpcJs.channelMod.Channel
import typingsSlinky.grpcGrpcJs.filterMod.BaseFilter
import typingsSlinky.grpcGrpcJs.filterMod.Filter
import typingsSlinky.grpcGrpcJs.filterMod.FilterFactory
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/deadline-filter", JSImport.Namespace)
@js.native
object deadlineFilterMod extends js.Object {
  @js.native
  class DeadlineFilter protected ()
    extends BaseFilter
       with Filter {
    def this(channel: Channel, callStream: Call) = this()
    val callStream: js.Any = js.native
    val channel: js.Any = js.native
    var deadline: js.Any = js.native
    var timer: js.Any = js.native
    /* InferMemberOverrides */
    override def receiveMessage(message: js.Promise[Buffer]): js.Promise[Buffer] = js.native
    /* InferMemberOverrides */
    override def receiveMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
    /* InferMemberOverrides */
    override def receiveTrailers(status: js.Promise[StatusObject]): js.Promise[StatusObject] = js.native
    /* InferMemberOverrides */
    override def sendMessage(message: js.Promise[WriteObject]): js.Promise[WriteObject] = js.native
    /* InferMemberOverrides */
    override def sendMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
  }
  
  @js.native
  class DeadlineFilterFactory protected () extends FilterFactory[DeadlineFilter] {
    def this(channel: Channel) = this()
    val channel: js.Any = js.native
  }
  
}

