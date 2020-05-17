package typingsSlinky.chrome.chrome.cast.media

import typingsSlinky.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TvShowMediaMetadata extends js.Object {
  var episode: Double = js.native
  /** @deprecated. Use episode instead. */
  var episodeNumber: Double = js.native
  /** @deprecated. Use title instead. */
  var episodeTitle: String = js.native
  var images: js.Array[Image] = js.native
  var metadataType: MetadataType = js.native
  var originalAirdate: String = js.native
  /** @deprecated. Use originalAirdate instead. */
  var releaseYear: Double = js.native
  var season: Double = js.native
  /** @deprecated. Use season instead. */
  var seasonNumber: Double = js.native
  var seriesTitle: String = js.native
  var title: String = js.native
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
}

object TvShowMediaMetadata {
  @scala.inline
  def apply(
    episode: Double,
    episodeNumber: Double,
    episodeTitle: String,
    images: js.Array[Image],
    metadataType: MetadataType,
    originalAirdate: String,
    releaseYear: Double,
    season: Double,
    seasonNumber: Double,
    seriesTitle: String,
    title: String,
    `type`: MetadataType
  ): TvShowMediaMetadata = {
    val __obj = js.Dynamic.literal(episode = episode.asInstanceOf[js.Any], episodeNumber = episodeNumber.asInstanceOf[js.Any], episodeTitle = episodeTitle.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any], originalAirdate = originalAirdate.asInstanceOf[js.Any], releaseYear = releaseYear.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any], seasonNumber = seasonNumber.asInstanceOf[js.Any], seriesTitle = seriesTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TvShowMediaMetadata]
  }
  @scala.inline
  implicit class TvShowMediaMetadataOps[Self <: TvShowMediaMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEpisode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEpisodeNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episodeNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEpisodeTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episodeTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: js.Array[Image]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadataType(value: MetadataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalAirdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalAirdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeason(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("season")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeasonNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seasonNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeriesTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MetadataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

