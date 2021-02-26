package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to copy the selected text and place it to the specified position.
  */
@js.native
trait CopyContentCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the CopyContentCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param position An integer value specifying a position of the inserted text.
    */
  def execute(position: Double): Boolean = js.native
}
object CopyContentCommand {
  
  @scala.inline
  def apply(execute: Double => Boolean, getState: () => SimpleCommandState): CopyContentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CopyContentCommand]
  }
  
  @scala.inline
  implicit class CopyContentCommandMutableBuilder[Self <: CopyContentCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: Double => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
