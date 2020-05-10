package typingsSlinky.reactAce.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommandManager extends js.Object {
  var bindKey: js.UndefOr[js.Function2[/* bindKey */ js.Any, /* command */ js.Any, Unit]] = js.native
  var byName: js.Any = js.native
  var commands: js.Any = js.native
  var platform: String = js.native
  def addCommand(command: js.Any): Unit = js.native
  def addCommands(commands: js.Array[_]): Unit = js.native
  def exec(name: String, editor: js.Any, args: js.Any): Unit = js.native
}

object ICommandManager {
  @scala.inline
  def apply(
    addCommand: js.Any => Unit,
    addCommands: js.Array[_] => Unit,
    byName: js.Any,
    commands: js.Any,
    exec: (String, js.Any, js.Any) => Unit,
    platform: String
  ): ICommandManager = {
    val __obj = js.Dynamic.literal(addCommand = js.Any.fromFunction1(addCommand), addCommands = js.Any.fromFunction1(addCommands), byName = byName.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], exec = js.Any.fromFunction3(exec), platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandManager]
  }
  @scala.inline
  implicit class ICommandManagerOps[Self <: ICommandManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCommand(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddCommands(value: js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCommands")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withByName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommands(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExec(value: (String, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBindKey(value: (/* bindKey */ js.Any, /* command */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBindKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindKey")(js.undefined)
        ret
    }
  }
  
}

