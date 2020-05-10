package typingsSlinky.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlbumTracksParams extends js.Object {
  var album_id: js.UndefOr[Double] = js.native
  var album_mbid: js.UndefOr[Double] = js.native
  var format: js.UndefOr[TFormat] = js.native
}

object AlbumTracksParams {
  @scala.inline
  def apply(): AlbumTracksParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlbumTracksParams]
  }
  @scala.inline
  implicit class AlbumTracksParamsOps[Self <: AlbumTracksParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbum_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbum_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album_id")(js.undefined)
        ret
    }
    @scala.inline
    def withAlbum_mbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album_mbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbum_mbid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album_mbid")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: TFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

