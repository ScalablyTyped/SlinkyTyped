package typingsSlinky.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotItemCollection object, for use in `pivotItemCollection.set({ ... })`. */
@js.native
trait PivotItemCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotItemData]] = js.native
}
object PivotItemCollectionUpdateData {
  
  @scala.inline
  def apply(): PivotItemCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotItemCollectionUpdateData]
  }
  
  @scala.inline
  implicit class PivotItemCollectionUpdateDataMutableBuilder[Self <: PivotItemCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PivotItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PivotItemData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
