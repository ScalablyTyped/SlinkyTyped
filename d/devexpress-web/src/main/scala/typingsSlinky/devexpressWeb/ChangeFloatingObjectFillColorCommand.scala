package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a floating object's background fill color.
  */
@js.native
trait ChangeFloatingObjectFillColorCommand extends CommandBase {
  
  /**
    * Executes the ChangeFloatingObjectFillColorCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string value specifying the color.
    */
  def execute(color: String): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[String] = js.native
}
object ChangeFloatingObjectFillColorCommand {
  
  @scala.inline
  def apply(execute: String => Boolean, getState: () => CommandState[String]): ChangeFloatingObjectFillColorCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectFillColorCommand]
  }
  
  @scala.inline
  implicit class ChangeFloatingObjectFillColorCommandMutableBuilder[Self <: ChangeFloatingObjectFillColorCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: String => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[String]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
