package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchableWithoutFeedbackPropsIOS extends js.Object {
  /**
    * *(Apple TV only)* TV preferred focus (see documentation for the View component).
    *
    * @platform ios
    */
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  /**
    * *(Apple TV only)* Object with properties to control Apple TV parallax effects.
    *
    * enabled: If true, parallax effects are enabled.  Defaults to true.
    * shiftDistanceX: Defaults to 2.0.
    * shiftDistanceY: Defaults to 2.0.
    * tiltAngle: Defaults to 0.05.
    * magnification: Defaults to 1.0.
    * pressMagnification: Defaults to 1.0.
    * pressDuration: Defaults to 0.3.
    * pressDelay: Defaults to 0.0.
    *
    * @platform ios
    */
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
}

object TouchableWithoutFeedbackPropsIOS {
  @scala.inline
  def apply(): TouchableWithoutFeedbackPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchableWithoutFeedbackPropsIOS]
  }
  @scala.inline
  implicit class TouchableWithoutFeedbackPropsIOSOps[Self <: TouchableWithoutFeedbackPropsIOS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasTVPreferredFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTVPreferredFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasTVPreferredFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTVPreferredFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxProperties(value: TVParallaxProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxProperties")(js.undefined)
        ret
    }
  }
  
}

