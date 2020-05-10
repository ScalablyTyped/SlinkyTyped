package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.OlShiftState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeyCode extends js.Object {
  val KeyCode: Double = js.native
  val Shift: OlShiftState = js.native
}

object AnonKeyCode {
  @scala.inline
  def apply(KeyCode: Double, Shift: OlShiftState): AnonKeyCode = {
    val __obj = js.Dynamic.literal(KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyCode]
  }
  @scala.inline
  implicit class AnonKeyCodeOps[Self <: AnonKeyCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShift(value: OlShiftState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shift")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

