package typingsSlinky.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableResize extends js.Object {
  var classes: js.UndefOr[js.Object] = js.native
  var options: js.UndefOr[js.Object] = js.native
  var rowSelected: js.UndefOr[Boolean] = js.native
  var setResizeable: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var updateDividers: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
}

object MUIDataTableResize {
  @scala.inline
  def apply(): MUIDataTableResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableResize]
  }
  @scala.inline
  implicit class MUIDataTableResizeOps[Self <: MUIDataTableResize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
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
    def withSetResizeable(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResizeable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetResizeable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResizeable")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDividers(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDividers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateDividers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDividers")(js.undefined)
        ret
    }
  }
  
}

