package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Inventory item List Response
  */
@js.native
trait SchemaInventoryItemsListResponse extends js.Object {
  
  /**
    * Inventory item collection
    */
  var inventoryItems: js.UndefOr[js.Array[SchemaInventoryItem]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#inventoryItemsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaInventoryItemsListResponse {
  
  @scala.inline
  def apply(): SchemaInventoryItemsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventoryItemsListResponse]
  }
  
  @scala.inline
  implicit class SchemaInventoryItemsListResponseOps[Self <: SchemaInventoryItemsListResponse] (val x: Self) extends AnyVal {
    
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
    def setInventoryItemsVarargs(value: SchemaInventoryItem*): Self = this.set("inventoryItems", js.Array(value :_*))
    
    @scala.inline
    def setInventoryItems(value: js.Array[SchemaInventoryItem]): Self = this.set("inventoryItems", value.asInstanceOf[js.Any])
    
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
