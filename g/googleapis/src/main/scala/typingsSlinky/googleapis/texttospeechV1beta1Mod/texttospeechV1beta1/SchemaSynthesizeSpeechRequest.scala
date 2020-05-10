package typingsSlinky.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The top-level message sent by the client for the `SynthesizeSpeech` method.
  */
@js.native
trait SchemaSynthesizeSpeechRequest extends js.Object {
  /**
    * Required. The configuration of the synthesized audio.
    */
  var audioConfig: js.UndefOr[SchemaAudioConfig] = js.native
  /**
    * Required. The Synthesizer requires either plain text or SSML as input.
    */
  var input: js.UndefOr[SchemaSynthesisInput] = js.native
  /**
    * Required. The desired voice of the synthesized audio.
    */
  var voice: js.UndefOr[SchemaVoiceSelectionParams] = js.native
}

object SchemaSynthesizeSpeechRequest {
  @scala.inline
  def apply(): SchemaSynthesizeSpeechRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSynthesizeSpeechRequest]
  }
  @scala.inline
  implicit class SchemaSynthesizeSpeechRequestOps[Self <: SchemaSynthesizeSpeechRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioConfig(value: SchemaAudioConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: SchemaSynthesisInput): Self = {
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
    def withVoice(value: SchemaVoiceSelectionParams): Self = {
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
  }
  
}

