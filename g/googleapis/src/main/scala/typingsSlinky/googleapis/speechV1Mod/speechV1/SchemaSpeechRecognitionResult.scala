package typingsSlinky.googleapis.speechV1Mod.speechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A speech recognition result corresponding to a portion of the audio.
  */
@js.native
trait SchemaSpeechRecognitionResult extends js.Object {
  /**
    * Output only. May contain one or more recognition hypotheses (up to the
    * maximum specified in `max_alternatives`). These alternatives are ordered
    * in terms of accuracy, with the top (first) alternative being the most
    * probable, as ranked by the recognizer.
    */
  var alternatives: js.UndefOr[js.Array[SchemaSpeechRecognitionAlternative]] = js.native
  /**
    * For multi-channel audio, this is the channel number corresponding to the
    * recognized result for the audio from that channel. For
    * audio_channel_count = N, its output values can range from &#39;1&#39; to
    * &#39;N&#39;.
    */
  var channelTag: js.UndefOr[Double] = js.native
}

object SchemaSpeechRecognitionResult {
  @scala.inline
  def apply(): SchemaSpeechRecognitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpeechRecognitionResult]
  }
  @scala.inline
  implicit class SchemaSpeechRecognitionResultOps[Self <: SchemaSpeechRecognitionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternatives(value: js.Array[SchemaSpeechRecognitionAlternative]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatives")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelTag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelTag")(js.undefined)
        ret
    }
  }
  
}

