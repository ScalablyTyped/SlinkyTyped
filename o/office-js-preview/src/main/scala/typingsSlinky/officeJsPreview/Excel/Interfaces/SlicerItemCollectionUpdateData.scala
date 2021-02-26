package typingsSlinky.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SlicerItemCollection object, for use in `slicerItemCollection.set({ ... })`. */
@js.native
trait SlicerItemCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[SlicerItemData]] = js.native
}
object SlicerItemCollectionUpdateData {
  
  @scala.inline
  def apply(): SlicerItemCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerItemCollectionUpdateData]
  }
  
  @scala.inline
  implicit class SlicerItemCollectionUpdateDataMutableBuilder[Self <: SlicerItemCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SlicerItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SlicerItemData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
