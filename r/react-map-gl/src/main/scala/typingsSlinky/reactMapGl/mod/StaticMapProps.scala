package typingsSlinky.reactMapGl.mod

import typingsSlinky.reactMapGl.AnonHeight
import typingsSlinky.reactMapGl.AnonMaxPitch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticMapProps extends MapboxProps {
  var className: js.UndefOr[String] = js.native
  var disableTokenWarning: js.UndefOr[Boolean] = js.native
  var onResize: js.UndefOr[js.Function1[/* dimensions */ AnonHeight, Unit]] = js.native
  var preventStyleDiffing: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var visibilityConstraints: js.UndefOr[AnonMaxPitch] = js.native
}

object StaticMapProps {
  @scala.inline
  def apply(height: Double | String, width: Double | String): StaticMapProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapProps]
  }
  @scala.inline
  implicit class StaticMapPropsOps[Self <: StaticMapProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTokenWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTokenWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTokenWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTokenWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: /* dimensions */ AnonHeight => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventStyleDiffing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventStyleDiffing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventStyleDiffing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventStyleDiffing")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibilityConstraints(value: AnonMaxPitch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibilityConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityConstraints")(js.undefined)
        ret
    }
  }
  
}

