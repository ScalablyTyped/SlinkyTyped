package typingsSlinky.coreJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBind extends js.Object {
  def bind(target: Function, thisArg: js.Any, argArray: js.Any*): js.Any = js.native
  def part(target: Function, args: js.Any*): js.Any = js.native
}

object AnonBind {
  @scala.inline
  def apply(
    bind: (Function, js.Any, /* repeated */ js.Any) => js.Any,
    part: (Function, /* repeated */ js.Any) => js.Any
  ): AnonBind = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), part = js.Any.fromFunction2(part))
    __obj.asInstanceOf[AnonBind]
  }
  @scala.inline
  implicit class AnonBindOps[Self <: AnonBind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: (Function, js.Any, /* repeated */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPart(value: (Function, /* repeated */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

