package typingsSlinky.firefoxWebextBrowser.browser.windows

import typingsSlinky.firefoxWebextBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  /** Whether the window is set to be always on top. */
  var alwaysOnTop: Boolean = js.native
  /** Whether the window is currently the focused window. */
  var focused: Boolean = js.native
  /**
    * The height of the window, including the frame, in pixels. Under some circumstances a Window may not be
    * assigned height property, for example when querying closed windows from the `sessions` API.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The ID of the window. Window IDs are unique within a browser session. Under some circumstances a Window may
    * not be assigned an ID, for example when querying windows using the `sessions` API, in which case a session
    * ID may be present.
    */
  var id: js.UndefOr[Double] = js.native
  /** Whether the window is incognito. */
  var incognito: Boolean = js.native
  /**
    * The offset of the window from the left edge of the screen in pixels. Under some circumstances a Window may
    * not be assigned left property, for example when querying closed windows from the `sessions` API.
    */
  var left: js.UndefOr[Double] = js.native
  /** The session ID used to uniquely identify a Window obtained from the `sessions` API. */
  var sessionId: js.UndefOr[String] = js.native
  /** The state of this browser window. */
  var state: js.UndefOr[WindowState] = js.native
  /** Array of `tabs.Tab` objects representing the current tabs in the window. */
  var tabs: js.UndefOr[js.Array[Tab]] = js.native
  /** The title of the window. Read-only. */
  var title: js.UndefOr[String] = js.native
  /**
    * The offset of the window from the top edge of the screen in pixels. Under some circumstances a Window may
    * not be assigned top property, for example when querying closed windows from the `sessions` API.
    */
  var top: js.UndefOr[Double] = js.native
  /** The type of browser window this is. */
  var `type`: js.UndefOr[WindowType] = js.native
  /**
    * The width of the window, including the frame, in pixels. Under some circumstances a Window may not be
    * assigned width property, for example when querying closed windows from the `sessions` API.
    */
  var width: js.UndefOr[Double] = js.native
}

object Window {
  @scala.inline
  def apply(alwaysOnTop: Boolean, focused: Boolean, incognito: Boolean): Window = {
    val __obj = js.Dynamic.literal(alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncognito(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(value.asInstanceOf[js.Any])
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
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
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
    def withState(value: WindowState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTabs(value: js.Array[Tab]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(js.undefined)
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
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: WindowType): Self = {
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

