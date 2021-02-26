package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to format a current paragraph with double line spacing.
  */
@js.native
trait SetDoubleParagraphSpacingCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the SetDoubleParagraphSpacingCommand command.
    */
  def execute(): Boolean = js.native
}
object SetDoubleParagraphSpacingCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): SetDoubleParagraphSpacingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[SetDoubleParagraphSpacingCommand]
  }
  
  @scala.inline
  implicit class SetDoubleParagraphSpacingCommandMutableBuilder[Self <: SetDoubleParagraphSpacingCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
