package typingsSlinky.awsSdkClientS3Browser.typesPutBucketAclOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketAclOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketAclOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketAclOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketAclOutput]
  }
}

