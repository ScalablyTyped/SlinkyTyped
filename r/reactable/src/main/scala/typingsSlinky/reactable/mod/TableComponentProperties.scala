package typingsSlinky.reactable.mod

import typingsSlinky.reactable.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableComponentProperties[T] extends js.Object {
  var className: js.UndefOr[String] = js.native
  var columns: js.UndefOr[js.Array[ColumnsType]] = js.native
  var currentPage: js.UndefOr[Double] = js.native
  var data: js.UndefOr[js.Array[T]] = js.native
  var defaultSort: js.UndefOr[Column] = js.native
  var filterBy: js.UndefOr[String] = js.native
  var filterable: js.UndefOr[js.Array[String]] = js.native
  var hideFilterInput: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var itemsPerPage: js.UndefOr[Double] = js.native
  var noDataText: js.UndefOr[String] = js.native
  var onFilter: js.UndefOr[FilterMethodType] = js.native
  var pageButtonLimit: js.UndefOr[Double] = js.native
  var sortBy: js.UndefOr[Boolean] = js.native
  var sortable: js.UndefOr[js.Array[String] | Boolean] = js.native
}

object TableComponentProperties {
  @scala.inline
  def apply[T](): TableComponentProperties[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableComponentProperties[T]]
  }
  @scala.inline
  implicit class TableComponentPropertiesOps[Self[t] <: TableComponentProperties[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[ColumnsType]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPage(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPage: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSort(value: Column): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSort: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSort")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterBy(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterBy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterable(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(js.undefined)
        ret
    }
    @scala.inline
    def withHideFilterInput(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFilterInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideFilterInput: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFilterInput")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsPerPage(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsPerPage: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsPerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDataText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDataText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilter(value: /* text */ String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withPageButtonLimit(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageButtonLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageButtonLimit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageButtonLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSortBy(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortBy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSortable(value: js.Array[String] | Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.undefined)
        ret
    }
  }
  
}

