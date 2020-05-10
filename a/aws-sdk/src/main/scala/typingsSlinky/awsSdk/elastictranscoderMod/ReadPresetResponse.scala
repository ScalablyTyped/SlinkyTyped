package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadPresetResponse extends js.Object {
  /**
    * A section of the response body that provides information about the preset.
    */
  var Preset: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Preset] = js.native
}

object ReadPresetResponse {
  @scala.inline
  def apply(): ReadPresetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadPresetResponse]
  }
  @scala.inline
  implicit class ReadPresetResponseOps[Self <: ReadPresetResponse] (val x: Self) extends AnyVal {
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

