package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  var actor: js.UndefOr[js.Array[String]] = js.native
  var album: js.UndefOr[String] = js.native
  var artist: js.UndefOr[js.Array[String]] = js.native
  var broadcaster: js.UndefOr[js.Array[String]] = js.native
  var category: js.UndefOr[String] = js.native
  var contentType: js.UndefOr[String] = js.native
  var copyrightDate: js.UndefOr[Date] = js.native
  var customId: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var director: js.UndefOr[js.Array[String]] = js.native
  var eidr: js.UndefOr[String] = js.native
  var endYear: js.UndefOr[Double] = js.native
  var episodeNumber: js.UndefOr[String] = js.native
  var episodesAreUntitled: js.UndefOr[Boolean] = js.native
  var genre: js.UndefOr[js.Array[String]] = js.native
  var grid: js.UndefOr[String] = js.native
  var hfa: js.UndefOr[String] = js.native
  var infoUrl: js.UndefOr[String] = js.native
  var isan: js.UndefOr[String] = js.native
  var isrc: js.UndefOr[String] = js.native
  var iswc: js.UndefOr[String] = js.native
  var keyword: js.UndefOr[js.Array[String]] = js.native
  var label: js.UndefOr[String] = js.native
  var notes: js.UndefOr[String] = js.native
  var originalReleaseMedium: js.UndefOr[String] = js.native
  var producer: js.UndefOr[js.Array[String]] = js.native
  var ratings: js.UndefOr[js.Array[Rating]] = js.native
  var releaseDate: js.UndefOr[Date] = js.native
  var seasonNumber: js.UndefOr[String] = js.native
  var showCustomId: js.UndefOr[String] = js.native
  var showTitle: js.UndefOr[String] = js.native
  var spokenLanguage: js.UndefOr[String] = js.native
  var startYear: js.UndefOr[Double] = js.native
  var subtitledLanguage: js.UndefOr[js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var tmsId: js.UndefOr[String] = js.native
  var totalEpisodesExpected: js.UndefOr[Double] = js.native
  var upc: js.UndefOr[String] = js.native
  var writer: js.UndefOr[js.Array[String]] = js.native
}

object Metadata {
  @scala.inline
  def apply(): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActor(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actor")(js.undefined)
        ret
    }
    @scala.inline
    def withAlbum(value: String): Self = {
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
    def withArtist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(js.undefined)
        ret
    }
    @scala.inline
    def withBroadcaster(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBroadcaster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcaster")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyrightDate(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyrightDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyrightDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyrightDate")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDirector(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("director")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("director")(js.undefined)
        ret
    }
    @scala.inline
    def withEidr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eidr")(js.undefined)
        ret
    }
    @scala.inline
    def withEndYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endYear")(js.undefined)
        ret
    }
    @scala.inline
    def withEpisodeNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episodeNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpisodeNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episodeNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withEpisodesAreUntitled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episodesAreUntitled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpisodesAreUntitled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episodesAreUntitled")(js.undefined)
        ret
    }
    @scala.inline
    def withGenre(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genre")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withHfa(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hfa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHfa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hfa")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIsan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isan")(js.undefined)
        ret
    }
    @scala.inline
    def withIsrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isrc")(js.undefined)
        ret
    }
    @scala.inline
    def withIswc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iswc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIswc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iswc")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyword(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalReleaseMedium(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalReleaseMedium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalReleaseMedium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalReleaseMedium")(js.undefined)
        ret
    }
    @scala.inline
    def withProducer(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producer")(js.undefined)
        ret
    }
    @scala.inline
    def withRatings(value: js.Array[Rating]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratings")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseDate(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSeasonNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seasonNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeasonNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seasonNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCustomId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCustomId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomId")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSpokenLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spokenLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpokenLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spokenLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withStartYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startYear")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitledLanguage(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitledLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitledLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitledLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTmsId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTmsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmsId")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalEpisodesExpected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalEpisodesExpected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalEpisodesExpected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalEpisodesExpected")(js.undefined)
        ret
    }
    @scala.inline
    def withUpc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upc")(js.undefined)
        ret
    }
    @scala.inline
    def withWriter(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writer")(js.undefined)
        ret
    }
  }
  
}

