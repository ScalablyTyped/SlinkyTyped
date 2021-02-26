package typingsSlinky.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrdersCreateTestReturnRequest extends StObject {
  
  /**
    * Returned items.
    */
  var items: js.UndefOr[js.Array[SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem]] = js.native
}
object SchemaOrdersCreateTestReturnRequest {
  
  @scala.inline
  def apply(): SchemaOrdersCreateTestReturnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCreateTestReturnRequest]
  }
  
  @scala.inline
  implicit class SchemaOrdersCreateTestReturnRequestMutableBuilder[Self <: SchemaOrdersCreateTestReturnRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
