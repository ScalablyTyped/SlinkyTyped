package typingsSlinky.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object serverCallMod {
  
  type HandleCall[RequestType, ResponseType] = (typingsSlinky.grpcGrpcJs.serverCallMod.handleUnaryCall[RequestType, ResponseType]) | (typingsSlinky.grpcGrpcJs.serverCallMod.handleClientStreamingCall[RequestType, ResponseType]) | (typingsSlinky.grpcGrpcJs.serverCallMod.handleServerStreamingCall[RequestType, ResponseType]) | (typingsSlinky.grpcGrpcJs.serverCallMod.handleBidiStreamingCall[RequestType, ResponseType])
  
  type handleBidiStreamingCall[RequestType, ResponseType] = js.Function1[
    /* call */ typingsSlinky.grpcGrpcJs.serverCallMod.ServerDuplexStream[RequestType, ResponseType], 
    scala.Unit
  ]
  
  type handleClientStreamingCall[RequestType, ResponseType] = js.Function2[
    /* call */ typingsSlinky.grpcGrpcJs.serverCallMod.ServerReadableStream[RequestType, ResponseType], 
    /* callback */ typingsSlinky.grpcGrpcJs.serverCallMod.sendUnaryData[ResponseType], 
    scala.Unit
  ]
  
  type handleServerStreamingCall[RequestType, ResponseType] = js.Function1[
    /* call */ typingsSlinky.grpcGrpcJs.serverCallMod.ServerWritableStream[RequestType, ResponseType], 
    scala.Unit
  ]
  
  type handleUnaryCall[RequestType, ResponseType] = js.Function2[
    /* call */ typingsSlinky.grpcGrpcJs.serverCallMod.ServerUnaryCall[RequestType, ResponseType], 
    /* callback */ typingsSlinky.grpcGrpcJs.serverCallMod.sendUnaryData[ResponseType], 
    scala.Unit
  ]
  
  type sendUnaryData[ResponseType] = js.Function4[
    /* error */ typingsSlinky.grpcGrpcJs.serverCallMod.ServerErrorResponse | typingsSlinky.grpcGrpcJs.serverCallMod.ServerStatusResponse | scala.Null, 
    /* value */ ResponseType | scala.Null, 
    /* trailer */ js.UndefOr[typingsSlinky.grpcGrpcJs.metadataMod.Metadata], 
    /* flags */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
}
