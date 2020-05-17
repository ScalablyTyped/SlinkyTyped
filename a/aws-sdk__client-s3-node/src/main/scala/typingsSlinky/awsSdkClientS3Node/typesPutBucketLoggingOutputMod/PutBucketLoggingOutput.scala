package typingsSlinky.awsSdkClientS3Node.typesPutBucketLoggingOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketLoggingOutput
  extends MetadataBearer
     with OutputTypesUnion

object PutBucketLoggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketLoggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLoggingOutput]
  }
}

