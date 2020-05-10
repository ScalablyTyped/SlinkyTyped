package typingsSlinky.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioConfig extends js.Object {
  var audioEncoding: AudioEncoding = js.native
  var effectsProfileId: js.UndefOr[js.Array[String]] = js.native
  var pitch: js.UndefOr[Double] = js.native
  var sampleRateHertz: js.UndefOr[Double] = js.native
  var speakingRate: js.UndefOr[Double] = js.native
  var volumeGainDb: js.UndefOr[Double] = js.native
}

object AudioConfig {
  @scala.inline
  def apply(audioEncoding: AudioEncoding): AudioConfig = {
    val __obj = js.Dynamic.literal(audioEncoding = audioEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioConfig]
  }
  @scala.inline
  implicit class AudioConfigOps[Self <: AudioConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioEncoding(value: AudioEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioEncoding")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withSampleRateHertz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRateHertz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRateHertz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRateHertz")(js.undefined)
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
  }
  
}

