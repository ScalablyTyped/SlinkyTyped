package typingsSlinky.reactBootstrap.collapseMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactBootstrap.mod.TransitionCallbacks
import typingsSlinky.reactBootstrap.reactBootstrapStrings.height
import typingsSlinky.reactBootstrap.reactBootstrapStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapseProps
  extends ClassAttributes[Collapse]
     with TransitionCallbacks {
  var dimension: js.UndefOr[height | width | js.Function0[String]] = js.native
  var getDimensionValue: js.UndefOr[js.Function2[/* dimension */ Double, /* element */ ReactElement, Double]] = js.native
  var in: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var transitionAppear: js.UndefOr[Boolean] = js.native
  var unmountOnExit: js.UndefOr[Boolean] = js.native
}

object CollapseProps {
  @scala.inline
  def apply(): CollapseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseProps]
  }
  @scala.inline
  implicit class CollapsePropsOps[Self <: CollapseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDimension(value: height | width | js.Function0[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDimensionValue(value: (/* dimension */ Double, /* element */ ReactElement) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDimensionValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionAppear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionAppear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionAppear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionAppear")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmountOnExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountOnExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmountOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmountOnExit")(js.undefined)
        ret
    }
  }
  
}

