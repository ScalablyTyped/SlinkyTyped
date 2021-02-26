package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to remove the selected numeration.
  */
@js.native
trait RemoveNumerationCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the RemoveNumerationCommand command.
    */
  def execute(): Boolean = js.native
}
object RemoveNumerationCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemoveNumerationCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemoveNumerationCommand]
  }
  
  @scala.inline
  implicit class RemoveNumerationCommandMutableBuilder[Self <: RemoveNumerationCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
