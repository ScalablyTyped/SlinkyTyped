package typingsSlinky.reactNativeElements.mod

import typingsSlinky.reactNative.mod.TouchableWithoutFeedbackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleProps extends TouchableWithoutFeedbackProps {
  var activeScale: js.UndefOr[Double] = js.native
  var defaultNumber: js.UndefOr[Double] = js.native
  var friction: js.UndefOr[Double] = js.native
  var pressInFriction: js.UndefOr[Double] = js.native
  var pressInTension: js.UndefOr[Double] = js.native
  var pressOutFriction: js.UndefOr[Double] = js.native
  var pressOutTension: js.UndefOr[Double] = js.native
  var tension: js.UndefOr[Double] = js.native
  var useNativeDriver: js.UndefOr[Boolean] = js.native
}

object ScaleProps {
  @scala.inline
  def apply(): ScaleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleProps]
  }
  @scala.inline
  implicit class ScalePropsOps[Self <: ScaleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeScale")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(js.undefined)
        ret
    }
    @scala.inline
    def withPressInFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressInFriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressInFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressInFriction")(js.undefined)
        ret
    }
    @scala.inline
    def withPressInTension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressInTension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressInTension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressInTension")(js.undefined)
        ret
    }
    @scala.inline
    def withPressOutFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressOutFriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressOutFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressOutFriction")(js.undefined)
        ret
    }
    @scala.inline
    def withPressOutTension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressOutTension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressOutTension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressOutTension")(js.undefined)
        ret
    }
    @scala.inline
    def withTension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tension")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNativeDriver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeDriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeDriver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeDriver")(js.undefined)
        ret
    }
  }
  
}

