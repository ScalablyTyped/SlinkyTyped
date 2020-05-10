package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceFilters extends DataSourceFilter {
  var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.native
  var logic: js.UndefOr[String] = js.native
}

object DataSourceFilters {
  @scala.inline
  def apply(): DataSourceFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceFilters]
  }
  @scala.inline
  implicit class DataSourceFiltersOps[Self <: DataSourceFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[DataSourceFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withLogic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logic")(js.undefined)
        ret
    }
  }
  
}

