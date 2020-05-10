package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailableOffer extends js.Object {
  /** The number of codes for this offer that are available for distribution. */
  var available: js.UndefOr[Double] = js.native
  /** Offer info by country. */
  var countryOfferInfos: js.UndefOr[js.Array[CountryOfferInfo]] = js.native
  /** Description of the offer. */
  var description: js.UndefOr[String] = js.native
  /** ID of this offer. */
  var id: js.UndefOr[String] = js.native
  /** The maximum age of an account [in days] to be eligible. */
  var maxAccountAge: js.UndefOr[Double] = js.native
  /** Name of the offer. */
  var name: js.UndefOr[String] = js.native
  /** Level of this offer. */
  var offerLevel: js.UndefOr[String] = js.native
  /** Type of offer. */
  var offerType: js.UndefOr[String] = js.native
  /** Customers who qualify for this offer. */
  var qualifiedCustomer: js.UndefOr[js.Array[OfferCustomer]] = js.native
  /** Whether or not the list of qualified customers is definitely complete. */
  var qualifiedCustomersComplete: js.UndefOr[Boolean] = js.native
  /** Should special text be shown on the offers page. */
  var showSpecialOfferCopy: js.UndefOr[Boolean] = js.native
  /** Terms of the offer. */
  var terms: js.UndefOr[String] = js.native
}

object AvailableOffer {
  @scala.inline
  def apply(): AvailableOffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailableOffer]
  }
  @scala.inline
  implicit class AvailableOfferOps[Self <: AvailableOffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryOfferInfos(value: js.Array[CountryOfferInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryOfferInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryOfferInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryOfferInfos")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
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
    def withMaxAccountAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAccountAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAccountAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAccountAge")(js.undefined)
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
    def withOfferLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerLevel")(js.undefined)
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
    def withQualifiedCustomer(value: js.Array[OfferCustomer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifiedCustomer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifiedCustomer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifiedCustomer")(js.undefined)
        ret
    }
    @scala.inline
    def withQualifiedCustomersComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifiedCustomersComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifiedCustomersComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifiedCustomersComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSpecialOfferCopy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSpecialOfferCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSpecialOfferCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSpecialOfferCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withTerms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(js.undefined)
        ret
    }
  }
  
}

