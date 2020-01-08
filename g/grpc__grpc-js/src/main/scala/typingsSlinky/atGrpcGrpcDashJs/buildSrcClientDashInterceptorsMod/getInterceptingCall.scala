package typingsSlinky.atGrpcGrpcDashJs.buildSrcClientDashInterceptorsMod

import typingsSlinky.atGrpcGrpcDashJs.buildSrcChannelMod.Channel
import typingsSlinky.atGrpcGrpcDashJs.buildSrcClientMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/client-interceptors", "getInterceptingCall")
@js.native
object getInterceptingCall extends js.Object {
  def apply(
    interceptorArgs: InterceptorArguments,
    methodDefinition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientMethodDefinition<any, any> */ js.Any,
    options: CallOptions,
    channel: Channel
  ): InterceptingCallInterface = js.native
}

