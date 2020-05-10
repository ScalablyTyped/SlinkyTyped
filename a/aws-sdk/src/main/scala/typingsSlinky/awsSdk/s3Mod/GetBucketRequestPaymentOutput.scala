package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketRequestPaymentOutput extends js.Object {
  /**
    * Specifies who pays for the download and request fees.
    */
  var Payer: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Payer] = js.native
}

object GetBucketRequestPaymentOutput {
  @scala.inline
  def apply(): GetBucketRequestPaymentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketRequestPaymentOutput]
  }
  @scala.inline
  implicit class GetBucketRequestPaymentOutputOps[Self <: GetBucketRequestPaymentOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayer(value: Payer): Self = {
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

