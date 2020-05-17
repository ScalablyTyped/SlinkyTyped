package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Panel extends js.Object {
  /** The url to the html file to show in a sidebar. If set to the empty string (''), no sidebar is shown. */
  var panel: String | Null = js.native
  /** Sets the sidebar url for the tab specified by tabId. Automatically resets when the tab is closed. */
  var tabId: js.UndefOr[Double] = js.native
  /** Sets the sidebar url for the window specified by windowId. */
  var windowId: js.UndefOr[Double] = js.native
}

object Panel {
  @scala.inline
  def apply(): Panel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Panel]
  }
  @scala.inline
  implicit class PanelOps[Self <: Panel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPanel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(null)
        ret
    }
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

