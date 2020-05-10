package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryCustomBatchRequestEntry extends js.Object {
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.native
  /** Price and availability of the product. */
  var inventory: js.UndefOr[Inventory] = js.native
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[String] = js.native
  /** The ID of the product for which to update price and availability. */
  var productId: js.UndefOr[String] = js.native
  /** The code of the store for which to update price and availability. Use online to update price and availability of an online product. */
  var storeCode: js.UndefOr[String] = js.native
}

object InventoryCustomBatchRequestEntry {
  @scala.inline
  def apply(): InventoryCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryCustomBatchRequestEntry]
  }
  @scala.inline
  implicit class InventoryCustomBatchRequestEntryOps[Self <: InventoryCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(js.undefined)
        ret
    }
    @scala.inline
    def withInventory(value: Inventory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventory")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeCode")(js.undefined)
        ret
    }
  }
  
}

