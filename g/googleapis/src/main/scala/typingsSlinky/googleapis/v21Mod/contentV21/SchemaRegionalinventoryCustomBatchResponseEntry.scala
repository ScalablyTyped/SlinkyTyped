package typingsSlinky.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch entry encoding a single non-batch regional inventory response.
  */
@js.native
trait SchemaRegionalinventoryCustomBatchResponseEntry extends StObject {
  
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#regionalinventoryCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Price and availability of the product.
    */
  var regionalInventory: js.UndefOr[SchemaRegionalInventory] = js.native
}
object SchemaRegionalinventoryCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): SchemaRegionalinventoryCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionalinventoryCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class SchemaRegionalinventoryCustomBatchResponseEntryMutableBuilder[Self <: SchemaRegionalinventoryCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRegionalInventory(value: SchemaRegionalInventory): Self = StObject.set(x, "regionalInventory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalInventoryUndefined: Self = StObject.set(x, "regionalInventory", js.undefined)
  }
}
