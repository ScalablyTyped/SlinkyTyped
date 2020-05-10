package typingsSlinky.mathjs

import typingsSlinky.mathjs.mod.MathArray
import typingsSlinky.mathjs.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonL extends js.Object {
  var L: MathArray | Matrix = js.native
  var P: js.Array[Double] = js.native
  var U: MathArray | Matrix = js.native
}

object AnonL {
  @scala.inline
  def apply(L: MathArray | Matrix, P: js.Array[Double], U: MathArray | Matrix): AnonL = {
    val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonL]
  }
  @scala.inline
  implicit class AnonLOps[Self <: AnonL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withL(value: MathArray | Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("L")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withU(value: MathArray | Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("U")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

