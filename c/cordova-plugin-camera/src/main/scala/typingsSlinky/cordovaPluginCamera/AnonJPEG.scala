package typingsSlinky.cordovaPluginCamera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonJPEG extends js.Object {
  var JPEG: Double = js.native
  var PNG: Double = js.native
}

object AnonJPEG {
  @scala.inline
  def apply(JPEG: Double, PNG: Double): AnonJPEG = {
    val __obj = js.Dynamic.literal(JPEG = JPEG.asInstanceOf[js.Any], PNG = PNG.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJPEG]
  }
  @scala.inline
  implicit class AnonJPEGOps[Self <: AnonJPEG] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJPEG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPEG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNG")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

