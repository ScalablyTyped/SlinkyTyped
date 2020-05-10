package typingsSlinky.lyricist.mod

import typingsSlinky.lyricist.AnonAcceptedannotations
import typingsSlinky.lyricist.AnonExcludedpermissions
import typingsSlinky.lyricist.AnonSongs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Song ============================================================================================
@js.native
trait Song extends js.Object {
  var album: js.UndefOr[js.Any] = js.native
  var annotation_count: Double = js.native
  var api_path: String = js.native
  var apple_music_id: js.UndefOr[js.Any] = js.native
  var apple_music_player_url: String = js.native
  var current_user_metadata: AnonExcludedpermissions = js.native
  var custom_performances: js.Array[_] = js.native
  var description: Description = js.native
  var description_annotation: DescriptionAnnotation = js.native
  var embed_content: String = js.native
  var featured_artists: js.Array[_] = js.native
  var featured_video: Boolean = js.native
  var full_title: String = js.native
  var header_image_thumbnail_url: String = js.native
  var header_image_url: String = js.native
  var id: Double = js.native
  var lyrics: String = js.native
  var lyrics_marked_complete_by: js.UndefOr[js.Any] = js.native
  var lyrics_owner_id: Double = js.native
  var lyrics_state: String = js.native
  var media: js.Array[Media] = js.native
  var path: String = js.native
  var primary_artist: ArtistBrief = js.native
  var producer_artists: js.Array[ArtistBrief] = js.native
  var pyongs_count: js.UndefOr[js.Any] = js.native
  var recording_location: js.UndefOr[js.Any] = js.native
  var release_date: String = js.native
  var song_art_image_thumbnail_url: String = js.native
  var song_art_image_url: String = js.native
  var song_relationships: js.Array[AnonSongs] = js.native
  var stats: AnonAcceptedannotations = js.native
  var title: String = js.native
  var title_with_featured: String = js.native
  var url: String = js.native
  var verified_annotations_by: js.Array[_] = js.native
  var verified_contributors: js.Array[_] = js.native
  var verified_lyrics_by: js.Array[_] = js.native
  var writer_artists: js.Array[ArtistBrief] = js.native
}

object Song {
  @scala.inline
  def apply(
    annotation_count: Double,
    api_path: String,
    apple_music_player_url: String,
    current_user_metadata: AnonExcludedpermissions,
    custom_performances: js.Array[_],
    description: Description,
    description_annotation: DescriptionAnnotation,
    embed_content: String,
    featured_artists: js.Array[_],
    featured_video: Boolean,
    full_title: String,
    header_image_thumbnail_url: String,
    header_image_url: String,
    id: Double,
    lyrics: String,
    lyrics_owner_id: Double,
    lyrics_state: String,
    media: js.Array[Media],
    path: String,
    primary_artist: ArtistBrief,
    producer_artists: js.Array[ArtistBrief],
    release_date: String,
    song_art_image_thumbnail_url: String,
    song_art_image_url: String,
    song_relationships: js.Array[AnonSongs],
    stats: AnonAcceptedannotations,
    title: String,
    title_with_featured: String,
    url: String,
    verified_annotations_by: js.Array[_],
    verified_contributors: js.Array[_],
    verified_lyrics_by: js.Array[_],
    writer_artists: js.Array[ArtistBrief]
  ): Song = {
    val __obj = js.Dynamic.literal(annotation_count = annotation_count.asInstanceOf[js.Any], api_path = api_path.asInstanceOf[js.Any], apple_music_player_url = apple_music_player_url.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], custom_performances = custom_performances.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], description_annotation = description_annotation.asInstanceOf[js.Any], embed_content = embed_content.asInstanceOf[js.Any], featured_artists = featured_artists.asInstanceOf[js.Any], featured_video = featured_video.asInstanceOf[js.Any], full_title = full_title.asInstanceOf[js.Any], header_image_thumbnail_url = header_image_thumbnail_url.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lyrics = lyrics.asInstanceOf[js.Any], lyrics_owner_id = lyrics_owner_id.asInstanceOf[js.Any], lyrics_state = lyrics_state.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], primary_artist = primary_artist.asInstanceOf[js.Any], producer_artists = producer_artists.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], song_art_image_thumbnail_url = song_art_image_thumbnail_url.asInstanceOf[js.Any], song_art_image_url = song_art_image_url.asInstanceOf[js.Any], song_relationships = song_relationships.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], title_with_featured = title_with_featured.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified_annotations_by = verified_annotations_by.asInstanceOf[js.Any], verified_contributors = verified_contributors.asInstanceOf[js.Any], verified_lyrics_by = verified_lyrics_by.asInstanceOf[js.Any], writer_artists = writer_artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Song]
  }
  @scala.inline
  implicit class SongOps[Self <: Song] (val x: Self) extends AnyVal {
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
    def withApple_music_player_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apple_music_player_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_user_metadata(value: AnonExcludedpermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom_performances(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_performances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription_annotation(value: DescriptionAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description_annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbed_content(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed_content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatured_artists(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featured_artists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatured_video(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featured_video")(value.asInstanceOf[js.Any])
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
    def withLyrics(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lyrics")(value.asInstanceOf[js.Any])
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
    def withMedia(value: js.Array[Media]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
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
    def withProducer_artists(value: js.Array[ArtistBrief]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producer_artists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSong_art_image_thumbnail_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("song_art_image_thumbnail_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSong_art_image_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("song_art_image_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSong_relationships(value: js.Array[AnonSongs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("song_relationships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: AnonAcceptedannotations): Self = {
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
    def withVerified_annotations_by(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_annotations_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified_contributors(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_contributors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified_lyrics_by(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_lyrics_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriter_artists(value: js.Array[ArtistBrief]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writer_artists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlbum(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album")(js.undefined)
        ret
    }
    @scala.inline
    def withApple_music_id(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apple_music_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApple_music_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apple_music_id")(js.undefined)
        ret
    }
    @scala.inline
    def withLyrics_marked_complete_by(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lyrics_marked_complete_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLyrics_marked_complete_by: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lyrics_marked_complete_by")(js.undefined)
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
    @scala.inline
    def withRecording_location(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recording_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecording_location: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recording_location")(js.undefined)
        ret
    }
  }
  
}

