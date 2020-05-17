package typingsSlinky.grommet.dropButtonMod

import slinky.core.facade.ReactElement
import typingsSlinky.grommet.anon.Left
import typingsSlinky.grommet.dropMod.DropProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropButtonProps extends js.Object {
  var dropAlign: js.UndefOr[Left] = js.native
  var dropContent: ReactElement = js.native
  var dropProps: js.UndefOr[DropProps] = js.native
  var dropTarget: js.UndefOr[js.Object] = js.native
  var onClose: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var open: js.UndefOr[Boolean] = js.native
}

object DropButtonProps {
  @scala.inline
  def apply(dropContent: ReactElement): DropButtonProps = {
    val __obj = js.Dynamic.literal(dropContent = dropContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropButtonProps]
  }
  @scala.inline
  implicit class DropButtonPropsOps[Self <: DropButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropContent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropAlign(value: Left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withDropProps(value: DropProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDropTarget(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* repeated */ js.Any => _): Self = {
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
    def withOnOpen(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
  }
  
}

