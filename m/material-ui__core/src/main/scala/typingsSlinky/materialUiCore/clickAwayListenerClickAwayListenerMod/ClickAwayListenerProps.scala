package typingsSlinky.materialUiCore.clickAwayListenerClickAwayListenerMod

import slinky.core.TagMod
import typingsSlinky.materialUiCore.materialUiCoreBooleans.`false`
import typingsSlinky.materialUiCore.materialUiCoreStrings.onClick
import typingsSlinky.materialUiCore.materialUiCoreStrings.onMouseDown
import typingsSlinky.materialUiCore.materialUiCoreStrings.onMouseUp
import typingsSlinky.materialUiCore.materialUiCoreStrings.onTouchEnd
import typingsSlinky.materialUiCore.materialUiCoreStrings.onTouchStart
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickAwayListenerProps extends js.Object {
  var children: TagMod[Any] = js.native
  var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.native
  var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.native
  def onClickAway(event: ChangeEvent[js.Object]): Unit = js.native
}

object ClickAwayListenerProps {
  @scala.inline
  def apply(onClickAway: ChangeEvent[js.Object] => Unit): ClickAwayListenerProps = {
    val __obj = js.Dynamic.literal(onClickAway = js.Any.fromFunction1(onClickAway))
    __obj.asInstanceOf[ClickAwayListenerProps]
  }
  @scala.inline
  implicit class ClickAwayListenerPropsOps[Self <: ClickAwayListenerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClickAway(value: ChangeEvent[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickAway")(js.Any.fromFunction1(value))
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
    def withMouseEvent(value: onClick | onMouseDown | onMouseUp | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchEvent(value: onTouchStart | onTouchEnd | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEvent")(js.undefined)
        ret
    }
  }
  
}

