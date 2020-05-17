package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.extension.ViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabId extends js.Object {
  /** Find a view according to a tab id. If this field is omitted, returns all views. */
  var tabId: js.UndefOr[Double] = js.native
  /**
    * The type of view to get. If omitted, returns all views (including background pages and tabs). Valid values:
    * 'tab', 'popup', 'sidebar'.
    */
  var `type`: js.UndefOr[ViewType] = js.native
  /** The window to restrict the search to. If omitted, returns all views. */
  var windowId: js.UndefOr[Double] = js.native
}

object TabId {
  @scala.inline
  def apply(): TabId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabId]
  }
  @scala.inline
  implicit class TabIdOps[Self <: TabId] (val x: Self) extends AnyVal {
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
    def withType(value: ViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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

