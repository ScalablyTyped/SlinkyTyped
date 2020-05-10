package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioCodecSettings extends js.Object {
  var AacSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AacSettings] = js.native
  var Ac3Settings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Ac3Settings] = js.native
  var Eac3Settings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Eac3Settings] = js.native
  var Mp2Settings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Mp2Settings] = js.native
  var PassThroughSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.PassThroughSettings] = js.native
}

object AudioCodecSettings {
  @scala.inline
  def apply(): AudioCodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioCodecSettings]
  }
  @scala.inline
  implicit class AudioCodecSettingsOps[Self <: AudioCodecSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAacSettings(value: AacSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AacSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAacSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AacSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withAc3Settings(value: Ac3Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ac3Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAc3Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ac3Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withEac3Settings(value: Eac3Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eac3Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEac3Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eac3Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withMp2Settings(value: Mp2Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mp2Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMp2Settings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mp2Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withPassThroughSettings(value: PassThroughSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PassThroughSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassThroughSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PassThroughSettings")(js.undefined)
        ret
    }
  }
  
}

