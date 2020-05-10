package typingsSlinky.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommand extends js.Object {
  val Cancel: js.Any = js.native
  val Command: js.Any = js.native
}

object AnonCommand {
  @scala.inline
  def apply(Cancel: js.Any, Command: js.Any): AnonCommand = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommand]
  }
  @scala.inline
  implicit class AnonCommandOps[Self <: AnonCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Command")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

