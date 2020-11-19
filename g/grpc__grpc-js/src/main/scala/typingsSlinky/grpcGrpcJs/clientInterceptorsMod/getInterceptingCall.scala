package typingsSlinky.grpcGrpcJs.clientInterceptorsMod

import typingsSlinky.grpcGrpcJs.channelMod.Channel
import typingsSlinky.grpcGrpcJs.clientMod.CallOptions
import typingsSlinky.grpcGrpcJs.makeClientMod.ClientMethodDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/client-interceptors", "getInterceptingCall")
@js.native
object getInterceptingCall extends js.Object {
  
  def apply(
    interceptorArgs: InterceptorArguments,
    methodDefinition: ClientMethodDefinition[_, _],
    options: CallOptions,
    channel: Channel
  ): InterceptingCallInterface = js.native
}
