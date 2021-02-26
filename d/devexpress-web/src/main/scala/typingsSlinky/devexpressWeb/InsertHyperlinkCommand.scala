package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a hyperlink at the current position in the document.
  */
@js.native
trait InsertHyperlinkCommand extends StObject {
  
  /**
    * Executes the InsertHyperlinkCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A HyperlinkSettings object specifying hyperlink settings.
    */
  def execute(settings: HyperlinkSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[HyperlinkSettings] = js.native
}
object InsertHyperlinkCommand {
  
  @scala.inline
  def apply(execute: HyperlinkSettings => Boolean, getState: () => CommandState[HyperlinkSettings]): InsertHyperlinkCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertHyperlinkCommand]
  }
  
  @scala.inline
  implicit class InsertHyperlinkCommandMutableBuilder[Self <: InsertHyperlinkCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: HyperlinkSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => CommandState[HyperlinkSettings]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
