package typingsSlinky.reactMotionUiPack.mod.Transition

import slinky.core.facade.ReactElement
import typingsSlinky.reactMotion.mod.PlainStyle
import typingsSlinky.reactMotion.mod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionProps extends js.Object {
  var appear: js.UndefOr[Style] = js.native
  var component: js.UndefOr[String | Boolean | ReactElement] = js.native
  var enter: js.UndefOr[Style] = js.native
  var leave: js.UndefOr[Style] = js.native
  var onEnter: js.UndefOr[js.Function1[/* style */ PlainStyle, Unit]] = js.native
  var onLeave: js.UndefOr[js.Function1[/* style */ Style, Unit]] = js.native
  var runOnMount: js.UndefOr[Boolean] = js.native
}

object TransitionProps {
  @scala.inline
  def apply(): TransitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionProps]
  }
  @scala.inline
  implicit class TransitionPropsOps[Self <: TransitionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppear(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appear")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: String | Boolean | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withEnter(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withLeave(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnter(value: /* style */ PlainStyle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeave(value: /* style */ Style => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withRunOnMount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOnMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOnMount")(js.undefined)
        ret
    }
  }
  
}

