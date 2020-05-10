package typingsSlinky.antd

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLeavedClassName extends js.Object {
  var leavedClassName: js.UndefOr[String] = js.native
  var motionAppear: Boolean = js.native
  var motionEnter: js.UndefOr[Boolean] = js.native
  var motionLeave: js.UndefOr[Boolean] = js.native
  var motionLeaveImmediately: js.UndefOr[Boolean] = js.native
  var motionName: js.UndefOr[String] = js.native
  var onAppearActive: js.UndefOr[js.Function1[/* element */ HTMLElement, CSSProperties]] = js.native
  var onAppearEnd: js.UndefOr[js.Function1[/* element */ HTMLElement, CSSProperties]] = js.native
  var onAppearStart: js.UndefOr[js.Function1[/* element */ HTMLElement, CSSProperties]] = js.native
  var onEnterActive: js.UndefOr[js.Function1[/* element */ HTMLElement, CSSProperties]] = js.native
  var onEnterEnd: js.UndefOr[js.Function1[/* element */ HTMLElement, CSSProperties]] = js.native
  var onEnterStart: js.UndefOr[js.Function1[/* element */ HTMLElement, CSSProperties]] = js.native
  var onLeaveActive: js.UndefOr[js.Function1[/* element */ HTMLElement, CSSProperties]] = js.native
  var onLeaveEnd: js.UndefOr[js.Function1[/* element */ HTMLElement, CSSProperties]] = js.native
  var onLeaveStart: js.UndefOr[js.Function1[/* element */ HTMLElement, CSSProperties]] = js.native
  var removeOnLeave: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object AnonLeavedClassName {
  @scala.inline
  def apply(motionAppear: Boolean): AnonLeavedClassName = {
    val __obj = js.Dynamic.literal(motionAppear = motionAppear.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeavedClassName]
  }
  @scala.inline
  implicit class AnonLeavedClassNameOps[Self <: AnonLeavedClassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMotionAppear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionAppear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeavedClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavedClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeavedClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavedClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionLeave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionLeave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionLeaveImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionLeaveImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionLeaveImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionLeaveImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppearActive(value: /* element */ HTMLElement => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppearActive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAppearActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppearActive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppearEnd(value: /* element */ HTMLElement => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppearEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAppearEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppearEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppearStart(value: /* element */ HTMLElement => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppearStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAppearStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppearStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnterActive(value: /* element */ HTMLElement => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterActive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnterActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterActive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnterEnd(value: /* element */ HTMLElement => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnterEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnterStart(value: /* element */ HTMLElement => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnterStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeaveActive(value: /* element */ HTMLElement => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeaveActive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLeaveActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeaveActive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeaveEnd(value: /* element */ HTMLElement => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeaveEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLeaveEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeaveEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeaveStart(value: /* element */ HTMLElement => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeaveStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLeaveStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeaveStart")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveOnLeave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnLeave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveOnLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

