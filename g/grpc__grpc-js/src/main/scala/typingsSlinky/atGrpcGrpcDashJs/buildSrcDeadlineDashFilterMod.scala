package typingsSlinky.atGrpcGrpcDashJs

import typingsSlinky.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.Call
import typingsSlinky.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
import typingsSlinky.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.WriteObject
import typingsSlinky.atGrpcGrpcDashJs.buildSrcChannelMod.Channel
import typingsSlinky.atGrpcGrpcDashJs.buildSrcDeadlineDashFilterMod.DeadlineFilter
import typingsSlinky.atGrpcGrpcDashJs.buildSrcFilterMod.BaseFilter
import typingsSlinky.atGrpcGrpcDashJs.buildSrcFilterMod.Filter
import typingsSlinky.atGrpcGrpcDashJs.buildSrcFilterMod.FilterFactory
import typingsSlinky.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/deadline-filter", JSImport.Namespace)
@js.native
object buildSrcDeadlineDashFilterMod extends js.Object {
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
    /* CompleteClass */
    override def createFilter(callStream: Call): DeadlineFilter = js.native
  }
  
}

