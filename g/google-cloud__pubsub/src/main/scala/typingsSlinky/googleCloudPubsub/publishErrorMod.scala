package typingsSlinky.googleCloudPubsub

import typingsSlinky.grpcGrpcJs.callMod.ServiceError
import typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject
import typingsSlinky.grpcGrpcJs.mod.Metadata
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/publisher/publish-error", JSImport.Namespace)
@js.native
object publishErrorMod extends js.Object {
  @js.native
  class PublishError protected ()
    extends Error
       with StatusObject {
    def this(key: String, err: ServiceError) = this()
    var error: ServiceError = js.native
    @JSName("metadata")
    var metadata_PublishError: Metadata = js.native
    var orderingKey: String = js.native
  }
  
}

