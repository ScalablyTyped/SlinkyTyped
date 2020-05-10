package typingsSlinky.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SynthesizeSpeechRequest extends js.Object {
  var audioConfig: AudioConfig = js.native
  var input: SynthesisInput = js.native
  var voice: VoiceSelectionParams = js.native
}

object SynthesizeSpeechRequest {
  @scala.inline
  def apply(audioConfig: AudioConfig, input: SynthesisInput, voice: VoiceSelectionParams): SynthesizeSpeechRequest = {
    val __obj = js.Dynamic.literal(audioConfig = audioConfig.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], voice = voice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizeSpeechRequest]
  }
  @scala.inline
  implicit class SynthesizeSpeechRequestOps[Self <: SynthesizeSpeechRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioConfig(value: AudioConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: SynthesisInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoice(value: VoiceSelectionParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

