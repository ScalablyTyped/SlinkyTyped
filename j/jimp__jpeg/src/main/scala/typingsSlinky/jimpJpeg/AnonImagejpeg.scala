package typingsSlinky.jimpJpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImagejpeg extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg: js.Array[String] = js.native
}

object AnonImagejpeg {
  @scala.inline
  def apply(imageSlashjpeg: js.Array[String]): AnonImagejpeg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/jpeg")(imageSlashjpeg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImagejpeg]
  }
  @scala.inline
  implicit class AnonImagejpegOps[Self <: AnonImagejpeg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageSlashjpeg(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image/jpeg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

