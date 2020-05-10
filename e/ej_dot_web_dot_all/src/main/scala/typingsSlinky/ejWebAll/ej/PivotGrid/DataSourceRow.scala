package typingsSlinky.ejWebAll.ej.PivotGrid

import typingsSlinky.ejWebAll.ej.PivotAnalysis.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceRow extends js.Object {
  /** Allows you to filter the report by using the advanced filtering (e.g., Microsoft Excel) option for the OLAP data source in client-mode.
    * @Default {[]}
    */
  var advancedFilter: js.UndefOr[js.Array[DataSourceRowsAdvancedFilter]] = js.native
  /** Allows you to set the custom theme for row headers.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Allows you to set the delimiter for date type format in the formatString. This is applicable for the groupByDate in row/column headers.
    */
  var delimiter: js.UndefOr[String] = js.native
  /** Contains the list of members need to be drilled down by default in the field.
    * @Default {[]}
    */
  var drilledItems: js.UndefOr[js.Array[_]] = js.native
  /** Allows you to set the display caption for the item.
    */
  var fieldCaption: js.UndefOr[String] = js.native
  /** Allows you to bind the item by using its unique name as field name.
    */
  var fieldName: js.UndefOr[String] = js.native
  /** Applies the filter to field members.
    * @Default {null}
    */
  var filterItems: js.UndefOr[DataSourceRowsFilterItems] = js.native
  /** Allows you to set the format for row headers.
    */
  var format: js.UndefOr[String] = js.native
  /** This property is set to display the formatted values with format types in the PivotGrid.
    */
  var formatString: js.UndefOr[String] = js.native
  /** Allows you to indicate whether the added item is a named set or not.
    * @Default {false}
    */
  var isNamedSets: js.UndefOr[Boolean] = js.native
  /** Shows/hides the sub-total of the field.
    * @Default {true}
    */
  var showSubTotal: js.UndefOr[Boolean] = js.native
  /** Allows you to set the sorting order of members of the field.
    * @Default {ej.PivotAnalysis.SortOrder.Ascending}
    */
  var sortOrder: js.UndefOr[SortOrder | String] = js.native
}

object DataSourceRow {
  @scala.inline
  def apply(): DataSourceRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRow]
  }
  @scala.inline
  implicit class DataSourceRowOps[Self <: DataSourceRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvancedFilter(value: js.Array[DataSourceRowsAdvancedFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvancedFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDrilledItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilledItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrilledItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilledItems")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldCaption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldCaption")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterItems(value: DataSourceRowsFilterItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterItems")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
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
    def withFormatString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatString")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNamedSets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNamedSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNamedSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNamedSets")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSubTotal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSubTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSubTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSubTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: SortOrder | String): Self = {
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
  }
  
}

