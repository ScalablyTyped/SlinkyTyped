package typingsSlinky.lyricParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Album extends js.Object {
  var album: String = js.native
  var artist: String = js.native
  var by: String = js.native
  var offset: String = js.native
  var title: String = js.native
}

object Album {
  @scala.inline
  def apply(album: String, artist: String, by: String, offset: String, title: String): Album = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], by = by.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Album]
  }
  @scala.inline
  implicit class AlbumOps[Self <: Album] (val x: Self) extends AnyVal {
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
    def withArtist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
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

