package typingsSlinky.gapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientContent.anon.DryRun
import typingsSlinky.gapiClientContent.anon.ProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryResource extends js.Object {
  /**
    * Updates price and availability for multiple products or stores in a single request. This operation does not update the expiration date of the products.
    * This method can only be called for non-multi-client accounts.
    */
  def custombatch(request: DryRun): Request[InventoryCustomBatchResponse] = js.native
  /**
    * Updates price and availability of a product in your Merchant Center account. This operation does not update the expiration date of the product. This
    * method can only be called for non-multi-client accounts.
    */
  def set(request: ProductId): Request[InventorySetResponse] = js.native
}

object InventoryResource {
  @scala.inline
  def apply(
    custombatch: DryRun => Request[InventoryCustomBatchResponse],
    set: ProductId => Request[InventorySetResponse]
  ): InventoryResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[InventoryResource]
  }
  @scala.inline
  implicit class InventoryResourceOps[Self <: InventoryResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustombatch(value: DryRun => Request[InventoryCustomBatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custombatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: ProductId => Request[InventorySetResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

