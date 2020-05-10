package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreviousTabId extends js.Object {
  /** The ID of the tab that was previously active, if that tab is still open. */
  var previousTabId: js.UndefOr[Double] = js.native
  /** The ID of the tab that has become active. */
  var tabId: Double = js.native
  /** The ID of the window the active tab changed inside of. */
  var windowId: Double = js.native
}

object AnonPreviousTabId {
  @scala.inline
  def apply(tabId: Double, windowId: Double): AnonPreviousTabId = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreviousTabId]
  }
  @scala.inline
  implicit class AnonPreviousTabIdOps[Self <: AnonPreviousTabId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTabId")(js.undefined)
        ret
    }
  }
  
}

