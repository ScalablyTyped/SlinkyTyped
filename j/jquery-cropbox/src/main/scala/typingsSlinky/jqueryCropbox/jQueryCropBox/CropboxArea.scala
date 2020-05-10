package typingsSlinky.jqueryCropbox.jQueryCropBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropboxArea extends js.Object {
  var cropH: Double = js.native
  var cropW: Double = js.native
  var cropX: Double = js.native
  var cropY: Double = js.native
}

object CropboxArea {
  @scala.inline
  def apply(cropH: Double, cropW: Double, cropX: Double, cropY: Double): CropboxArea = {
    val __obj = js.Dynamic.literal(cropH = cropH.asInstanceOf[js.Any], cropW = cropW.asInstanceOf[js.Any], cropX = cropX.asInstanceOf[js.Any], cropY = cropY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropboxArea]
  }
  @scala.inline
  implicit class CropboxAreaOps[Self <: CropboxArea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCropH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCropW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCropX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCropY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

