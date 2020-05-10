package typingsSlinky.fabric

import typingsSlinky.fabric.fabricImplMod.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCorner extends js.Object {
  var corner: String = js.native
  var originX: String = js.native
  var originY: String = js.native
  var original: Object = js.native
  var width: Double = js.native
}

object AnonCorner {
  @scala.inline
  def apply(corner: String, originX: String, originY: String, original: Object, width: Double): AnonCorner = {
    val __obj = js.Dynamic.literal(corner = corner.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCorner]
  }
  @scala.inline
  implicit class AnonCornerOps[Self <: AnonCorner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal(value: Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original")(value.asInstanceOf[js.Any])
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

