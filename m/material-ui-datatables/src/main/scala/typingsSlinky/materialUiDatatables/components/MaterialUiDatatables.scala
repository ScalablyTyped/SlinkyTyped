package typingsSlinky.materialUiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiDatatables.PartialDataTableProps
import typingsSlinky.materialUiDatatables.materialUiDatatablesStrings.filter
import typingsSlinky.materialUiDatatables.mod.Column
import typingsSlinky.materialUiDatatables.mod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MaterialUiDatatables {
  @JSImport("material-ui-datatables", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def columns(value: js.Array[Column]): this.type = set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deselectOnClickaway(value: Boolean): this.type = set("deselectOnClickaway", value.asInstanceOf[js.Any])
    @scala.inline
    def enableSelectAll(value: Boolean): this.type = set("enableSelectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def filterHintText(value: String): this.type = set("filterHintText", value.asInstanceOf[js.Any])
    @scala.inline
    def filterValue(value: String): this.type = set("filterValue", value.asInstanceOf[js.Any])
    @scala.inline
    def fixedFooter(value: Boolean): this.type = set("fixedFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def fixedHeader(value: Boolean): this.type = set("fixedHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def footerToolbarStyle(value: CSSProperties): this.type = set("footerToolbarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def headerToolbarMode(value: typingsSlinky.materialUiDatatables.materialUiDatatablesStrings.default | filter | String): this.type = set("headerToolbarMode", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: js.Any): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def multiSelectable(value: Boolean): this.type = set("multiSelectable", value.asInstanceOf[js.Any])
    @scala.inline
    def onCellClick(
      value: (/* rowIndex */ Double, /* columnIndex */ Double, /* row */ js.Any, /* columnValue */ js.Any, /* event */ js.Any) => Unit
    ): this.type = set("onCellClick", js.Any.fromFunction5(value))
    @scala.inline
    def onCellDoubleClick(
      value: (/* rowIndex */ Double, /* columnIndex */ Double, /* row */ js.Any, /* columnValue */ js.Any, /* event */ js.Any) => Unit
    ): this.type = set("onCellDoubleClick", js.Any.fromFunction5(value))
    @scala.inline
    def onFilterValueChange(value: /* value */ String => Unit): this.type = set("onFilterValueChange", js.Any.fromFunction1(value))
    @scala.inline
    def onNextPageClick(value: /* event */ js.Any => Unit): this.type = set("onNextPageClick", js.Any.fromFunction1(value))
    @scala.inline
    def onPreviousPageClick(value: /* event */ js.Any => Unit): this.type = set("onPreviousPageClick", js.Any.fromFunction1(value))
    @scala.inline
    def onRowSelection(value: /* selectedRows */ js.Any => Unit): this.type = set("onRowSelection", js.Any.fromFunction1(value))
    @scala.inline
    def onRowSizeChange(value: (/* index */ Double, /* value */ js.Any) => Unit): this.type = set("onRowSizeChange", js.Any.fromFunction2(value))
    @scala.inline
    def onSortOrderChange(value: (/* key */ String, /* order */ String) => Unit): this.type = set("onSortOrderChange", js.Any.fromFunction2(value))
    @scala.inline
    def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def rowSize(value: Double): this.type = set("rowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def rowSizeLabel(value: String): this.type = set("rowSizeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def rowSizeList(value: js.Array[Double]): this.type = set("rowSizeList", value.asInstanceOf[js.Any])
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def showCheckboxes(value: Boolean): this.type = set("showCheckboxes", value.asInstanceOf[js.Any])
    @scala.inline
    def showFooterToolbar(value: Boolean): this.type = set("showFooterToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def showHeaderToolbar(value: Boolean): this.type = set("showHeaderToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def showHeaderToolbarFilterIcon(value: Boolean): this.type = set("showHeaderToolbarFilterIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def showRowHover(value: Boolean): this.type = set("showRowHover", value.asInstanceOf[js.Any])
    @scala.inline
    def showRowSizeControls(value: Boolean): this.type = set("showRowSizeControls", value.asInstanceOf[js.Any])
    @scala.inline
    def stripedRows(value: Boolean): this.type = set("stripedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def summaryLabelTemplate(value: (/* start */ Double, /* end */ Double, /* count */ Double) => _): this.type = set("summaryLabelTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def tableBodyStyle(value: CSSProperties): this.type = set("tableBodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def tableHeaderColumnStyle(value: CSSProperties): this.type = set("tableHeaderColumnStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def tableHeaderStyle(value: CSSProperties): this.type = set("tableHeaderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def tableRowColumnStyle(value: CSSProperties): this.type = set("tableRowColumnStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def tableRowStyle(value: CSSProperties): this.type = set("tableRowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def tableStyle(value: CSSProperties): this.type = set("tableStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def tableWrapperStyle(value: CSSProperties): this.type = set("tableWrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyle(value: CSSProperties): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def toolbarIconRight(value: js.Any): this.type = set("toolbarIconRight", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PartialDataTableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MaterialUiDatatables.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

