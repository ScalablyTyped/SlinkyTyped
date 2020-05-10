package typingsSlinky.reactNativeModalPopover.popoverControllerMod

import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverControllerRenderProps extends js.Object {
  var popoverAnchorRect: Rect = js.native
  var popoverVisible: Boolean = js.native
  def closePopover(): Unit = js.native
  def openPopover(): Unit = js.native
  def setPopoverAnchor(ref: js.Any): Unit = js.native
}

object PopoverControllerRenderProps {
  @scala.inline
  def apply(
    closePopover: () => Unit,
    openPopover: () => Unit,
    popoverAnchorRect: Rect,
    popoverVisible: Boolean,
    setPopoverAnchor: js.Any => Unit
  ): PopoverControllerRenderProps = {
    val __obj = js.Dynamic.literal(closePopover = js.Any.fromFunction0(closePopover), openPopover = js.Any.fromFunction0(openPopover), popoverAnchorRect = popoverAnchorRect.asInstanceOf[js.Any], popoverVisible = popoverVisible.asInstanceOf[js.Any], setPopoverAnchor = js.Any.fromFunction1(setPopoverAnchor))
    __obj.asInstanceOf[PopoverControllerRenderProps]
  }
  @scala.inline
  implicit class PopoverControllerRenderPropsOps[Self <: PopoverControllerRenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosePopover(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePopover")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpenPopover(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openPopover")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPopoverAnchorRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverAnchorRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopoverVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetPopoverAnchor(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPopoverAnchor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

