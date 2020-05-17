package typingsSlinky.easeljs.createjs.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoundRect extends js.Object {
  var h: Double = js.native
  var radiusBL: Double = js.native
  var radiusBR: Double = js.native
  var radiusTL: Double = js.native
  var radiusTR: Double = js.native
  var w: Double = js.native
  // properties
  var x: Double = js.native
  var y: Double = js.native
}

object RoundRect {
  @scala.inline
  def apply(
    h: Double,
    radiusBL: Double,
    radiusBR: Double,
    radiusTL: Double,
    radiusTR: Double,
    w: Double,
    x: Double,
    y: Double
  ): RoundRect = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], radiusBL = radiusBL.asInstanceOf[js.Any], radiusBR = radiusBR.asInstanceOf[js.Any], radiusTL = radiusTL.asInstanceOf[js.Any], radiusTR = radiusTR.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundRect]
  }
  @scala.inline
  implicit class RoundRectOps[Self <: RoundRect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadiusBL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusBL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadiusBR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusBR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadiusTL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadiusTR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

