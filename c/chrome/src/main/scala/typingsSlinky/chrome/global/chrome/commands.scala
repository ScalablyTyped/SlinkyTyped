package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.commands.Command
import typingsSlinky.chrome.chrome.commands.CommandEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Commands
////////////////////
/**
  * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to open the browser action or send a command to the extension.
  * Availability: Since Chrome 25.
  * Manifest:  "commands": {...}
  */
object commands {
  
  @JSGlobal("chrome.commands")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.commands.getAll")
  @js.native
  def getAll(callback: js.Function1[/* commands */ js.Array[Command], Unit]): Unit = js.native
  
  @JSGlobal("chrome.commands.onCommand")
  @js.native
  def onCommand: CommandEvent = js.native
  @scala.inline
  def onCommand_=(x: CommandEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCommand")(x.asInstanceOf[js.Any])
}
