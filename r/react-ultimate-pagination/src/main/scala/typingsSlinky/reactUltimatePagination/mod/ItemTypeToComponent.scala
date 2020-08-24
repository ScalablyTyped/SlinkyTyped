package typingsSlinky.reactUltimatePagination.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemTypeToComponent extends js.Object {
  /**
    * An item that represents groups of pages that currently are not visible in paginator (can be used to navigate to the page in the group that is the nearest to the current page)
    */
  var ELLIPSIS: ReactComponentClass[PaginationComponentProps] = js.native
  /**
    * A link to the first page
    */
  var FIRST_PAGE_LINK: ReactComponentClass[PaginationComponentProps] = js.native
  /**
    * A link to the last page
    */
  var LAST_PAGE_LINK: ReactComponentClass[PaginationComponentProps] = js.native
  /**
    * A link to the next page
    */
  var NEXT_PAGE_LINK: ReactComponentClass[PaginationComponentProps] = js.native
  /**
    * A link to a page
    */
  var PAGE: ReactComponentClass[PaginationComponentProps] = js.native
  /**
    * A link to the previous page
    */
  var PREVIOUS_PAGE_LINK: ReactComponentClass[PaginationComponentProps] = js.native
}

object ItemTypeToComponent {
  @scala.inline
  def apply(
    ELLIPSIS: ReactComponentClass[PaginationComponentProps],
    FIRST_PAGE_LINK: ReactComponentClass[PaginationComponentProps],
    LAST_PAGE_LINK: ReactComponentClass[PaginationComponentProps],
    NEXT_PAGE_LINK: ReactComponentClass[PaginationComponentProps],
    PAGE: ReactComponentClass[PaginationComponentProps],
    PREVIOUS_PAGE_LINK: ReactComponentClass[PaginationComponentProps]
  ): ItemTypeToComponent = {
    val __obj = js.Dynamic.literal(ELLIPSIS = ELLIPSIS.asInstanceOf[js.Any], FIRST_PAGE_LINK = FIRST_PAGE_LINK.asInstanceOf[js.Any], LAST_PAGE_LINK = LAST_PAGE_LINK.asInstanceOf[js.Any], NEXT_PAGE_LINK = NEXT_PAGE_LINK.asInstanceOf[js.Any], PAGE = PAGE.asInstanceOf[js.Any], PREVIOUS_PAGE_LINK = PREVIOUS_PAGE_LINK.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemTypeToComponent]
  }
  @scala.inline
  implicit class ItemTypeToComponentOps[Self <: ItemTypeToComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setELLIPSIS(value: ReactComponentClass[PaginationComponentProps]): Self = this.set("ELLIPSIS", value.asInstanceOf[js.Any])
    @scala.inline
    def setFIRST_PAGE_LINK(value: ReactComponentClass[PaginationComponentProps]): Self = this.set("FIRST_PAGE_LINK", value.asInstanceOf[js.Any])
    @scala.inline
    def setLAST_PAGE_LINK(value: ReactComponentClass[PaginationComponentProps]): Self = this.set("LAST_PAGE_LINK", value.asInstanceOf[js.Any])
    @scala.inline
    def setNEXT_PAGE_LINK(value: ReactComponentClass[PaginationComponentProps]): Self = this.set("NEXT_PAGE_LINK", value.asInstanceOf[js.Any])
    @scala.inline
    def setPAGE(value: ReactComponentClass[PaginationComponentProps]): Self = this.set("PAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setPREVIOUS_PAGE_LINK(value: ReactComponentClass[PaginationComponentProps]): Self = this.set("PREVIOUS_PAGE_LINK", value.asInstanceOf[js.Any])
  }
  
}

