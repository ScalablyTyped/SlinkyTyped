package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchasesResource extends js.Object {
  var products: ProductsResource = js.native
  var subscriptions: SubscriptionsResource = js.native
  var voidedpurchases: VoidedpurchasesResource = js.native
}

object PurchasesResource {
  @scala.inline
  def apply(
    products: ProductsResource,
    subscriptions: SubscriptionsResource,
    voidedpurchases: VoidedpurchasesResource
  ): PurchasesResource = {
    val __obj = js.Dynamic.literal(products = products.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], voidedpurchases = voidedpurchases.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchasesResource]
  }
  @scala.inline
  implicit class PurchasesResourceOps[Self <: PurchasesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProducts(value: ProductsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptions(value: SubscriptionsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoidedpurchases(value: VoidedpurchasesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voidedpurchases")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

