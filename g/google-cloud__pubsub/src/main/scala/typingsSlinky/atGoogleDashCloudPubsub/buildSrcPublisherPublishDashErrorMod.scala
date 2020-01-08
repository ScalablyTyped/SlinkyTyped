package typingsSlinky.atGoogleDashCloudPubsub

import typingsSlinky.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
import typingsSlinky.atGrpcGrpcDashJs.buildSrcCallMod.ServiceError
import typingsSlinky.atGrpcGrpcDashJs.buildSrcConstantsMod.Status
import typingsSlinky.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/publisher/publish-error", JSImport.Namespace)
@js.native
object buildSrcPublisherPublishDashErrorMod extends js.Object {
  @js.native
  class PublishError protected ()
    extends Error
       with StatusObject {
    def this(key: String, err: ServiceError) = this()
    /* CompleteClass */
    override var code: Status = js.native
    /* CompleteClass */
    override var details: String = js.native
    var error: ServiceError = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var metadata: Metadata = js.native
    @JSName("metadata")
    var metadata_PublishError: typingsSlinky.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod.Metadata = js.native
    /* CompleteClass */
    override var name: String = js.native
    var orderingKey: String = js.native
  }
  
}

