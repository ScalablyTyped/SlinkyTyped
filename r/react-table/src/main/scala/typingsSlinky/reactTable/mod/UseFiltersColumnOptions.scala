package typingsSlinky.reactTable.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  Filter  :react-table.react-table.Renderer<react-table.react-table.FilterProps<D>>,   disableFilters  :boolean,   defaultCanFilter  :boolean,   filter  :react-table.react-table.FilterType<D> | react-table.react-table.DefaultFilterTypes | string}> */
@js.native
trait UseFiltersColumnOptions[D /* <: js.Object */] extends js.Object {
  var Filter: js.UndefOr[Renderer[FilterProps[D]]] = js.native
  var defaultCanFilter: js.UndefOr[Boolean] = js.native
  var disableFilters: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[FilterType[D] | DefaultFilterTypes | String] = js.native
}

object UseFiltersColumnOptions {
  @scala.inline
  def apply[D](): UseFiltersColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseFiltersColumnOptions[D]]
  }
  @scala.inline
  implicit class UseFiltersColumnOptionsOps[Self[d] <: UseFiltersColumnOptions[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withFilterReactElement(value: ReactElement): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterFunctionComponent(value: ReactComponentClass[FilterProps[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterComponentClass(value: ReactComponentClass[FilterProps[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: Renderer[FilterProps[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(js.undefined)
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
  }
  
}

