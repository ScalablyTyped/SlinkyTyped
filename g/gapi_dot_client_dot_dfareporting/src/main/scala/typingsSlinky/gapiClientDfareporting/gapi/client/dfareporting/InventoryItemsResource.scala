package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Id
import typingsSlinky.gapiClientDfareporting.anon.InPlan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryItemsResource extends js.Object {
  /** Gets one inventory item by ID. */
  def get(request: Id): Request[InventoryItem] = js.native
  /** Retrieves a list of inventory items, possibly filtered. This method supports paging. */
  def list(request: InPlan): Request[InventoryItemsListResponse] = js.native
}

object InventoryItemsResource {
  @scala.inline
  def apply(get: Id => Request[InventoryItem], list: InPlan => Request[InventoryItemsListResponse]): InventoryItemsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[InventoryItemsResource]
  }
  @scala.inline
  implicit class InventoryItemsResourceOps[Self <: InventoryItemsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Id => Request[InventoryItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: InPlan => Request[InventoryItemsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

