package typingsSlinky.reactBootstrapTable2Paginator.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrapTable2Paginator.mod.SizePerPageDropdownStandaloneProps
import typingsSlinky.reactBootstrapTable2Paginator.reactBootstrapTable2PaginatorStrings.dropdown
import typingsSlinky.reactBootstrapTable2Paginator.reactBootstrapTable2PaginatorStrings.dropup
import typingsSlinky.reactBootstrapTableNext.anon.Text
import typingsSlinky.reactBootstrapTableNext.mod.PageButtonRendererOptions
import typingsSlinky.reactBootstrapTableNext.mod.PageListRendererOptions
import typingsSlinky.reactBootstrapTableNext.mod.SizePerPageOptionRendererOptions
import typingsSlinky.reactBootstrapTableNext.mod.SizePerPageRendererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SizePerPageDropdownStandalone {
  
  @JSImport("react-bootstrap-table2-paginator", "SizePerPageDropdownStandalone")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def alwaysShowAllBtns(value: Boolean): this.type = set("alwaysShowAllBtns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bootstrap4(value: Boolean): this.type = set("bootstrap4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def btnContextual(value: Boolean): this.type = set("btnContextual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def custom(value: Boolean): this.type = set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def firstPageTextReactElement(value: ReactElement): this.type = set("firstPageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def firstPageText(value: String | ReactElement): this.type = set("firstPageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def firstPageTitle(value: String): this.type = set("firstPageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidePageListOnlyOnePage(value: Boolean): this.type = set("hidePageListOnlyOnePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideSizePerPage(value: Boolean): this.type = set("hideSizePerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lastPageTextReactElement(value: ReactElement): this.type = set("lastPageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lastPageText(value: String | ReactElement): this.type = set("lastPageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lastPageTitle(value: String): this.type = set("lastPageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextPageTextReactElement(value: ReactElement): this.type = set("nextPageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextPageText(value: String | ReactElement): this.type = set("nextPageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextPageTitle(value: String): this.type = set("nextPageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPageChange(value: (/* page */ Double, /* sizePerPage */ Double) => Unit): this.type = set("onPageChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSizePerPageChange(value: (/* page */ Double, /* sizePerPage */ Double) => Unit): this.type = set("onSizePerPageChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageButtonRenderer(value: /* options */ PageButtonRendererOptions => ReactElement): this.type = set("pageButtonRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def pageListRenderer(value: /* options */ PageListRendererOptions => ReactElement): this.type = set("pageListRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def pageStartIndex(value: Double): this.type = set("pageStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paginationSize(value: Double): this.type = set("paginationSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paginationTotalRenderer(value: (/* from */ Double, /* to */ Double, /* size */ Double) => ReactElement): this.type = set("paginationTotalRenderer", js.Any.fromFunction3(value))
    
    @scala.inline
    def prePageTextReactElement(value: ReactElement): this.type = set("prePageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prePageText(value: String | ReactElement): this.type = set("prePageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prePageTitle(value: String): this.type = set("prePageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTotal(value: Boolean): this.type = set("showTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sizePerPage(value: Double): this.type = set("sizePerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sizePerPageListVarargs(value: (Double | Text)*): this.type = set("sizePerPageList", js.Array(value :_*))
    
    @scala.inline
    def sizePerPageList(value: js.Array[Double | Text]): this.type = set("sizePerPageList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sizePerPageOptionRenderer(value: /* options */ SizePerPageOptionRendererOptions => ReactElement): this.type = set("sizePerPageOptionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def sizePerPageRenderer(value: /* options */ SizePerPageRendererOptions => ReactElement): this.type = set("sizePerPageRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def tableId(value: String): this.type = set("tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def totalSize(value: Double): this.type = set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def variation(value: dropdown | dropup): this.type = set("variation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def withFirstAndLast(value: Boolean): this.type = set("withFirstAndLast", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SizePerPageDropdownStandaloneProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SizePerPageDropdownStandalone.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
