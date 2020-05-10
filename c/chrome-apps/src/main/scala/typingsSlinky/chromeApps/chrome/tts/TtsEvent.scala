package typingsSlinky.chromeApps.chrome.tts

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An event from the TTS engine to communicate the status of an utterance. */
@js.native
trait TtsEvent extends js.Object {
  /** The index of the current character in the utterance. */
  var charIndex: js.UndefOr[integer] = js.native
  /** The error description, if the event type is 'error'. */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * The type can be 'start' as soon as speech has started, 'word' when a word boundary is reached, 'sentence' when a sentence boundary is reached, 'marker' when an SSML mark element is reached, 'end' when the end of the utterance is reached, 'interrupted' when the utterance is stopped or interrupted before reaching the end, 'cancelled' when it's removed from the queue before ever being synthesized, or 'error' when any other error occurs. When pausing speech, a 'pause' event is fired if a particular utterance is paused in the middle, and 'resume' if an utterance resumes speech. Note that pause and resume events may not fire if speech is paused in-between utterances.
    * One of: 'start', 'end', 'word', 'sentence', 'marker', 'interrupted', 'cancelled', 'error', 'pause', or 'resume'
    */
  var `type`: String = js.native
}

object TtsEvent {
  @scala.inline
  def apply(`type`: String): TtsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TtsEvent]
  }
  @scala.inline
  implicit class TtsEventOps[Self <: TtsEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharIndex(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
  }
  
}

