package typingsSlinky.digibyte.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reverse extends js.Object {
  def reverse(a: js.Any): js.Any = js.native
}

object Reverse {
  @scala.inline
  def apply(reverse: js.Any => js.Any): Reverse = {
    val __obj = js.Dynamic.literal(reverse = js.Any.fromFunction1(reverse))
    __obj.asInstanceOf[Reverse]
  }
  @scala.inline
  implicit class ReverseOps[Self <: Reverse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReverse(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

