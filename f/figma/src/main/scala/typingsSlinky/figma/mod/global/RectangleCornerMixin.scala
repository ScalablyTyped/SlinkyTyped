package typingsSlinky.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RectangleCornerMixin extends js.Object {
  var bottomLeftRadius: Double = js.native
  var bottomRightRadius: Double = js.native
  var topLeftRadius: Double = js.native
  var topRightRadius: Double = js.native
}

object RectangleCornerMixin {
  @scala.inline
  def apply(bottomLeftRadius: Double, bottomRightRadius: Double, topLeftRadius: Double, topRightRadius: Double): RectangleCornerMixin = {
    val __obj = js.Dynamic.literal(bottomLeftRadius = bottomLeftRadius.asInstanceOf[js.Any], bottomRightRadius = bottomRightRadius.asInstanceOf[js.Any], topLeftRadius = topLeftRadius.asInstanceOf[js.Any], topRightRadius = topRightRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectangleCornerMixin]
  }
  @scala.inline
  implicit class RectangleCornerMixinOps[Self <: RectangleCornerMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomLeftRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeftRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomRightRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRightRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopLeftRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeftRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopRightRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRightRadius")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

