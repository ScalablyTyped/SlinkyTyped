package typingsSlinky.chromeApps.global.chrome

import typingsSlinky.chromeApps.chrome.commands.Command
import typingsSlinky.chromeApps.chrome.commands.CommandEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.commands
//////////////
// Commands //
//////////////
/**
  * @since Chrome 35.
  * @requires Manifest:  'commands': {...}
  * @description
  * Use the commands API to add keyboard shortcuts that
  * trigger actions in your app, for example, an
  * action to open the browser action or send a command
  * to the app.
  * @see[Usage]{@link https://developer.chrome.com/apps/commands}
  */
@JSGlobal("chrome.commands")
@js.native
object commands extends js.Object {
  
  /**
    * Returns all the registered commands for this app and their shortcut (if active).
    * @param callback Called to return the registered commands.
    */
  def getAll(callback: js.Function1[/* commands */ js.Array[Command], Unit]): Unit = js.native
  
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: CommandEvent = js.native
}
