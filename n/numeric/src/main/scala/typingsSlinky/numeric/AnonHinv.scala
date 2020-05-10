package typingsSlinky.numeric

import typingsSlinky.numeric.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHinv extends js.Object {
  var Hinv: Matrix = js.native
}

object AnonHinv {
  @scala.inline
  def apply(Hinv: Matrix): AnonHinv = {
    val __obj = js.Dynamic.literal(Hinv = Hinv.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHinv]
  }
  @scala.inline
  implicit class AnonHinvOps[Self <: AnonHinv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHinv(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hinv")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

