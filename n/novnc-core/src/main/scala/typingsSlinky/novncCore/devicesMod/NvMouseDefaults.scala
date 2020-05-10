package typingsSlinky.novncCore.devicesMod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NvMouseDefaults extends js.Object {
  var focused: js.UndefOr[Boolean] = js.native
  var onMouseButton: js.UndefOr[
    js.Function4[/* x */ Double, /* y */ Double, /* down */ Boolean, /* bmask */ Double, Unit]
  ] = js.native
  var onMouseMove: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.native
  var target: js.UndefOr[Element] = js.native
  var touchButton: js.UndefOr[Double] = js.native
}

object NvMouseDefaults {
  @scala.inline
  def apply(): NvMouseDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NvMouseDefaults]
  }
  @scala.inline
  implicit class NvMouseDefaultsOps[Self <: NvMouseDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseButton(value: (/* x */ Double, /* y */ Double, /* down */ Boolean, /* bmask */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseButton")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnMouseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: (/* x */ Double, /* y */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchButton(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchButton")(js.undefined)
        ret
    }
  }
  
}

