package typingsSlinky.reactVirtualized.esTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRowProps extends StObject {
  
  var className: String = js.native
  
  var columns: js.Array[_] = js.native
  
  var index: Double = js.native
  
  var isScrolling: Boolean = js.native
  
  var key: String = js.native
  
  var onRowClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  
  var onRowDoubleClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  
  var onRowMouseOut: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  
  var onRowMouseOver: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  
  var onRowRightClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.native
  
  var rowData: js.Any = js.native
  
  var style: js.Any = js.native
}
object TableRowProps {
  
  @scala.inline
  def apply(
    className: String,
    columns: js.Array[_],
    index: Double,
    isScrolling: Boolean,
    key: String,
    rowData: js.Any,
    style: js.Any
  ): TableRowProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowProps]
  }
  
  @scala.inline
  implicit class TableRowPropsMutableBuilder[Self <: TableRowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumns(value: js.Array[_]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: js.Any*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRowClick(value: /* params */ RowMouseEventHandlerParams => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
    
    @scala.inline
    def setOnRowDoubleClick(value: /* params */ RowMouseEventHandlerParams => Unit): Self = StObject.set(x, "onRowDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRowDoubleClickUndefined: Self = StObject.set(x, "onRowDoubleClick", js.undefined)
    
    @scala.inline
    def setOnRowMouseOut(value: /* params */ RowMouseEventHandlerParams => Unit): Self = StObject.set(x, "onRowMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRowMouseOutUndefined: Self = StObject.set(x, "onRowMouseOut", js.undefined)
    
    @scala.inline
    def setOnRowMouseOver(value: /* params */ RowMouseEventHandlerParams => Unit): Self = StObject.set(x, "onRowMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRowMouseOverUndefined: Self = StObject.set(x, "onRowMouseOver", js.undefined)
    
    @scala.inline
    def setOnRowRightClick(value: /* params */ RowMouseEventHandlerParams => Unit): Self = StObject.set(x, "onRowRightClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRowRightClickUndefined: Self = StObject.set(x, "onRowRightClick", js.undefined)
    
    @scala.inline
    def setRowData(value: js.Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
