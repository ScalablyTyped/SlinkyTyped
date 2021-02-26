package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a DATE field displaying the current date.
  */
@js.native
trait CreateDateFieldCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the CreateDateFieldCommand command.
    */
  def execute(): Boolean = js.native
}
object CreateDateFieldCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): CreateDateFieldCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CreateDateFieldCommand]
  }
  
  @scala.inline
  implicit class CreateDateFieldCommandMutableBuilder[Self <: CreateDateFieldCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
