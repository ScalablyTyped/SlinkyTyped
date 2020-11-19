package typingsSlinky.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object clientMod {
  
  type CallInvocationTransformer = js.Function1[
    /* callProperties */ typingsSlinky.grpcGrpcJs.clientMod.CallProperties[js.Any, js.Any], 
    typingsSlinky.grpcGrpcJs.clientMod.CallProperties[js.Any, js.Any]
  ]
  
  type UnaryCallback[ResponseType] = js.Function2[
    /* err */ typingsSlinky.grpcGrpcJs.callMod.ServiceError | scala.Null, 
    /* value */ js.UndefOr[ResponseType], 
    scala.Unit
  ]
}
