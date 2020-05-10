package typingsSlinky.muiDatatables.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTablePopover extends js.Object {
  var action: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var anchorEl: js.UndefOr[TagMod[Any]] = js.native
  var anchorOrigin: js.UndefOr[js.Any] = js.native
  var elevation: js.UndefOr[Double] = js.native
  var onClose: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var onExited: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  var option: js.UndefOr[Boolean] = js.native
  var ref: js.UndefOr[js.Any] = js.native
  var transformOrigin: js.UndefOr[js.Any] = js.native
}

object MUIDataTablePopover {
  @scala.inline
  def apply(): MUIDataTablePopover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTablePopover]
  }
  @scala.inline
  implicit class MUIDataTablePopoverOps[Self <: MUIDataTablePopover] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorElReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchorEl(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorEl")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorOrigin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withElevation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElevation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExited(value: /* args */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExited")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExited")(js.undefined)
        ret
    }
    @scala.inline
    def withOption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(js.undefined)
        ret
    }
    @scala.inline
    def withRef(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformOrigin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOrigin")(js.undefined)
        ret
    }
  }
  
}

