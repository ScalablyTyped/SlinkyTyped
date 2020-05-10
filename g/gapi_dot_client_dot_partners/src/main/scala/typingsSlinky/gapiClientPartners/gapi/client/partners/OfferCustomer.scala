package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfferCustomer extends js.Object {
  /** URL to the customer's AdWords page. */
  var adwordsUrl: js.UndefOr[String] = js.native
  /** Country code of the customer. */
  var countryCode: js.UndefOr[String] = js.native
  /** Time the customer was created. */
  var creationTime: js.UndefOr[String] = js.native
  /** Days the customer is still eligible. */
  var eligibilityDaysLeft: js.UndefOr[Double] = js.native
  /** External CID for the customer. */
  var externalCid: js.UndefOr[String] = js.native
  /** Formatted Get Y amount with currency code. */
  var getYAmount: js.UndefOr[String] = js.native
  /** Name of the customer. */
  var name: js.UndefOr[String] = js.native
  /** Type of the offer */
  var offerType: js.UndefOr[String] = js.native
  /** Formatted Spend X amount with currency code. */
  var spendXAmount: js.UndefOr[String] = js.native
}

object OfferCustomer {
  @scala.inline
  def apply(): OfferCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferCustomer]
  }
  @scala.inline
  implicit class OfferCustomerOps[Self <: OfferCustomer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdwordsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adwordsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdwordsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adwordsUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEligibilityDaysLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligibilityDaysLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEligibilityDaysLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligibilityDaysLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalCid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalCid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalCid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalCid")(js.undefined)
        ret
    }
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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

