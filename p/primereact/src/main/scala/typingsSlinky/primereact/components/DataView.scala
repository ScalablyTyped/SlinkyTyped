package typingsSlinky.primereact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Rows
import typingsSlinky.primereact.dataViewMod.DataViewProps
import typingsSlinky.primereact.primereactStrings.grid
import typingsSlinky.primereact.primereactStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataView {
  
  @JSImport("primereact/dataview", "DataView")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactDataviewMod.DataView] {
    
    @scala.inline
    def alwaysShowPaginator(value: Boolean): this.type = set("alwaysShowPaginator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def currentPageReportTemplate(value: String): this.type = set("currentPageReportTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def emptyMessage(value: String): this.type = set("emptyMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def first(value: Double): this.type = set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: ReactElement | String): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: ReactElement | String): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemTemplate(value: (/* item */ js.Any, /* layout */ grid | list) => js.UndefOr[ReactElement]): this.type = set("itemTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def layout(value: String): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingIcon(value: String): this.type = set("loadingIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPage(value: /* e */ Rows => Unit): this.type = set("onPage", js.Any.fromFunction1(value))
    
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
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowsPerPageOptionsVarargs(value: Double*): this.type = set("rowsPerPageOptions", js.Array(value :_*))
    
    @scala.inline
    def rowsPerPageOptions(value: js.Array[Double]): this.type = set("rowsPerPageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortField(value: String): this.type = set("sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortOrder(value: Double): this.type = set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: String): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def totalRecords(value: Double): this.type = set("totalRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: js.Any*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def value(value: js.Array[_]): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DataViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DataView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
