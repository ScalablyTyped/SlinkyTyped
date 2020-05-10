package typingsSlinky.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherLyricsParams extends js.Object {
  var q_artist: js.UndefOr[String] = js.native
  var q_track: js.UndefOr[String] = js.native
}

object MatcherLyricsParams {
  @scala.inline
  def apply(): MatcherLyricsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherLyricsParams]
  }
  @scala.inline
  implicit class MatcherLyricsParamsOps[Self <: MatcherLyricsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQ_artist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q_artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ_artist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q_artist")(js.undefined)
        ret
    }
    @scala.inline
    def withQ_track(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q_track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ_track: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q_track")(js.undefined)
        ret
    }
  }
  
}

