package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTabIdWindowId extends js.Object {
  /**
    * Specify the tab to get the panel from. If no tab nor window is specified, the global panel is returned.
    */
  var tabId: js.UndefOr[Double] = js.native
  /**
    * Specify the window to get the panel from. If no tab nor window is specified, the global panel is returned.
    */
  var windowId: js.UndefOr[Double] = js.native
}

object AnonTabIdWindowId {
  @scala.inline
  def apply(): AnonTabIdWindowId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTabIdWindowId]
  }
  @scala.inline
  implicit class AnonTabIdWindowIdOps[Self <: AnonTabIdWindowId] (val x: Self) extends AnyVal {
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
    def withoutTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowId")(js.undefined)
        ret
    }
  }
  
}

