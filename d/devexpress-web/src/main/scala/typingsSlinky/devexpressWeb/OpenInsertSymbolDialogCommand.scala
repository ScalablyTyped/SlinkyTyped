package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Symbols dialog.
  */
@js.native
trait OpenInsertSymbolDialogCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenInsertSymbolDialogCommand command.
    */
  def execute(): Boolean = js.native
}
object OpenInsertSymbolDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenInsertSymbolDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenInsertSymbolDialogCommand]
  }
  
  @scala.inline
  implicit class OpenInsertSymbolDialogCommandMutableBuilder[Self <: OpenInsertSymbolDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
