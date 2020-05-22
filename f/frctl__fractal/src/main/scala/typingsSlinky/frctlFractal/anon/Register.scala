package typingsSlinky.frctlFractal.anon

import typingsSlinky.frctlFractal.mod.Adapter
import typingsSlinky.frctlFractal.mod.fractal.core.entities.Entity
import typingsSlinky.frctlFractal.mod.fractal.core.entities.EntitySource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Register[T /* <: Entity */, TEngine] extends js.Object {
  def register(source: EntitySource[T, _], app: js.Any): Adapter[TEngine]
}

object Register {
  @scala.inline
  def apply[T, TEngine](register: (EntitySource[T, _], js.Any) => Adapter[TEngine]): Register[T, TEngine] = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[Register[T, TEngine]]
  }
}

