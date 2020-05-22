package typingsSlinky.awsSdkClientS3Node.typesPutBucketWebsiteOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketWebsiteOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketWebsiteOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketWebsiteOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketWebsiteOutput]
  }
}

