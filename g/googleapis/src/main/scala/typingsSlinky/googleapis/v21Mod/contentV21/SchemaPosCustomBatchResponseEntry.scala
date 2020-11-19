package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPosCustomBatchResponseEntry extends js.Object {
  
  /**
    * The ID of the request entry to which this entry responds.
    */
  var batchId: js.UndefOr[Double] = js.native
  
  /**
    * A list of errors defined if, and only if, the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  
  /**
    * The updated inventory information.
    */
  var inventory: js.UndefOr[SchemaPosInventory] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#posCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The updated sale information.
    */
  var sale: js.UndefOr[SchemaPosSale] = js.native
  
  /**
    * The retrieved or updated store information.
    */
  var store: js.UndefOr[SchemaPosStore] = js.native
}
object SchemaPosCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): SchemaPosCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class SchemaPosCustomBatchResponseEntryOps[Self <: SchemaPosCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
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
    def setErrors(value: SchemaErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setInventory(value: SchemaPosInventory): Self = this.set("inventory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventory: Self = this.set("inventory", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSale(value: SchemaPosSale): Self = this.set("sale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSale: Self = this.set("sale", js.undefined)
    
    @scala.inline
    def setStore(value: SchemaPosStore): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
  }
}
