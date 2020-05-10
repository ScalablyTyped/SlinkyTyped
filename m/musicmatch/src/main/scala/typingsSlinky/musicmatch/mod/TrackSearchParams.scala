package typingsSlinky.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackSearchParams extends Pageable {
  var f_artist_id: js.UndefOr[Double] = js.native
  var f_artist_mbid: js.UndefOr[Double] = js.native
  var f_has_lyrics: js.UndefOr[TBoolean] = js.native
  var f_lyrics_language: js.UndefOr[String] = js.native
  var f_music_genre_id: js.UndefOr[Double] = js.native
  var q: js.UndefOr[String] = js.native
  var q_lyrics: js.UndefOr[String] = js.native
  var quorum_factor: js.UndefOr[Double] = js.native
  var s_artist_rating: js.UndefOr[TSort] = js.native
  var s_track_rating: js.UndefOr[TSort] = js.native
}

object TrackSearchParams {
  @scala.inline
  def apply(): TrackSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackSearchParams]
  }
  @scala.inline
  implicit class TrackSearchParamsOps[Self <: TrackSearchParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withF_artist_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_artist_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF_artist_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_artist_id")(js.undefined)
        ret
    }
    @scala.inline
    def withF_artist_mbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_artist_mbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF_artist_mbid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_artist_mbid")(js.undefined)
        ret
    }
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
    def withF_lyrics_language(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_lyrics_language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF_lyrics_language: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_lyrics_language")(js.undefined)
        ret
    }
    @scala.inline
    def withF_music_genre_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_music_genre_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF_music_genre_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_music_genre_id")(js.undefined)
        ret
    }
    @scala.inline
    def withQ(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(js.undefined)
        ret
    }
    @scala.inline
    def withQ_lyrics(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q_lyrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ_lyrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q_lyrics")(js.undefined)
        ret
    }
    @scala.inline
    def withQuorum_factor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quorum_factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuorum_factor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quorum_factor")(js.undefined)
        ret
    }
    @scala.inline
    def withS_artist_rating(value: TSort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s_artist_rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS_artist_rating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s_artist_rating")(js.undefined)
        ret
    }
    @scala.inline
    def withS_track_rating(value: TSort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s_track_rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS_track_rating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s_track_rating")(js.undefined)
        ret
    }
  }
  
}

