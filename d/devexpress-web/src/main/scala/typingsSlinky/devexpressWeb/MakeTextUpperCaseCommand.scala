package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to convert the selected text to upper case.
  */
@js.native
trait MakeTextUpperCaseCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the MakeTextUpperCaseCommand command.
    */
  def execute(): Boolean = js.native
}
object MakeTextUpperCaseCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): MakeTextUpperCaseCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MakeTextUpperCaseCommand]
  }
  
  @scala.inline
  implicit class MakeTextUpperCaseCommandMutableBuilder[Self <: MakeTextUpperCaseCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
