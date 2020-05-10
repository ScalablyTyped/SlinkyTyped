package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionHelper extends js.Object {
  def now(): Raw[_] = js.native
}

object FunctionHelper {
  @scala.inline
  def apply(now: () => Raw[_]): FunctionHelper = {
    val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
    __obj.asInstanceOf[FunctionHelper]
  }
  @scala.inline
  implicit class FunctionHelperOps[Self <: FunctionHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNow(value: () => Raw[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

