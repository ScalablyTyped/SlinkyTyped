package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Tabs paragraph dialog.
  */
@js.native
trait OpenTabsDialogCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenTabsDialogCommand command.
    */
  def execute(): Boolean = js.native
}
object OpenTabsDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenTabsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenTabsDialogCommand]
  }
  
  @scala.inline
  implicit class OpenTabsDialogCommandMutableBuilder[Self <: OpenTabsDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
