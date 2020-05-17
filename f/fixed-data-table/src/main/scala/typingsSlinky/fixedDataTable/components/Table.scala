package typingsSlinky.fixedDataTable.components

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fixedDataTable.mod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  @JSImport("fixed-data-table", "Table")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.fixedDataTable.mod.Table] {
    @scala.inline
    def footerHeight(value: Double): this.type = set("footerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def groupHeaderHeight(value: Double): this.type = set("groupHeaderHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def headerHeight(value: Double): this.type = set("headerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def isColumnResizing(value: Boolean): this.type = set("isColumnResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def onColumnResizeEndCallback(value: (/* newColumnWidth */ Double, /* columnKey */ String) => Unit): this.type = set("onColumnResizeEndCallback", js.Any.fromFunction2(value))
    @scala.inline
    def onContentHeightChange(value: /* newHeight */ Double => Unit): this.type = set("onContentHeightChange", js.Any.fromFunction1(value))
    @scala.inline
    def onRowClick(
      value: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDataTable.mod.Table], /* rowIndex */ Double) => Unit
    ): this.type = set("onRowClick", js.Any.fromFunction2(value))
    @scala.inline
    def onRowDoubleClick(
      value: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDataTable.mod.Table], /* rowIndex */ Double) => Unit
    ): this.type = set("onRowDoubleClick", js.Any.fromFunction2(value))
    @scala.inline
    def onRowMouseDown(
      value: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDataTable.mod.Table], /* rowIndex */ Double) => Unit
    ): this.type = set("onRowMouseDown", js.Any.fromFunction2(value))
    @scala.inline
    def onRowMouseEnter(
      value: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDataTable.mod.Table], /* rowIndex */ Double) => Unit
    ): this.type = set("onRowMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def onRowMouseLeave(
      value: (/* event */ SyntheticEvent[Event, typingsSlinky.fixedDataTable.mod.Table], /* rowIndex */ Double) => Unit
    ): this.type = set("onRowMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def onScrollEnd(value: (/* x */ Double, /* y */ Double) => Unit): this.type = set("onScrollEnd", js.Any.fromFunction2(value))
    @scala.inline
    def onScrollStart(value: (/* x */ Double, /* y */ Double) => Unit): this.type = set("onScrollStart", js.Any.fromFunction2(value))
    @scala.inline
    def overflowX(value: String): this.type = set("overflowX", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowY(value: String): this.type = set("overflowY", value.asInstanceOf[js.Any])
    @scala.inline
    def ownerHeight(value: Double): this.type = set("ownerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def rowClassNameGetter(value: /* index */ Double => String): this.type = set("rowClassNameGetter", js.Any.fromFunction1(value))
    @scala.inline
    def rowHeightGetter(value: /* index */ Double => Double): this.type = set("rowHeightGetter", js.Any.fromFunction1(value))
    @scala.inline
    def scrollLeft(value: Double): this.type = set("scrollLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollToColumn(value: Double): this.type = set("scrollToColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollToRow(value: Double): this.type = set("scrollToRow", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollTop(value: Double): this.type = set("scrollTop", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(rowHeight: Double, rowsCount: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableProps]))
  }
}

