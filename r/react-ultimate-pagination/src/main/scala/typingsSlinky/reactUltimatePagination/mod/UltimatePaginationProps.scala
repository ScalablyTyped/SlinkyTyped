package typingsSlinky.reactUltimatePagination.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UltimatePaginationProps extends js.Object {
  /**
    * Number of always visible pages at the beginning and end
    */
  var boundaryPagesRange: js.UndefOr[Double] = js.native
  /**
    * Current page number
    */
  var currentPage: Double = js.native
  /**
    * Boolean flag to disable all buttons in pagination
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Boolean flag to hide ellipsis
    */
  var hideEllipsis: js.UndefOr[Boolean] = js.native
  /**
    * Boolean flag to hide first and last page links
    */
  var hideFirstAndLastPageLinks: js.UndefOr[Boolean] = js.native
  /**
    * Boolean flag to hide previous and next page links
    */
  var hidePreviousAndNextPageLinks: js.UndefOr[Boolean] = js.native
  /**
    * Callback that will be called with new page when it should be changed by user interaction
    */
  var onChange: js.UndefOr[js.Function1[/* newPage */ Double, Unit]] = js.native
  /**
    * Number of always visible pages before and after the current one
    */
  var siblingPagesRange: js.UndefOr[Double] = js.native
  /**
    * Total number of pages
    */
  var totalPages: Double = js.native
}

object UltimatePaginationProps {
  @scala.inline
  def apply(currentPage: Double, totalPages: Double): UltimatePaginationProps = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[UltimatePaginationProps]
  }
  @scala.inline
  implicit class UltimatePaginationPropsOps[Self <: UltimatePaginationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundaryPagesRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryPagesRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaryPagesRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryPagesRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHideEllipsis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEllipsis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideEllipsis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEllipsis")(js.undefined)
        ret
    }
    @scala.inline
    def withHideFirstAndLastPageLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFirstAndLastPageLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideFirstAndLastPageLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFirstAndLastPageLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withHidePreviousAndNextPageLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePreviousAndNextPageLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidePreviousAndNextPageLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePreviousAndNextPageLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* newPage */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSiblingPagesRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblingPagesRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiblingPagesRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblingPagesRange")(js.undefined)
        ret
    }
  }
  
}

