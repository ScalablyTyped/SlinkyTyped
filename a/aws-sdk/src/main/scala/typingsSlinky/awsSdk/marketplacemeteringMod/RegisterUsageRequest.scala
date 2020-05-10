package typingsSlinky.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterUsageRequest extends js.Object {
  /**
    * (Optional) To scope down the registration to a specific running software instance and guard against replay attacks.
    */
  var Nonce: js.UndefOr[typingsSlinky.awsSdk.marketplacemeteringMod.Nonce] = js.native
  /**
    * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as the one used during the publishing of a new product.
    */
  var ProductCode: typingsSlinky.awsSdk.marketplacemeteringMod.ProductCode = js.native
  /**
    * Public Key Version provided by AWS Marketplace
    */
  var PublicKeyVersion: VersionInteger = js.native
}

object RegisterUsageRequest {
  @scala.inline
  def apply(ProductCode: ProductCode, PublicKeyVersion: VersionInteger): RegisterUsageRequest = {
    val __obj = js.Dynamic.literal(ProductCode = ProductCode.asInstanceOf[js.Any], PublicKeyVersion = PublicKeyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterUsageRequest]
  }
  @scala.inline
  implicit class RegisterUsageRequestOps[Self <: RegisterUsageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductCode(value: ProductCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKeyVersion(value: VersionInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKeyVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonce(value: Nonce): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nonce")(js.undefined)
        ret
    }
  }
  
}

