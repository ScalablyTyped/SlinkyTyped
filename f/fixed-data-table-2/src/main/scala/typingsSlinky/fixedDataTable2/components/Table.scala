package typingsSlinky.fixedDataTable2.components

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.auto
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.hidden
import typingsSlinky.fixedDataTable2.mod.ColumnReorderEndEvent
import typingsSlinky.fixedDataTable2.mod.ElementOrFunc
import typingsSlinky.fixedDataTable2.mod.RowProps
import typingsSlinky.fixedDataTable2.mod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  @JSImport("fixed-data-table-2", "Table")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.fixedDataTable2.mod.Table] {
    
    @scala.inline
    def bufferRowCount(value: Double): this.type = set("bufferRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cellGroupWrapperHeight(value: Double): this.type = set("cellGroupWrapperHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerHeight(value: Double): this.type = set("footerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupHeaderHeight(value: Double): this.type = set("groupHeaderHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isColumnReordering(value: Boolean): this.type = set("isColumnReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isColumnResizing(value: Boolean): this.type = set("isColumnResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboardPageEnabled(value: Boolean): this.type = set("keyboardPageEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboardScrollEnabled(value: Boolean): this.type = set("keyboardScrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onColumnReorderEndCallback(value: /* event */ ColumnReorderEndEvent => Unit): this.type = set("onColumnReorderEndCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def onColumnResizeEndCallback(value: (/* newColumnWidth */ Double, /* columnKey */ String) => Unit): this.type = set("onColumnResizeEndCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def onContentHeightChange(value: /* newHeight */ Double => Unit): this.type = set("onContentHeightChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHorizontalScroll(value: /* scrollPos */ Double => Boolean): this.type = set("onHorizontalScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowClick(
      value: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit
    ): this.type = set("onRowClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRowDoubleClick(
      value: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit
    ): this.type = set("onRowDoubleClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRowMouseDown(
      value: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit
    ): this.type = set("onRowMouseDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRowMouseEnter(
      value: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit
    ): this.type = set("onRowMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRowMouseLeave(
      value: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit
    ): this.type = set("onRowMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRowMouseUp(
      value: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit
    ): this.type = set("onRowMouseUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRowTouchEnd(
      value: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit
    ): this.type = set("onRowTouchEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRowTouchMove(
      value: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit
    ): this.type = set("onRowTouchMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRowTouchStart(
      value: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDataTable2.mod.Table], /* rowIndex */ Double) => Unit
    ): this.type = set("onRowTouchStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def onScrollEnd(value: (/* x */ Double, /* y */ Double) => Unit): this.type = set("onScrollEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def onScrollStart(value: (/* x */ Double, /* y */ Double) => Unit): this.type = set("onScrollStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def onVerticalScroll(value: /* scrollPos */ Double => Boolean): this.type = set("onVerticalScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def overflowX(value: hidden | auto): this.type = set("overflowX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowY(value: hidden | auto): this.type = set("overflowY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ownerHeight(value: Double): this.type = set("ownerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowClassNameGetter(value: /* index */ Double => String): this.type = set("rowClassNameGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def rowExpandedReactElement(value: ReactElement): this.type = set("rowExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowExpandedFunction1(value: RowProps => String | ReactElement): this.type = set("rowExpanded", js.Any.fromFunction1(value))
    
    @scala.inline
    def rowExpanded(value: ElementOrFunc[RowProps]): this.type = set("rowExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowHeightGetter(value: /* index */ Double => Double): this.type = set("rowHeightGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def rowKeyGetter(value: /* index */ Double => String): this.type = set("rowKeyGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def scrollLeft(value: Double): this.type = set("scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollToColumn(value: Double): this.type = set("scrollToColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollToRow(value: Double): this.type = set("scrollToRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollTop(value: Double): this.type = set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showScrollbarX(value: Boolean): this.type = set("showScrollbarX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showScrollbarY(value: Boolean): this.type = set("showScrollbarY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stopScrollPropagation(value: Boolean): this.type = set("stopScrollPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subRowHeight(value: Double): this.type = set("subRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subRowHeightGetter(value: /* index */ Double => Double): this.type = set("subRowHeightGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def touchScrollEnabled(value: Boolean): this.type = set("touchScrollEnabled", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(headerHeight: Double, rowHeight: Double, rowsCount: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(headerHeight = headerHeight.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableProps]))
  }
}
