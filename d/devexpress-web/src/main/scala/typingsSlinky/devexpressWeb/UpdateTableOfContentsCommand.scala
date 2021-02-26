package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to update a table of contents.
  */
@js.native
trait UpdateTableOfContentsCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the UpdateTableOfContentsCommand command.
    */
  def execute(): Boolean = js.native
}
object UpdateTableOfContentsCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): UpdateTableOfContentsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[UpdateTableOfContentsCommand]
  }
  
  @scala.inline
  implicit class UpdateTableOfContentsCommandMutableBuilder[Self <: UpdateTableOfContentsCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
