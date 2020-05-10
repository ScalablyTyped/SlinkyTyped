package typingsSlinky.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCropbottom extends js.Object {
  var crop_bottom: Double = js.native
  var crop_left: Double = js.native
  var crop_right: Double = js.native
  var crop_top: Double = js.native
}

object AnonCropbottom {
  @scala.inline
  def apply(crop_bottom: Double, crop_left: Double, crop_right: Double, crop_top: Double): AnonCropbottom = {
    val __obj = js.Dynamic.literal(crop_bottom = crop_bottom.asInstanceOf[js.Any], crop_left = crop_left.asInstanceOf[js.Any], crop_right = crop_right.asInstanceOf[js.Any], crop_top = crop_top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCropbottom]
  }
  @scala.inline
  implicit class AnonCropbottomOps[Self <: AnonCropbottom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrop_bottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop_bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrop_left(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop_left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrop_right(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop_right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrop_top(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop_top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

