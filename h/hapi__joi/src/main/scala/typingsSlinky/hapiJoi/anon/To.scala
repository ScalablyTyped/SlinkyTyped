package typingsSlinky.hapiJoi.anon

import typingsSlinky.hapiJoi.mod.CustomHelpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait To extends js.Object {
  def from(value: js.Any): js.Any = js.native
  def to(value: js.Any, helpers: CustomHelpers[_]): js.Any = js.native
}

object To {
  @scala.inline
  def apply(from: js.Any => js.Any, to: (js.Any, CustomHelpers[_]) => js.Any): To = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), to = js.Any.fromFunction2(to))
    __obj.asInstanceOf[To]
  }
  @scala.inline
  implicit class ToOps[Self <: To] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTo(value: (js.Any, CustomHelpers[_]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

