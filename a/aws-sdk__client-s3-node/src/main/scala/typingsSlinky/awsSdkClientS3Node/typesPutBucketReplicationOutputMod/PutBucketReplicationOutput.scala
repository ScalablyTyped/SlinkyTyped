package typingsSlinky.awsSdkClientS3Node.typesPutBucketReplicationOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketReplicationOutput
  extends MetadataBearer
     with OutputTypesUnion

object PutBucketReplicationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketReplicationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketReplicationOutput]
  }
}

