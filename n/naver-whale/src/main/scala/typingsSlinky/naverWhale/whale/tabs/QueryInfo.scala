package typingsSlinky.naverWhale.whale.tabs

import typingsSlinky.naverWhale.naverWhaleStrings.app
import typingsSlinky.naverWhale.naverWhaleStrings.complete
import typingsSlinky.naverWhale.naverWhaleStrings.devtools
import typingsSlinky.naverWhale.naverWhaleStrings.loading
import typingsSlinky.naverWhale.naverWhaleStrings.normal
import typingsSlinky.naverWhale.naverWhaleStrings.panel
import typingsSlinky.naverWhale.naverWhaleStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryInfo extends js.Object {
  /** Optional. Whether the tabs are active in their windows. */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Whether the tabs are audible.
    * @since Chrome 45.
    */
  var audible: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * Whether the tabs can be discarded automatically by the browser when resources are low.
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Whether the tabs are in the current window.
    * @since Chrome 19.
    */
  var currentWindow: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * Whether the tabs are discarded. A discarded tab is one whose content has been unloaded from memory, but is still visible in the tab strip. Its content gets reloaded the next time it's activated.
    * @since Chrome 54.
    */
  var discarded: js.UndefOr[Boolean] = js.native
  /** Optional. Whether the tabs are highlighted. */
  var highlighted: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The position of the tabs within their windows.
    * @since Chrome 18.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Optional. Whether the tabs are in the last focused window.
    * @since Chrome 19.
    */
  var lastFocusedWindow: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Whether the tabs are muted.
    * @since Chrome 45.
    */
  var muted: js.UndefOr[Boolean] = js.native
  /** Optional. Whether the tabs are pinned. */
  var pinned: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Whether the tabs have completed loading.
    * One of: "loading", or "complete"
    */
  var status: js.UndefOr[loading | complete] = js.native
  /** Optional. Match page titles against a pattern. */
  var title: js.UndefOr[String] = js.native
  /** Optional. Match tabs against one or more URL patterns. Note that fragment identifiers are not matched. */
  var url: js.UndefOr[String | js.Array[String]] = js.native
  /** Optional. The ID of the parent window, or windows.WINDOW_ID_CURRENT for the current window. */
  var windowId: js.UndefOr[Double] = js.native
  /**
    * Optional. The type of window the tabs are in.
    * One of: "normal", "popup", "panel", "app", or "devtools"
    */
  var windowType: js.UndefOr[normal | popup | panel | app | devtools] = js.native
}

object QueryInfo {
  @scala.inline
  def apply(): QueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInfo]
  }
  @scala.inline
  implicit class QueryInfoOps[Self <: QueryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAudible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audible")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDiscardable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDiscardable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDiscardable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDiscardable")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscarded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discarded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscarded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discarded")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlighted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlighted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighted")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withLastFocusedWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFocusedWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastFocusedWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFocusedWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(js.undefined)
        ret
    }
    @scala.inline
    def withPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: loading | complete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
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
    @scala.inline
    def withWindowType(value: normal | popup | panel | app | devtools): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowType")(js.undefined)
        ret
    }
  }
  
}

