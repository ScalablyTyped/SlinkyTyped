package typingsSlinky.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsChildWindow extends js.Object {
  var Cancel: Boolean = js.native
  val IsChildWindow: Boolean = js.native
}

object IsChildWindow {
  @scala.inline
  def apply(Cancel: Boolean, IsChildWindow: Boolean): IsChildWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], IsChildWindow = IsChildWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsChildWindow]
  }
  @scala.inline
  implicit class IsChildWindowOps[Self <: IsChildWindow] (val x: Self) extends AnyVal {
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

