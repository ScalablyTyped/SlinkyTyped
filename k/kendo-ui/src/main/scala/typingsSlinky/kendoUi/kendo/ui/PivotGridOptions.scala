package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.PivotDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGridOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.native
  var collapseMember: js.UndefOr[js.Function1[/* e */ PivotGridCollapseMemberEvent, Unit]] = js.native
  var columnHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var columnWidth: js.UndefOr[Double] = js.native
  var dataBinding: js.UndefOr[js.Function1[/* e */ PivotGridDataBindingEvent, Unit]] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ PivotGridDataBoundEvent, Unit]] = js.native
  var dataCellTemplate: js.UndefOr[String | js.Function] = js.native
  var dataSource: js.UndefOr[js.Any | PivotDataSource] = js.native
  var excel: js.UndefOr[PivotGridExcel] = js.native
  var excelExport: js.UndefOr[js.Function1[/* e */ PivotGridExcelExportEvent, Unit]] = js.native
  var expandMember: js.UndefOr[js.Function1[/* e */ PivotGridExpandMemberEvent, Unit]] = js.native
  var filterable: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var kpiStatusTemplate: js.UndefOr[String | js.Function] = js.native
  var kpiTrendTemplate: js.UndefOr[String | js.Function] = js.native
  var messages: js.UndefOr[PivotGridMessages] = js.native
  var name: js.UndefOr[String] = js.native
  var pdf: js.UndefOr[PivotGridPdf] = js.native
  var pdfExport: js.UndefOr[js.Function1[/* e */ PivotGridPdfExportEvent, Unit]] = js.native
  var reorderable: js.UndefOr[Boolean] = js.native
  var rowHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var sortable: js.UndefOr[Boolean | PivotGridSortable] = js.native
}

object PivotGridOptions {
  @scala.inline
  def apply(): PivotGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridOptions]
  }
  @scala.inline
  implicit class PivotGridOptionsOps[Self <: PivotGridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoBind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBind")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseMember(value: /* e */ PivotGridCollapseMemberEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseMember")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCollapseMember: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseMember")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeaderTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBinding(value: /* e */ PivotGridDataBindingEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: /* e */ PivotGridDataBoundEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withDataCellTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any | PivotDataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withExcel(value: PivotGridExcel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excel")(js.undefined)
        ret
    }
    @scala.inline
    def withExcelExport(value: /* e */ PivotGridExcelExportEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelExport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExcelExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelExport")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandMember(value: /* e */ PivotGridExpandMemberEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandMember")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpandMember: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandMember")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
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
    def withKpiStatusTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kpiStatusTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKpiStatusTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kpiStatusTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withKpiTrendTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kpiTrendTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKpiTrendTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kpiTrendTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: PivotGridMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPdf(value: PivotGridPdf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(js.undefined)
        ret
    }
    @scala.inline
    def withPdfExport(value: /* e */ PivotGridPdfExportEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfExport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPdfExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfExport")(js.undefined)
        ret
    }
    @scala.inline
    def withReorderable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReorderable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderable")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeaderTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSortable(value: Boolean | PivotGridSortable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.undefined)
        ret
    }
  }
  
}

