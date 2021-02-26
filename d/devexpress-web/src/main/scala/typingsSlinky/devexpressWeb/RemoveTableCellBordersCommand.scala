package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to remove the borders of the selected table cells.
  */
@js.native
trait RemoveTableCellBordersCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the RemoveTableCellBordersCommand command.
    */
  def execute(): Boolean = js.native
}
object RemoveTableCellBordersCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemoveTableCellBordersCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemoveTableCellBordersCommand]
  }
  
  @scala.inline
  implicit class RemoveTableCellBordersCommandMutableBuilder[Self <: RemoveTableCellBordersCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
