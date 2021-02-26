package typingsSlinky.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandA3[R, T, U, V] extends StObject {
  
  def execute(t: T, u: U, v: V): js.Thenable[R] = js.native
}
object CommandA3 {
  
  @scala.inline
  def apply[R, T, U, V](execute: (T, U, V) => js.Thenable[R]): CommandA3[R, T, U, V] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction3(execute))
    __obj.asInstanceOf[CommandA3[R, T, U, V]]
  }
  
  @scala.inline
  implicit class CommandA3MutableBuilder[Self <: CommandA3[_, _, _, _], R, T, U, V] (val x: Self with (CommandA3[R, T, U, V])) extends AnyVal {
    
    @scala.inline
    def setExecute(value: (T, U, V) => js.Thenable[R]): Self = StObject.set(x, "execute", js.Any.fromFunction3(value))
  }
}
