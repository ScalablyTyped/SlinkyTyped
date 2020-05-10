package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridGroupByColumnSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Enables/disables grouping a column from the UI. By default all columns can be grouped.
  	 *
  	 */
  var allowGrouping: js.UndefOr[Boolean] = js.native
  /**
  	 * Reference/name of a function (string or function) used for custom comparison.
  	 * The function accepts the following arguments:
  	 * val1 - the first value to compare
  	 * val2 - the second value to compare
  	 * recordsData - an object having three properties: fieldName - the name of the sorted field; record1 - first record to compare; record2 - second record to compare
  	 * The function returns the following numeric value:
  	 * 0 - indicating that values are equal
  	 * 1 - indicating that val1 > val2
  	 * -1 - indicating that val1 < val2
  	 *
  	 *
  	 * Valid values:
  	 * "string" the name of the function as a string located in the global window object.
  	 * "function" function which will be used for custom comparison.
  	 */
  var compareFunc: js.UndefOr[String | js.Function] = js.native
  /**
  	 * Specifies the sort order - ascending or descending when the column is initially grouped ([isGroupBy](ui.iggridgroupby#options:columnSettings.isGroupBy) = true).
  	 *
  	 */
  var dir: js.UndefOr[js.Any] = js.native
  /**
  	 * Specifies a custom group by function, which accepts the column setting, the first and the second value to compare and returns bool. This option is deprecated - please use option [compareFunc](ui.iggridgroupby#options:columnSettings.compareFunc) instead.
  	 */
  var groupComparerFunction: js.UndefOr[js.Function] = js.native
  /**
  	 * Reference/name of a function (string or function) which will be used for formatting the cell values. The function should accept a value from the grouped column and return the new formatted value in the label of the row.
  	 *
  	 *
  	 * Valid values:
  	 * "string" the name of the function as a string located in the global window object.
  	 * "function" which will be used for formatting the cell values.
  	 */
  var groupLabelFormatter: js.UndefOr[String | js.Function] = js.native
  /**
  	 * Enables/disables default summaries per group data island or specifies summaries that are applied to specific column no matter the group.
  	 *
  	 */
  var groupSummaries: js.UndefOr[js.Any] = js.native
  /**
  	 * Specifies the initial column grouped state.
  	 *
  	 */
  var isGroupBy: js.UndefOr[Boolean] = js.native
  /**
  	 * A list of aggregation functions to calculate on the column values for each group. When not specified the default aggregate function is "count".
  	 *
  	 */
  var summaries: js.UndefOr[IgGridGroupByColumnSettingsSummaries] = js.native
}

object IgGridGroupByColumnSettings {
  @scala.inline
  def apply(): IgGridGroupByColumnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridGroupByColumnSettings]
  }
  @scala.inline
  implicit class IgGridGroupByColumnSettingsOps[Self <: IgGridGroupByColumnSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareFunc(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupComparerFunction(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupComparerFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupComparerFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupComparerFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupLabelFormatter(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupLabelFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupLabelFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupLabelFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSummaries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGroupBy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsGroupBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroupBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaries(value: IgGridGroupByColumnSettingsSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaries")(js.undefined)
        ret
    }
  }
  
}

