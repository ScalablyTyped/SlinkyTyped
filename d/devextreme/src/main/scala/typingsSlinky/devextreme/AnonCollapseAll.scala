package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCollapseAll extends js.Object {
  var collapseAll: js.UndefOr[String] = js.native
  var dataNotAvailable: js.UndefOr[String] = js.native
  var expandAll: js.UndefOr[String] = js.native
  var exportToExcel: js.UndefOr[String] = js.native
  var grandTotal: js.UndefOr[String] = js.native
  var noData: js.UndefOr[String] = js.native
  var removeAllSorting: js.UndefOr[String] = js.native
  var showFieldChooser: js.UndefOr[String] = js.native
  var sortColumnBySummary: js.UndefOr[String] = js.native
  var sortRowBySummary: js.UndefOr[String] = js.native
  var total: js.UndefOr[String] = js.native
}

object AnonCollapseAll {
  @scala.inline
  def apply(): AnonCollapseAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCollapseAll]
  }
  @scala.inline
  implicit class AnonCollapseAllOps[Self <: AnonCollapseAll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseAll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAll")(js.undefined)
        ret
    }
    @scala.inline
    def withDataNotAvailable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataNotAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataNotAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataNotAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandAll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(js.undefined)
        ret
    }
    @scala.inline
    def withExportToExcel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportToExcel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportToExcel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportToExcel")(js.undefined)
        ret
    }
    @scala.inline
    def withGrandTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grandTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrandTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grandTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withNoData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noData")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAllSorting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveAllSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFieldChooser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFieldChooser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFieldChooser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFieldChooser")(js.undefined)
        ret
    }
    @scala.inline
    def withSortColumnBySummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumnBySummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortColumnBySummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortColumnBySummary")(js.undefined)
        ret
    }
    @scala.inline
    def withSortRowBySummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRowBySummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortRowBySummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRowBySummary")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

