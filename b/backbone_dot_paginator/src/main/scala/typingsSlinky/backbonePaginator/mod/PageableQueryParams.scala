package typingsSlinky.backbonePaginator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageableQueryParams extends js.Object {
  var currentPage: js.UndefOr[String] = js.native
  var directions: js.UndefOr[js.Any] = js.native
  var order: js.UndefOr[String] = js.native
  var pageSize: js.UndefOr[String] = js.native
  var sortKey: js.UndefOr[String] = js.native
  var totalPages: js.UndefOr[String] = js.native
  var totalRecords: js.UndefOr[String] = js.native
}

object PageableQueryParams {
  @scala.inline
  def apply(): PageableQueryParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageableQueryParams]
  }
  @scala.inline
  implicit class PageableQueryParamsOps[Self <: PageableQueryParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(js.undefined)
        ret
    }
    @scala.inline
    def withDirections(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directions")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSortKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalPages(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPages")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRecords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRecords")(js.undefined)
        ret
    }
  }
  
}

