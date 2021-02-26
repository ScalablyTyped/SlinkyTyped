package typingsSlinky.antd.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemUnit extends StObject {
  
  var itemUnit: String = js.native
  
  var itemsUnit: String = js.native
  
  var notFoundContent: ReactElement = js.native
  
  var remove: String = js.native
  
  var removeAll: String = js.native
  
  var removeCurrent: String = js.native
  
  var searchPlaceholder: String = js.native
  
  var selectAll: String = js.native
  
  var selectCurrent: String = js.native
  
  var selectInvert: String = js.native
  
  var titles: js.Array[String] = js.native
}
object ItemUnit {
  
  @scala.inline
  def apply(
    itemUnit: String,
    itemsUnit: String,
    remove: String,
    removeAll: String,
    removeCurrent: String,
    searchPlaceholder: String,
    selectAll: String,
    selectCurrent: String,
    selectInvert: String,
    titles: js.Array[String]
  ): ItemUnit = {
    val __obj = js.Dynamic.literal(itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeAll = removeAll.asInstanceOf[js.Any], removeCurrent = removeCurrent.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], selectCurrent = selectCurrent.asInstanceOf[js.Any], selectInvert = selectInvert.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemUnit]
  }
  
  @scala.inline
  implicit class ItemUnitMutableBuilder[Self <: ItemUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemUnit(value: String): Self = StObject.set(x, "itemUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUnit(value: String): Self = StObject.set(x, "itemsUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundContent(value: ReactElement): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
    
    @scala.inline
    def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAll(value: String): Self = StObject.set(x, "removeAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveCurrent(value: String): Self = StObject.set(x, "removeCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAll(value: String): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectCurrent(value: String): Self = StObject.set(x, "selectCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectInvert(value: String): Self = StObject.set(x, "selectInvert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitles(value: js.Array[String]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlesVarargs(value: String*): Self = StObject.set(x, "titles", js.Array(value :_*))
  }
}
