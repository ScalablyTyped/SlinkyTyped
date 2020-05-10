package typingsSlinky.gapiClientSpeech.gapi.client.speech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordInfo extends js.Object {
  /**
    * &#42;Output-only&#42; Time offset relative to the beginning of the audio,
    * and corresponding to the end of the spoken word.
    * This field is only set if `enable_word_time_offsets=true` and only
    * in the top hypothesis.
    * This is an experimental feature and the accuracy of the time offset can
    * vary.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * &#42;Output-only&#42; Time offset relative to the beginning of the audio,
    * and corresponding to the start of the spoken word.
    * This field is only set if `enable_word_time_offsets=true` and only
    * in the top hypothesis.
    * This is an experimental feature and the accuracy of the time offset can
    * vary.
    */
  var startTime: js.UndefOr[String] = js.native
  /** &#42;Output-only&#42; The word corresponding to this set of information. */
  var word: js.UndefOr[String] = js.native
}

object WordInfo {
  @scala.inline
  def apply(): WordInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordInfo]
  }
  @scala.inline
  implicit class WordInfoOps[Self <: WordInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(js.undefined)
        ret
    }
  }
  
}

