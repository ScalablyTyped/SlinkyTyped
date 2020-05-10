package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoiseReducerFilterSettings extends js.Object {
  /**
    * Relative strength of noise reducing filter. Higher values produce stronger filtering.
    */
  var Strength: js.UndefOr[integerMin0Max3] = js.native
}

object NoiseReducerFilterSettings {
  @scala.inline
  def apply(): NoiseReducerFilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReducerFilterSettings]
  }
  @scala.inline
  implicit class NoiseReducerFilterSettingsOps[Self <: NoiseReducerFilterSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStrength(value: integerMin0Max3): Self = {
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

