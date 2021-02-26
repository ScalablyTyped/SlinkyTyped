package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.commands.Command
import typingsSlinky.chromeApps.chrome.commands.CommandEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcommands extends StObject {
  
  /**
    * Returns all the registered commands for this app and their shortcut (if active).
    * @param callback Called to return the registered commands.
    */
  def getAll(callback: js.Function1[/* commands */ js.Array[Command], Unit]): Unit = js.native
  
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: CommandEvent = js.native
}
object Typeofcommands {
  
  @scala.inline
  def apply(getAll: js.Function1[/* commands */ js.Array[Command], Unit] => Unit, onCommand: CommandEvent): Typeofcommands = {
    val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction1(getAll), onCommand = onCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcommands]
  }
  
  @scala.inline
  implicit class TypeofcommandsMutableBuilder[Self <: Typeofcommands] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAll(value: js.Function1[/* commands */ js.Array[Command], Unit] => Unit): Self = StObject.set(x, "getAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCommand(value: CommandEvent): Self = StObject.set(x, "onCommand", value.asInstanceOf[js.Any])
  }
}
