package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to delete all hyperlinks in a selected range.
  */
@js.native
trait DeleteHyperlinksCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the DeleteHyperlinksCommand command.
    */
  def execute(): Boolean = js.native
}
object DeleteHyperlinksCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): DeleteHyperlinksCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[DeleteHyperlinksCommand]
  }
  
  @scala.inline
  implicit class DeleteHyperlinksCommandMutableBuilder[Self <: DeleteHyperlinksCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
