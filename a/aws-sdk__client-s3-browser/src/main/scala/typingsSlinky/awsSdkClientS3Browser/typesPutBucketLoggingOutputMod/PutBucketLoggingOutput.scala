package typingsSlinky.awsSdkClientS3Browser.typesPutBucketLoggingOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketLoggingOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketLoggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketLoggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLoggingOutput]
  }
}

