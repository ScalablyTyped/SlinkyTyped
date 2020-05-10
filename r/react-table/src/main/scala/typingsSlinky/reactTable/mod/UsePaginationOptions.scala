package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  pageCount  :number,   manualPagination  :boolean,   autoResetPage ? :boolean,   paginateExpandedRows  :boolean}> */
@js.native
trait UsePaginationOptions[D /* <: js.Object */] extends js.Object {
  var autoResetPage: js.UndefOr[Boolean] = js.native
  var manualPagination: js.UndefOr[Boolean] = js.native
  var pageCount: js.UndefOr[Double] = js.native
  var paginateExpandedRows: js.UndefOr[Boolean] = js.native
}

object UsePaginationOptions {
  @scala.inline
  def apply[D](): UsePaginationOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsePaginationOptions[D]]
  }
  @scala.inline
  implicit class UsePaginationOptionsOps[Self[d] <: UsePaginationOptions[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAutoResetPage(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResetPage: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetPage")(js.undefined)
        ret
    }
    @scala.inline
    def withManualPagination(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualPagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualPagination: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualPagination")(js.undefined)
        ret
    }
    @scala.inline
    def withPageCount(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageCount: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginateExpandedRows(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginateExpandedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginateExpandedRows: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginateExpandedRows")(js.undefined)
        ret
    }
  }
  
}

