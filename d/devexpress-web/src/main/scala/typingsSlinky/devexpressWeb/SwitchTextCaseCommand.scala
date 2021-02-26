package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to switch the text case at the current position in the document.
  */
@js.native
trait SwitchTextCaseCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the SwitchTextCaseCommand command.
    */
  def execute(): Boolean = js.native
}
object SwitchTextCaseCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): SwitchTextCaseCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SwitchTextCaseCommand]
  }
  
  @scala.inline
  implicit class SwitchTextCaseCommandMutableBuilder[Self <: SwitchTextCaseCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
