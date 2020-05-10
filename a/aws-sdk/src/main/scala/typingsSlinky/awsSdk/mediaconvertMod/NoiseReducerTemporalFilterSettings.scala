package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoiseReducerTemporalFilterSettings extends js.Object {
  /**
    * Use Aggressive mode for content that has complex motion. Higher values produce stronger temporal filtering. This filters highly complex scenes more aggressively and creates better VQ for low bitrate outputs.
    */
  var AggressiveMode: js.UndefOr[integerMin0Max4] = js.native
  /**
    * The speed of the filter (higher number is faster). Low setting reduces bit rate at the cost of transcode time, high setting improves transcode time at the cost of bit rate.
    */
  var Speed: js.UndefOr[integerMinNegative1Max3] = js.native
  /**
    * Specify the strength of the noise reducing filter on this output. Higher values produce stronger filtering. We recommend the following value ranges, depending on the result that you want: * 0-2 for complexity reduction with minimal sharpness loss * 2-8 for complexity reduction with image preservation * 8-16 for a high level of complexity reduction
    */
  var Strength: js.UndefOr[integerMin0Max16] = js.native
}

object NoiseReducerTemporalFilterSettings {
  @scala.inline
  def apply(): NoiseReducerTemporalFilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReducerTemporalFilterSettings]
  }
  @scala.inline
  implicit class NoiseReducerTemporalFilterSettingsOps[Self <: NoiseReducerTemporalFilterSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggressiveMode(value: integerMin0Max4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggressiveMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggressiveMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AggressiveMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: integerMinNegative1Max3): Self = {
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

