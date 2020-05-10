package typingsSlinky.reactAce.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommand extends js.Object {
  var bindKey: ICommandBindKey = js.native
  var name: String = js.native
  def exec(): js.Any = js.native
}

object ICommand {
  @scala.inline
  def apply(bindKey: ICommandBindKey, exec: () => js.Any, name: String): ICommand = {
    val __obj = js.Dynamic.literal(bindKey = bindKey.asInstanceOf[js.Any], exec = js.Any.fromFunction0(exec), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommand]
  }
  @scala.inline
  implicit class ICommandOps[Self <: ICommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindKey(value: ICommandBindKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExec(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

