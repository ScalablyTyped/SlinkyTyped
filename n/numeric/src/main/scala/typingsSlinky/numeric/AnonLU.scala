package typingsSlinky.numeric

import typingsSlinky.numeric.mod.Matrix
import typingsSlinky.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLU extends js.Object {
  var LU: Matrix = js.native
  var P: Vector = js.native
}

object AnonLU {
  @scala.inline
  def apply(LU: Matrix, P: Vector): AnonLU = {
    val __obj = js.Dynamic.literal(LU = LU.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLU]
  }
  @scala.inline
  implicit class AnonLUOps[Self <: AnonLU] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLU(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LU")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

