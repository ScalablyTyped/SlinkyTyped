package typingsSlinky.instagramPrivateApi.musicSearchFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicSearchFeedResponseTrack extends js.Object {
  var audio_asset_id: Null = js.native
  var cover_artwork_thumbnail_uri: String = js.native
  var cover_artwork_uri: String = js.native
  var dash_manifest: String = js.native
  var display_artist: String = js.native
  var has_lyrics: Boolean = js.native
  var highlight_start_times_in_ms: js.Array[Double] = js.native
  var id: String = js.native
  var is_explicit: Boolean = js.native
  var progressive_download_url: String = js.native
  var subtitle: String = js.native
  var title: String = js.native
}

object MusicSearchFeedResponseTrack {
  @scala.inline
  def apply(
    audio_asset_id: Null,
    cover_artwork_thumbnail_uri: String,
    cover_artwork_uri: String,
    dash_manifest: String,
    display_artist: String,
    has_lyrics: Boolean,
    highlight_start_times_in_ms: js.Array[Double],
    id: String,
    is_explicit: Boolean,
    progressive_download_url: String,
    subtitle: String,
    title: String
  ): MusicSearchFeedResponseTrack = {
    val __obj = js.Dynamic.literal(audio_asset_id = audio_asset_id.asInstanceOf[js.Any], cover_artwork_thumbnail_uri = cover_artwork_thumbnail_uri.asInstanceOf[js.Any], cover_artwork_uri = cover_artwork_uri.asInstanceOf[js.Any], dash_manifest = dash_manifest.asInstanceOf[js.Any], display_artist = display_artist.asInstanceOf[js.Any], has_lyrics = has_lyrics.asInstanceOf[js.Any], highlight_start_times_in_ms = highlight_start_times_in_ms.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_explicit = is_explicit.asInstanceOf[js.Any], progressive_download_url = progressive_download_url.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicSearchFeedResponseTrack]
  }
  @scala.inline
  implicit class MusicSearchFeedResponseTrackOps[Self <: MusicSearchFeedResponseTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio_asset_id(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio_asset_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCover_artwork_thumbnail_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover_artwork_thumbnail_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCover_artwork_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover_artwork_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDash_manifest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dash_manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_artist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_lyrics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_lyrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlight_start_times_in_ms(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight_start_times_in_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_explicit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_explicit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressive_download_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressive_download_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

