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
    def withELLIPSIS(value: ReactComponentClass[PaginationComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ELLIPSIS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFIRST_PAGE_LINK(value: ReactComponentClass[PaginationComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIRST_PAGE_LINK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLAST_PAGE_LINK(value: ReactComponentClass[PaginationComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LAST_PAGE_LINK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNEXT_PAGE_LINK(value: ReactComponentClass[PaginationComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NEXT_PAGE_LINK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPAGE(value: ReactComponentClass[PaginationComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPREVIOUS_PAGE_LINK(value: ReactComponentClass[PaginationComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PREVIOUS_PAGE_LINK")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

