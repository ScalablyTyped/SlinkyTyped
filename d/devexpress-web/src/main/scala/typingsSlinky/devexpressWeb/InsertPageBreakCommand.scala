package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a page break at the current position in the document.
  */
@js.native
trait InsertPageBreakCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertPageBreakCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertPageBreakCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertPageBreakCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertPageBreakCommand]
  }
  
  @scala.inline
  implicit class InsertPageBreakCommandMutableBuilder[Self <: InsertPageBreakCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
