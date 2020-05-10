package typingsSlinky.lyricist.mod

import typingsSlinky.lyricist.AnonHot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Search ================================================
@js.native
trait SearchResult extends js.Object {
  var annotation_count: Double = js.native
  var api_path: String = js.native
  var full_title: String = js.native
  var header_image_thumbnail_url: String = js.native
  var header_image_url: String = js.native
  var id: Double = js.native
  var lyrics_owner_id: Double = js.native
  var lyrics_state: String = js.native
  var path: String = js.native
  var primary_artist: ArtistBrief = js.native
  var pyongs_count: js.UndefOr[js.Any] = js.native
  var song_art_image_thumbnail_url: String = js.native
  var stats: AnonHot = js.native
  var title: String = js.native
  var title_with_featured: String = js.native
  var url: String = js.native
}

object SearchResult {
  @scala.inline
  def apply(
    annotation_count: Double,
    api_path: String,
    full_title: String,
    header_image_thumbnail_url: String,
    header_image_url: String,
    id: Double,
    lyrics_owner_id: Double,
    lyrics_state: String,
    path: String,
    primary_artist: ArtistBrief,
    song_art_image_thumbnail_url: String,
    stats: AnonHot,
    title: String,
    title_with_featured: String,
    url: String
  ): SearchResult = {
    val __obj = js.Dynamic.literal(annotation_count = annotation_count.asInstanceOf[js.Any], api_path = api_path.asInstanceOf[js.Any], full_title = full_title.asInstanceOf[js.Any], header_image_thumbnail_url = header_image_thumbnail_url.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lyrics_owner_id = lyrics_owner_id.asInstanceOf[js.Any], lyrics_state = lyrics_state.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], primary_artist = primary_artist.asInstanceOf[js.Any], song_art_image_thumbnail_url = song_art_image_thumbnail_url.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], title_with_featured = title_with_featured.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApi_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader_image_thumbnail_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header_image_thumbnail_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader_image_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header_image_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLyrics_owner_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lyrics_owner_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLyrics_state(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lyrics_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimary_artist(value: ArtistBrief): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSong_art_image_thumbnail_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("song_art_image_thumbnail_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: AnonHot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle_with_featured(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title_with_featured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPyongs_count(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyongs_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPyongs_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyongs_count")(js.undefined)
        ret
    }
  }
  
}

