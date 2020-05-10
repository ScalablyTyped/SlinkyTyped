package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsSettings extends js.Object {
  var AudioOnlyHlsSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AudioOnlyHlsSettings] = js.native
  var Fmp4HlsSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Fmp4HlsSettings] = js.native
  var StandardHlsSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.StandardHlsSettings] = js.native
}

object HlsSettings {
  @scala.inline
  def apply(): HlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsSettings]
  }
  @scala.inline
  implicit class HlsSettingsOps[Self <: HlsSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioOnlyHlsSettings(value: AudioOnlyHlsSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioOnlyHlsSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioOnlyHlsSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioOnlyHlsSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFmp4HlsSettings(value: Fmp4HlsSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fmp4HlsSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFmp4HlsSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fmp4HlsSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardHlsSettings(value: StandardHlsSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardHlsSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardHlsSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardHlsSettings")(js.undefined)
        ret
    }
  }
  
}

