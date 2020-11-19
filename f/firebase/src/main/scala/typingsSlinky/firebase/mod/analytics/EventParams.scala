package typingsSlinky.firebase.mod.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventParams extends js.Object {
  
  var affiliation: js.UndefOr[String] = js.native
  
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
  
  var item_list_id: js.UndefOr[String] = js.native
  
  var item_list_name: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[js.Array[Item]] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var number: js.UndefOr[String] = js.native
  
  var payment_type: js.UndefOr[String] = js.native
  
  var promotion_id: js.UndefOr[String] = js.native
  
  var promotion_name: js.UndefOr[String] = js.native
  
  var promotions: js.UndefOr[js.Array[Promotion]] = js.native
  
  var screen_name: js.UndefOr[String] = js.native
  
  var search_term: js.UndefOr[String] = js.native
  
  var shipping: js.UndefOr[Currency] = js.native
  
  var shipping_tier: js.UndefOr[String] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvent_category(value: String): Self = this.set("event_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffiliation(value: String): Self = this.set("affiliation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffiliation: Self = this.set("affiliation", js.undefined)
    
    @scala.inline
    def setCheckout_option(value: String): Self = this.set("checkout_option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckout_option: Self = this.set("checkout_option", js.undefined)
    
    @scala.inline
    def setCheckout_step(value: Double): Self = this.set("checkout_step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckout_step: Self = this.set("checkout_step", js.undefined)
    
    @scala.inline
    def setContent_id(value: String): Self = this.set("content_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent_id: Self = this.set("content_id", js.undefined)
    
    @scala.inline
    def setContent_type(value: String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent_type: Self = this.set("content_type", js.undefined)
    
    @scala.inline
    def setCoupon(value: String): Self = this.set("coupon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoupon: Self = this.set("coupon", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEvent_label(value: String): Self = this.set("event_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent_label: Self = this.set("event_label", js.undefined)
    
    @scala.inline
    def setFatal(value: Boolean): Self = this.set("fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFatal: Self = this.set("fatal", js.undefined)
    
    @scala.inline
    def setItem_list_id(value: String): Self = this.set("item_list_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem_list_id: Self = this.set("item_list_id", js.undefined)
    
    @scala.inline
    def setItem_list_name(value: String): Self = this.set("item_list_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem_list_name: Self = this.set("item_list_name", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setPayment_type(value: String): Self = this.set("payment_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayment_type: Self = this.set("payment_type", js.undefined)
    
    @scala.inline
    def setPromotion_id(value: String): Self = this.set("promotion_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotion_id: Self = this.set("promotion_id", js.undefined)
    
    @scala.inline
    def setPromotion_name(value: String): Self = this.set("promotion_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotion_name: Self = this.set("promotion_name", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: Promotion*): Self = this.set("promotions", js.Array(value :_*))
    
    @scala.inline
    def setPromotions(value: js.Array[Promotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotions: Self = this.set("promotions", js.undefined)
    
    @scala.inline
    def setScreen_name(value: String): Self = this.set("screen_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreen_name: Self = this.set("screen_name", js.undefined)
    
    @scala.inline
    def setSearch_term(value: String): Self = this.set("search_term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch_term: Self = this.set("search_term", js.undefined)
    
    @scala.inline
    def setShipping(value: Currency): Self = this.set("shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
    
    @scala.inline
    def setShipping_tier(value: String): Self = this.set("shipping_tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping_tier: Self = this.set("shipping_tier", js.undefined)
    
    @scala.inline
    def setTax(value: Currency): Self = this.set("tax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax: Self = this.set("tax", js.undefined)
    
    @scala.inline
    def setTransaction_id(value: String): Self = this.set("transaction_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction_id: Self = this.set("transaction_id", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
