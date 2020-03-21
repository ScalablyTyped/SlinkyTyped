package typingsSlinky.jupyterlabLauncher.mod.ILauncher

import typingsSlinky.phosphorCommands.mod.CommandRegistry
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a Launcher.
  */
trait IOptions extends js.Object {
  /**
    * The command registry used by the launcher.
    */
  var commands: CommandRegistry
  /**
    * The cwd of the launcher.
    */
  var cwd: String
  /**
    * The callback used when an item is launched.
    */
  def callback(widget: Widget): Unit
}

object IOptions {
  @scala.inline
  def apply(callback: Widget => Unit, commands: CommandRegistry, cwd: String): IOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), commands = commands.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

