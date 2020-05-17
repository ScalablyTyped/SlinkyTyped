package typingsSlinky.awsSdkClientS3Node.typesDeleteBucketOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketOutput
  extends MetadataBearer
     with OutputTypesUnion

object DeleteBucketOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketOutput]
  }
}

