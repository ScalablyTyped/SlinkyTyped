package typingsSlinky.googleVisualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColor1 extends js.Object {
  var color1: String = js.native
  var color2: String = js.native
  var useObjectBoundingBoxUnits: js.UndefOr[Boolean] = js.native
  var x1: String = js.native
  var x2: String = js.native
  var y1: String = js.native
  var y2: String = js.native
}

object AnonColor1 {
  @scala.inline
  def apply(color1: String, color2: String, x1: String, x2: String, y1: String, y2: String): AnonColor1 = {
    val __obj = js.Dynamic.literal(color1 = color1.asInstanceOf[js.Any], color2 = color2.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor1]
  }
  @scala.inline
  implicit class AnonColor1Ops[Self <: AnonColor1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseObjectBoundingBoxUnits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useObjectBoundingBoxUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseObjectBoundingBoxUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useObjectBoundingBoxUnits")(js.undefined)
        ret
    }
  }
  
}

