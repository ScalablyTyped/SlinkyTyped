package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.tabs.QueryScreen
import typingsSlinky.firefoxWebextBrowser.browser.tabs.TabStatus
import typingsSlinky.firefoxWebextBrowser.browser.tabs.WindowType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attention extends js.Object {
  /** Whether the tabs are active in their windows. */
  var active: js.UndefOr[Boolean] = js.native
  /** Whether the tabs are drawing attention. */
  var attention: js.UndefOr[Boolean] = js.native
  /** Whether the tabs are audible. */
  var audible: js.UndefOr[Boolean] = js.native
  /** True if the tab is using the camera. */
  var camera: js.UndefOr[Boolean] = js.native
  /** The CookieStoreId used for the tab. */
  var cookieStoreId: js.UndefOr[String] = js.native
  /** Whether the tabs are in the current window. */
  var currentWindow: js.UndefOr[Boolean] = js.native
  /** True while the tabs are not loaded with content. */
  var discarded: js.UndefOr[Boolean] = js.native
  /** True while the tabs are hidden. */
  var hidden: js.UndefOr[Boolean] = js.native
  /** Whether the tabs are highlighted. Works as an alias of active. */
  var highlighted: js.UndefOr[Boolean] = js.native
  /** The position of the tabs within their windows. */
  var index: js.UndefOr[Double] = js.native
  /** Whether the tabs are in the last focused window. */
  var lastFocusedWindow: js.UndefOr[Boolean] = js.native
  /** True if the tab is using the microphone. */
  var microphone: js.UndefOr[Boolean] = js.native
  /** Whether the tabs are muted. */
  var muted: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
    */
  var openerTabId: js.UndefOr[Double] = js.native
  /** Whether the tabs are pinned. */
  var pinned: js.UndefOr[Boolean] = js.native
  /** True for any screen sharing, or a string to specify type of screen sharing. */
  var screen: js.UndefOr[Boolean | QueryScreen] = js.native
  /** Whether the tabs have completed loading. */
  var status: js.UndefOr[TabStatus] = js.native
  /** Match page titles against a pattern. */
  var title: js.UndefOr[String] = js.native
  /** Match tabs against one or more URL patterns. Note that fragment identifiers are not matched. */
  var url: js.UndefOr[String | js.Array[String]] = js.native
  /** The ID of the parent window, or `windows.WINDOW_ID_CURRENT` for the current window. */
  var windowId: js.UndefOr[Double] = js.native
  /** The type of window the tabs are in. */
  var windowType: js.UndefOr[WindowType] = js.native
}

object Attention {
  @scala.inline
  def apply(): Attention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attention]
  }
  @scala.inline
  implicit class AttentionOps[Self <: Attention] (val x: Self) extends AnyVal {
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
    def withAttention(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attention")(js.undefined)
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
    def withCamera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieStoreId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieStoreId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieStoreId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieStoreId")(js.undefined)
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
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
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
    def withMicrophone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrophone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphone")(js.undefined)
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
    def withOpenerTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openerTabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenerTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openerTabId")(js.undefined)
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
    def withScreen(value: Boolean | QueryScreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: TabStatus): Self = {
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
    def withWindowType(value: WindowType): Self = {
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

