package typingsSlinky.grpcGrpcJs.clientInterceptorsMod

import typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials
import typingsSlinky.grpcGrpcJs.callStreamMod.Deadline
import typingsSlinky.grpcGrpcJs.clientMod.CallOptions
import typingsSlinky.grpcGrpcJs.makeClientMod.ClientMethodDefinition
import typingsSlinky.grpcGrpcJs.serverCallMod.ServerDuplexStream
import typingsSlinky.grpcGrpcJs.serverCallMod.ServerReadableStream
import typingsSlinky.grpcGrpcJs.serverCallMod.ServerUnaryCall
import typingsSlinky.grpcGrpcJs.serverCallMod.ServerWritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterceptorOptions extends CallOptions {
  var method_definition: ClientMethodDefinition[_, _]
}

object InterceptorOptions {
  @scala.inline
  def apply(
    method_definition: ClientMethodDefinition[_, _],
    credentials: CallCredentials = null,
    deadline: Deadline = null,
    host: String = null,
    interceptor_providers: js.Array[InterceptorProvider] = null,
    interceptors: js.Array[Interceptor] = null,
    parent: (ServerUnaryCall[_, _]) | (ServerReadableStream[_, _]) | (ServerWritableStream[_, _]) | (ServerDuplexStream[_, _]) = null,
    propagate_flags: js.UndefOr[Double] = js.undefined
  ): InterceptorOptions = {
    val __obj = js.Dynamic.literal(method_definition = method_definition.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (interceptor_providers != null) __obj.updateDynamic("interceptor_providers")(interceptor_providers.asInstanceOf[js.Any])
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(propagate_flags)) __obj.updateDynamic("propagate_flags")(propagate_flags.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterceptorOptions]
  }
}

