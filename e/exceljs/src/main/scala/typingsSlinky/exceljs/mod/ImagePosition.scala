package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.AnonCol
import typingsSlinky.exceljs.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePosition extends js.Object {
  var ext: AnonHeight = js.native
  var tl: AnonCol = js.native
}

object ImagePosition {
  @scala.inline
  def apply(ext: AnonHeight, tl: AnonCol): ImagePosition = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePosition]
  }
  @scala.inline
  implicit class ImagePositionOps[Self <: ImagePosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExt(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTl(value: AnonCol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

