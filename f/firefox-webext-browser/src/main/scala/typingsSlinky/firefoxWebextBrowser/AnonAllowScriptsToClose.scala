package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.windows.CreateType
import typingsSlinky.firefoxWebextBrowser.browser.windows.WindowState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowScriptsToClose extends js.Object {
  /** Allow scripts to close the window. */
  var allowScriptsToClose: js.UndefOr[Boolean] = js.native
  /** The CookieStoreId to use for all tabs that were created when the window is opened. */
  var cookieStoreId: js.UndefOr[String] = js.native
  /**
    * If true, opens an active window. If false, opens an inactive window.
    * @deprecated Unsupported on Firefox at this time.
    */
  var focused: js.UndefOr[Boolean] = js.native
  /**
    * The height in pixels of the new window, including the frame. If not specified defaults to a natural height.
    */
  var height: js.UndefOr[Double] = js.native
  /** Whether the new window should be an incognito window. */
  var incognito: js.UndefOr[Boolean] = js.native
  /**
    * The number of pixels to position the new window from the left edge of the screen. If not specified, the new
    * window is offset naturally from the last focused window. This value is ignored for panels.
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * The initial state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined
    * with 'left', 'top', 'width' or 'height'.
    */
  var state: js.UndefOr[WindowState] = js.native
  /** The id of the tab for which you want to adopt to the new window. */
  var tabId: js.UndefOr[Double] = js.native
  /** A string to add to the beginning of the window title. */
  var titlePreface: js.UndefOr[String] = js.native
  /**
    * The number of pixels to position the new window from the top edge of the screen. If not specified, the new
    * window is offset naturally from the last focused window. This value is ignored for panels.
    */
  var top: js.UndefOr[Double] = js.native
  /**
    * Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup
    * unless the '--enable-panels' flag is set.
    */
  var `type`: js.UndefOr[CreateType] = js.native
  /**
    * A URL or array of URLs to open as tabs in the window. Fully-qualified URLs must include a scheme (i.e.
    * 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within
    * the extension. Defaults to the New Tab Page.
    */
  var url: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The width in pixels of the new window, including the frame. If not specified defaults to a natural width.
    */
  var width: js.UndefOr[Double] = js.native
}

object AnonAllowScriptsToClose {
  @scala.inline
  def apply(): AnonAllowScriptsToClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAllowScriptsToClose]
  }
  @scala.inline
  implicit class AnonAllowScriptsToCloseOps[Self <: AnonAllowScriptsToClose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowScriptsToClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowScriptsToClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowScriptsToClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowScriptsToClose")(js.undefined)
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
    def withFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(js.undefined)
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
    def withIncognito(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncognito: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(js.undefined)
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
    def withTitlePreface(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePreface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitlePreface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePreface")(js.undefined)
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
    def withType(value: CreateType): Self = {
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

