package typingsSlinky.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommandAny extends js.Object {
  val Command: js.Any = js.native
}

object AnonCommandAny {
  @scala.inline
  def apply(Command: js.Any): AnonCommandAny = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommandAny]
  }
  @scala.inline
  implicit class AnonCommandAnyOps[Self <: AnonCommandAny] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Command")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

