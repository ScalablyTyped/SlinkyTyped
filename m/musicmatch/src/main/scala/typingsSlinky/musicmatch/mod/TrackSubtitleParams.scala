package typingsSlinky.musicmatch.mod

import typingsSlinky.musicmatch.musicmatchStrings.dfxp
import typingsSlinky.musicmatch.musicmatchStrings.lrc
import typingsSlinky.musicmatch.musicmatchStrings.stledu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackSubtitleParams extends js.Object {
  var f_subtitle_length: js.UndefOr[Double] = js.native
  var f_subtitle_length_max_deviation: js.UndefOr[Double] = js.native
  var subtitle_format: js.UndefOr[lrc | dfxp | stledu] = js.native
  var track_id: js.UndefOr[Double] = js.native
  var track_mbid: js.UndefOr[Double] = js.native
}

object TrackSubtitleParams {
  @scala.inline
  def apply(): TrackSubtitleParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackSubtitleParams]
  }
  @scala.inline
  implicit class TrackSubtitleParamsOps[Self <: TrackSubtitleParams] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withSubtitle_format(value: lrc | dfxp | stledu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle_format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle_format")(js.undefined)
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
    @scala.inline
    def withTrack_mbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_mbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack_mbid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_mbid")(js.undefined)
        ret
    }
  }
  
}

