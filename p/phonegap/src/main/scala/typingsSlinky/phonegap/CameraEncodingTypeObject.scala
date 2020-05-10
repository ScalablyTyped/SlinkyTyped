package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraEncodingTypeObject extends js.Object {
  var JPEG: Double = js.native
  var PNG: Double = js.native
}

object CameraEncodingTypeObject {
  @scala.inline
  def apply(JPEG: Double, PNG: Double): CameraEncodingTypeObject = {
    val __obj = js.Dynamic.literal(JPEG = JPEG.asInstanceOf[js.Any], PNG = PNG.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraEncodingTypeObject]
  }
  @scala.inline
  implicit class CameraEncodingTypeObjectOps[Self <: CameraEncodingTypeObject] (val x: Self) extends AnyVal {
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

