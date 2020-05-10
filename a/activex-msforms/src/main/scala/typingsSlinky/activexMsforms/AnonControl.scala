package typingsSlinky.activexMsforms

import typingsSlinky.activexMsforms.MSForms.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonControl extends js.Object {
  val Control: typingsSlinky.activexMsforms.MSForms.Control = js.native
}

object AnonControl {
  @scala.inline
  def apply(Control: Control): AnonControl = {
    val __obj = js.Dynamic.literal(Control = Control.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonControl]
  }
  @scala.inline
  implicit class AnonControlOps[Self <: AnonControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControl(value: Control): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Control")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

