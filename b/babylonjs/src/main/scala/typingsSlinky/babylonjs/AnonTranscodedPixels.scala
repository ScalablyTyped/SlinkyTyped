package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTranscodedPixels extends js.Object {
  var height: Double = js.native
  var transcodedPixels: js.typedarray.ArrayBufferView = js.native
  var width: Double = js.native
}

object AnonTranscodedPixels {
  @scala.inline
  def apply(height: Double, transcodedPixels: js.typedarray.ArrayBufferView, width: Double): AnonTranscodedPixels = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], transcodedPixels = transcodedPixels.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTranscodedPixels]
  }
  @scala.inline
  implicit class AnonTranscodedPixelsOps[Self <: AnonTranscodedPixels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranscodedPixels(value: js.typedarray.ArrayBufferView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcodedPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

