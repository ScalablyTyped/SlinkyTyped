package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.callStreamMod.Call
import typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject
import typingsSlinky.grpcGrpcJs.callStreamMod.WriteObject
import typingsSlinky.grpcGrpcJs.filterMod.Filter
import typingsSlinky.grpcGrpcJs.filterMod.FilterFactory
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/filter-stack", JSImport.Namespace)
@js.native
object filterStackMod extends js.Object {
  @js.native
  class FilterStack protected () extends Filter {
    def this(filters: js.Array[Filter]) = this()
    val filters: js.Any = js.native
    /* CompleteClass */
    override def receiveMessage(message: js.Promise[Buffer]): js.Promise[Buffer] = js.native
    /* CompleteClass */
    override def receiveMetadata(metadata: Metadata): Metadata = js.native
    /* CompleteClass */
    override def receiveTrailers(status: StatusObject): StatusObject = js.native
    /* CompleteClass */
    override def sendMessage(message: js.Promise[WriteObject]): js.Promise[WriteObject] = js.native
    /* CompleteClass */
    override def sendMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
  }
  
  @js.native
  class FilterStackFactory protected () extends FilterFactory[FilterStack] {
    def this(factories: js.Array[FilterFactory[Filter]]) = this()
    val factories: js.Any = js.native
    /* CompleteClass */
    override def createFilter(callStream: Call): FilterStack = js.native
  }
  
}

