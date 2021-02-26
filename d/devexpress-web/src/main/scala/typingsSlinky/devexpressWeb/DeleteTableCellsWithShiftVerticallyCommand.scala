package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to delete the selected table cells with a vertical shift.
  */
@js.native
trait DeleteTableCellsWithShiftVerticallyCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the DeleteTableCellsWithShiftVerticallyCommand command.
    */
  def execute(): Boolean = js.native
}
object DeleteTableCellsWithShiftVerticallyCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteTableCellsWithShiftVerticallyCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteTableCellsWithShiftVerticallyCommand]
  }
  
  @scala.inline
  implicit class DeleteTableCellsWithShiftVerticallyCommandMutableBuilder[Self <: DeleteTableCellsWithShiftVerticallyCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
