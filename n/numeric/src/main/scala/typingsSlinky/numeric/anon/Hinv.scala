package typingsSlinky.numeric.anon

import typingsSlinky.numeric.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hinv extends js.Object {
  var Hinv: Matrix = js.native
}

object Hinv {
  @scala.inline
  def apply(Hinv: Matrix): Hinv = {
    val __obj = js.Dynamic.literal(Hinv = Hinv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hinv]
  }
  @scala.inline
  implicit class HinvOps[Self <: Hinv] (val x: Self) extends AnyVal {
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

