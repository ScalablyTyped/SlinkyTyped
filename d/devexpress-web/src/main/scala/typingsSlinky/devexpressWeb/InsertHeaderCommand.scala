package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to activate the page header and begin editing.
  */
@js.native
trait InsertHeaderCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertHeaderCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertHeaderCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertHeaderCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertHeaderCommand]
  }
  
  @scala.inline
  implicit class InsertHeaderCommandMutableBuilder[Self <: InsertHeaderCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
