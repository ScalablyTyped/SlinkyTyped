package typingsSlinky.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tab extends js.Object {
  /** Whether the tab is active in its window. (Does not necessarily mean the window is focused.) */
  var active: Boolean = js.native
  /** Whether the tab is drawing attention. */
  var attention: js.UndefOr[Boolean] = js.native
  /**
    * Whether the tab has produced sound over the past couple of seconds (but it might not be heard if also
    * muted). Equivalent to whether the speaker audio indicator is showing.
    */
  var audible: js.UndefOr[Boolean] = js.native
  /** The CookieStoreId used for the tab. */
  var cookieStoreId: js.UndefOr[String] = js.native
  /** True while the tab is not loaded with content. */
  var discarded: js.UndefOr[Boolean] = js.native
  /**
    * The URL of the tab's favicon. This property is only present if the extension's manifest includes the
    * `"tabs"` permission. It may also be an empty string if the tab is loading.
    */
  var favIconUrl: js.UndefOr[String] = js.native
  /** The height of the tab in pixels. */
  var height: js.UndefOr[Double] = js.native
  /** True if the tab is hidden. */
  var hidden: js.UndefOr[Boolean] = js.native
  /** Whether the tab is highlighted. Works as an alias of active */
  var highlighted: Boolean = js.native
  /**
    * The ID of the tab. Tab IDs are unique within a browser session. Under some circumstances a Tab may not be
    * assigned an ID, for example when querying foreign tabs using the `sessions` API, in which case a session ID
    * may be present. Tab ID can also be set to `tabs.TAB_ID_NONE` for apps and devtools windows.
    */
  var id: js.UndefOr[Double] = js.native
  /** Whether the tab is in an incognito window. */
  var incognito: Boolean = js.native
  /** The zero-based index of the tab within its window. */
  var index: Double = js.native
  /** Whether the document in the tab can be rendered in reader mode. */
  var isArticle: js.UndefOr[Boolean] = js.native
  /** Whether the document in the tab is being rendered in reader mode. */
  var isInReaderMode: js.UndefOr[Boolean] = js.native
  /** The last time the tab was accessed as the number of milliseconds since epoch. */
  var lastAccessed: js.UndefOr[Double] = js.native
  /** Current tab muted state and the reason for the last state change. */
  var mutedInfo: js.UndefOr[MutedInfo] = js.native
  /**
    * The ID of the tab that opened this tab, if any. This property is only present if the opener tab still exists.
    */
  var openerTabId: js.UndefOr[Double] = js.native
  /** Whether the tab is pinned. */
  var pinned: Boolean = js.native
  /**
    * Whether the tab is selected.
    * @deprecated Please use `tabs.Tab.highlighted`.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /** The session ID used to uniquely identify a Tab obtained from the `sessions` API. */
  var sessionId: js.UndefOr[String] = js.native
  /** Current tab sharing state for screen, microphone and camera. */
  var sharingState: js.UndefOr[SharingState] = js.native
  /** Either _loading_ or _complete_. */
  var status: js.UndefOr[String] = js.native
  /** The ID of this tab's successor, if any; `tabs.TAB_ID_NONE` otherwise. */
  var successorTabId: js.UndefOr[Double] = js.native
  /**
    * The title of the tab. This property is only present if the extension's manifest includes the `"tabs"`
    * permission.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The URL the tab is displaying. This property is only present if the extension's manifest includes the
    * `"tabs"` permission.
    */
  var url: js.UndefOr[String] = js.native
  /** The width of the tab in pixels. */
  var width: js.UndefOr[Double] = js.native
  /** The ID of the window the tab is contained within. */
  var windowId: js.UndefOr[Double] = js.native
}

object Tab {
  @scala.inline
  def apply(active: Boolean, highlighted: Boolean, incognito: Boolean, index: Double, pinned: Boolean): Tab = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  @scala.inline
  implicit class TabOps[Self <: Tab] (val x: Self) extends AnyVal {
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
    def withHighlighted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncognito(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
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
    def withFavIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFavIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favIconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
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
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsArticle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArticle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsArticle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArticle")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInReaderMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInReaderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInReaderMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInReaderMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAccessed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAccessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAccessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAccessed")(js.undefined)
        ret
    }
    @scala.inline
    def withMutedInfo(value: MutedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutedInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutedInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutedInfo")(js.undefined)
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
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSharingState(value: SharingState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharingState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharingState")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
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
    def withSuccessorTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successorTabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessorTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successorTabId")(js.undefined)
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
    def withUrl(value: String): Self = {
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
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
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

