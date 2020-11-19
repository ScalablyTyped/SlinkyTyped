package typingsSlinky.grpcGrpcJs.serverCallMod

import typingsSlinky.grpcGrpcJs.makeClientMod.Deserialize
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.grpcGrpcJs.serverCallMod.ServerReadableStream because var conflicts: destroyed, readable. Inlined cancelled, metadata, getPeer, sendMetadata */ @JSImport("@grpc/grpc-js/build/src/server-call", "ServerReadableStreamImpl")
@js.native
class ServerReadableStreamImpl[RequestType, ResponseType] protected () extends Readable {
  def this(
    call: Http2ServerCallStream[RequestType, ResponseType],
    metadata: Metadata,
    deserialize: Deserialize[RequestType]
  ) = this()
  
  var call: js.Any = js.native
  
  var cancelled: Boolean = js.native
  
  def deserialize(bytes: Buffer): RequestType = js.native
  @JSName("deserialize")
  var deserialize_Original: Deserialize[RequestType] = js.native
  
  def getPeer(): String = js.native
  
  var metadata: Metadata = js.native
  
  def sendMetadata(responseMetadata: Metadata): Unit = js.native
}
