package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a table column to the right of the current position in the table.
  */
@js.native
trait InsertTableColumnToTheRightCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableColumnToTheRightCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertTableColumnToTheRightCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableColumnToTheRightCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableColumnToTheRightCommand]
  }
  
  @scala.inline
  implicit class InsertTableColumnToTheRightCommandMutableBuilder[Self <: InsertTableColumnToTheRightCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
