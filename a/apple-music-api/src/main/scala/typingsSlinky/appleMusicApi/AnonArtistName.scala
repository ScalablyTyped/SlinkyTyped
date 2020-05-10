package typingsSlinky.appleMusicApi

import typingsSlinky.appleMusicApi.AppleMusicApi.Artwork
import typingsSlinky.appleMusicApi.AppleMusicApi.EditorialNotes
import typingsSlinky.appleMusicApi.AppleMusicApi.PlayParameters
import typingsSlinky.appleMusicApi.appleMusicApiStrings.clean
import typingsSlinky.appleMusicApi.appleMusicApiStrings.explicit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArtistName extends js.Object {
  var albumName: String = js.native
  var artistName: String = js.native
  var artwork: js.UndefOr[Artwork] = js.native
  var contentRating: js.UndefOr[clean | explicit] = js.native
  var copyright: js.UndefOr[String] = js.native
  var editorialNotes: js.UndefOr[EditorialNotes] = js.native
  var genreNames: js.Array[String] = js.native
  var isComplete: Boolean = js.native
  var isMasteredForItunes: Boolean = js.native
  var isSingle: Boolean = js.native
  var name: String = js.native
  var playParams: js.UndefOr[PlayParameters] = js.native
  var recordLabel: String = js.native
  var releaseDate: String = js.native
  var trackCount: Double = js.native
  var url: String = js.native
}

object AnonArtistName {
  @scala.inline
  def apply(
    albumName: String,
    artistName: String,
    genreNames: js.Array[String],
    isComplete: Boolean,
    isMasteredForItunes: Boolean,
    isSingle: Boolean,
    name: String,
    recordLabel: String,
    releaseDate: String,
    trackCount: Double,
    url: String
  ): AnonArtistName = {
    val __obj = js.Dynamic.literal(albumName = albumName.asInstanceOf[js.Any], artistName = artistName.asInstanceOf[js.Any], genreNames = genreNames.asInstanceOf[js.Any], isComplete = isComplete.asInstanceOf[js.Any], isMasteredForItunes = isMasteredForItunes.asInstanceOf[js.Any], isSingle = isSingle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recordLabel = recordLabel.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], trackCount = trackCount.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArtistName]
  }
  @scala.inline
  implicit class AnonArtistNameOps[Self <: AnonArtistName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbumName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtistName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artistName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenreNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genreNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMasteredForItunes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMasteredForItunes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSingle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSingle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtwork(value: Artwork): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artwork")(js.undefined)
        ret
    }
    @scala.inline
    def withContentRating(value: clean | explicit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentRating")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyright(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorialNotes(value: EditorialNotes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorialNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorialNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorialNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayParams(value: PlayParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playParams")(js.undefined)
        ret
    }
  }
  
}

