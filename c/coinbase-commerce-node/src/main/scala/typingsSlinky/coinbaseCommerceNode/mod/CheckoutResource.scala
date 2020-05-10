package typingsSlinky.coinbaseCommerceNode.mod

import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.checkout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Checkout Resource.
  *
  * @link https://commerce.coinbase.com/docs/api/#checkout-resource
  */
@js.native
trait CheckoutResource extends BaseCheckout {
  /**
    * Checkout UUID.
    */
  var id: String = js.native
  /**
    * Price in local fiat currency.
    */
  var local_price: js.UndefOr[Price[FiatCurrency]] = js.native
  /**
    * Checkout image URL.
    */
  var logo_url: js.UndefOr[String] = js.native
  /**
    * Resource name.
    */
  var resource: checkout = js.native
}

object CheckoutResource {
  @scala.inline
  def apply(description: String, id: String, name: String, pricing_type: PricingType, resource: checkout): CheckoutResource = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckoutResource]
  }
  @scala.inline
  implicit class CheckoutResourceOps[Self <: CheckoutResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: checkout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocal_price(value: Price[FiatCurrency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_price: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_price")(js.undefined)
        ret
    }
    @scala.inline
    def withLogo_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo_url")(js.undefined)
        ret
    }
  }
  
}

