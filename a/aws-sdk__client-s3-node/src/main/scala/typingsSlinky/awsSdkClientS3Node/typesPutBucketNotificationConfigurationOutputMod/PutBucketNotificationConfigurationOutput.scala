package typingsSlinky.awsSdkClientS3Node.typesPutBucketNotificationConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketNotificationConfigurationOutput
  extends MetadataBearer
     with OutputTypesUnion

object PutBucketNotificationConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketNotificationConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketNotificationConfigurationOutput]
  }
}

