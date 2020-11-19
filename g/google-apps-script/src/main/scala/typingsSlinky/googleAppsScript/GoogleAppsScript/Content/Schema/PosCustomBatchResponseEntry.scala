package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PosCustomBatchResponseEntry extends js.Object {
  
  var batchId: js.UndefOr[Double] = js.native
  
  var errors: js.UndefOr[Errors] = js.native
  
  var inventory: js.UndefOr[PosInventory] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var sale: js.UndefOr[PosSale] = js.native
  
  var store: js.UndefOr[PosStore] = js.native
}
object PosCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): PosCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PosCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class PosCustomBatchResponseEntryOps[Self <: PosCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
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
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    
    @scala.inline
    def setErrors(value: Errors): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setInventory(value: PosInventory): Self = this.set("inventory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventory: Self = this.set("inventory", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSale(value: PosSale): Self = this.set("sale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSale: Self = this.set("sale", js.undefined)
    
    @scala.inline
    def setStore(value: PosStore): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
  }
}
