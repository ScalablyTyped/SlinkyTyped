package typingsSlinky.googleVisualization.google.visualization

import typingsSlinky.googleVisualization.googleVisualizationStrings.auto
import typingsSlinky.googleVisualization.googleVisualizationStrings.both
import typingsSlinky.googleVisualization.googleVisualizationStrings.next
import typingsSlinky.googleVisualization.googleVisualizationStrings.prev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableOptions extends js.Object {
  var allowHtml: js.UndefOr[Boolean] = js.native
  var alternatingRowStyle: js.UndefOr[Boolean] = js.native
  var cssClassNames: js.UndefOr[CssClassNames] = js.native
  var firstRowNumber: js.UndefOr[Double] = js.native
  var frozenColumns: js.UndefOr[Double] = js.native
  var height: js.UndefOr[String] = js.native
  var page: js.UndefOr[String] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var pagingButtons: js.UndefOr[Double | both | prev | next | auto] = js.native
  var rtlTable: js.UndefOr[Boolean] = js.native
  var scrollLeftStartPosition: js.UndefOr[Double] = js.native
  var showRowNumber: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[String] = js.native
  var sortAscending: js.UndefOr[Boolean] = js.native
  var sortColumn: js.UndefOr[Double] = js.native
  var startPage: js.UndefOr[Double] = js.native
  var width: js.UndefOr[String] = js.native
}

object TableOptions {
  @scala.inline
  def apply(): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOptions]
  }
  @scala.inline
  implicit class TableOptionsOps[Self <: TableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withAlternatingRowStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatingRowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternatingRowStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatingRowStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClassNames(value: CssClassNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClassNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClassNames")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstRowNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstRowNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstRowNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstRowNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
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
    def withPagingButtons(value: Double | both | prev | next | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagingButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withRtlTable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtlTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtlTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtlTable")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollLeftStartPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeftStartPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollLeftStartPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeftStartPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRowNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRowNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortAscending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAscending")(js.undefined)
        ret
    }
    @scala.inline
    def withSortColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPage")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

