package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandManager extends js.Object {
  /** An object that maps a set of command names with the corresponding command objects
    * @Default {{}}
    */
  var commands: js.UndefOr[CommandManagerCommands] = js.native
}

object CommandManager {
  @scala.inline
  def apply(): CommandManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandManager]
  }
  @scala.inline
  implicit class CommandManagerOps[Self <: CommandManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(value: CommandManagerCommands): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(js.undefined)
        ret
    }
  }
  
}

