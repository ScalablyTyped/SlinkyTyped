package typingsSlinky.activexPowerpoint

import typingsSlinky.activexPowerpoint.PowerPoint.PpProtectedViewCloseReason
import typingsSlinky.activexPowerpoint.PowerPoint.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProtectedViewCloseReason extends js.Object {
  var Cancel: Boolean = js.native
  val ProtViewWindow: ProtectedViewWindow = js.native
  val ProtectedViewCloseReason: PpProtectedViewCloseReason = js.native
}

object AnonProtectedViewCloseReason {
  @scala.inline
  def apply(
    Cancel: Boolean,
    ProtViewWindow: ProtectedViewWindow,
    ProtectedViewCloseReason: PpProtectedViewCloseReason
  ): AnonProtectedViewCloseReason = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ProtViewWindow = ProtViewWindow.asInstanceOf[js.Any], ProtectedViewCloseReason = ProtectedViewCloseReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProtectedViewCloseReason]
  }
  @scala.inline
  implicit class AnonProtectedViewCloseReasonOps[Self <: AnonProtectedViewCloseReason] (val x: Self) extends AnyVal {
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
    def withProtViewWindow(value: ProtectedViewWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProtViewWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtectedViewCloseReason(value: PpProtectedViewCloseReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProtectedViewCloseReason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

