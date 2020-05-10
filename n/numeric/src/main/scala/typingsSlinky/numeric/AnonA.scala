package typingsSlinky.numeric

import typingsSlinky.numeric.mod.Matrix
import typingsSlinky.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonA extends js.Object {
  var A: Matrix = js.native
  var I: Matrix = js.native
  var P: Vector = js.native
}

object AnonA {
  @scala.inline
  def apply(A: Matrix, I: Matrix, P: Vector): AnonA = {
    val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], I = I.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonA]
  }
  @scala.inline
  implicit class AnonAOps[Self <: AnonA] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("I")(value.asInstanceOf[js.Any])
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

