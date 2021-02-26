package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableColumnDef
import typingsSlinky.muiDatatables.mod.MUIDataTableHead
import typingsSlinky.muiDatatables.mod.MUIDataTableOptions
import typingsSlinky.muiDatatables.mod.MUIDataTableStateRows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHead {
  
  @scala.inline
  def apply(columnOrder: js.Array[Double]): Builder = {
    val __props = js.Dynamic.literal(columnOrder = columnOrder.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableHead]))
  }
  
  @JSImport("mui-datatables", "TableHead")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def activeColumn(value: js.Any): this.type = set("activeColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def areAllRowsExpanded(value: () => Boolean): this.type = set("areAllRowsExpanded", js.Any.fromFunction0(value))
    
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columns(value: js.Array[MUIDataTableColumnDef]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnsVarargs(value: MUIDataTableColumnDef*): this.type = set("columns", js.Array(value :_*))
    
    @scala.inline
    def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def draggableHeadCellRefs(value: js.Object): this.type = set("draggableHeadCellRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandedRows(value: MUIDataTableStateRows): this.type = set("expandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def options(value: MUIDataTableOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowsPerPage(value: Double): this.type = set("rowsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectRowUpdate(value: /* repeated */ js.Any => _): this.type = set("selectRowUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def selectedRows(value: MUIDataTableStateRows): this.type = set("selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRef(value: /* repeated */ js.Any => _): this.type = set("setCellRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def tableRef(value: () => _): this.type = set("tableRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def tabledId(value: String): this.type = set("tabledId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timers(value: js.Object): this.type = set("timers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def toggleAllExpandableRows(value: () => _): this.type = set("toggleAllExpandableRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def toggleSort(value: /* repeated */ js.Any => _): this.type = set("toggleSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def updateColumnOrder(value: /* repeated */ js.Any => _): this.type = set("updateColumnOrder", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MUIDataTableHead): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
