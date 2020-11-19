package typingsSlinky.reactBootstrapTable.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactBootstrapTable.anon.Filter
import typingsSlinky.reactBootstrapTable.mod.BootstrapTableProps
import typingsSlinky.reactBootstrapTable.mod.BootstrapVersion
import typingsSlinky.reactBootstrapTable.mod.CellEdit
import typingsSlinky.reactBootstrapTable.mod.ExpandColumnOptions
import typingsSlinky.reactBootstrapTable.mod.FetchInfo
import typingsSlinky.reactBootstrapTable.mod.FooterData
import typingsSlinky.reactBootstrapTable.mod.KeyboardNavigation
import typingsSlinky.reactBootstrapTable.mod.Options
import typingsSlinky.reactBootstrapTable.mod.RemoteObjSpec
import typingsSlinky.reactBootstrapTable.mod.ScrollPosition
import typingsSlinky.reactBootstrapTable.mod.SelectRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BootstrapTable {
  
  @JSImport("react-bootstrap-table", "BootstrapTable")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrapTable.mod.BootstrapTable] {
    
    @scala.inline
    def autoCollapse(value: Filter): this.type = set("autoCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyContainerClass(value: String): this.type = set("bodyContainerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cellEdit(value: CellEdit[_]): this.type = set("cellEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnFilter(value: Boolean): this.type = set("columnFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def condensed(value: Boolean): this.type = set("condensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerClass(value: String): this.type = set("containerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerStyle(value: CSSProperties): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def csvFileNameFunction0(value: () => String): this.type = set("csvFileName", js.Any.fromFunction0(value))
    
    @scala.inline
    def csvFileName(value: String | js.Function0[String]): this.type = set("csvFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow(value: Boolean): this.type = set("deleteRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def excludeCSVHeader(value: Boolean): this.type = set("excludeCSVHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandColumnOptions(value: ExpandColumnOptions): this.type = set("expandColumnOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandComponent(value: /* row */ js.Any => String | ReactElement): this.type = set("expandComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def expandableRow(value: /* row */ js.Any => Boolean): this.type = set("expandableRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def exportCSV(value: Boolean): this.type = set("exportCSV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fetchInfo(value: FetchInfo): this.type = set("fetchInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: Boolean): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerDataVarargs(value: js.Array[FooterData]*): this.type = set("footerData", js.Array(value :_*))
    
    @scala.inline
    def footerData(value: js.Array[js.Array[FooterData]]): this.type = set("footerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerContainerClass(value: String): this.type = set("headerContainerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerStyle(value: CSSProperties): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hover(value: Boolean): this.type = set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ignoreSinglePage(value: Boolean): this.type = set("ignoreSinglePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def insertRow(value: Boolean): this.type = set("insertRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyBoardNav(value: Boolean | KeyboardNavigation): this.type = set("keyBoardNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyField(value: String): this.type = set("keyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxHeight(value: String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiColumnSearch(value: Boolean): this.type = set("multiColumnSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiColumnSort(value: Double): this.type = set("multiColumnSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def options(value: Options[_]): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pagination(value: Boolean): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def remoteFunction1(value: /* remobeObj */ RemoteObjSpec => RemoteObjSpec): this.type = set("remote", js.Any.fromFunction1(value))
    
    @scala.inline
    def remote(value: Boolean | (js.Function1[/* remobeObj */ RemoteObjSpec, RemoteObjSpec])): this.type = set("remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderAlert(value: Boolean): this.type = set("renderAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollTop(value: Double | ScrollPosition): this.type = set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def search(value: Boolean): this.type = set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchPlaceholder(value: String): this.type = set("searchPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectRow(value: SelectRow[_]): this.type = set("selectRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strictSearch(value: Boolean): this.type = set("strictSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def striped(value: Boolean): this.type = set("striped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableBodyClass(value: String): this.type = set("tableBodyClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableContainerClass(value: String): this.type = set("tableContainerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableFooterClass(value: String): this.type = set("tableFooterClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableHeaderClass(value: String): this.type = set("tableHeaderClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableStyle(value: CSSProperties): this.type = set("tableStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trClassNameFunction2(value: (/* rowData */ js.Any, /* rowIndex */ Double) => String): this.type = set("trClassName", js.Any.fromFunction2(value))
    
    @scala.inline
    def trClassName(value: String | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, String])): this.type = set("trClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trStyleFunction2(value: (/* rowData */ js.Any, /* rowIndex */ Double) => CSSProperties): this.type = set("trStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def trStyle(value: CSSProperties | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, CSSProperties])): this.type = set("trStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def version(value: BootstrapVersion): this.type = set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def withoutTabIndex(value: Boolean): this.type = set("withoutTabIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BootstrapTableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(data: js.Array[js.Object]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BootstrapTableProps]))
  }
}
