package typingsSlinky.activexPowerpoint.anon

import typingsSlinky.activexPowerpoint.PowerPoint.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtViewWindow extends js.Object {
  val ProtViewWindow: ProtectedViewWindow = js.native
}

object ProtViewWindow {
  @scala.inline
  def apply(ProtViewWindow: ProtectedViewWindow): ProtViewWindow = {
    val __obj = js.Dynamic.literal(ProtViewWindow = ProtViewWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtViewWindow]
  }
  @scala.inline
  implicit class ProtViewWindowOps[Self <: ProtViewWindow] (val x: Self) extends AnyVal {
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

