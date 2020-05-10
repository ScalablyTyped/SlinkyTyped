package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.paginationMod.PaginationProps
import typingsSlinky.cathoQuantum.paginationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination {
  @JSImport("@catho/quantum/Pagination", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def activePage(value: Double): this.type = set("activePage", value.asInstanceOf[js.Any])
    @scala.inline
    def activePageAriaLabel(value: String): this.type = set("activePageAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def followOnlyFirstPage(value: Boolean): this.type = set("followOnlyFirstPage", value.asInstanceOf[js.Any])
    @scala.inline
    def infoFormatter(value: (/* activePage */ js.UndefOr[Double], /* lastPage */ js.UndefOr[Double]) => Unit): this.type = set("infoFormatter", js.Any.fromFunction2(value))
    @scala.inline
    def nextButtonText(value: String): this.type = set("nextButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def onPageClick(value: /* page */ js.UndefOr[Double] => Unit): this.type = set("onPageClick", js.Any.fromFunction1(value))
    @scala.inline
    def pageAriaLabel(value: String): this.type = set("pageAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def pageHref(value: /* page */ js.UndefOr[Double] => Unit): this.type = set("pageHref", js.Any.fromFunction1(value))
    @scala.inline
    def prevButtonText(value: String): this.type = set("prevButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(totalPages: Double): Builder = {
    val __props = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PaginationProps]))
  }
}

