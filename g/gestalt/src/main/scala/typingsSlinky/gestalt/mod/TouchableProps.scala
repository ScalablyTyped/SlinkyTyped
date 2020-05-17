package typingsSlinky.gestalt.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.gestalt.anon.EventSyntheticEvent
import typingsSlinky.gestalt.gestaltNumbers.`0`
import typingsSlinky.gestalt.gestaltNumbers.`1`
import typingsSlinky.gestalt.gestaltNumbers.`2`
import typingsSlinky.gestalt.gestaltNumbers.`3`
import typingsSlinky.gestalt.gestaltNumbers.`4`
import typingsSlinky.gestalt.gestaltNumbers.`5`
import typingsSlinky.gestalt.gestaltNumbers.`6`
import typingsSlinky.gestalt.gestaltNumbers.`7`
import typingsSlinky.gestalt.gestaltNumbers.`8`
import typingsSlinky.gestalt.gestaltStrings.circle
import typingsSlinky.gestalt.gestaltStrings.copy
import typingsSlinky.gestalt.gestaltStrings.grab
import typingsSlinky.gestalt.gestaltStrings.grabbing
import typingsSlinky.gestalt.gestaltStrings.move
import typingsSlinky.gestalt.gestaltStrings.noDrop
import typingsSlinky.gestalt.gestaltStrings.pill
import typingsSlinky.gestalt.gestaltStrings.pointer
import typingsSlinky.gestalt.gestaltStrings.zoomIn
import typingsSlinky.gestalt.gestaltStrings.zoomOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchableProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var fullHeight: js.UndefOr[Boolean] = js.native
  var fullWidth: js.UndefOr[Boolean] = js.native
  var mouseCursor: js.UndefOr[copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut] = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* args */ EventSyntheticEvent, Unit]] = js.native
  var onMouseLeave: js.UndefOr[js.Function1[/* args */ EventSyntheticEvent, Unit]] = js.native
  var rounding: js.UndefOr[pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.native
  def onTouch(args: typingsSlinky.gestalt.anon.`3`): Unit = js.native
}

object TouchableProps {
  @scala.inline
  def apply(onTouch: typingsSlinky.gestalt.anon.`3` => Unit): TouchableProps = {
    val __obj = js.Dynamic.literal(onTouch = js.Any.fromFunction1(onTouch))
    __obj.asInstanceOf[TouchableProps]
  }
  @scala.inline
  implicit class TouchablePropsOps[Self <: TouchableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnTouch(value: typingsSlinky.gestalt.anon.`3` => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouch")(js.Any.fromFunction1(value))
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
    def withFullHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFullWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseCursor(value: copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: /* args */ EventSyntheticEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: /* args */ EventSyntheticEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withRounding(value: pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRounding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounding")(js.undefined)
        ret
    }
  }
  
}

