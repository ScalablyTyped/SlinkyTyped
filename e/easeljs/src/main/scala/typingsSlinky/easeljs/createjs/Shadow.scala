package typingsSlinky.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shadow extends js.Object {
  // properties
  var blur: Double = js.native
  var color: String = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
}

object Shadow {
  @scala.inline
  def apply(blur: Double, color: String, offsetX: Double, offsetY: Double): Shadow = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shadow]
  }
  @scala.inline
  implicit class ShadowOps[Self <: Shadow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

