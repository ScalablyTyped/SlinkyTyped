package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaxInfo extends js.Object {
  /** Whether this is a government charge or a carrier surcharge. */
  var chargeType: js.UndefOr[String] = js.native
  /** The code to enter in the ticket's tax box. */
  var code: js.UndefOr[String] = js.native
  /** For government charges, the country levying the charge. */
  var country: js.UndefOr[String] = js.native
  /** Identifier uniquely identifying this tax in a response. Not present for unnamed carrier surcharges. */
  var id: js.UndefOr[String] = js.native
  /** Identifies this as a tax information object. Value: the fixed string qpxexpress#taxInfo. */
  var kind: js.UndefOr[String] = js.native
  /** The price of the tax in the sales or equivalent currency. */
  var salePrice: js.UndefOr[String] = js.native
}

object TaxInfo {
  @scala.inline
  def apply(): TaxInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaxInfo]
  }
  @scala.inline
  implicit class TaxInfoOps[Self <: TaxInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChargeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chargeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChargeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chargeType")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withSalePrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salePrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalePrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salePrice")(js.undefined)
        ret
    }
  }
  
}

