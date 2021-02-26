package typingsSlinky.antd.anon

import typingsSlinky.antd.transferListMod.RenderedItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilteredItems[RecordType /* <: typingsSlinky.antd.transferMod.KeyWiseTransferItem */] extends StObject {
  
  var filteredItems: js.Array[RecordType] = js.native
  
  var filteredRenderItems: js.Array[RenderedItem[RecordType]] = js.native
}
object FilteredItems {
  
  @scala.inline
  def apply[RecordType /* <: typingsSlinky.antd.transferMod.KeyWiseTransferItem */](filteredItems: js.Array[RecordType], filteredRenderItems: js.Array[RenderedItem[RecordType]]): FilteredItems[RecordType] = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteredItems[RecordType]]
  }
  
  @scala.inline
  implicit class FilteredItemsMutableBuilder[Self <: FilteredItems[_], RecordType /* <: typingsSlinky.antd.transferMod.KeyWiseTransferItem */] (val x: Self with FilteredItems[RecordType]) extends AnyVal {
    
    @scala.inline
    def setFilteredItems(value: js.Array[RecordType]): Self = StObject.set(x, "filteredItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredItemsVarargs(value: RecordType*): Self = StObject.set(x, "filteredItems", js.Array(value :_*))
    
    @scala.inline
    def setFilteredRenderItems(value: js.Array[RenderedItem[RecordType]]): Self = StObject.set(x, "filteredRenderItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredRenderItemsVarargs(value: RenderedItem[RecordType]*): Self = StObject.set(x, "filteredRenderItems", js.Array(value :_*))
  }
}
