package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.commands.Command
import typingsSlinky.chrome.chrome.commands.CommandEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Commands
////////////////////
/**
  * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to open the browser action or send a command to the extension.
  * Availability: Since Chrome 25.
  * Manifest:  "commands": {...}
  */
@JSGlobal("chrome.commands")
@js.native
object commands extends js.Object {
  var onCommand: CommandEvent = js.native
  def getAll(callback: js.Function1[/* commands */ js.Array[Command], Unit]): Unit = js.native
}

