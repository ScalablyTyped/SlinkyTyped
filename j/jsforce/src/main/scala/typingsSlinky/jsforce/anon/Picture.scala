package typingsSlinky.jsforce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Picture extends js.Object {
  var picture: String = js.native
  var thumbnail: String = js.native
}

object Picture {
  @scala.inline
  def apply(picture: String, thumbnail: String): Picture = {
    val __obj = js.Dynamic.literal(picture = picture.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Picture]
  }
  @scala.inline
  implicit class PictureOps[Self <: Picture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPicture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

