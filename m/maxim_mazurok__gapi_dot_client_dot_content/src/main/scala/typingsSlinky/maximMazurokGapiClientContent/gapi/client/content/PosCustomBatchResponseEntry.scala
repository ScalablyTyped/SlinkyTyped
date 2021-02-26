package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PosCustomBatchResponseEntry extends StObject {
  
  /** The ID of the request entry to which this entry responds. */
  var batchId: js.UndefOr[Double] = js.native
  
  /** A list of errors defined if, and only if, the request failed. */
  var errors: js.UndefOr[Errors] = js.native
  
  /** The updated inventory information. */
  var inventory: js.UndefOr[PosInventory] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#posCustomBatchResponseEntry`" */
  var kind: js.UndefOr[String] = js.native
  
  /** The updated sale information. */
  var sale: js.UndefOr[PosSale] = js.native
  
  /** The retrieved or updated store information. */
  var store: js.UndefOr[PosStore] = js.native
}
object PosCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): PosCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PosCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class PosCustomBatchResponseEntryMutableBuilder[Self <: PosCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setInventory(value: PosInventory): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryUndefined: Self = StObject.set(x, "inventory", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSale(value: PosSale): Self = StObject.set(x, "sale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaleUndefined: Self = StObject.set(x, "sale", js.undefined)
    
    @scala.inline
    def setStore(value: PosStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}
