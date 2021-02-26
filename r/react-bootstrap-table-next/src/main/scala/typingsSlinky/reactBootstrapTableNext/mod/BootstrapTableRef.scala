package typingsSlinky.reactBootstrapTableNext.mod

import typingsSlinky.reactBootstrapTableNext.anon.CurrFilters
import typingsSlinky.reactBootstrapTableNext.anon.CurrPage
import typingsSlinky.reactBootstrapTableNext.anon.Props
import typingsSlinky.reactBootstrapTableNext.anon.Selected
import typingsSlinky.reactBootstrapTableNext.anon.StartEditing
import typingsSlinky.reactBootstrapTableNext.anon.State
import typingsSlinky.reactBootstrapTableNext.anon.StateSortColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapTableRef[T /* <: js.Object */] extends StObject {
  
  var cellEditContext: js.UndefOr[StartEditing] = js.native
  
  var filterContext: js.UndefOr[CurrFilters] = js.native
  
  var paginationContext: js.UndefOr[CurrPage] = js.native
  
  var rowExpandContext: js.UndefOr[State] = js.native
  
  var selectionContext: js.UndefOr[Selected] = js.native
  
  var sortContext: js.UndefOr[StateSortColumn[T]] = js.native
  
  var table: Props[T] = js.native
}
object BootstrapTableRef {
  
  @scala.inline
  def apply[T /* <: js.Object */](table: Props[T]): BootstrapTableRef[T] = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTableRef[T]]
  }
  
  @scala.inline
  implicit class BootstrapTableRefMutableBuilder[Self <: BootstrapTableRef[_], T /* <: js.Object */] (val x: Self with BootstrapTableRef[T]) extends AnyVal {
    
    @scala.inline
    def setCellEditContext(value: StartEditing): Self = StObject.set(x, "cellEditContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellEditContextUndefined: Self = StObject.set(x, "cellEditContext", js.undefined)
    
    @scala.inline
    def setFilterContext(value: CurrFilters): Self = StObject.set(x, "filterContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterContextUndefined: Self = StObject.set(x, "filterContext", js.undefined)
    
    @scala.inline
    def setPaginationContext(value: CurrPage): Self = StObject.set(x, "paginationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationContextUndefined: Self = StObject.set(x, "paginationContext", js.undefined)
    
    @scala.inline
    def setRowExpandContext(value: State): Self = StObject.set(x, "rowExpandContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowExpandContextUndefined: Self = StObject.set(x, "rowExpandContext", js.undefined)
    
    @scala.inline
    def setSelectionContext(value: Selected): Self = StObject.set(x, "selectionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionContextUndefined: Self = StObject.set(x, "selectionContext", js.undefined)
    
    @scala.inline
    def setSortContext(value: StateSortColumn[T]): Self = StObject.set(x, "sortContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortContextUndefined: Self = StObject.set(x, "sortContext", js.undefined)
    
    @scala.inline
    def setTable(value: Props[T]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
