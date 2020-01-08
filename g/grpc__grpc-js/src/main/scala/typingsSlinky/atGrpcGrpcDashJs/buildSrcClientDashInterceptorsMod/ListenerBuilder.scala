package typingsSlinky.atGrpcGrpcDashJs.buildSrcClientDashInterceptorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/client-interceptors", "ListenerBuilder")
@js.native
class ListenerBuilder () extends js.Object {
  var message: js.Any = js.native
  var metadata: js.Any = js.native
  var status: js.Any = js.native
  def build(): js.Any = js.native
  def withOnReceiveMessage(
    onReceiveMessage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MessageListener */ js.Any
  ): this.type = js.native
  def withOnReceiveMetadata(
    onReceiveMetadata: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MetadataListener */ js.Any
  ): this.type = js.native
  def withOnReceiveStatus(
    onReceiveStatus: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StatusListener */ js.Any
  ): this.type = js.native
}

