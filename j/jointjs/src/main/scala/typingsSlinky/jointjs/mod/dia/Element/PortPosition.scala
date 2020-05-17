package typingsSlinky.jointjs.mod.dia.Element

import typingsSlinky.jointjs.mod.g.PlainPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortPosition extends PlainPoint {
  var angle: Double = js.native
}

object PortPosition {
  @scala.inline
  def apply(angle: Double, x: Double, y: Double): PortPosition = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortPosition]
  }
  @scala.inline
  implicit class PortPositionOps[Self <: PortPosition] (val x: Self) extends AnyVal {
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
  }
  
}

