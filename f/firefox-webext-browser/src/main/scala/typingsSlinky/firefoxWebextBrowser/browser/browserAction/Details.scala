package typingsSlinky.firefoxWebextBrowser.browser.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* browserAction types */
/**
  * Specifies to which tab or window the value should be set, or from which one it should be retrieved. If no tab
  * nor window is specified, the global value is set or retrieved.
  */
@js.native
trait Details extends js.Object {
  /**
    * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab
    * navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the
    * window one will be inherited.
    */
  var tabId: js.UndefOr[Double] = js.native
  /**
    * When setting a value, it will be specific to the specified window. When getting, specifies the window to get
    * the value from; if there is no window-specific value, the global one will be inherited.
    */
  var windowId: js.UndefOr[Double] = js.native
}

object Details {
  @scala.inline
  def apply(): Details = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Details]
  }
  @scala.inline
  implicit class DetailsOps[Self <: Details] (val x: Self) extends AnyVal {
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

