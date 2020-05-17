package typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketCorsOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketCorsOutput
  extends MetadataBearer
     with OutputTypesUnion

object DeleteBucketCorsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketCorsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketCorsOutput]
  }
}

