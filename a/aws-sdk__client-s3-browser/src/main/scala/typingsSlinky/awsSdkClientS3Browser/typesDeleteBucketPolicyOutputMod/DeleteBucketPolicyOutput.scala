package typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketPolicyOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketPolicyOutput
  extends MetadataBearer
     with OutputTypesUnion

object DeleteBucketPolicyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketPolicyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketPolicyOutput]
  }
}

