package typingsSlinky.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoublePoint extends js.Object {
  var X: Double = js.native
  var Y: Double = js.native
}

object DoublePoint {
  @scala.inline
  def apply(X: Double, Y: Double): DoublePoint = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoublePoint]
  }
  @scala.inline
  implicit class DoublePointOps[Self <: DoublePoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

