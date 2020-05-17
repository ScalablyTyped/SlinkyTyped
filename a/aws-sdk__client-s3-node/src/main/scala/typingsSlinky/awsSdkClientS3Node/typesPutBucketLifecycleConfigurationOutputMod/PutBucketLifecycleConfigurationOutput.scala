package typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketLifecycleConfigurationOutput
  extends MetadataBearer
     with OutputTypesUnion

object PutBucketLifecycleConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketLifecycleConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLifecycleConfigurationOutput]
  }
}

