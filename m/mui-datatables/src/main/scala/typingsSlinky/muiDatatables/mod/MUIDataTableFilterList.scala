package typingsSlinky.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableFilterList extends js.Object {
  var classes: js.UndefOr[js.Object] = js.native
  var filterList: js.Array[js.Array[String]] = js.native
  var onFilterUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
}

object MUIDataTableFilterList {
  @scala.inline
  def apply(filterList: js.Array[js.Array[String]]): MUIDataTableFilterList = {
    val __obj = js.Dynamic.literal(filterList = filterList.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableFilterList]
  }
  @scala.inline
  implicit class MUIDataTableFilterListOps[Self <: MUIDataTableFilterList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterList(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterList")(value.asInstanceOf[js.Any])
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

