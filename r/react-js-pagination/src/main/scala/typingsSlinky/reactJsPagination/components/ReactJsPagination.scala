package typingsSlinky.reactJsPagination.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactJsPagination.mod.ReactJsPaginationProps
import typingsSlinky.reactJsPagination.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactJsPagination {
  @JSImport("react-js-pagination", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def activeClass(value: String): this.type = set("activeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def activeLinkClass(value: String): this.type = set("activeLinkClass", value.asInstanceOf[js.Any])
    @scala.inline
    def disabledClass(value: String): this.type = set("disabledClass", value.asInstanceOf[js.Any])
    @scala.inline
    def firstPageTextReactElement(value: ReactElement): this.type = set("firstPageText", value.asInstanceOf[js.Any])
    @scala.inline
    def firstPageText(value: String | ReactElement): this.type = set("firstPageText", value.asInstanceOf[js.Any])
    @scala.inline
    def getPageUrl(value: /* pageNumber */ Double => String): this.type = set("getPageUrl", js.Any.fromFunction1(value))
    @scala.inline
    def hideDisabled(value: Boolean): this.type = set("hideDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def hideFirstLastPages(value: Boolean): this.type = set("hideFirstLastPages", value.asInstanceOf[js.Any])
    @scala.inline
    def hideNavigation(value: Boolean): this.type = set("hideNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def innerClass(value: String): this.type = set("innerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def itemClass(value: String): this.type = set("itemClass", value.asInstanceOf[js.Any])
    @scala.inline
    def itemClassFirst(value: String): this.type = set("itemClassFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def itemClassLast(value: String): this.type = set("itemClassLast", value.asInstanceOf[js.Any])
    @scala.inline
    def itemClassNext(value: String): this.type = set("itemClassNext", value.asInstanceOf[js.Any])
    @scala.inline
    def itemClassPrev(value: String): this.type = set("itemClassPrev", value.asInstanceOf[js.Any])
    @scala.inline
    def itemsCountPerPage(value: Double): this.type = set("itemsCountPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def lastPageTextReactElement(value: ReactElement): this.type = set("lastPageText", value.asInstanceOf[js.Any])
    @scala.inline
    def lastPageText(value: String | ReactElement): this.type = set("lastPageText", value.asInstanceOf[js.Any])
    @scala.inline
    def linkClass(value: String): this.type = set("linkClass", value.asInstanceOf[js.Any])
    @scala.inline
    def linkClassFirst(value: String): this.type = set("linkClassFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def linkClassLast(value: String): this.type = set("linkClassLast", value.asInstanceOf[js.Any])
    @scala.inline
    def linkClassNext(value: String): this.type = set("linkClassNext", value.asInstanceOf[js.Any])
    @scala.inline
    def linkClassPrev(value: String): this.type = set("linkClassPrev", value.asInstanceOf[js.Any])
    @scala.inline
    def nextPageTextReactElement(value: ReactElement): this.type = set("nextPageText", value.asInstanceOf[js.Any])
    @scala.inline
    def nextPageText(value: String | ReactElement): this.type = set("nextPageText", value.asInstanceOf[js.Any])
    @scala.inline
    def pageRangeDisplayed(value: Double): this.type = set("pageRangeDisplayed", value.asInstanceOf[js.Any])
    @scala.inline
    def prevPageTextReactElement(value: ReactElement): this.type = set("prevPageText", value.asInstanceOf[js.Any])
    @scala.inline
    def prevPageText(value: String | ReactElement): this.type = set("prevPageText", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactJsPaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(activePage: Double, onChange: Double => Unit, totalItemsCount: Double): Builder = {
    val __props = js.Dynamic.literal(activePage = activePage.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), totalItemsCount = totalItemsCount.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactJsPaginationProps]))
  }
}

