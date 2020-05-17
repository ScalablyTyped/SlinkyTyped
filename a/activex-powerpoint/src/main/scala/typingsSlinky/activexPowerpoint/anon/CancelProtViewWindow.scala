package typingsSlinky.activexPowerpoint.anon

import typingsSlinky.activexPowerpoint.PowerPoint.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelProtViewWindow extends js.Object {
  var Cancel: Boolean = js.native
  val ProtViewWindow: ProtectedViewWindow = js.native
}

object CancelProtViewWindow {
  @scala.inline
  def apply(Cancel: Boolean, ProtViewWindow: ProtectedViewWindow): CancelProtViewWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ProtViewWindow = ProtViewWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelProtViewWindow]
  }
  @scala.inline
  implicit class CancelProtViewWindowOps[Self <: CancelProtViewWindow] (val x: Self) extends AnyVal {
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
  }
  
}

