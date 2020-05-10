package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsChildWindow extends js.Object {
  var Cancel: Boolean = js.native
  val IsChildWindow: Boolean = js.native
}

object AnonIsChildWindow {
  @scala.inline
  def apply(Cancel: Boolean, IsChildWindow: Boolean): AnonIsChildWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], IsChildWindow = IsChildWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsChildWindow]
  }
  @scala.inline
  implicit class AnonIsChildWindowOps[Self <: AnonIsChildWindow] (val x: Self) extends AnyVal {
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
    def withIsChildWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsChildWindow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

