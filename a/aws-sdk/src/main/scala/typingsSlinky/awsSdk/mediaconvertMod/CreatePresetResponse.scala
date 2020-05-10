package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePresetResponse extends js.Object {
  /**
    * A preset is a collection of preconfigured media conversion settings that you want MediaConvert to apply to the output during the conversion process.
    */
  var Preset: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.Preset] = js.native
}

object CreatePresetResponse {
  @scala.inline
  def apply(): CreatePresetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePresetResponse]
  }
  @scala.inline
  implicit class CreatePresetResponseOps[Self <: CreatePresetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreset(value: Preset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Preset")(js.undefined)
        ret
    }
  }
  
}

