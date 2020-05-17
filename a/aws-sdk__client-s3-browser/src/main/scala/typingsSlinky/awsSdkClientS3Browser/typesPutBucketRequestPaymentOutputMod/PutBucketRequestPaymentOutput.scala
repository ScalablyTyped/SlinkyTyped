package typingsSlinky.awsSdkClientS3Browser.typesPutBucketRequestPaymentOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketRequestPaymentOutput
  extends MetadataBearer
     with OutputTypesUnion

object PutBucketRequestPaymentOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketRequestPaymentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketRequestPaymentOutput]
  }
}

