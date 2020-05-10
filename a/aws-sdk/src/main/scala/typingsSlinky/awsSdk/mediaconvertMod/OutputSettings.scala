package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputSettings extends js.Object {
  /**
    * Settings for HLS output groups
    */
  var HlsSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.HlsSettings] = js.native
}

object OutputSettings {
  @scala.inline
  def apply(): OutputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSettings]
  }
  @scala.inline
  implicit class OutputSettingsOps[Self <: OutputSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHlsSettings(value: HlsSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsSettings")(js.undefined)
        ret
    }
  }
  
}

