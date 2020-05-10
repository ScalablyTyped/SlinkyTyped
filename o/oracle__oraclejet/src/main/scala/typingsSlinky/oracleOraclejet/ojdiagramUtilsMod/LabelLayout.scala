package typingsSlinky.oracleOraclejet.ojdiagramUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelLayout extends js.Object {
  var angle: Double = js.native
  var halign: String = js.native
  var rotationPointX: Double = js.native
  var rotationPointY: Double = js.native
  var valign: String = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object LabelLayout {
  @scala.inline
  def apply(
    angle: Double,
    halign: String,
    rotationPointX: Double,
    rotationPointY: Double,
    valign: String,
    x: Double,
    y: Double
  ): LabelLayout = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], halign = halign.asInstanceOf[js.Any], rotationPointX = rotationPointX.asInstanceOf[js.Any], rotationPointY = rotationPointY.asInstanceOf[js.Any], valign = valign.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelLayout]
  }
  @scala.inline
  implicit class LabelLayoutOps[Self <: LabelLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHalign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotationPointX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationPointX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotationPointY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationPointY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valign")(value.asInstanceOf[js.Any])
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

