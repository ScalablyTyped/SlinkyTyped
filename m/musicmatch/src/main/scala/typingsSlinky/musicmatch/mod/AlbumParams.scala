package typingsSlinky.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlbumParams extends js.Object {
  var album_id: Double = js.native
}

object AlbumParams {
  @scala.inline
  def apply(album_id: Double): AlbumParams = {
    val __obj = js.Dynamic.literal(album_id = album_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumParams]
  }
  @scala.inline
  implicit class AlbumParamsOps[Self <: AlbumParams] (val x: Self) extends AnyVal {
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
  }
  
}

