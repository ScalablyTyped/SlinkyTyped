package typingsSlinky.lyricist.mod

import typingsSlinky.lyricist.AnonExcludedpermissionsInteractions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Album =================================================
@js.native
trait Album extends js.Object {
  var api_path: String = js.native
  var artist: ArtistBrief = js.native
  var comment_count: Double = js.native
  var cover_art_url: String = js.native
  var cover_arts: js.Array[_] = js.native
  var current_user_metadata: AnonExcludedpermissionsInteractions = js.native
  var custom_header_image_url: js.UndefOr[js.Any] = js.native
  var description_annotation: DescriptionAnnotation = js.native
  var full_title: String = js.native
  var header_image_url: String = js.native
  var id: Double = js.native
  var lock_state: String = js.native
  var name: String = js.native
  var performance_groups: js.Array[_] = js.native
  var pyongs_count: Double = js.native
  var release_date: js.UndefOr[js.Any] = js.native
  var release_date_components: js.UndefOr[js.Any] = js.native
  var song_pageviews: Double = js.native
  var song_performances: js.Array[_] = js.native
  var url: String = js.native
}

object Album {
  @scala.inline
  def apply(
    api_path: String,
    artist: ArtistBrief,
    comment_count: Double,
    cover_art_url: String,
    cover_arts: js.Array[_],
    current_user_metadata: AnonExcludedpermissionsInteractions,
    description_annotation: DescriptionAnnotation,
    full_title: String,
    header_image_url: String,
    id: Double,
    lock_state: String,
    name: String,
    performance_groups: js.Array[_],
    pyongs_count: Double,
    song_pageviews: Double,
    song_performances: js.Array[_],
    url: String
  ): Album = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], cover_art_url = cover_art_url.asInstanceOf[js.Any], cover_arts = cover_arts.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], description_annotation = description_annotation.asInstanceOf[js.Any], full_title = full_title.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lock_state = lock_state.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], performance_groups = performance_groups.asInstanceOf[js.Any], pyongs_count = pyongs_count.asInstanceOf[js.Any], song_pageviews = song_pageviews.asInstanceOf[js.Any], song_performances = song_performances.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Album]
  }
  @scala.inline
  implicit class AlbumOps[Self <: Album] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtist(value: ArtistBrief): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCover_art_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover_art_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCover_arts(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover_arts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_user_metadata(value: AnonExcludedpermissionsInteractions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription_annotation(value: DescriptionAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description_annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_title")(value.asInstanceOf[js.Any])
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
    def withLock_state(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerformance_groups(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance_groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPyongs_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyongs_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSong_pageviews(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("song_pageviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSong_performances(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("song_performances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom_header_image_url(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_header_image_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_header_image_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_header_image_url")(js.undefined)
        ret
    }
    @scala.inline
    def withRelease_date(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelease_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release_date")(js.undefined)
        ret
    }
    @scala.inline
    def withRelease_date_components(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release_date_components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelease_date_components: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release_date_components")(js.undefined)
        ret
    }
  }
  
}

