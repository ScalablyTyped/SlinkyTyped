package typingsSlinky.reactNativeMaterialKit.mod

import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeMaterialKit.mod.MKPropTypes.rippleLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MKRippleProperties extends ViewProps {
  var maskBorderRadius: js.UndefOr[Double] = js.native
  var maskBorderRadiusInPercent: js.UndefOr[Double] = js.native
  var maskColor: js.UndefOr[String] = js.native
  var maskDuration: js.UndefOr[Double] = js.native
  var maskEnabled: js.UndefOr[Boolean] = js.native
  var rippleColor: js.UndefOr[String] = js.native
  var rippleDuration: js.UndefOr[Double] = js.native
  var rippleLocation: js.UndefOr[typingsSlinky.reactNativeMaterialKit.mod.MKPropTypes.rippleLocation] = js.native
  var shadowAniEnabled: js.UndefOr[Boolean] = js.native
}

object MKRippleProperties {
  @scala.inline
  def apply(): MKRippleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKRippleProperties]
  }
  @scala.inline
  implicit class MKRipplePropertiesOps[Self <: MKRippleProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaskBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskBorderRadiusInPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorderRadiusInPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskBorderRadiusInPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorderRadiusInPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleLocation(value: rippleLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowAniEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowAniEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowAniEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowAniEnabled")(js.undefined)
        ret
    }
  }
  
}

