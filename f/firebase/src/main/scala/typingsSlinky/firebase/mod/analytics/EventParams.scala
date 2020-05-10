package typingsSlinky.firebase.mod.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventParams extends js.Object {
  var checkout_option: js.UndefOr[String] = js.native
  var checkout_step: js.UndefOr[Double] = js.native
  var content_id: js.UndefOr[String] = js.native
  var content_type: js.UndefOr[String] = js.native
  var coupon: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var event_category: String = js.native
  var event_label: js.UndefOr[String] = js.native
  var fatal: js.UndefOr[Boolean] = js.native
  var items: js.UndefOr[js.Array[Item]] = js.native
  var method: js.UndefOr[String] = js.native
  var number: js.UndefOr[String] = js.native
  var promotions: js.UndefOr[js.Array[Promotion]] = js.native
  var screen_name: js.UndefOr[String] = js.native
  var search_term: js.UndefOr[String] = js.native
  var shipping: js.UndefOr[Currency] = js.native
  var tax: js.UndefOr[Currency] = js.native
  var transaction_id: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
}

object EventParams {
  @scala.inline
  def apply(event_category: String): EventParams = {
    val __obj = js.Dynamic.literal(event_category = event_category.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventParams]
  }
  @scala.inline
  implicit class EventParamsOps[Self <: EventParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent_category(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckout_option(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkout_option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckout_option: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkout_option")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckout_step(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkout_step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckout_step: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkout_step")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_id")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(js.undefined)
        ret
    }
    @scala.inline
    def withCoupon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coupon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoupon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coupon")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
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
    def withEvent_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_label")(js.undefined)
        ret
    }
    @scala.inline
    def withFatal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFatal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatal")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Item]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotions(value: js.Array[Promotion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotions")(js.undefined)
        ret
    }
    @scala.inline
    def withScreen_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreen_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen_name")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch_term(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_term")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch_term: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_term")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping(value: Currency): Self = {
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
    def withTax(value: Currency): Self = {
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
    @scala.inline
    def withTransaction_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction_id")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

