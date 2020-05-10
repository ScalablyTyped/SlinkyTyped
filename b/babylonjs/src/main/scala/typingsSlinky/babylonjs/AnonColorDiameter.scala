package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.mathColorMod.Color3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColorDiameter extends js.Object {
  var color: Color3 = js.native
  var diameter: Double = js.native
  var segments: Double = js.native
}

object AnonColorDiameter {
  @scala.inline
  def apply(color: Color3, diameter: Double, segments: Double): AnonColorDiameter = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], diameter = diameter.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorDiameter]
  }
  @scala.inline
  implicit class AnonColorDiameterOps[Self <: AnonColorDiameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiameter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

