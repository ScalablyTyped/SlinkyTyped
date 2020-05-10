package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountryOfferInfo extends js.Object {
  /** (localized) Get Y amount for that country's offer. */
  var getYAmount: js.UndefOr[String] = js.native
  /** Country code for which offer codes may be requested. */
  var offerCountryCode: js.UndefOr[String] = js.native
  /** Type of offer country is eligible for. */
  var offerType: js.UndefOr[String] = js.native
  /** (localized) Spend X amount for that country's offer. */
  var spendXAmount: js.UndefOr[String] = js.native
}

object CountryOfferInfo {
  @scala.inline
  def apply(): CountryOfferInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryOfferInfo]
  }
  @scala.inline
  implicit class CountryOfferInfoOps[Self <: CountryOfferInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetYAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetYAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerCountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerCountryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerType")(js.undefined)
        ret
    }
    @scala.inline
    def withSpendXAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spendXAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpendXAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spendXAmount")(js.undefined)
        ret
    }
  }
  
}

