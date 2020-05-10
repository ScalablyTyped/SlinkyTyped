package typingsSlinky.awsSdk.cloudfrontSignerMod.Signer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CannedPolicy extends js.Object {
  var `CloudFront-Expires`: Double = js.native
  var `CloudFront-Key-Pair-Id`: String = js.native
  var `CloudFront-Signature`: String = js.native
}

object CannedPolicy {
  @scala.inline
  def apply(`CloudFront-Expires`: Double, `CloudFront-Key-Pair-Id`: String, `CloudFront-Signature`: String): CannedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CloudFront-Expires")(`CloudFront-Expires`.asInstanceOf[js.Any])
    __obj.updateDynamic("CloudFront-Key-Pair-Id")(`CloudFront-Key-Pair-Id`.asInstanceOf[js.Any])
    __obj.updateDynamic("CloudFront-Signature")(`CloudFront-Signature`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CannedPolicy]
  }
  @scala.inline
  implicit class CannedPolicyOps[Self <: CannedPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withCloudFront-Expires`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFront-Expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withCloudFront-Key-Pair-Id`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFront-Key-Pair-Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withCloudFront-Signature`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFront-Signature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

