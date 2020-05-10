package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoiseReducerSpatialFilterSettings extends js.Object {
  /**
    * Specify strength of post noise reduction sharpening filter, with 0 disabling the filter and 3 enabling it at maximum strength.
    */
  var PostFilterSharpenStrength: js.UndefOr[integerMin0Max3] = js.native
  /**
    * The speed of the filter, from -2 (lower speed) to 3 (higher speed), with 0 being the nominal value.
    */
  var Speed: js.UndefOr[integerMinNegative2Max3] = js.native
  /**
    * Relative strength of noise reducing filter. Higher values produce stronger filtering.
    */
  var Strength: js.UndefOr[integerMin0Max16] = js.native
}

object NoiseReducerSpatialFilterSettings {
  @scala.inline
  def apply(): NoiseReducerSpatialFilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReducerSpatialFilterSettings]
  }
  @scala.inline
  implicit class NoiseReducerSpatialFilterSettingsOps[Self <: NoiseReducerSpatialFilterSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostFilterSharpenStrength(value: integerMin0Max3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostFilterSharpenStrength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostFilterSharpenStrength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostFilterSharpenStrength")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: integerMinNegative2Max3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Speed")(js.undefined)
        ret
    }
    @scala.inline
    def withStrength(value: integerMin0Max16): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Strength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Strength")(js.undefined)
        ret
    }
  }
  
}

