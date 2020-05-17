package typingsSlinky.flexmonster.mod

import typingsSlinky.flexmonster.anon.ActiveMeasure
import typingsSlinky.flexmonster.anon.DateFormat
import typingsSlinky.flexmonster.anon.Dragging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var caseSensitiveMembers: js.UndefOr[Boolean] = js.native
  var chart: js.UndefOr[ActiveMeasure] = js.native
  var configuratorActive: js.UndefOr[Boolean] = js.native
  var configuratorButton: js.UndefOr[Boolean] = js.native
  var datePattern: js.UndefOr[String] = js.native
  var dateTimePattern: js.UndefOr[String] = js.native
  var dateTimezoneOffset: js.UndefOr[Double] = js.native
  var defaultDateType: js.UndefOr[String] = js.native
  var defaultHierarchySortName: js.UndefOr[String] = js.native
  var drillThrough: js.UndefOr[Boolean] = js.native
  var editing: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[DateFormat] = js.native
  var grid: js.UndefOr[Dragging] = js.native
  var grouping: js.UndefOr[Boolean] = js.native
  var saveAllFormats: js.UndefOr[Boolean] = js.native
  var selectEmptyCells: js.UndefOr[Boolean] = js.native
  var showAggregationLabels: js.UndefOr[Boolean] = js.native
  var showAggregations: js.UndefOr[Boolean] = js.native
  var showAllFieldsDrillThrough: js.UndefOr[Boolean] = js.native
  var showCalculatedValuesButton: js.UndefOr[Boolean] = js.native
  var showDefaultSlice: js.UndefOr[Boolean] = js.native
  var showDrillThroughConfigurator: js.UndefOr[Boolean] = js.native
  var showEmptyData: js.UndefOr[Boolean] = js.native
  var showFieldListSearch: js.UndefOr[Boolean] = js.native
  var showMemberProperties: js.UndefOr[Boolean] = js.native
  var showOutdatedDataAlert: js.UndefOr[Boolean] = js.native
  var simplifyFieldListFolders: js.UndefOr[Boolean] = js.native
  var sorting: js.UndefOr[String] = js.native
  var strictDataTypes: js.UndefOr[Boolean] = js.native
  var timePattern: js.UndefOr[String] = js.native
  var useOlapFormatting: js.UndefOr[Boolean] = js.native
  var validateFormulas: js.UndefOr[Boolean] = js.native
  var validateReportFiles: js.UndefOr[Boolean] = js.native
  var viewType: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseSensitiveMembers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitiveMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitiveMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitiveMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withChart(value: ActiveMeasure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(js.undefined)
        ret
    }
    @scala.inline
    def withConfiguratorActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuratorActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguratorActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuratorActive")(js.undefined)
        ret
    }
    @scala.inline
    def withConfiguratorButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuratorButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguratorButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuratorButton")(js.undefined)
        ret
    }
    @scala.inline
    def withDatePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTimePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTimezoneOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimezoneOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimezoneOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimezoneOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDateType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDateType")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHierarchySortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHierarchySortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHierarchySortName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHierarchySortName")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillThrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillThrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: DateFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: Dragging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveAllFormats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAllFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveAllFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAllFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectEmptyCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectEmptyCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectEmptyCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectEmptyCells")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAggregationLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAggregationLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAggregationLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAggregationLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAggregations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAggregations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAggregations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAggregations")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAllFieldsDrillThrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllFieldsDrillThrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAllFieldsDrillThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAllFieldsDrillThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCalculatedValuesButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCalculatedValuesButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCalculatedValuesButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCalculatedValuesButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDefaultSlice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDefaultSlice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDefaultSlice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDefaultSlice")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDrillThroughConfigurator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDrillThroughConfigurator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDrillThroughConfigurator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDrillThroughConfigurator")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEmptyData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmptyData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEmptyData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmptyData")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFieldListSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFieldListSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFieldListSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFieldListSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMemberProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMemberProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMemberProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMemberProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOutdatedDataAlert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOutdatedDataAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOutdatedDataAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOutdatedDataAlert")(js.undefined)
        ret
    }
    @scala.inline
    def withSimplifyFieldListFolders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplifyFieldListFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimplifyFieldListFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplifyFieldListFolders")(js.undefined)
        ret
    }
    @scala.inline
    def withSorting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictDataTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictDataTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictDataTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictDataTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withUseOlapFormatting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOlapFormatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseOlapFormatting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOlapFormatting")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateFormulas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFormulas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateFormulas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFormulas")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateReportFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateReportFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateReportFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateReportFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withViewType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewType")(js.undefined)
        ret
    }
  }
  
}

