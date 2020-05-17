package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reversed extends js.Object {
  var reversed: Boolean = js.native
}

object Reversed {
  @scala.inline
  def apply(reversed: Boolean): Reversed = {
    val __obj = js.Dynamic.literal(reversed = reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reversed]
  }
  @scala.inline
  implicit class ReversedOps[Self <: Reversed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

