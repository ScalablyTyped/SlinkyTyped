package typingsSlinky.appleMusicApi.anon

import typingsSlinky.appleMusicApi.AppleMusicApi.Artwork
import typingsSlinky.appleMusicApi.AppleMusicApi.PlayParameters
import typingsSlinky.appleMusicApi.AppleMusicApi.Preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlbumName extends js.Object {
  var albumName: String = js.native
  var artistName: String = js.native
  var artwork: js.UndefOr[Artwork] = js.native
  var composerName: js.UndefOr[String] = js.native
  var contentRating: js.UndefOr[String] = js.native
  var discNumber: Double = js.native
  var durationInMillis: Double = js.native
  var editorialNotes: js.UndefOr[typingsSlinky.appleMusicApi.AppleMusicApi.EditorialNotes] = js.native
  var genreNames: js.Array[String] = js.native
  var hasLyrics: Boolean = js.native
  var isrc: String = js.native
  var movementCount: js.UndefOr[Double] = js.native
  var movementName: js.UndefOr[String] = js.native
  var movementNumber: js.UndefOr[String] = js.native
  var name: String = js.native
  var playParams: js.UndefOr[PlayParameters] = js.native
  var previews: js.Array[Preview] = js.native
  var releaseDate: String = js.native
  var trackNumber: Double = js.native
  var url: String = js.native
  var workName: js.UndefOr[String] = js.native
}

object AlbumName {
  @scala.inline
  def apply(
    albumName: String,
    artistName: String,
    discNumber: Double,
    durationInMillis: Double,
    genreNames: js.Array[String],
    hasLyrics: Boolean,
    isrc: String,
    name: String,
    previews: js.Array[Preview],
    releaseDate: String,
    trackNumber: Double,
    url: String
  ): AlbumName = {
    val __obj = js.Dynamic.literal(albumName = albumName.asInstanceOf[js.Any], artistName = artistName.asInstanceOf[js.Any], discNumber = discNumber.asInstanceOf[js.Any], durationInMillis = durationInMillis.asInstanceOf[js.Any], genreNames = genreNames.asInstanceOf[js.Any], hasLyrics = hasLyrics.asInstanceOf[js.Any], isrc = isrc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], trackNumber = trackNumber.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumName]
  }
  @scala.inline
  implicit class AlbumNameOps[Self <: AlbumName] (val x: Self) extends AnyVal {
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
    def withDiscNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurationInMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenreNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genreNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasLyrics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLyrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviews(value: js.Array[Preview]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackNumber")(value.asInstanceOf[js.Any])
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
    def withComposerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composerName")(js.undefined)
        ret
    }
    @scala.inline
    def withContentRating(value: String): Self = {
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
    def withEditorialNotes(value: typingsSlinky.appleMusicApi.AppleMusicApi.EditorialNotes): Self = {
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
    def withMovementCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movementCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovementCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movementCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMovementName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movementName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovementName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movementName")(js.undefined)
        ret
    }
    @scala.inline
    def withMovementNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movementNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovementNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movementNumber")(js.undefined)
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
    @scala.inline
    def withWorkName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workName")(js.undefined)
        ret
    }
  }
  
}

