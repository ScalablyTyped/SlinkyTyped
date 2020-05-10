package typingsSlinky.emojiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMask extends js.Object {
  var mask: Double = js.native
  var path: String = js.native
  var sheet: String = js.native
  var sheet_size: Double = js.native
}

object AnonMask {
  @scala.inline
  def apply(mask: Double, path: String, sheet: String, sheet_size: Double): AnonMask = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any], sheet_size = sheet_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMask]
  }
  @scala.inline
  implicit class AnonMaskOps[Self <: AnonMask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheet_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet_size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

