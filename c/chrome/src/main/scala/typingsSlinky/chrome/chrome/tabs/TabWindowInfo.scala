package typingsSlinky.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabWindowInfo extends js.Object {
  /** The ID of the window of where the tab is located. */
  var windowId: Double = js.native
}

object TabWindowInfo {
  @scala.inline
  def apply(windowId: Double): TabWindowInfo = {
    val __obj = js.Dynamic.literal(windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabWindowInfo]
  }
  @scala.inline
  implicit class TabWindowInfoOps[Self <: TabWindowInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWindowId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

