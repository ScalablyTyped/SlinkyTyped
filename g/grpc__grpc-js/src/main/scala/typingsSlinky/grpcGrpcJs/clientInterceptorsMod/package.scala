package typingsSlinky.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientInterceptorsMod {
  type CancelRequester = js.Function1[/* next */ js.Function0[scala.Unit], scala.Unit]
  type CloseRequester = js.Function1[/* next */ js.Function0[scala.Unit], scala.Unit]
  type Interceptor = js.Function2[
    /* options */ typingsSlinky.grpcGrpcJs.clientInterceptorsMod.InterceptorOptions, 
    /* nextCall */ typingsSlinky.grpcGrpcJs.clientInterceptorsMod.NextCall, 
    typingsSlinky.grpcGrpcJs.clientInterceptorsMod.InterceptingCall
  ]
  type InterceptorProvider = js.Function1[
    /* methodDefinition */ typingsSlinky.grpcGrpcJs.makeClientMod.ClientMethodDefinition[js.Any, js.Any], 
    typingsSlinky.grpcGrpcJs.clientInterceptorsMod.Interceptor
  ]
  type MessageRequester = js.Function2[
    /* message */ js.Any, 
    /* next */ js.Function1[/* message */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type MetadataRequester = js.Function3[
    /* metadata */ typingsSlinky.grpcGrpcJs.metadataMod.Metadata, 
    /* listener */ typingsSlinky.grpcGrpcJs.callStreamMod.InterceptingListener, 
    /* next */ js.Function2[
      /* metadata */ typingsSlinky.grpcGrpcJs.metadataMod.Metadata, 
      /* listener */ typingsSlinky.grpcGrpcJs.callStreamMod.InterceptingListener | typingsSlinky.grpcGrpcJs.callStreamMod.Listener, 
      scala.Unit
    ], 
    scala.Unit
  ]
  type NextCall = js.Function1[
    /* options */ typingsSlinky.grpcGrpcJs.clientInterceptorsMod.InterceptorOptions, 
    typingsSlinky.grpcGrpcJs.clientInterceptorsMod.InterceptingCallInterface
  ]
}
