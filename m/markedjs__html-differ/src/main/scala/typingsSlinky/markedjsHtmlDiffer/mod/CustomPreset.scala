package typingsSlinky.markedjsHtmlDiffer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPreset extends Options {
  var preset: Preset = js.native
}

object CustomPreset {
  @scala.inline
  def apply(preset: Preset): CustomPreset = {
    val __obj = js.Dynamic.literal(preset = preset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPreset]
  }
  @scala.inline
  implicit class CustomPresetOps[Self <: CustomPreset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreset(value: Preset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

