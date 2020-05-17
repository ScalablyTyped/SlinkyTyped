package typingsSlinky.discordRpc.mod

import typingsSlinky.discordRpc.anon.AutoThreshold
import typingsSlinky.discordRpc.anon.Device
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceSettings extends js.Object {
  var automaticGainControl: Boolean = js.native
  var deaf: Boolean = js.native
  var echoCancellation: Boolean = js.native
  var input: js.UndefOr[Device] = js.native
  var mode: js.UndefOr[AutoThreshold] = js.native
  var mute: Boolean = js.native
  var noiseSuppression: Boolean = js.native
  var output: js.UndefOr[Device] = js.native
  var qos: Boolean = js.native
  var silenceWarning: Boolean = js.native
}

object VoiceSettings {
  @scala.inline
  def apply(
    automaticGainControl: Boolean,
    deaf: Boolean,
    echoCancellation: Boolean,
    mute: Boolean,
    noiseSuppression: Boolean,
    qos: Boolean,
    silenceWarning: Boolean
  ): VoiceSettings = {
    val __obj = js.Dynamic.literal(automaticGainControl = automaticGainControl.asInstanceOf[js.Any], deaf = deaf.asInstanceOf[js.Any], echoCancellation = echoCancellation.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], noiseSuppression = noiseSuppression.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], silenceWarning = silenceWarning.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceSettings]
  }
  @scala.inline
  implicit class VoiceSettingsOps[Self <: VoiceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticGainControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticGainControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeaf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deaf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEchoCancellation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoCancellation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoiseSuppression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noiseSuppression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilenceWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silenceWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: Device): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: AutoThreshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: Device): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
  }
  
}

