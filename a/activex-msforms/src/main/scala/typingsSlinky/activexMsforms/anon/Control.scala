package typingsSlinky.activexMsforms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Control extends js.Object {
  val Control: typingsSlinky.activexMsforms.MSForms.Control = js.native
}

object Control {
  @scala.inline
  def apply(Control: typingsSlinky.activexMsforms.MSForms.Control): Control = {
    val __obj = js.Dynamic.literal(Control = Control.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
  @scala.inline
  implicit class ControlOps[Self <: Control] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControl(value: typingsSlinky.activexMsforms.MSForms.Control): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Control")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

