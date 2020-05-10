package typingsSlinky.activexPowerpoint

import typingsSlinky.activexPowerpoint.PowerPoint.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProtViewWindow extends js.Object {
  val ProtViewWindow: ProtectedViewWindow = js.native
}

object AnonProtViewWindow {
  @scala.inline
  def apply(ProtViewWindow: ProtectedViewWindow): AnonProtViewWindow = {
    val __obj = js.Dynamic.literal(ProtViewWindow = ProtViewWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProtViewWindow]
  }
  @scala.inline
  implicit class AnonProtViewWindowOps[Self <: AnonProtViewWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtViewWindow(value: ProtectedViewWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProtViewWindow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

