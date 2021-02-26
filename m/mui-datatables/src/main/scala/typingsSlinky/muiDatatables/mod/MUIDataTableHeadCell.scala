package typingsSlinky.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableHeadCell extends StObject {
  
  var children: js.UndefOr[js.Any] = js.native
  
  var classes: js.UndefOr[js.Object] = js.native
  
  var hint: String = js.native
  
  var options: MUIDataTableOptions = js.native
  
  var sort: Boolean = js.native
  
  var sortOrder: js.UndefOr[MUISortOptions] = js.native
  
  def toggleSort(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = js.native
}
object MUIDataTableHeadCell {
  
  @scala.inline
  def apply(hint: String, options: MUIDataTableOptions, sort: Boolean, toggleSort: js.Any => js.Any): MUIDataTableHeadCell = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], toggleSort = js.Any.fromFunction1(toggleSort))
    __obj.asInstanceOf[MUIDataTableHeadCell]
  }
  
  @scala.inline
  implicit class MUIDataTableHeadCellMutableBuilder[Self <: MUIDataTableHeadCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrder(value: MUISortOptions): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    @scala.inline
    def setToggleSort(value: js.Any => js.Any): Self = StObject.set(x, "toggleSort", js.Any.fromFunction1(value))
  }
}
