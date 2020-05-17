package typingsSlinky.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinskyOfferType extends js.Object {
  /** The finsky offer type (e.g., PURCHASE=0 RENTAL=3) */
  var finskyOfferType: js.UndefOr[Double] = js.native
  /** Indicates whether the offer is giftable. */
  var giftable: js.UndefOr[Boolean] = js.native
  /** Offer list (=undiscounted) price in Micros. */
  var listPrice: js.UndefOr[AmountInMicros] = js.native
  /** The rental duration (for rental offers only). */
  var rentalDuration: js.UndefOr[Count] = js.native
  /** Offer retail (=discounted) price in Micros */
  var retailPrice: js.UndefOr[AmountInMicros] = js.native
}

object FinskyOfferType {
  @scala.inline
  def apply(): FinskyOfferType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinskyOfferType]
  }
  @scala.inline
  implicit class FinskyOfferTypeOps[Self <: FinskyOfferType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinskyOfferType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finskyOfferType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinskyOfferType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finskyOfferType")(js.undefined)
        ret
    }
    @scala.inline
    def withGiftable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("giftable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGiftable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("giftable")(js.undefined)
        ret
    }
    @scala.inline
    def withListPrice(value: AmountInMicros): Self = {
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
    def withRentalDuration(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rentalDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRentalDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rentalDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withRetailPrice(value: AmountInMicros): Self = {
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
  }
  
}

