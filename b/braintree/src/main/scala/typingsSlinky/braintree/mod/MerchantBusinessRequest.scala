package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantBusinessRequest extends js.Object {
  var address: js.UndefOr[MerchantAddressDetails] = js.native
  var dbaName: js.UndefOr[String] = js.native
  var legalName: js.UndefOr[String] = js.native
  var taxId: js.UndefOr[String] = js.native
}

object MerchantBusinessRequest {
  @scala.inline
  def apply(): MerchantBusinessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantBusinessRequest]
  }
  @scala.inline
  implicit class MerchantBusinessRequestOps[Self <: MerchantBusinessRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: MerchantAddressDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withDbaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbaName")(js.undefined)
        ret
    }
    @scala.inline
    def withLegalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legalName")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxId")(js.undefined)
        ret
    }
  }
  
}

