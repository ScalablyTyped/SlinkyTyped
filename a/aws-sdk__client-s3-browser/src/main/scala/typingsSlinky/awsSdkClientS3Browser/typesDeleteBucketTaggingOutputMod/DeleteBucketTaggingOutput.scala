package typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketTaggingOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketTaggingOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketTaggingOutput]
  }
}

