package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioSelectorSettings extends js.Object {
  var AudioLanguageSelection: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AudioLanguageSelection] = js.native
  var AudioPidSelection: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.AudioPidSelection] = js.native
}

object AudioSelectorSettings {
  @scala.inline
  def apply(): AudioSelectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioSelectorSettings]
  }
  @scala.inline
  implicit class AudioSelectorSettingsOps[Self <: AudioSelectorSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioLanguageSelection(value: AudioLanguageSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioLanguageSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioLanguageSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioLanguageSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioPidSelection(value: AudioPidSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioPidSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioPidSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioPidSelection")(js.undefined)
        ret
    }
  }
  
}

