package typingsSlinky.paypalRestSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGiftwrap extends js.Object {
  var gift_wrap: js.UndefOr[String] = js.native
  var handling_fee: js.UndefOr[String] = js.native
  var insurance: js.UndefOr[String] = js.native
  var shipping: js.UndefOr[String] = js.native
  var shipping_discout: js.UndefOr[String] = js.native
  var subtotal: js.UndefOr[String] = js.native
  var tax: js.UndefOr[String] = js.native
}

object AnonGiftwrap {
  @scala.inline
  def apply(): AnonGiftwrap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonGiftwrap]
  }
  @scala.inline
  implicit class AnonGiftwrapOps[Self <: AnonGiftwrap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGift_wrap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gift_wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGift_wrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gift_wrap")(js.undefined)
        ret
    }
    @scala.inline
    def withHandling_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handling_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandling_fee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handling_fee")(js.undefined)
        ret
    }
    @scala.inline
    def withInsurance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insurance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsurance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insurance")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping_discout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_discout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_discout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_discout")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtotal")(js.undefined)
        ret
    }
    @scala.inline
    def withTax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax")(js.undefined)
        ret
    }
  }
  
}

