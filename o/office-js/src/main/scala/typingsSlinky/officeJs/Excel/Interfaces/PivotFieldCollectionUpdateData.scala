package typingsSlinky.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotFieldCollection object, for use in `pivotFieldCollection.set({ ... })`. */
@js.native
trait PivotFieldCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotFieldData]] = js.native
}
object PivotFieldCollectionUpdateData {
  
  @scala.inline
  def apply(): PivotFieldCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFieldCollectionUpdateData]
  }
  
  @scala.inline
  implicit class PivotFieldCollectionUpdateDataMutableBuilder[Self <: PivotFieldCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PivotFieldData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PivotFieldData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
