package typingsSlinky.primereact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Columns
import typingsSlinky.primereact.anon.Data
import typingsSlinky.primereact.anon.DataArray
import typingsSlinky.primereact.anon.DataField
import typingsSlinky.primereact.anon.DataIndex
import typingsSlinky.primereact.anon.DataOriginalEvent
import typingsSlinky.primereact.anon.Delta
import typingsSlinky.primereact.anon.DragIndex
import typingsSlinky.primereact.anon.Filters
import typingsSlinky.primereact.anon.First
import typingsSlinky.primereact.anon.MultiSortMeta
import typingsSlinky.primereact.anon.Type
import typingsSlinky.primereact.anon.Value
import typingsSlinky.primereact.dataTableMod.DataTableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTable {
  
  @JSImport("primereact/datatable", "DataTable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactDatatableMod.DataTable] {
    
    @scala.inline
    def alwaysShowPaginator(value: Boolean): this.type = set("alwaysShowPaginator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoLayout(value: Boolean): this.type = set("autoLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnResizeMode(value: String): this.type = set("columnResizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compareSelectionBy(value: String): this.type = set("compareSelectionBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contextMenuSelection(value: js.Any): this.type = set("contextMenuSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def csvSeparator(value: String): this.type = set("csvSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def currentPageReportTemplate(value: String): this.type = set("currentPageReportTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customRestoreState(value: () => _): this.type = set("customRestoreState", js.Any.fromFunction0(value))
    
    @scala.inline
    def customSaveState(value: /* state */ js.Any => Unit): this.type = set("customSaveState", js.Any.fromFunction1(value))
    
    @scala.inline
    def dataKey(value: String): this.type = set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultSortOrder(value: Double): this.type = set("defaultSortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editMode(value: String): this.type = set("editMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def emptyMessage(value: js.Any): this.type = set("emptyMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandableRowGroups(value: Boolean): this.type = set("expandableRowGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandedRows(value: js.Array[_]): this.type = set("expandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandedRowsVarargs(value: js.Any*): this.type = set("expandedRows", js.Array(value :_*))
    
    @scala.inline
    def exportFilename(value: String): this.type = set("exportFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def exportFunction(value: /* e */ DataField => _): this.type = set("exportFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def filterLocale(value: String): this.type = set("filterLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filters(value: js.Object): this.type = set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def first(value: Double): this.type = set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: js.Any): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerColumnGroup(value: js.Any): this.type = set("footerColumnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def frozenFooterColumnGroup(value: js.Any): this.type = set("frozenFooterColumnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def frozenHeaderColumnGroup(value: js.Any): this.type = set("frozenHeaderColumnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def frozenValue(value: js.Array[_]): this.type = set("frozenValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def frozenValueVarargs(value: js.Any*): this.type = set("frozenValue", js.Array(value :_*))
    
    @scala.inline
    def frozenWidth(value: String): this.type = set("frozenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def globalFilter(value: js.Any): this.type = set("globalFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupField(value: String): this.type = set("groupField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: js.Any): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerColumnGroup(value: js.Any): this.type = set("headerColumnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingIcon(value: String): this.type = set("loadingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def metaKeySelection(value: Boolean): this.type = set("metaKeySelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiSortMeta(value: js.Array[_]): this.type = set("multiSortMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiSortMetaVarargs(value: js.Any*): this.type = set("multiSortMeta", js.Array(value :_*))
    
    @scala.inline
    def onColReorder(value: /* e */ Columns => Unit): this.type = set("onColReorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onColumnResizeEnd(value: /* e */ Delta => Unit): this.type = set("onColumnResizeEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenu(value: /* e */ DataOriginalEvent => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenuSelectionChange(value: /* e */ Value => Unit): this.type = set("onContextMenuSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFilter(value: /* e */ Filters => Unit): this.type = set("onFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPage(value: /* e */ First => Unit): this.type = set("onPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowClick(value: /* e */ DataIndex => Unit): this.type = set("onRowClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowCollapse(value: /* e */ DataOriginalEvent => Unit): this.type = set("onRowCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowDoubleClick(value: /* e */ DataIndex => Unit): this.type = set("onRowDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowEditCancel(value: /* e */ DataIndex => Unit): this.type = set("onRowEditCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowEditInit(value: /* e */ DataIndex => Unit): this.type = set("onRowEditInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowEditSave(value: /* e */ DataIndex => Unit): this.type = set("onRowEditSave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowExpand(value: /* e */ DataOriginalEvent => Unit): this.type = set("onRowExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowReorder(value: /* e */ DragIndex => Unit): this.type = set("onRowReorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowSelect(value: /* e */ Type => Unit): this.type = set("onRowSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowToggle(value: /* e */ DataArray => Unit): this.type = set("onRowToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowUnselect(value: /* e */ Type => Unit): this.type = set("onRowUnselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelectionChange(value: /* e */ Value => Unit): this.type = set("onSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSort(value: /* e */ MultiSortMeta => Unit): this.type = set("onSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStateRestore(value: /* state */ js.Any => Unit): this.type = set("onStateRestore", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStateSave(value: /* state */ js.Any => Unit): this.type = set("onStateSave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onValueChange(value: /* value */ js.Array[_] => Unit): this.type = set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVirtualScroll(value: /* e */ First => Unit): this.type = set("onVirtualScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def pageLinkSize(value: Double): this.type = set("pageLinkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paginator(value: Boolean): this.type = set("paginator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paginatorDropdownAppendTo(value: js.Any): this.type = set("paginatorDropdownAppendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paginatorLeft(value: js.Any): this.type = set("paginatorLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paginatorPosition(value: String): this.type = set("paginatorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paginatorRight(value: js.Any): this.type = set("paginatorRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paginatorTemplate(value: String): this.type = set("paginatorTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removableSort(value: Boolean): this.type = set("removableSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reorderableColumns(value: Boolean): this.type = set("reorderableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resizableColumns(value: Boolean): this.type = set("resizableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowClassName(value: /* rowData */ js.Any => js.Object): this.type = set("rowClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def rowEditorValidator(value: /* rowData */ js.Any => Boolean): this.type = set("rowEditorValidator", js.Any.fromFunction1(value))
    
    @scala.inline
    def rowExpansionTemplate(value: /* data */ js.Any => js.UndefOr[ReactElement]): this.type = set("rowExpansionTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def rowGroupFooterTemplate(value: (/* data */ js.Any, /* index */ Double) => js.UndefOr[ReactElement]): this.type = set("rowGroupFooterTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def rowGroupHeaderTemplate(value: (/* data */ js.Any, /* index */ Double) => js.UndefOr[ReactElement]): this.type = set("rowGroupHeaderTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def rowGroupMode(value: String): this.type = set("rowGroupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowHover(value: Boolean): this.type = set("rowHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowsPerPageOptions(value: js.Array[Double]): this.type = set("rowsPerPageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowsPerPageOptionsVarargs(value: Double*): this.type = set("rowsPerPageOptions", js.Array(value :_*))
    
    @scala.inline
    def scrollHeight(value: String): this.type = set("scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollable(value: Boolean): this.type = set("scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selection(value: js.Any): this.type = set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionMode(value: String): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showReorderElement(value: /* e */ Data => Boolean): this.type = set("showReorderElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def showSelectionElement(value: /* e */ Data => Boolean): this.type = set("showSelectionElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def sortField(value: String): this.type = set("sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortMode(value: String): this.type = set("sortMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortOrder(value: Double): this.type = set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stateKey(value: String): this.type = set("stateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stateStorage(value: String): this.type = set("stateStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: String): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableClassName(value: String): this.type = set("tableClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableStyle(value: js.Object): this.type = set("tableStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def totalRecords(value: Double): this.type = set("totalRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Array[_]): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: js.Any*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def virtualRowHeight(value: Double): this.type = set("virtualRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def virtualScroll(value: Boolean): this.type = set("virtualScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def virtualScrollDelay(value: Double): this.type = set("virtualScrollDelay", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DataTable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DataTableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
