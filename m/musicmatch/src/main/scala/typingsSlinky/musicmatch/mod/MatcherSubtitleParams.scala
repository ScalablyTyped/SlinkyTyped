package typingsSlinky.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherSubtitleParams extends MatcherLyricsParams {
  var f_subtitle_length: js.UndefOr[Double] = js.native
  var f_subtitle_length_max_deviation: js.UndefOr[Double] = js.native
}

object MatcherSubtitleParams {
  @scala.inline
  def apply(): MatcherSubtitleParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherSubtitleParams]
  }
  @scala.inline
  implicit class MatcherSubtitleParamsOps[Self <: MatcherSubtitleParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withF_subtitle_length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_subtitle_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF_subtitle_length: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_subtitle_length")(js.undefined)
        ret
    }
    @scala.inline
    def withF_subtitle_length_max_deviation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_subtitle_length_max_deviation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF_subtitle_length_max_deviation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_subtitle_length_max_deviation")(js.undefined)
        ret
    }
  }
  
}

