package typingsSlinky.jupyterlabLauncher.mod.ILauncher

import typingsSlinky.phosphorCommands.mod.CommandRegistry
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a Launcher.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The command registry used by the launcher.
    */
  var commands: CommandRegistry = js.native
  /**
    * The cwd of the launcher.
    */
  var cwd: String = js.native
  /**
    * The callback used when an item is launched.
    */
  def callback(widget: Widget): Unit = js.native
}

object IOptions {
  @scala.inline
  def apply(callback: Widget => Unit, commands: CommandRegistry, cwd: String): IOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), commands = commands.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: Widget => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCommands(value: CommandRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

