package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridSortingColumnSetting
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Enables/disables sorting on the specified column. By default all columns are sortable.
  	 *
  	 */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /**
  	 * Identifies the grid column by index. Either key or index must be set in every column setting.
  	 *
  	 */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
  	 * Identifies the grid column by key. Either key or index must be set in every column setting.
  	 *
  	 */
  var columnKey: js.UndefOr[String] = js.native
  /**
  	 * Reference to a function (string or function) used for custom comparison.
  	 * The function accepts the following arguments:
  	 * val1 - the first value to compare,
  	 * val2 - the second value to compare,
  	 * recordsData (optional) - an object having three properties: fieldName - the name of the sorted field; record1 - first record to compare; record2 - second record to compare.
  	 * The function returns the following numeric value:
  	 * 0 - indicating that values are equal,
  	 * 1 - indicating that val1 > val2,
  	 * -1 - indicating that val1 < val2.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The name of the function as a string located in the global window object.
  	 * "function" Function which will be used for custom comparison.
  	 */
  var compareFunc: js.UndefOr[String | js.Function] = js.native
  /**
  	 * The current (or default) sort direction. If this setting is specified, the column will be rendered sorted according to this option.
  	 *
  	 *
  	 * Valid values:
  	 * "asc" The initial sort of the column data will be in ascending order.
  	 * "desc" The initial sort of the column data will be in descending order.
  	 */
  var currentSortDirection: js.UndefOr[String] = js.native
  /**
  	 * This will be the first sort direction when the column hasn't been sorted before.
  	 *
  	 *
  	 * Valid values:
  	 * "asc" The first sort of the column data will be in ascending order.
  	 * "desc" The first sort of the column data will be in descending order.
  	 */
  var firstSortDirection: js.UndefOr[String] = js.native
}

object IgGridSortingColumnSetting {
  @scala.inline
  def apply(): IgGridSortingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSortingColumnSetting]
  }
  @scala.inline
  implicit class IgGridSortingColumnSettingOps[Self <: IgGridSortingColumnSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(js.undefined)
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
    def withCurrentSortDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSortDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstSortDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSortDirection")(js.undefined)
        ret
    }
  }
  
}

