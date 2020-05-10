package typingsSlinky.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tab extends js.Object {
  /**
    * Whether the tab is active in its window. (Does not necessarily mean the window is focused.)
    * @since Chrome 16.
    */
  var active: Boolean = js.native
  /**
    * Optional.
    * Whether the tab has produced sound over the past couple of seconds (but it might not be heard if also muted). Equivalent to whether the speaker audio indicator is showing.
    * @since Chrome 45.
    */
  var audible: js.UndefOr[Boolean] = js.native
  /**
    * Whether the tab can be discarded automatically by the browser when resources are low.
    * @since Chrome 54.
    */
  var autoDiscardable: Boolean = js.native
  /**
    * Whether the tab is discarded. A discarded tab is one whose content has been unloaded from memory, but is still visible in the tab strip. Its content gets reloaded the next time it's activated.
    * @since Chrome 54.
    */
  var discarded: Boolean = js.native
  /**
    * Optional.
    * The URL of the tab's favicon. This property is only present if the extension's manifest includes the "tabs" permission. It may also be an empty string if the tab is loading.
    */
  var favIconUrl: js.UndefOr[String] = js.native
  /**
    * Optional. The height of the tab in pixels.
    * @since Chrome 31.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Whether the tab is highlighted.
    * @since Chrome 16.
    */
  var highlighted: Boolean = js.native
  /**
    * Optional.
    * The ID of the tab. Tab IDs are unique within a browser session. Under some circumstances a Tab may not be assigned an ID, for example when querying foreign tabs using the sessions API, in which case a session ID may be present. Tab ID can also be set to chrome.tabs.TAB_ID_NONE for apps and devtools windows.
    */
  var id: js.UndefOr[Double] = js.native
  /** Whether the tab is in an incognito window. */
  var incognito: Boolean = js.native
  /** The zero-based index of the tab within its window. */
  var index: Double = js.native
  /**
    * Optional.
    * Current tab muted state and the reason for the last state change.
    * @since Chrome 46. Warning: this is the current Beta channel.
    */
  var mutedInfo: js.UndefOr[typingsSlinky.chrome.chrome.tabs.MutedInfo] = js.native
  /**
    * Optional.
    * The ID of the tab that opened this tab, if any. This property is only present if the opener tab still exists.
    * @since Chrome 18.
    */
  var openerTabId: js.UndefOr[Double] = js.native
  /**
    * The URL the tab is navigating to, before it has committed.
    * This property is only present if the extension's manifest includes the "tabs" permission and there is a pending navigation.
    * @since Chrome 79.
    */
  var pendingUrl: js.UndefOr[String] = js.native
  /**
    * Whether the tab is pinned.
    * @since Chrome 9.
    */
  var pinned: Boolean = js.native
  /**
    * Whether the tab is selected.
    * @deprecated since Chrome 33. Please use tabs.Tab.highlighted.
    */
  var selected: Boolean = js.native
  /**
    * Optional. The session ID used to uniquely identify a Tab obtained from the sessions API.
    * @since Chrome 31.
    */
  var sessionId: js.UndefOr[String] = js.native
  /**
    * Optional.
    * Either loading or complete.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Optional.
    * The title of the tab. This property is only present if the extension's manifest includes the "tabs" permission.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Optional.
    * The URL the tab is displaying. This property is only present if the extension's manifest includes the "tabs" permission.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Optional. The width of the tab in pixels.
    * @since Chrome 31.
    */
  var width: js.UndefOr[Double] = js.native
  /** The ID of the window the tab is contained within. */
  var windowId: Double = js.native
}

object Tab {
  @scala.inline
  def apply(
    active: Boolean,
    autoDiscardable: Boolean,
    discarded: Boolean,
    highlighted: Boolean,
    incognito: Boolean,
    index: Double,
    pinned: Boolean,
    selected: Boolean,
    windowId: Double
  ): Tab = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], autoDiscardable = autoDiscardable.asInstanceOf[js.Any], discarded = discarded.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
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
    def withAutoDiscardable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDiscardable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscarded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discarded")(value.asInstanceOf[js.Any])
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
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowId")(value.asInstanceOf[js.Any])
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
    def withMutedInfo(value: typingsSlinky.chrome.chrome.tabs.MutedInfo): Self = {
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
    def withPendingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingUrl")(js.undefined)
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
  }
  
}

