package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFinskyOfferType extends js.Object {
  var finskyOfferType: js.UndefOr[Double] = js.native
  var giftable: js.UndefOr[Boolean] = js.native
  var listPrice: js.UndefOr[AnonAmountInMicros] = js.native
  var rentalDuration: js.UndefOr[AnonUnit] = js.native
  var retailPrice: js.UndefOr[AnonAmountInMicros] = js.native
}

object AnonFinskyOfferType {
  @scala.inline
  def apply(): AnonFinskyOfferType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFinskyOfferType]
  }
  @scala.inline
  implicit class AnonFinskyOfferTypeOps[Self <: AnonFinskyOfferType] (val x: Self) extends AnyVal {
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
    def withListPrice(value: AnonAmountInMicros): Self = {
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
    def withRentalDuration(value: AnonUnit): Self = {
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
    def withRetailPrice(value: AnonAmountInMicros): Self = {
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

