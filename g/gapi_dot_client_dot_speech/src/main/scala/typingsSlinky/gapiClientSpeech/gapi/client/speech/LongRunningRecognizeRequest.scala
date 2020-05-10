package typingsSlinky.gapiClientSpeech.gapi.client.speech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongRunningRecognizeRequest extends js.Object {
  /** &#42;Required&#42; The audio data to be recognized. */
  var audio: js.UndefOr[RecognitionAudio] = js.native
  /**
    * &#42;Required&#42; Provides information to the recognizer that specifies how to
    * process the request.
    */
  var config: js.UndefOr[RecognitionConfig] = js.native
}

object LongRunningRecognizeRequest {
  @scala.inline
  def apply(): LongRunningRecognizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongRunningRecognizeRequest]
  }
  @scala.inline
  implicit class LongRunningRecognizeRequestOps[Self <: LongRunningRecognizeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio(value: RecognitionAudio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: RecognitionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
  }
  
}

