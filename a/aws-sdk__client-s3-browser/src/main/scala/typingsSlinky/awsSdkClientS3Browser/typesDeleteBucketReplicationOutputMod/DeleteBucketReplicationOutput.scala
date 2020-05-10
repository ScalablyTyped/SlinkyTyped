package typingsSlinky.awsSdkClientS3Browser.typesDeleteBucketReplicationOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketReplicationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketReplicationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketReplicationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketReplicationOutput]
  }
}

