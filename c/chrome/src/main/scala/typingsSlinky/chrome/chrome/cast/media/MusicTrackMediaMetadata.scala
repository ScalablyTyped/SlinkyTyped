package typingsSlinky.chrome.chrome.cast.media

import typingsSlinky.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicTrackMediaMetadata extends js.Object {
  var albumArtist: String = js.native
  var albumName: String = js.native
  var artist: String = js.native
  /** @deprecated. Use artist instead. */
  var artistName: String = js.native
  var composer: String = js.native
  var discNumber: Double = js.native
  var images: js.Array[Image] = js.native
  var metadataType: MetadataType = js.native
  var releaseDate: String = js.native
  /** @deprecated. Use releaseDate instead. */
  var releaseYear: Double = js.native
  var songName: String = js.native
  var title: String = js.native
  var trackNumber: Double = js.native
  /** @deprecated. Use metadataType instead. */
  var `type`: MetadataType = js.native
}

object MusicTrackMediaMetadata {
  @scala.inline
  def apply(
    albumArtist: String,
    albumName: String,
    artist: String,
    artistName: String,
    composer: String,
    discNumber: Double,
    images: js.Array[Image],
    metadataType: MetadataType,
    releaseDate: String,
    releaseYear: Double,
    songName: String,
    title: String,
    trackNumber: Double,
    `type`: MetadataType
  ): MusicTrackMediaMetadata = {
    val __obj = js.Dynamic.literal(albumArtist = albumArtist.asInstanceOf[js.Any], albumName = albumName.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], artistName = artistName.asInstanceOf[js.Any], composer = composer.asInstanceOf[js.Any], discNumber = discNumber.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], releaseYear = releaseYear.asInstanceOf[js.Any], songName = songName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trackNumber = trackNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicTrackMediaMetadata]
  }
  @scala.inline
  implicit class MusicTrackMediaMetadataOps[Self <: MusicTrackMediaMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbumArtist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumArtist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlbumName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtistName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artistName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComposer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discNumber")(value.asInstanceOf[js.Any])
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
    def withReleaseDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSongName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("songName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackNumber")(value.asInstanceOf[js.Any])
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

