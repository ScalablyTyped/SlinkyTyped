package typingsSlinky.jimpJpeg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagejpegString extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg: String = js.native
}

object ImagejpegString {
  @scala.inline
  def apply(imageSlashjpeg: String): ImagejpegString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/jpeg")(imageSlashjpeg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagejpegString]
  }
  @scala.inline
  implicit class ImagejpegStringOps[Self <: ImagejpegString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageSlashjpeg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image/jpeg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

