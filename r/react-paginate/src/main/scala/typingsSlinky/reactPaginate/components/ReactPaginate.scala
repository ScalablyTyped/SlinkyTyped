package typingsSlinky.reactPaginate.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactPaginate.anon.Selected
import typingsSlinky.reactPaginate.mod.ReactPaginateProps
import typingsSlinky.reactPaginate.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPaginate {
  
  @JSImport("react-paginate", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def activeClassName(value: String): this.type = set("activeClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeLinkClassName(value: String): this.type = set("activeLinkClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def breakClassName(value: String): this.type = set("breakClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def breakLabelReactElement(value: ReactElement): this.type = set("breakLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def breakLabel(value: String | ReactElement): this.type = set("breakLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def breakLinkClassName(value: String): this.type = set("breakLinkClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableInitialCallback(value: Boolean): this.type = set("disableInitialCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledClassName(value: String): this.type = set("disabledClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraAriaContext(value: String): this.type = set("extraAriaContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forcePage(value: Double): this.type = set("forcePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hrefBuilder(value: /* pageIndex */ Double => Unit): this.type = set("hrefBuilder", js.Any.fromFunction1(value))
    
    @scala.inline
    def initialPage(value: Double): this.type = set("initialPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextClassName(value: String): this.type = set("nextClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextLabelReactElement(value: ReactElement): this.type = set("nextLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextLabel(value: ReactElement): this.type = set("nextLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextLinkClassName(value: String): this.type = set("nextLinkClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPageChange(value: /* selectedItem */ Selected => Unit): this.type = set("onPageChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def pageClassName(value: String): this.type = set("pageClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageLinkClassName(value: String): this.type = set("pageLinkClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def previousClassName(value: String): this.type = set("previousClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def previousLabelReactElement(value: ReactElement): this.type = set("previousLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def previousLabel(value: ReactElement): this.type = set("previousLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def previousLinkClassName(value: String): this.type = set("previousLinkClassName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactPaginateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(marginPagesDisplayed: Double, pageCount: Double, pageRangeDisplayed: Double): Builder = {
    val __props = js.Dynamic.literal(marginPagesDisplayed = marginPagesDisplayed.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any], pageRangeDisplayed = pageRangeDisplayed.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactPaginateProps]))
  }
}
