package typingsSlinky.numeric

import typingsSlinky.numeric.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonH extends js.Object {
  var H: Matrix = js.native
  var Q: Matrix = js.native
}

object AnonH {
  @scala.inline
  def apply(H: Matrix, Q: Matrix): AnonH = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], Q = Q.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonH]
  }
  @scala.inline
  implicit class AnonHOps[Self <: AnonH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withH(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQ(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Q")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

