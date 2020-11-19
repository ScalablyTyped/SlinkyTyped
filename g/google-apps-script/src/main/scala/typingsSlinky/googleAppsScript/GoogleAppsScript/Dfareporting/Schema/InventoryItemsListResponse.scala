package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryItemsListResponse extends js.Object {
  
  var inventoryItems: js.UndefOr[js.Array[InventoryItem]] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
}
object InventoryItemsListResponse {
  
  @scala.inline
  def apply(): InventoryItemsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryItemsListResponse]
  }
  
  @scala.inline
  implicit class InventoryItemsListResponseOps[Self <: InventoryItemsListResponse] (val x: Self) extends AnyVal {
    
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
    def setInventoryItemsVarargs(value: InventoryItem*): Self = this.set("inventoryItems", js.Array(value :_*))
    
    @scala.inline
    def setInventoryItems(value: js.Array[InventoryItem]): Self = this.set("inventoryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventoryItems: Self = this.set("inventoryItems", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
