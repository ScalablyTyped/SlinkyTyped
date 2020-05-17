package typingsSlinky.jimpJpeg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Imagejpeg extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg: js.Array[String] = js.native
}

object Imagejpeg {
  @scala.inline
  def apply(imageSlashjpeg: js.Array[String]): Imagejpeg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/jpeg")(imageSlashjpeg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imagejpeg]
  }
  @scala.inline
  implicit class ImagejpegOps[Self <: Imagejpeg] (val x: Self) extends AnyVal {
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

