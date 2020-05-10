package typingsSlinky.gapiClientSpeech.gapi.client.speech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechRecognitionAlternative extends js.Object {
  /**
    * &#42;Output-only&#42; The confidence estimate between 0.0 and 1.0. A higher number
    * indicates an estimated greater likelihood that the recognized words are
    * correct. This field is typically provided only for the top hypothesis, and
    * only for `is_final=true` results. Clients should not rely on the
    * `confidence` field as it is not guaranteed to be accurate or consistent.
    * The default of 0.0 is a sentinel value indicating `confidence` was not set.
    */
  var confidence: js.UndefOr[Double] = js.native
  /** &#42;Output-only&#42; Transcript text representing the words that the user spoke. */
  var transcript: js.UndefOr[String] = js.native
  /** &#42;Output-only&#42; A list of word-specific information for each recognized word. */
  var words: js.UndefOr[js.Array[WordInfo]] = js.native
}

object SpeechRecognitionAlternative {
  @scala.inline
  def apply(): SpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeechRecognitionAlternative]
  }
  @scala.inline
  implicit class SpeechRecognitionAlternativeOps[Self <: SpeechRecognitionAlternative] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withTranscript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcript")(js.undefined)
        ret
    }
    @scala.inline
    def withWords(value: js.Array[WordInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(js.undefined)
        ret
    }
  }
  
}

