package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonId
import typingsSlinky.gapiClientDfareporting.AnonInPlan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryItemsResource extends js.Object {
  /** Gets one inventory item by ID. */
  def get(request: AnonId): Request_[InventoryItem] = js.native
  /** Retrieves a list of inventory items, possibly filtered. This method supports paging. */
  def list(request: AnonInPlan): Request_[InventoryItemsListResponse] = js.native
}

object InventoryItemsResource {
  @scala.inline
  def apply(get: AnonId => Request_[InventoryItem], list: AnonInPlan => Request_[InventoryItemsListResponse]): InventoryItemsResource = {
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
    def withGet(value: AnonId => Request_[InventoryItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonInPlan => Request_[InventoryItemsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

