package typingsSlinky.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketOwner
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Requester
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketRequestPaymentOutput
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * <p>Specifies who pays for the download and request fees.</p>
    */
  var Payer: js.UndefOr[Requester | BucketOwner | String] = js.native
}

object GetBucketRequestPaymentOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketRequestPaymentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketRequestPaymentOutput]
  }
  @scala.inline
  implicit class GetBucketRequestPaymentOutputOps[Self <: GetBucketRequestPaymentOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayer(value: Requester | BucketOwner | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payer")(js.undefined)
        ret
    }
  }
  
}

