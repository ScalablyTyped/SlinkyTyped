package typingsSlinky.grpcGrpcJs.clientMod

import typingsSlinky.grpcGrpcJs.callCredentialsMod.CallCredentials
import typingsSlinky.grpcGrpcJs.callStreamMod.Deadline
import typingsSlinky.grpcGrpcJs.clientInterceptorsMod.Interceptor
import typingsSlinky.grpcGrpcJs.clientInterceptorsMod.InterceptorProvider
import typingsSlinky.grpcGrpcJs.serverCallMod.ServerDuplexStream
import typingsSlinky.grpcGrpcJs.serverCallMod.ServerReadableStream
import typingsSlinky.grpcGrpcJs.serverCallMod.ServerUnaryCall
import typingsSlinky.grpcGrpcJs.serverCallMod.ServerWritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallOptions extends js.Object {
  var credentials: js.UndefOr[CallCredentials] = js.undefined
  var deadline: js.UndefOr[Deadline] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var interceptor_providers: js.UndefOr[js.Array[InterceptorProvider]] = js.undefined
  var interceptors: js.UndefOr[js.Array[Interceptor]] = js.undefined
  var parent: js.UndefOr[
    (ServerUnaryCall[_, _]) | (ServerReadableStream[_, _]) | (ServerWritableStream[_, _]) | (ServerDuplexStream[_, _])
  ] = js.undefined
  var propagate_flags: js.UndefOr[Double] = js.undefined
}

object CallOptions {
  @scala.inline
  def apply(
    credentials: CallCredentials = null,
    deadline: Deadline = null,
    host: String = null,
    interceptor_providers: js.Array[InterceptorProvider] = null,
    interceptors: js.Array[Interceptor] = null,
    parent: (ServerUnaryCall[_, _]) | (ServerReadableStream[_, _]) | (ServerWritableStream[_, _]) | (ServerDuplexStream[_, _]) = null,
    propagate_flags: js.UndefOr[Double] = js.undefined
  ): CallOptions = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (interceptor_providers != null) __obj.updateDynamic("interceptor_providers")(interceptor_providers.asInstanceOf[js.Any])
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(propagate_flags)) __obj.updateDynamic("propagate_flags")(propagate_flags.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOptions]
  }
}

