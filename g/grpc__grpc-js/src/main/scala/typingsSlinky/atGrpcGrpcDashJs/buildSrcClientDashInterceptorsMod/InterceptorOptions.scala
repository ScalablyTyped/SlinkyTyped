package typingsSlinky.atGrpcGrpcDashJs.buildSrcClientDashInterceptorsMod

import typingsSlinky.atGrpcGrpcDashJs.buildSrcCallDashCredentialsMod.CallCredentials
import typingsSlinky.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.Deadline
import typingsSlinky.atGrpcGrpcDashJs.buildSrcClientMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterceptorOptions extends CallOptions {
  var method_definition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientMethodDefinition<any, any> */ js.Any
}

object InterceptorOptions {
  @scala.inline
  def apply(
    method_definition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientMethodDefinition<any, any> */ js.Any,
    credentials: CallCredentials = null,
    deadline: Deadline = null,
    host: String = null,
    propagate_flags: Int | Double = null
  ): InterceptorOptions = {
    val __obj = js.Dynamic.literal(method_definition = method_definition.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (propagate_flags != null) __obj.updateDynamic("propagate_flags")(propagate_flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterceptorOptions]
  }
}

