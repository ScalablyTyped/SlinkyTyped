package typingsSlinky.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceRowsAdvancedFilter extends js.Object {
  /** Allows you to set the filtering type while performing the advanced filtering.
    */
  var advancedFilterType: js.UndefOr[String] = js.native
  /** Allows you to set the operator to perform the label filtering.
    * @Default {none}
    */
  var labelFilterOperator: js.UndefOr[String] = js.native
  /** In value filtering, this property contains the measure name to which the filter is applied.
    */
  var measure: js.UndefOr[String] = js.native
  /** Allows you to provide the level unique name to perform the advanced filtering.
    */
  var name: js.UndefOr[String] = js.native
  /** Allows you to set the operator to perform the value filtering.
    * @Default {none}
    */
  var valueFilterOperator: js.UndefOr[String] = js.native
  /** Allows you to hold the filter operand values in the advanced filtering.
    */
  var values: js.UndefOr[js.Array[_]] = js.native
}

object DataSourceRowsAdvancedFilter {
  @scala.inline
  def apply(): DataSourceRowsAdvancedFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRowsAdvancedFilter]
  }
  @scala.inline
  implicit class DataSourceRowsAdvancedFilterOps[Self <: DataSourceRowsAdvancedFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvancedFilterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedFilterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvancedFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedFilterType")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFilterOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFilterOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFilterOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFilterOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(js.undefined)
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
    def withValueFilterOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFilterOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFilterOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFilterOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

