package typingsSlinky.mathjs

import typingsSlinky.mathjs.mod.MathArray
import typingsSlinky.mathjs.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQ extends js.Object {
  var Q: MathArray | Matrix = js.native
  var R: MathArray | Matrix = js.native
}

object AnonQ {
  @scala.inline
  def apply(Q: MathArray | Matrix, R: MathArray | Matrix): AnonQ = {
    val __obj = js.Dynamic.literal(Q = Q.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQ]
  }
  @scala.inline
  implicit class AnonQOps[Self <: AnonQ] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQ(value: MathArray | Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: MathArray | Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("R")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

