package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Audio extends js.Object {
  // The title of the album for this audio file.
  var album: js.UndefOr[String] = js.native
  // The artist named on the album for the audio file.
  var albumArtist: js.UndefOr[String] = js.native
  // The performing artist for the audio file.
  var artist: js.UndefOr[String] = js.native
  // Bitrate expressed in kbps.
  var bitrate: js.UndefOr[Double] = js.native
  // The name of the composer of the audio file.
  var composers: js.UndefOr[String] = js.native
  // Copyright information for the audio file.
  var copyright: js.UndefOr[String] = js.native
  // The number of the disc this audio file came from.
  var disc: js.UndefOr[Double] = js.native
  // The total number of discs in this album.
  var discCount: js.UndefOr[Double] = js.native
  // Duration of the audio file, expressed in milliseconds
  var duration: js.UndefOr[Double] = js.native
  // The genre of this audio file.
  var genre: js.UndefOr[String] = js.native
  // Indicates if the file is protected with digital rights management.
  var hasDrm: js.UndefOr[Boolean] = js.native
  // Indicates if the file is encoded with a variable bitrate.
  var isVariableBitrate: js.UndefOr[Boolean] = js.native
  // The title of the audio file.
  var title: js.UndefOr[String] = js.native
  // The number of the track on the original disc for this audio file.
  var track: js.UndefOr[Double] = js.native
  // The total number of tracks on the original disc for this audio file.
  var trackCount: js.UndefOr[Double] = js.native
  // The year the audio file was recorded.
  var year: js.UndefOr[Double] = js.native
}

object Audio {
  @scala.inline
  def apply(): Audio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Audio]
  }
  @scala.inline
  implicit class AudioOps[Self <: Audio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAlbumArtist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumArtist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbumArtist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumArtist")(js.undefined)
        ret
    }
    @scala.inline
    def withArtist(value: String): Self = {
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
    def withBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withComposers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composers")(js.undefined)
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
    def withDisc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disc")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withGenre(value: String): Self = {
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
    def withHasDrm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDrm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasDrm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDrm")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVariableBitrate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVariableBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVariableBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVariableBitrate")(js.undefined)
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
    def withTrack(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackCount")(js.undefined)
        ret
    }
    @scala.inline
    def withYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(js.undefined)
        ret
    }
  }
  
}

