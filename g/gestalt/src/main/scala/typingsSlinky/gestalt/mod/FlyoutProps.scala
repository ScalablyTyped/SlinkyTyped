package typingsSlinky.gestalt.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.gestalt.gestaltStrings.blue
import typingsSlinky.gestalt.gestaltStrings.darkGray
import typingsSlinky.gestalt.gestaltStrings.down
import typingsSlinky.gestalt.gestaltStrings.left
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.orange
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.right
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.up
import typingsSlinky.gestalt.gestaltStrings.white
import typingsSlinky.gestalt.gestaltStrings.xl
import typingsSlinky.gestalt.gestaltStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlyoutProps extends js.Object {
  var anchor: js.Any = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var color: js.UndefOr[blue | orange | red | white | darkGray] = js.native
  var idealDirection: js.UndefOr[up | right | down | left] = js.native
  var positionRelativeToAnchor: js.UndefOr[Boolean] = js.native
  var shouldFocus: js.UndefOr[Boolean] = js.native
  var showCaret: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[xs | sm | md | lg | xl | Double] = js.native
   // ideally a HTMLAnchorElement
  def onDismiss(): Unit = js.native
}

object FlyoutProps {
  @scala.inline
  def apply(anchor: js.Any, onDismiss: () => Unit): FlyoutProps = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[FlyoutProps]
  }
  @scala.inline
  implicit class FlyoutPropsOps[Self <: FlyoutProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: blue | orange | red | white | darkGray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withIdealDirection(value: up | right | down | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idealDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdealDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idealDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionRelativeToAnchor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionRelativeToAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionRelativeToAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionRelativeToAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCaret(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCaret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCaret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCaret")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: xs | sm | md | lg | xl | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

