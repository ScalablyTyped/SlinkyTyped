package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _Signer extends js.Object {
  /**
    * An AWS account that is included in the TrustedSigners complex type for this distribution. Valid values include:    self, which is the AWS account used to create the distribution.   An AWS account number.  
    */
  var AwsAccountNumber: js.UndefOr[String] = js.native
  /**
    * A complex type that lists the active CloudFront key pairs, if any, that are associated with AwsAccountNumber.
    */
  var KeyPairIds: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.KeyPairIds] = js.native
}

object _Signer {
  @scala.inline
  def apply(): _Signer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Signer]
  }
  @scala.inline
  implicit class _SignerOps[Self <: _Signer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsAccountNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsAccountNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPairIds(value: KeyPairIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPairIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPairIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPairIds")(js.undefined)
        ret
    }
  }
  
}

