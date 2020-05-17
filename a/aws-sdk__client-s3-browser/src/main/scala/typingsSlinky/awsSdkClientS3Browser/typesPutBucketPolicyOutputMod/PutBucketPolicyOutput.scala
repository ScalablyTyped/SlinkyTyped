package typingsSlinky.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketPolicyOutput
  extends MetadataBearer
     with OutputTypesUnion

object PutBucketPolicyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketPolicyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketPolicyOutput]
  }
}

