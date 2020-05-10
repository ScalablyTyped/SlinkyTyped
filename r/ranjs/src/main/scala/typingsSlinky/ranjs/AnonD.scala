package typingsSlinky.ranjs

import typingsSlinky.ranjs.mod.la.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonD extends js.Object {
  var D: Matrix = js.native
  var L: Matrix = js.native
}

object AnonD {
  @scala.inline
  def apply(D: Matrix, L: Matrix): AnonD = {
    val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonD]
  }
  @scala.inline
  implicit class AnonDOps[Self <: AnonD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("L")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

