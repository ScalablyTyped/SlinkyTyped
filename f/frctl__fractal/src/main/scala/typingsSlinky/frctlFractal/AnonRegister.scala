package typingsSlinky.frctlFractal

import typingsSlinky.frctlFractal.mod.Adapter
import typingsSlinky.frctlFractal.mod.fractal.core.entities.Entity
import typingsSlinky.frctlFractal.mod.fractal.core.entities.EntitySource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRegister[T /* <: Entity */, TEngine] extends js.Object {
  def register(source: EntitySource[T, _], app: js.Any): Adapter[TEngine] = js.native
}

object AnonRegister {
  @scala.inline
  def apply[T, TEngine](register: (EntitySource[T, _], js.Any) => Adapter[TEngine]): AnonRegister[T, TEngine] = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[AnonRegister[T, TEngine]]
  }
  @scala.inline
  implicit class AnonRegisterOps[Self[t, tengine] <: AnonRegister[t, tengine], T, TEngine] (val x: Self[T, TEngine]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, TEngine] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, TEngine]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, TEngine]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, TEngine]) with Other]
    @scala.inline
    def withRegister(value: (EntitySource[T, _], js.Any) => Adapter[TEngine]): Self[T, TEngine] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

