package typingsSlinky.activexOffice

import typingsSlinky.activexOffice.Office.CommandBarComboBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCtrl extends js.Object {
  val Ctrl: CommandBarComboBox = js.native
}

object AnonCtrl {
  @scala.inline
  def apply(Ctrl: CommandBarComboBox): AnonCtrl = {
    val __obj = js.Dynamic.literal(Ctrl = Ctrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCtrl]
  }
  @scala.inline
  implicit class AnonCtrlOps[Self <: AnonCtrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCtrl(value: CommandBarComboBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ctrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

