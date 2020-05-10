package typingsSlinky.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOut extends js.Object {
  def in[T](`val`: T): T = js.native
  def out[T](`val`: T): T = js.native
}

object AnonOut {
  @scala.inline
  def apply(in: js.Any => js.Any, out: js.Any => js.Any): AnonOut = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), out = js.Any.fromFunction1(out))
    __obj.asInstanceOf[AnonOut]
  }
  @scala.inline
  implicit class AnonOutOps[Self <: AnonOut] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIn(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOut(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

