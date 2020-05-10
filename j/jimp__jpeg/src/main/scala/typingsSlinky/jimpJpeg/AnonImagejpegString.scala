package typingsSlinky.jimpJpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImagejpegString extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg: String = js.native
}

object AnonImagejpegString {
  @scala.inline
  def apply(imageSlashjpeg: String): AnonImagejpegString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/jpeg")(imageSlashjpeg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImagejpegString]
  }
  @scala.inline
  implicit class AnonImagejpegStringOps[Self <: AnonImagejpegString] (val x: Self) extends AnyVal {
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

