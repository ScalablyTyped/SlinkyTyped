package typingsSlinky.currencyFormatter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNeg extends js.Object {
  var neg: String = js.native
  var pos: String = js.native
  var zero: String = js.native
}

object AnonNeg {
  @scala.inline
  def apply(neg: String, pos: String, zero: String): AnonNeg = {
    val __obj = js.Dynamic.literal(neg = neg.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNeg]
  }
  @scala.inline
  implicit class AnonNegOps[Self <: AnonNeg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNeg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZero(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zero")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

