package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to add an HTML formatted content in place of a selected range.
  */
@js.native
trait InsertHtmlCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertHtmlCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param html A string that specifies the inserted HTML code.
    */
  def execute(html: String): Boolean = js.native
}
object InsertHtmlCommand {
  
  @scala.inline
  def apply(execute: String => Boolean, getState: () => SimpleCommandState): InsertHtmlCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertHtmlCommand]
  }
  
  @scala.inline
  implicit class InsertHtmlCommandMutableBuilder[Self <: InsertHtmlCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: String => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
