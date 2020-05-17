package typingsSlinky.awsSdkClientS3Node.typesDeleteBucketTaggingOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketTaggingOutput
  extends MetadataBearer
     with OutputTypesUnion

object DeleteBucketTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketTaggingOutput]
  }
}

