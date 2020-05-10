package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  globalFilter  :(rows : std.Array<react-table.react-table.Row<D>>, columnIds : std.Array<react-table.react-table.IdType<D>>, filterValue : any): std.Array<react-table.react-table.Row<D>> | string,   manualGlobalFilter  :boolean,   filterTypes  :react-table.react-table.FilterTypes<D>,   autoResetGlobalFilter ? :boolean,   disableGlobalFilter ? :boolean}> */
@js.native
trait UseGlobalFiltersOptions[D /* <: js.Object */] extends js.Object {
  var autoResetGlobalFilter: js.UndefOr[Boolean] = js.native
  var disableGlobalFilter: js.UndefOr[Boolean] = js.native
  var filterTypes: js.UndefOr[FilterTypes[D]] = js.native
  var globalFilter: js.UndefOr[
    (js.Function3[
      /* rows */ js.Array[Row[D]], 
      /* columnIds */ js.Array[IdType[D]], 
      /* filterValue */ js.Any, 
      js.Array[Row[D]]
    ]) | String
  ] = js.native
  var manualGlobalFilter: js.UndefOr[Boolean] = js.native
}

object UseGlobalFiltersOptions {
  @scala.inline
  def apply[D](): UseGlobalFiltersOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseGlobalFiltersOptions[D]]
  }
  @scala.inline
  implicit class UseGlobalFiltersOptionsOps[Self[d] <: UseGlobalFiltersOptions[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAutoResetGlobalFilter(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetGlobalFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResetGlobalFilter: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetGlobalFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableGlobalFilter(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableGlobalFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableGlobalFilter: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableGlobalFilter")(js.undefined)
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
    def withGlobalFilterFunction3(
      value: (/* rows */ js.Array[Row[D]], /* columnIds */ js.Array[IdType[D]], /* filterValue */ js.Any) => js.Array[Row[D]]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalFilter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGlobalFilter(
      value: (js.Function3[
          /* rows */ js.Array[Row[D]], 
          /* columnIds */ js.Array[IdType[D]], 
          /* filterValue */ js.Any, 
          js.Array[Row[D]]
        ]) | String
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalFilter: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withManualGlobalFilter(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualGlobalFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualGlobalFilter: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualGlobalFilter")(js.undefined)
        ret
    }
  }
  
}

