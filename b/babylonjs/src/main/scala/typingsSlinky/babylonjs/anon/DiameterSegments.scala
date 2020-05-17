package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiameterSegments extends js.Object {
  var diameter: Double = js.native
  var segments: Double = js.native
}

object DiameterSegments {
  @scala.inline
  def apply(diameter: Double, segments: Double): DiameterSegments = {
    val __obj = js.Dynamic.literal(diameter = diameter.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiameterSegments]
  }
  @scala.inline
  implicit class DiameterSegmentsOps[Self <: DiameterSegments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

