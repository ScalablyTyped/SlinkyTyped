package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle left paragraph alignment on and off.
  */
@js.native
trait ToggleParagraphAlignmentLeftCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleParagraphAlignmentLeftCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleParagraphAlignmentLeftCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleParagraphAlignmentLeftCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleParagraphAlignmentLeftCommand]
  }
  
  @scala.inline
  implicit class ToggleParagraphAlignmentLeftCommandMutableBuilder[Self <: ToggleParagraphAlignmentLeftCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
