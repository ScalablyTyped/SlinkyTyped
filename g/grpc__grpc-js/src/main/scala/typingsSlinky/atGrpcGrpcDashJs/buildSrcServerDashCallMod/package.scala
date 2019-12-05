package typingsSlinky.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcServerDashCallMod {
  import typingsSlinky.atGrpcGrpcDashJs.Anon_Cancelled
  import typingsSlinky.atGrpcGrpcDashJs.Anon_Request
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.ObjectReadable
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.ObjectWritable
  import typingsSlinky.node.eventsMod.EventEmitter
  import typingsSlinky.std.Partial

  type HandleCall[RequestType, ResponseType] = (handleUnaryCall[RequestType, ResponseType]) | (handleClientStreamingCall[RequestType, ResponseType]) | (handleServerStreamingCall[RequestType, ResponseType]) | (handleBidiStreamingCall[RequestType, ResponseType])
  type ServerDuplexStream[RequestType, ResponseType] = ServerSurfaceCall with ObjectReadable[RequestType] with ObjectWritable[ResponseType]
  type ServerErrorResponse = ServerStatusResponse with js.Error
  type ServerReadableStream[RequestType, ResponseType] = ServerSurfaceCall with ObjectReadable[RequestType]
  type ServerStatusResponse = Partial[StatusObject]
  type ServerSurfaceCall = Anon_Cancelled with EventEmitter
  type ServerUnaryCall[RequestType, ResponseType] = ServerSurfaceCall with Anon_Request[RequestType]
  type ServerWritableStream[RequestType, ResponseType] = ServerSurfaceCall with ObjectWritable[ResponseType] with Anon_Request[RequestType]
  type handleBidiStreamingCall[RequestType, ResponseType] = js.Function1[/* call */ ServerDuplexStream[RequestType, ResponseType], Unit]
  type handleClientStreamingCall[RequestType, ResponseType] = js.Function2[
    /* call */ ServerReadableStream[RequestType, ResponseType], 
    /* callback */ sendUnaryData[ResponseType], 
    Unit
  ]
  type handleServerStreamingCall[RequestType, ResponseType] = js.Function1[/* call */ ServerWritableStream[RequestType, ResponseType], Unit]
  type handleUnaryCall[RequestType, ResponseType] = js.Function2[
    /* call */ ServerUnaryCall[RequestType, ResponseType], 
    /* callback */ sendUnaryData[ResponseType], 
    Unit
  ]
  type sendUnaryData[ResponseType] = js.Function4[
    /* error */ ServerErrorResponse | ServerStatusResponse | Null, 
    /* value */ ResponseType | Null, 
    /* trailer */ js.UndefOr[Metadata], 
    /* flags */ js.UndefOr[Double], 
    Unit
  ]
}
