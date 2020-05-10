package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveTrustedSigners extends js.Object {
  /**
    * Enabled is true if any of the AWS accounts listed in the TrustedSigners complex type for this distribution have active CloudFront key pairs. If not, Enabled is false.
    */
  var Enabled: Boolean = js.native
  /**
    * A complex type that contains one Signer complex type for each trusted signer that is specified in the TrustedSigners complex type.
    */
  var Items: js.UndefOr[SignerList] = js.native
  /**
    * The number of trusted signers specified in the TrustedSigners complex type.
    */
  var Quantity: integer = js.native
}

object ActiveTrustedSigners {
  @scala.inline
  def apply(Enabled: Boolean, Quantity: integer): ActiveTrustedSigners = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTrustedSigners]
  }
  @scala.inline
  implicit class ActiveTrustedSignersOps[Self <: ActiveTrustedSigners] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantity(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: SignerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(js.undefined)
        ret
    }
  }
  
}

