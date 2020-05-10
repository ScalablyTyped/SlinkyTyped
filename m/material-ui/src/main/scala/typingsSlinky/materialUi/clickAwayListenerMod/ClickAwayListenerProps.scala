package typingsSlinky.materialUi.clickAwayListenerMod

import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickAwayListenerProps extends Props[ClickAwayListener] {
  var onClickAway: js.UndefOr[js.Any] = js.native
}

object ClickAwayListenerProps {
  @scala.inline
  def apply(): ClickAwayListenerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickAwayListenerProps]
  }
  @scala.inline
  implicit class ClickAwayListenerPropsOps[Self <: ClickAwayListenerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClickAway(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickAway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClickAway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickAway")(js.undefined)
        ret
    }
  }
  
}

