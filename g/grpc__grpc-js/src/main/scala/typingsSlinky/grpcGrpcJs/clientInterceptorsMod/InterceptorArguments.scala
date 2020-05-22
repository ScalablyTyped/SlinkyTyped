package typingsSlinky.grpcGrpcJs.clientInterceptorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterceptorArguments extends js.Object {
  var callInterceptorProviders: js.Array[InterceptorProvider]
  var callInterceptors: js.Array[Interceptor]
  var clientInterceptorProviders: js.Array[InterceptorProvider]
  var clientInterceptors: js.Array[Interceptor]
}

object InterceptorArguments {
  @scala.inline
  def apply(
    callInterceptorProviders: js.Array[InterceptorProvider],
    callInterceptors: js.Array[Interceptor],
    clientInterceptorProviders: js.Array[InterceptorProvider],
    clientInterceptors: js.Array[Interceptor]
  ): InterceptorArguments = {
    val __obj = js.Dynamic.literal(callInterceptorProviders = callInterceptorProviders.asInstanceOf[js.Any], callInterceptors = callInterceptors.asInstanceOf[js.Any], clientInterceptorProviders = clientInterceptorProviders.asInstanceOf[js.Any], clientInterceptors = clientInterceptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterceptorArguments]
  }
}

