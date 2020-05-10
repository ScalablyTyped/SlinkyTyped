package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SynthesizeSpeechConfig. */
@js.native
trait ISynthesizeSpeechConfig extends js.Object {
  /** SynthesizeSpeechConfig effectsProfileId */
  var effectsProfileId: js.UndefOr[js.Array[String] | Null] = js.native
  /** SynthesizeSpeechConfig pitch */
  var pitch: js.UndefOr[Double | Null] = js.native
  /** SynthesizeSpeechConfig speakingRate */
  var speakingRate: js.UndefOr[Double | Null] = js.native
  /** SynthesizeSpeechConfig voice */
  var voice: js.UndefOr[IVoiceSelectionParams | Null] = js.native
  /** SynthesizeSpeechConfig volumeGainDb */
  var volumeGainDb: js.UndefOr[Double | Null] = js.native
}

object ISynthesizeSpeechConfig {
  @scala.inline
  def apply(): ISynthesizeSpeechConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISynthesizeSpeechConfig]
  }
  @scala.inline
  implicit class ISynthesizeSpeechConfigOps[Self <: ISynthesizeSpeechConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffectsProfileId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectsProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectsProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectsProfileId")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectsProfileIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectsProfileId")(null)
        ret
    }
    @scala.inline
    def withPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(js.undefined)
        ret
    }
    @scala.inline
    def withPitchNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(null)
        ret
    }
    @scala.inline
    def withSpeakingRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speakingRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeakingRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speakingRate")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeakingRateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speakingRate")(null)
        ret
    }
    @scala.inline
    def withVoice(value: IVoiceSelectionParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voice")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voice")(null)
        ret
    }
    @scala.inline
    def withVolumeGainDb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeGainDb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeGainDb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeGainDb")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeGainDbNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeGainDb")(null)
        ret
    }
  }
  
}

