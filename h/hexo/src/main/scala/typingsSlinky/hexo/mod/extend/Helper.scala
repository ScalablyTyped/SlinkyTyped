package typingsSlinky.hexo.mod.extend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Helper extends js.Object {
  def register(name: String, fn: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}

object Helper {
  @scala.inline
  def apply(register: (String, js.Function1[/* repeated */ js.Any, _]) => Unit): Helper = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[Helper]
  }
  @scala.inline
  implicit class HelperOps[Self <: Helper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegister(value: (String, js.Function1[/* repeated */ js.Any, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

