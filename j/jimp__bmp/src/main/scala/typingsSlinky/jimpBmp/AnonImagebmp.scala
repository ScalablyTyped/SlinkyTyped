package typingsSlinky.jimpBmp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImagebmp extends js.Object {
  @JSName("image/bmp")
  var imageSlashbmp: js.Array[String] = js.native
}

object AnonImagebmp {
  @scala.inline
  def apply(imageSlashbmp: js.Array[String]): AnonImagebmp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/bmp")(imageSlashbmp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImagebmp]
  }
  @scala.inline
  implicit class AnonImagebmpOps[Self <: AnonImagebmp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageSlashbmp(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image/bmp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

