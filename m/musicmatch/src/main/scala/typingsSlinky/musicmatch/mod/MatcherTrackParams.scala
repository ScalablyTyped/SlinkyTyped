package typingsSlinky.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherTrackParams extends MatcherLyricsParams {
  var f_has_lyrics: js.UndefOr[TBoolean] = js.native
  var f_has_subtitle: js.UndefOr[TBoolean] = js.native
}

object MatcherTrackParams {
  @scala.inline
  def apply(): MatcherTrackParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherTrackParams]
  }
  @scala.inline
  implicit class MatcherTrackParamsOps[Self <: MatcherTrackParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withF_has_lyrics(value: TBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_has_lyrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF_has_lyrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_has_lyrics")(js.undefined)
        ret
    }
    @scala.inline
    def withF_has_subtitle(value: TBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_has_subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF_has_subtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_has_subtitle")(js.undefined)
        ret
    }
  }
  
}

