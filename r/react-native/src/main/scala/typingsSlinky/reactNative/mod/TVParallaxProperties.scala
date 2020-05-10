package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TVParallaxProperties extends js.Object {
  /**
    * If true, parallax effects are enabled.  Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Defaults to 1.0
    */
  var magnification: js.UndefOr[Double] = js.native
  /**
    * Defaults to 0.3
    */
  var pressDelay: js.UndefOr[Double] = js.native
  /**
    * Defaults to 0.3
    */
  var pressDuration: js.UndefOr[Double] = js.native
  /**
    * Defaults to 1.0
    */
  var pressMagnification: js.UndefOr[Double] = js.native
  /**
    * Defaults to 2.0.
    */
  var shiftDistanceX: js.UndefOr[Double] = js.native
  /**
    * Defaults to 2.0.
    */
  var shiftDistanceY: js.UndefOr[Double] = js.native
  /**
    * Defaults to 0.05.
    */
  var tiltAngle: js.UndefOr[Double] = js.native
}

object TVParallaxProperties {
  @scala.inline
  def apply(): TVParallaxProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TVParallaxProperties]
  }
  @scala.inline
  implicit class TVParallaxPropertiesOps[Self <: TVParallaxProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMagnification(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagnification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnification")(js.undefined)
        ret
    }
    @scala.inline
    def withPressDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withPressDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withPressMagnification(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressMagnification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressMagnification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressMagnification")(js.undefined)
        ret
    }
    @scala.inline
    def withShiftDistanceX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftDistanceX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShiftDistanceX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftDistanceX")(js.undefined)
        ret
    }
    @scala.inline
    def withShiftDistanceY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftDistanceY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShiftDistanceY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftDistanceY")(js.undefined)
        ret
    }
    @scala.inline
    def withTiltAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiltAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiltAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiltAngle")(js.undefined)
        ret
    }
  }
  
}

