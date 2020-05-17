package typingsSlinky.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checked extends js.Object {
  val Checked: js.Any = js.native
  val Command: js.Any = js.native
}

object Checked {
  @scala.inline
  def apply(Checked: js.Any, Command: js.Any): Checked = {
    val __obj = js.Dynamic.literal(Checked = Checked.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
  @scala.inline
  implicit class CheckedOps[Self <: Checked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Checked")(value.asInstanceOf[js.Any])
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

