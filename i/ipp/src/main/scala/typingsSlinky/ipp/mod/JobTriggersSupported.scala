package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobTriggersSupported extends js.Object {
  var `preset-name`: js.UndefOr[String] = js.native
}

object JobTriggersSupported {
  @scala.inline
  def apply(): JobTriggersSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTriggersSupported]
  }
  @scala.inline
  implicit class JobTriggersSupportedOps[Self <: JobTriggersSupported] (val x: Self) extends AnyVal {
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

