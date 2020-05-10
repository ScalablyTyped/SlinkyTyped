package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualFilters  :boolean,   disableFilters  :boolean,   defaultCanFilter  :boolean,   filterTypes  :react-table.react-table.FilterTypes<D>,   autoResetFilters ? :boolean}> */
@js.native
trait UseFiltersOptions[D /* <: js.Object */] extends js.Object {
  var autoResetFilters: js.UndefOr[Boolean] = js.native
  var defaultCanFilter: js.UndefOr[Boolean] = js.native
  var disableFilters: js.UndefOr[Boolean] = js.native
  var filterTypes: js.UndefOr[FilterTypes[D]] = js.native
  var manualFilters: js.UndefOr[Boolean] = js.native
}

object UseFiltersOptions {
  @scala.inline
  def apply[D](): UseFiltersOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseFiltersOptions[D]]
  }
  @scala.inline
  implicit class UseFiltersOptionsOps[Self[d] <: UseFiltersOptions[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAutoResetFilters(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResetFilters: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCanFilter(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCanFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCanFilter: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCanFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFilters(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFilters: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterTypes(value: FilterTypes[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterTypes: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withManualFilters(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualFilters: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualFilters")(js.undefined)
        ret
    }
  }
  
}

