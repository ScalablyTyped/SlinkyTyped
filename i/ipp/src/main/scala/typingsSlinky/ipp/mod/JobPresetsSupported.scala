package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobPresetsSupported extends js.Object {
  var `preset-name`: js.UndefOr[String] = js.native
}

object JobPresetsSupported {
  @scala.inline
  def apply(): JobPresetsSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobPresetsSupported]
  }
  @scala.inline
  implicit class JobPresetsSupportedOps[Self <: JobPresetsSupported] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withPreset-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPreset-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset-name")(js.undefined)
        ret
    }
  }
  
}

