package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCloseReason extends js.Object {
  var Cancel: Boolean = js.native
  val CloseReason: Double = js.native
  val PvWindow: ProtectedViewWindow = js.native
}

object AnonCloseReason {
  @scala.inline
  def apply(Cancel: Boolean, CloseReason: Double, PvWindow: ProtectedViewWindow): AnonCloseReason = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], CloseReason = CloseReason.asInstanceOf[js.Any], PvWindow = PvWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloseReason]
  }
  @scala.inline
  implicit class AnonCloseReasonOps[Self <: AnonCloseReason] (val x: Self) extends AnyVal {
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
    def withCloseReason(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloseReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPvWindow(value: ProtectedViewWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PvWindow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

