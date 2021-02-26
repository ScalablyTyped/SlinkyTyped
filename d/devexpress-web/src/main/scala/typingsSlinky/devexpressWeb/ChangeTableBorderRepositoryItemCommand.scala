package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the repository item's table border style.
  */
@js.native
trait ChangeTableBorderRepositoryItemCommand extends CommandBase {
  
  /**
    * Executes the ChangeTableBorderRepositoryItemCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableBorderSettings object specifying the repository item's table border style.
    */
  def execute(settings: TableBorderSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableBorderSettings] = js.native
}
object ChangeTableBorderRepositoryItemCommand {
  
  @scala.inline
  def apply(execute: TableBorderSettings => Boolean, getState: () => CommandState[TableBorderSettings]): ChangeTableBorderRepositoryItemCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeTableBorderRepositoryItemCommand]
  }
  
  @scala.inline
  implicit class ChangeTableBorderRepositoryItemCommandMutableBuilder[Self <: ChangeTableBorderRepositoryItemCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: TableBorderSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[TableBorderSettings]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
