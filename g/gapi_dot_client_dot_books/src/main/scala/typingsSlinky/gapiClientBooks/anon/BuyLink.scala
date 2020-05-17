package typingsSlinky.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuyLink extends js.Object {
  /** URL to purchase this volume on the Google Books site. (In LITE projection) */
  var buyLink: js.UndefOr[String] = js.native
  /** The two-letter ISO_3166-1 country code for which this sale information is valid. (In LITE projection.) */
  var country: js.UndefOr[String] = js.native
  /** Whether or not this volume is an eBook (can be added to the My eBooks shelf). */
  var isEbook: js.UndefOr[Boolean] = js.native
  /** Suggested retail price. (In LITE projection.) */
  var listPrice: js.UndefOr[Amount] = js.native
  /** Offers available for this volume (sales and rentals). */
  var offers: js.UndefOr[js.Array[FinskyOfferType]] = js.native
  /** The date on which this book is available for sale. */
  var onSaleDate: js.UndefOr[String] = js.native
  /**
    * The actual selling price of the book. This is the same as the suggested retail or list price unless there are offers or discounts on this volume. (In
    * LITE projection.)
    */
  var retailPrice: js.UndefOr[Amount] = js.native
  /**
    * Whether or not this book is available for sale or offered for free in the Google eBookstore for the country listed above. Possible values are FOR_SALE,
    * FOR_RENTAL_ONLY, FOR_SALE_AND_RENTAL, FREE, NOT_FOR_SALE, or FOR_PREORDER.
    */
  var saleability: js.UndefOr[String] = js.native
}

object BuyLink {
  @scala.inline
  def apply(): BuyLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuyLink]
  }
  @scala.inline
  implicit class BuyLinkOps[Self <: BuyLink] (val x: Self) extends AnyVal {
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
    def withListPrice(value: Amount): Self = {
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
    def withOffers(value: js.Array[FinskyOfferType]): Self = {
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
    def withRetailPrice(value: Amount): Self = {
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

