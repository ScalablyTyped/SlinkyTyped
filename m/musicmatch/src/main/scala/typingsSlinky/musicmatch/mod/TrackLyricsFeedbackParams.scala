package typingsSlinky.musicmatch.mod

import typingsSlinky.musicmatch.musicmatchStrings.bad_characters
import typingsSlinky.musicmatch.musicmatchStrings.lines_too_long
import typingsSlinky.musicmatch.musicmatchStrings.wrong_attribution
import typingsSlinky.musicmatch.musicmatchStrings.wrong_formatting
import typingsSlinky.musicmatch.musicmatchStrings.wrong_lyrics
import typingsSlinky.musicmatch.musicmatchStrings.wrong_verses
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackLyricsFeedbackParams extends js.Object {
  var feedback: js.UndefOr[
    wrong_lyrics | wrong_attribution | bad_characters | lines_too_long | wrong_verses | wrong_formatting
  ] = js.native
  var lyrics_id: js.UndefOr[Double] = js.native
  var track_id: js.UndefOr[Double] = js.native
}

object TrackLyricsFeedbackParams {
  @scala.inline
  def apply(): TrackLyricsFeedbackParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackLyricsFeedbackParams]
  }
  @scala.inline
  implicit class TrackLyricsFeedbackParamsOps[Self <: TrackLyricsFeedbackParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeedback(
      value: wrong_lyrics | wrong_attribution | bad_characters | lines_too_long | wrong_verses | wrong_formatting
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback")(js.undefined)
        ret
    }
    @scala.inline
    def withLyrics_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lyrics_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLyrics_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lyrics_id")(js.undefined)
        ret
    }
    @scala.inline
    def withTrack_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_id")(js.undefined)
        ret
    }
  }
  
}

