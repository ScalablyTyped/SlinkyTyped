package typingsSlinky.awsSdkClientS3Node.typesPutBucketInventoryConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketInventoryConfigurationOutput
  extends MetadataBearer
     with OutputTypesUnion

object PutBucketInventoryConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketInventoryConfigurationOutput]
  }
}

