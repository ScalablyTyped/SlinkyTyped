package typingsSlinky.ejWebAll.ej.PivotGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceFilter extends js.Object {
  /** Allows the user to bind the item by using its unique name as field name.
    */
  var fieldName: js.UndefOr[String] = js.native
  /** Applies filter to the field members.
    * @Default {null}
    */
  var filterItems: js.UndefOr[DataSourceFiltersFilterItems] = js.native
}

object DataSourceFilter {
  @scala.inline
  def apply(): DataSourceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceFilter]
  }
  @scala.inline
  implicit class DataSourceFilterOps[Self <: DataSourceFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFilterItems(value: DataSourceFiltersFilterItems): Self = {
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
  }
  
}

