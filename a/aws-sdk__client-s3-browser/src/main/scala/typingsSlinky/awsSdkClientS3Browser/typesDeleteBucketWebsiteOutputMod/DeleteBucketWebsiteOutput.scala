package typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketWebsiteOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketWebsiteOutput
  extends MetadataBearer
     with OutputTypesUnion

object DeleteBucketWebsiteOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketWebsiteOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketWebsiteOutput]
  }
}

