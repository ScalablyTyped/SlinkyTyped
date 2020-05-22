package typingsSlinky.awsSdkClientS3Node.typesPutBucketPolicyOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketPolicyOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketPolicyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketPolicyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketPolicyOutput]
  }
}

