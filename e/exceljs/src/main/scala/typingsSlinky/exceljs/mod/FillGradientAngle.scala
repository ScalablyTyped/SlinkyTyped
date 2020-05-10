package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.angle
import typingsSlinky.exceljs.exceljsStrings.gradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillGradientAngle extends Fill {
  /**
  	 * For 'angle' gradient, specifies the direction of the gradient. 0 is from the left to the right.
  	 * Values from 1 - 359 rotates the direction clockwise
  	 */
  var degree: Double = js.native
  var gradient: angle = js.native
  /**
  	 * Specifies the gradient colour sequence. Is an array of objects containing position and
  	 * color starting with position 0 and ending with position 1.
  	 * Intermediary positions may be used to specify other colours on the path.
  	 */
  var stops: js.Array[GradientStop] = js.native
  var `type`: gradient = js.native
}

object FillGradientAngle {
  @scala.inline
  def apply(degree: Double, gradient: angle, stops: js.Array[GradientStop], `type`: gradient): FillGradientAngle = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillGradientAngle]
  }
  @scala.inline
  implicit class FillGradientAngleOps[Self <: FillGradientAngle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDegree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradient(value: angle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStops(value: js.Array[GradientStop]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: gradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

