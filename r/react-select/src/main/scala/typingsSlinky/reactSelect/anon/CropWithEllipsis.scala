package typingsSlinky.reactSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropWithEllipsis extends js.Object {
  var cropWithEllipsis: Boolean = js.native
}

object CropWithEllipsis {
  @scala.inline
  def apply(cropWithEllipsis: Boolean): CropWithEllipsis = {
    val __obj = js.Dynamic.literal(cropWithEllipsis = cropWithEllipsis.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropWithEllipsis]
  }
  @scala.inline
  implicit class CropWithEllipsisOps[Self <: CropWithEllipsis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCropWithEllipsis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropWithEllipsis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

