package typingsSlinky.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableToolbarSelect extends js.Object {
  var classes: js.UndefOr[js.Object] = js.native
  var displayData: js.UndefOr[js.Any] = js.native
  var onRowsDelete: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var options: js.Object = js.native
  var rowSelected: js.UndefOr[Boolean] = js.native
  var selectRowUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
}

object MUIDataTableToolbarSelect {
  @scala.inline
  def apply(options: js.Object): MUIDataTableToolbarSelect = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableToolbarSelect]
  }
  @scala.inline
  implicit class MUIDataTableToolbarSelectOps[Self <: MUIDataTableToolbarSelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDisplayData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowsDelete(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowsDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectRowUpdate(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRowUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectRowUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRowUpdate")(js.undefined)
        ret
    }
  }
  
}

