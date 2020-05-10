package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TVViewPropsIOS extends js.Object {
  /**
    * *(Apple TV only)* May be set to true to force the Apple TV focus engine to move focus to this view.
    *
    * @platform ios
    */
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  /**
    * *(Apple TV only)* When set to true, this view will be focusable
    * and navigable using the Apple TV remote.
    *
    * @platform ios
    */
  var isTVSelectable: js.UndefOr[Boolean] = js.native
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 1.0.
    *
    * @platform ios
    */
  var tvParallaxMagnification: js.UndefOr[Double] = js.native
  /**
    * *(Apple TV only)* Object with properties to control Apple TV parallax effects.
    *
    * @platform ios
    */
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 2.0.
    *
    * @platform ios
    */
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.native
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 2.0.
    *
    * @platform ios
    */
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.native
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 0.05.
    *
    * @platform ios
    */
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.native
}

object TVViewPropsIOS {
  @scala.inline
  def apply(): TVViewPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TVViewPropsIOS]
  }
  @scala.inline
  implicit class TVViewPropsIOSOps[Self <: TVViewPropsIOS] (val x: Self) extends AnyVal {
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
    def withIsTVSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTVSelectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTVSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTVSelectable")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxMagnification(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxMagnification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxMagnification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxMagnification")(js.undefined)
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
    @scala.inline
    def withTvParallaxShiftDistanceX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxShiftDistanceX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceX")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxShiftDistanceY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxShiftDistanceY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceY")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxTiltAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxTiltAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxTiltAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxTiltAngle")(js.undefined)
        ret
    }
  }
  
}

