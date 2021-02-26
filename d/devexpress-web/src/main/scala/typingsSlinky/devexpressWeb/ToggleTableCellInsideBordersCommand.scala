package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle inner borders for selected cells on/off.
  */
@js.native
trait ToggleTableCellInsideBordersCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellInsideBordersCommand command.
    */
  def execute(): Boolean = js.native
}
object ToggleTableCellInsideBordersCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => CommandState[Boolean]): ToggleTableCellInsideBordersCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableCellInsideBordersCommand]
  }
  
  @scala.inline
  implicit class ToggleTableCellInsideBordersCommandMutableBuilder[Self <: ToggleTableCellInsideBordersCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
