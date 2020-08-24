package typingsSlinky.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketInventoryConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketInventoryConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketInventoryConfigurationOutput]
  }
}

