package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidpublisher.anon.ProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductsResource extends js.Object {
  /** Checks the purchase and consumption status of an inapp item. */
  def get(request: ProductId): Request[ProductPurchase] = js.native
}

object ProductsResource {
  @scala.inline
  def apply(get: ProductId => Request[ProductPurchase]): ProductsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ProductsResource]
  }
  @scala.inline
  implicit class ProductsResourceOps[Self <: ProductsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: ProductId => Request[ProductPurchase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

