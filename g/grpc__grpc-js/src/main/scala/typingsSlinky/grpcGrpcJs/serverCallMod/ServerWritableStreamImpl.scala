package typingsSlinky.grpcGrpcJs.serverCallMod

import typingsSlinky.grpcGrpcJs.makeClientMod.Serialize
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.grpcGrpcJs.serverCallMod.ServerWritableStream because var conflicts: _writev, destroyed, writable. Inlined cancelled, metadata, getPeer, sendMetadata, request */ @JSImport("@grpc/grpc-js/build/src/server-call", "ServerWritableStreamImpl")
@js.native
class ServerWritableStreamImpl[RequestType, ResponseType] protected () extends Writable {
  def this(
    call: Http2ServerCallStream[RequestType, ResponseType],
    metadata: Metadata,
    serialize: Serialize[ResponseType]
  ) = this()
  
  def _final(callback: js.Function): Unit = js.native
  
  def _write(chunk: ResponseType, encoding: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  var call: js.Any = js.native
  
  var cancelled: Boolean = js.native
  
  def getPeer(): String = js.native
  
  var metadata: Metadata = js.native
  
  var request: Null | RequestType = js.native
  
  def sendMetadata(responseMetadata: Metadata): Unit = js.native
  
  def serialize(value: ResponseType): Buffer = js.native
  @JSName("serialize")
  var serialize_Original: Serialize[ResponseType] = js.native
  
  var trailingMetadata: js.Any = js.native
}
