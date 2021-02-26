package typingsSlinky.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends StObject {
  
  def execute(args: js.Any*): js.Thenable[_] = js.native
}
object Command {
  
  @scala.inline
  def apply(execute: /* repeated */ js.Any => js.Thenable[_]): Command = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: /* repeated */ js.Any => js.Thenable[_]): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
