package typingsSlinky.activexExcel

import typingsSlinky.activexExcel.Excel.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelPvw extends js.Object {
  var Cancel: Boolean = js.native
  val Pvw: ProtectedViewWindow = js.native
}

object AnonCancelPvw {
  @scala.inline
  def apply(Cancel: Boolean, Pvw: ProtectedViewWindow): AnonCancelPvw = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pvw = Pvw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelPvw]
  }
  @scala.inline
  implicit class AnonCancelPvwOps[Self <: AnonCancelPvw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPvw(value: ProtectedViewWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pvw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

