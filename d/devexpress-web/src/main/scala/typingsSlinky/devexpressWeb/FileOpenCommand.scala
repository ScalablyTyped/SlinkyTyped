package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to open the file, specifying its path.
  */
@js.native
trait FileOpenCommand extends StObject {
  
  /**
    * Executes the FileOpenCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param path A string value specifying path to the opening file.
    */
  def execute(path: String): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState = js.native
}
object FileOpenCommand {
  
  @scala.inline
  def apply(execute: String => Boolean, getState: () => SimpleCommandState): FileOpenCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[FileOpenCommand]
  }
  
  @scala.inline
  implicit class FileOpenCommandMutableBuilder[Self <: FileOpenCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: String => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => SimpleCommandState): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
