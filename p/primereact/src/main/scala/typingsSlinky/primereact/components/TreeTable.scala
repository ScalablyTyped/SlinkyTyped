package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Delta
import typingsSlinky.primereact.anon.DropIndex
import typingsSlinky.primereact.anon.First
import typingsSlinky.primereact.anon.MultiSortMeta
import typingsSlinky.primereact.anon.Node
import typingsSlinky.primereact.anon.NodeOriginalEvent
import typingsSlinky.primereact.anon.Value
import typingsSlinky.primereact.treeNodeMod.TreeNode
import typingsSlinky.primereact.treeTableMod.TreeTableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeTable {
  
  @JSImport("primereact/treetable", "TreeTable")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactTreetableMod.TreeTable] {
    
    @scala.inline
    def alwaysShowPaginator(value: Boolean): this.type = set("alwaysShowPaginator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoLayout(value: Boolean): this.type = set("autoLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnResizeMode(value: String): this.type = set("columnResizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contextMenuSelectionKey(value: js.Any): this.type = set("contextMenuSelectionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def currentPageReportTemplate(value: String): this.type = set("currentPageReportTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultSortOrder(value: Double): this.type = set("defaultSortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def emptyMessage(value: String): this.type = set("emptyMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandedKeys(value: js.Any): this.type = set("expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterLocale(value: String): this.type = set("filterLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterMode(value: String): this.type = set("filterMode", value.asInstanceOf[js.Any])
    
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
    def frozenWidth(value: String): this.type = set("frozenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def globalFilter(value: js.Any): this.type = set("globalFilter", value.asInstanceOf[js.Any])
    
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
    def multiSortMetaVarargs(value: js.Any*): this.type = set("multiSortMeta", js.Array(value :_*))
    
    @scala.inline
    def multiSortMeta(value: js.Array[_]): this.type = set("multiSortMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onColReorder(value: /* e */ DropIndex => Unit): this.type = set("onColReorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCollapse(value: /* e */ NodeOriginalEvent => Unit): this.type = set("onCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def onColumnResizeEnd(value: /* e */ Delta => Unit): this.type = set("onColumnResizeEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenu(value: /* e */ Node => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenuSelectionChange(value: /* e */ Value => Unit): this.type = set("onContextMenuSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExpand(value: /* e */ NodeOriginalEvent => Unit): this.type = set("onExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFilter(value: /* filters */ js.Array[_] => Unit): this.type = set("onFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPage(value: /* e */ First => Unit): this.type = set("onPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowClick(value: /* e */ NodeOriginalEvent => Unit): this.type = set("onRowClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(value: /* e */ NodeOriginalEvent => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelectionChange(value: /* e */ Value => Unit): this.type = set("onSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSort(value: /* e */ MultiSortMeta => Unit): this.type = set("onSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def onToggle(value: /* e */ Value => Unit): this.type = set("onToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def onUnselect(value: /* e */ NodeOriginalEvent => Unit): this.type = set("onUnselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def pageLinkSize(value: Double): this.type = set("pageLinkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paginator(value: Boolean): this.type = set("paginator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paginatorLeft(value: js.Any): this.type = set("paginatorLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paginatorPosition(value: String): this.type = set("paginatorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paginatorRight(value: js.Any): this.type = set("paginatorRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paginatorTemplate(value: String): this.type = set("paginatorTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def propagateSelectionDown(value: Boolean): this.type = set("propagateSelectionDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def propagateSelectionUp(value: Boolean): this.type = set("propagateSelectionUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reorderableColumns(value: Boolean): this.type = set("reorderableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resizableColumns(value: Boolean): this.type = set("resizableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowClassName(value: /* rowData */ js.Any => js.Object): this.type = set("rowClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowsPerPageOptionsVarargs(value: Double*): this.type = set("rowsPerPageOptions", js.Array(value :_*))
    
    @scala.inline
    def rowsPerPageOptions(value: js.Array[Double]): this.type = set("rowsPerPageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollHeight(value: String): this.type = set("scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollable(value: Boolean): this.type = set("scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionKeys(value: js.Any): this.type = set("selectionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionMode(value: String): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortField(value: String): this.type = set("sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortMode(value: String): this.type = set("sortMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortOrder(value: Double): this.type = set("sortOrder", value.asInstanceOf[js.Any])
    
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
    def valueVarargs(value: TreeNode*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def value(value: js.Array[TreeNode]): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TreeTableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TreeTable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
