package typingsSlinky.googleapis.texttospeechV1Mod.texttospeechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The message returned to the client by the `SynthesizeSpeech` method.
  */
@js.native
trait SchemaSynthesizeSpeechResponse extends js.Object {
  /**
    * The audio data bytes encoded as specified in the request, including the
    * header (For LINEAR16 audio, we include the WAV header). Note: as with all
    * bytes fields, protobuffers use a pure binary representation, whereas JSON
    * representations use base64.
    */
  var audioContent: js.UndefOr[String] = js.native
}

object SchemaSynthesizeSpeechResponse {
  @scala.inline
  def apply(): SchemaSynthesizeSpeechResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSynthesizeSpeechResponse]
  }
  @scala.inline
  implicit class SchemaSynthesizeSpeechResponseOps[Self <: SchemaSynthesizeSpeechResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioContent")(js.undefined)
        ret
    }
  }
  
}

