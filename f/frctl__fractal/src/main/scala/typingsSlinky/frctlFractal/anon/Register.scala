package typingsSlinky.frctlFractal.anon

import typingsSlinky.frctlFractal.mod.Adapter
import typingsSlinky.frctlFractal.mod.fractal.core.entities.Entity
import typingsSlinky.frctlFractal.mod.fractal.core.entities.EntitySource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Register[T /* <: Entity */, TEngine] extends StObject {
  
  def register(source: EntitySource[T, _], app: js.Any): Adapter[TEngine] = js.native
}
object Register {
  
  @scala.inline
  def apply[T /* <: Entity */, TEngine](register: (EntitySource[T, _], js.Any) => Adapter[TEngine]): Register[T, TEngine] = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[Register[T, TEngine]]
  }
  
  @scala.inline
  implicit class RegisterMutableBuilder[Self <: Register[_, _], T /* <: Entity */, TEngine] (val x: Self with (Register[T, TEngine])) extends AnyVal {
    
    @scala.inline
    def setRegister(value: (EntitySource[T, _], js.Any) => Adapter[TEngine]): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
  }
}
