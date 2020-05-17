package typingsSlinky.plottable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CenterX extends js.Object {
  var centerX: Double = js.native
  var centerY: Double = js.native
}

object CenterX {
  @scala.inline
  def apply(centerX: Double, centerY: Double): CenterX = {
    val __obj = js.Dynamic.literal(centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterX]
  }
  @scala.inline
  implicit class CenterXOps[Self <: CenterX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenterY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

