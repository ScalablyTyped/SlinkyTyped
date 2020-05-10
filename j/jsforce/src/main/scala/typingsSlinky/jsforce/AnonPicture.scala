package typingsSlinky.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPicture extends js.Object {
  var picture: String = js.native
  var thumbnail: String = js.native
}

object AnonPicture {
  @scala.inline
  def apply(picture: String, thumbnail: String): AnonPicture = {
    val __obj = js.Dynamic.literal(picture = picture.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPicture]
  }
  @scala.inline
  implicit class AnonPictureOps[Self <: AnonPicture] (val x: Self) extends AnyVal {
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

