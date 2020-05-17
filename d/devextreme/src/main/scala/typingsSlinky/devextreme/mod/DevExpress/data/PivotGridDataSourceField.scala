package typingsSlinky.devextreme.mod.DevExpress.data

import typingsSlinky.devextreme.anon.AllowSearch
import typingsSlinky.devextreme.anon.Children
import typingsSlinky.devextreme.anon.SummaryProcess
import typingsSlinky.devextreme.anon.Value
import typingsSlinky.devextreme.devextremeStrings.absoluteVariation
import typingsSlinky.devextreme.devextremeStrings.asc
import typingsSlinky.devextreme.devextremeStrings.avg
import typingsSlinky.devextreme.devextremeStrings.column
import typingsSlinky.devextreme.devextremeStrings.count
import typingsSlinky.devextreme.devextremeStrings.custom
import typingsSlinky.devextreme.devextremeStrings.date
import typingsSlinky.devextreme.devextremeStrings.day
import typingsSlinky.devextreme.devextremeStrings.dayOfWeek
import typingsSlinky.devextreme.devextremeStrings.desc
import typingsSlinky.devextreme.devextremeStrings.displayText
import typingsSlinky.devextreme.devextremeStrings.exclude
import typingsSlinky.devextreme.devextremeStrings.filter
import typingsSlinky.devextreme.devextremeStrings.include
import typingsSlinky.devextreme.devextremeStrings.max
import typingsSlinky.devextreme.devextremeStrings.min
import typingsSlinky.devextreme.devextremeStrings.month
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.number
import typingsSlinky.devextreme.devextremeStrings.percentOfColumnGrandTotal
import typingsSlinky.devextreme.devextremeStrings.percentOfColumnTotal
import typingsSlinky.devextreme.devextremeStrings.percentOfGrandTotal
import typingsSlinky.devextreme.devextremeStrings.percentOfRowGrandTotal
import typingsSlinky.devextreme.devextremeStrings.percentOfRowTotal
import typingsSlinky.devextreme.devextremeStrings.percentVariation
import typingsSlinky.devextreme.devextremeStrings.quarter
import typingsSlinky.devextreme.devextremeStrings.row
import typingsSlinky.devextreme.devextremeStrings.string_
import typingsSlinky.devextreme.devextremeStrings.sum
import typingsSlinky.devextreme.devextremeStrings.value
import typingsSlinky.devextreme.devextremeStrings.year
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGridSummaryCell
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGridDataSourceField extends js.Object {
  /** Specifies whether to take neighboring groups' summary values into account when calculating a running total and absolute or percent variation. */
  var allowCrossGroupCalculation: js.UndefOr[Boolean] = js.native
  /** Specifies whether a user can expand/collapse all items within the same column or row header level using the context menu. */
  var allowExpandAll: js.UndefOr[Boolean] = js.native
  /** Specifies whether a user can filter the field's values. */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /** Specifies whether a user can change the field's sorting. */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** Specifies whether a user can sort the pivot grid by summary values instead of field values. */
  var allowSortingBySummary: js.UndefOr[Boolean] = js.native
  /** Specifies the field's area. */
  var area: js.UndefOr[column | typingsSlinky.devextreme.devextremeStrings.data | filter | row] = js.native
  /** Specifies the field's order among the other fields in the same area. Corresponds to the field's order in the fields array by default. */
  var areaIndex: js.UndefOr[Double] = js.native
  /** Specifies a custom aggregate function. Applies only if the summaryType is "custom" and the remoteOperations is false. Cannot be used with an XmlaStore. */
  var calculateCustomSummary: js.UndefOr[js.Function1[/* options */ SummaryProcess, _]] = js.native
  /** Specifies a custom post-processing function for summary values. */
  var calculateSummaryValue: js.UndefOr[js.Function1[/* e */ dxPivotGridSummaryCell, Double]] = js.native
  /** Specifies the field's caption to be displayed in the field chooser and on the field panel. */
  var caption: js.UndefOr[String] = js.native
  /** Customizes the text displayed in summary cells. */
  var customizeText: js.UndefOr[js.Function1[/* cellInfo */ Value, String]] = js.native
  /** Specifies which data source field provides data for the pivot grid field. */
  var dataField: js.UndefOr[String] = js.native
  /** Casts field values to a specific data type. */
  var dataType: js.UndefOr[date | number | string_] = js.native
  /** Specifies the name of the folder in which the field is located when displayed in the field chooser. */
  var displayFolder: js.UndefOr[String] = js.native
  /** Specifies whether to expand all items within the field's header level. */
  var expanded: js.UndefOr[Boolean] = js.native
  /** Specifies whether a user changes the current filter by including (selecting) or excluding (clearing the selection of) values. */
  var filterType: js.UndefOr[exclude | include] = js.native
  /** Specifies the values by which the field is filtered. */
  var filterValues: js.UndefOr[js.Array[_]] = js.native
  /** Formats field values before they are displayed. */
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
  /** Specifies the field's index within its group. */
  var groupIndex: js.UndefOr[Double] = js.native
  /** Specifies how the field's values are combined into groups for the headers. Cannot be used with an XmlaStore. */
  var groupInterval: js.UndefOr[day | dayOfWeek | month | quarter | year | Double] = js.native
  /** Specifies the name of the field's group. */
  var groupName: js.UndefOr[String] = js.native
  /** Configures the field's header filter. */
  var headerFilter: js.UndefOr[AllowSearch] = js.native
  /** Specifies whether the field should be treated as a measure (a field providing data for calculation). */
  var isMeasure: js.UndefOr[Boolean] = js.native
  /** Specifies the field's identifier. */
  var name: js.UndefOr[String] = js.native
  /** Specifies whether to calculate the running total by rows or by columns. */
  var runningTotal: js.UndefOr[column | row] = js.native
  /** Specifies a function that combines the field's values into groups for the headers. Cannot be used with an XmlaStore or remote operations. */
  var selector: js.UndefOr[js.Function] = js.native
  /** Specifies whether to display the field's grand totals. Applies only if the field is in the data area. */
  var showGrandTotals: js.UndefOr[Boolean] = js.native
  /** Specifies whether to display the field's totals. */
  var showTotals: js.UndefOr[Boolean] = js.native
  /** Specifies whether to display the field's summary values. Applies only if the field is in the data area. Inherits the showTotals' value by default. */
  var showValues: js.UndefOr[Boolean] = js.native
  /** Specifies how the field's values in the headers should be sorted. */
  var sortBy: js.UndefOr[displayText | value | none] = js.native
  /** Sorts the field's values in the headers by the specified measure's summary values. Accepts the measure's name, caption, dataField, or index in the fields array. */
  var sortBySummaryField: js.UndefOr[String] = js.native
  /** Specifies a path to the column or row whose summary values should be used to sort the field's values in the headers. */
  var sortBySummaryPath: js.UndefOr[js.Array[Double | String]] = js.native
  /** Specifies the field values' sorting order. */
  var sortOrder: js.UndefOr[asc | desc] = js.native
  /** Specifies a custom comparison function that sorts the field's values in the headers. */
  var sortingMethod: js.UndefOr[js.Function2[/* a */ Children, /* b */ Children, Double]] = js.native
  /** Specifies a predefined post-processing function. Does not apply when the calculateSummaryValue option is set. */
  var summaryDisplayMode: js.UndefOr[
    absoluteVariation | percentOfColumnGrandTotal | percentOfColumnTotal | percentOfGrandTotal | percentOfRowGrandTotal | percentOfRowTotal | percentVariation
  ] = js.native
  /** Specifies how to aggregate the field's data. Cannot be used with an XmlaStore. */
  var summaryType: js.UndefOr[avg | count | custom | max | min | sum | String] = js.native
  /** Specifies whether the field is visible in the pivot grid and field chooser. */
  var visible: js.UndefOr[Boolean] = js.native
  /** Specifies the field's width in pixels when the field is displayed in the pivot grid. */
  var width: js.UndefOr[Double] = js.native
  /** Specifies whether text that does not fit into a header item should be wrapped. */
  var wordWrapEnabled: js.UndefOr[Boolean] = js.native
}

object PivotGridDataSourceField {
  @scala.inline
  def apply(): PivotGridDataSourceField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridDataSourceField]
  }
  @scala.inline
  implicit class PivotGridDataSourceFieldOps[Self <: PivotGridDataSourceField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCrossGroupCalculation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCrossGroupCalculation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCrossGroupCalculation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCrossGroupCalculation")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowExpandAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExpandAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowExpandAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExpandAll")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSortingBySummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSortingBySummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSortingBySummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSortingBySummary")(js.undefined)
        ret
    }
    @scala.inline
    def withArea(value: column | typingsSlinky.devextreme.devextremeStrings.data | filter | row): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(js.undefined)
        ret
    }
    @scala.inline
    def withAreaIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreaIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculateCustomSummary(value: /* options */ SummaryProcess => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateCustomSummary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalculateCustomSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateCustomSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculateSummaryValue(value: /* e */ dxPivotGridSummaryCell => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateSummaryValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalculateSummaryValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateSummaryValue")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeText(value: /* cellInfo */ Value => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.undefined)
        ret
    }
    @scala.inline
    def withDataField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataType(value: date | number | string_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterType(value: exclude | include): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValues")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFunction1(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupInterval(value: day | dayOfWeek | month | quarter | year | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFilter(value: AllowSearch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMeasure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMeasure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMeasure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMeasure")(js.undefined)
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
    def withRunningTotal(value: column | row): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunningTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGrandTotals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGrandTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGrandTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGrandTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTotals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withShowValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValues")(js.undefined)
        ret
    }
    @scala.inline
    def withSortBy(value: displayText | value | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSortBySummaryField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBySummaryField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortBySummaryField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBySummaryField")(js.undefined)
        ret
    }
    @scala.inline
    def withSortBySummaryPath(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBySummaryPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortBySummaryPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBySummaryPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: asc | desc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSortingMethod(value: (/* a */ Children, /* b */ Children) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingMethod")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSortingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryDisplayMode(
      value: absoluteVariation | percentOfColumnGrandTotal | percentOfColumnTotal | percentOfGrandTotal | percentOfRowGrandTotal | percentOfRowTotal | percentVariation
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryDisplayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryDisplayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryType(value: avg | count | custom | max | min | sum | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryType")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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
    @scala.inline
    def withWordWrapEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrapEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapEnabled")(js.undefined)
        ret
    }
  }
  
}

