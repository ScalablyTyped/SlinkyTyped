package typingsSlinky.nivoLine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColor extends js.Object {
  var color: String = js.native
  var x: String | Double = js.native
  var xFormatted: String | Double = js.native
  var y: Double = js.native
  var yFormatted: String | Double = js.native
  var yStacked: Double = js.native
}

object AnonColor {
  @scala.inline
  def apply(
    color: String,
    x: String | Double,
    xFormatted: String | Double,
    y: Double,
    yFormatted: String | Double,
    yStacked: Double
  ): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xFormatted = xFormatted.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yFormatted = yFormatted.asInstanceOf[js.Any], yStacked = yStacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
  @scala.inline
  implicit class AnonColorOps[Self <: AnonColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXFormatted(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xFormatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYFormatted(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yFormatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYStacked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yStacked")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

