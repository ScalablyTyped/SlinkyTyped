package typingsSlinky.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableFilter extends js.Object {
  var classes: js.UndefOr[js.Object] = js.native
  var filterData: js.Array[_] = js.native
  var filterList: js.UndefOr[js.Array[js.Array[String]]] = js.native
  var onFilterRest: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var onFilterUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var options: js.Object = js.native
}

object MUIDataTableFilter {
  @scala.inline
  def apply(filterData: js.Array[_], options: js.Object): MUIDataTableFilter = {
    val __obj = js.Dynamic.literal(filterData = filterData.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableFilter]
  }
  @scala.inline
  implicit class MUIDataTableFilterOps[Self <: MUIDataTableFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClasses(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterList(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterList")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilterRest(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterRest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilterRest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterRest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilterUpdate(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilterUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterUpdate")(js.undefined)
        ret
    }
  }
  
}

