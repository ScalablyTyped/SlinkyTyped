package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Insert Table dialog.
  */
@js.native
trait InsertTableCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param columnCount An integer value specifying a number of columns in a generated table.
    * @param rowCount An integer value specifying a number of rows in a generated table.
    */
  def execute(columnCount: Double, rowCount: Double): Boolean = js.native
}
object InsertTableCommand {
  
  @scala.inline
  def apply(execute: (Double, Double) => Boolean, getState: () => SimpleCommandState): InsertTableCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableCommand]
  }
  
  @scala.inline
  implicit class InsertTableCommandMutableBuilder[Self <: InsertTableCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: (Double, Double) => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
  }
}
