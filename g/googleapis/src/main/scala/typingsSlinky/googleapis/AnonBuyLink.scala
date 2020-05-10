package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBuyLink extends js.Object {
  var buyLink: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var isEbook: js.UndefOr[Boolean] = js.native
  var listPrice: js.UndefOr[AnonAmount] = js.native
  var offers: js.UndefOr[js.Array[AnonFinskyOfferType]] = js.native
  var onSaleDate: js.UndefOr[String] = js.native
  var retailPrice: js.UndefOr[AnonAmount] = js.native
  var saleability: js.UndefOr[String] = js.native
}

object AnonBuyLink {
  @scala.inline
  def apply(): AnonBuyLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBuyLink]
  }
  @scala.inline
  implicit class AnonBuyLinkOps[Self <: AnonBuyLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuyLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyLink")(js.undefined)
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
    def withIsEbook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEbook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEbook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEbook")(js.undefined)
        ret
    }
    @scala.inline
    def withListPrice(value: AnonAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withOffers(value: js.Array[AnonFinskyOfferType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offers")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSaleDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSaleDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSaleDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSaleDate")(js.undefined)
        ret
    }
    @scala.inline
    def withRetailPrice(value: AnonAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retailPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetailPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retailPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withSaleability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaleability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleability")(js.undefined)
        ret
    }
  }
  
}

