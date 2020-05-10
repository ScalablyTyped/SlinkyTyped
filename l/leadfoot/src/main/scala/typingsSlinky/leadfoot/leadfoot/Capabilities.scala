package typingsSlinky.leadfoot.leadfoot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * A list of possible capabilities for a remote WebDriver environment.
	 */
@js.native
trait Capabilities extends js.Object {
  /**
  		 * Environments with this capability expose the state of the browser’s offline application cache via the WebDriver API.
  		 */
  var applicationCacheEnabled: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability are incapable of clearing or deleting cookies. This issue cannot be worked around.
  		 */
  var brokenCookies: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability do not correctly retrieve the size of a CSS transformed element. This issue is
  		 * automatically corrected.
  		 */
  var brokenCssTransformedSize: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability do not correctly delete cookies. This issue is automatically corrected for cookies
  		 * that are accessible via JavaScript.
  		 */
  var brokenDeleteCookie: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability do not follow the correct event order when double-clicking. This issue is
  		 * automatically corrected.
  		 */
  var brokenDoubleClick: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability claim elements positioned offscreen to the top/left of the page are non-hidden.
  		 * This issue is automatically corrected.
  		 */
  var brokenElementDisplayedOffscreen: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability claim fully transparent elements are non-hidden. This issue is automatically
  		 * corrected.
  		 */
  var brokenElementDisplayedOpacity: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability do not correctly retrieve the position of a CSS transformed element. This issue is
  		 * automatically corrected.
  		 */
  var brokenElementPosition: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability return invalid element handles from execute functions. This issue cannot be worked
  		 * around.
  		 */
  var brokenExecuteElementReturn: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability do not operate correctly when the `flickFinger` method is called. This issue cannot
  		 * be corrected.
  		 */
  var brokenFlickFinger: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability return HTML tag names with the incorrect case. This issue is automatically
  		 * corrected.
  		 */
  var brokenHtmlTagName: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability fail to perform long tap gestures. This issue is not currently corrected.
  		 */
  var brokenLongTap: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability have broken mouse event APIs. This issue is automatically corrected as much as
  		 * possible through JavaScript-based event emulation.
  		 */
  var brokenMouseEvents: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability do not support dragging fingers across the page. This issue is not currently
  		 * corrected.
  		 */
  var brokenMoveFinger: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability do not support browser navigation functions (back, forward, refresh). This issue
  		 * cannot be corrected.
  		 */
  var brokenNavigation: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability incorrectly return an empty string instead of `null` for attributes that do not
  		 * exist when using the `getSpecAttribute` retrieval method. This issue is automatically corrected.
  		 */
  var brokenNullGetSpecAttribute: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability fail to complete calls to refresh a page through the standard WebDriver API. This
  		 * issue is automatically corrected.
  		 */
  var brokenRefresh: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability have broken keyboard event APIs. This issue is automatically corrected as much as
  		 * possible through JavaScript-based event emulation.
  		 */
  var brokenSendKeys: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability incorrectly omit the key/value of the button being submitted. This issue is
  		 * automatically corrected.
  		 */
  var brokenSubmitElement: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability do not operate correctly when the `touchScroll` method is called. This issue is
  		 * automatically corrected.
  		 */
  var brokenTouchScroll: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability break when `setWindowPosition` is called. This issue cannot be corrected.
  		 */
  var brokenWindowPosition: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability cannot switch between windows. This issue cannot be corrected.
  		 */
  var brokenWindowSwitch: js.UndefOr[Boolean] = js.native
  /**
  		 * The name of the current environment.
  		 */
  var browserName: String = js.native
  /**
  		 * Environments with this capability can use CSS selectors to find elements.
  		 */
  var cssSelectorsEnabled: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability have viewports that can be resized.
  		 */
  var dynamicViewport: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability break when the `getLogTypes` method is called. The list of log types provided here
  		 * are used in lieu of the values provided by the server when calling `getLogTypes`.
  		 */
  var fixedLogTypes: js.UndefOr[Boolean | js.Array[String]] = js.native
  /**
  		 * Environments with this capability have JavaScript enabled. Leadfoot does not operate in environments without
  		 * JavaScript.
  		 */
  var javascriptEnabled: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability allow the geographic location of the browser to be set and retrieved using the
  		 * WebDriver API.
  		 */
  var locationContextEnabled: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability support interaction via mouse commands.
  		 */
  var mouseEnabled: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability use platform native events instead of emulated events.
  		 */
  var nativeEvents: js.UndefOr[Boolean] = js.native
  /**
  		 * The name of the platform on which the current environment is running.
  		 */
  var platform: String = js.native
  /**
  		 * Environments with this capability allow files to be uploaded from a remote client.
  		 */
  var remoteFiles: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability allow the rotation of the device to be set and retrieved using the WebDriver API.
  		 */
  var rotatable: js.UndefOr[Boolean] = js.native
  /**
  		 * The special key that is used by default on the given platform to perform keyboard shortcuts.
  		 */
  var shortcutKey: js.UndefOr[String] = js.native
  /**
  		 * Environments with this capability support CSS transforms.
  		 */
  var supportsCssTransforms: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability support asynchronous JavaScript execution.
  		 */
  var supportsExecuteAsync: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability support navigation to `data:` URIs.
  		 */
  var supportsNavigationDataUris: js.UndefOr[Boolean] = js.native
  /** {boolean} takesScreenshot
  		 * Environments with this capability allow screenshots of the current screen to be taken.
  		 */
  var takesScreenshot: js.UndefOr[Boolean] = js.native
  /**
  		 * Environments with this capability support interaction via touch commands.
  		 */
  var touchEnabled: js.UndefOr[Boolean] = js.native
  /**
  		 * The version number of the current environment.
  		 */
  var version: String = js.native
  /**
  		 * Environments with this capability allow local storage and session storage to be set and retrieved using the
  		 * WebDriver API.
  		 */
  var webStorageEnabled: js.UndefOr[Boolean] = js.native
}

object Capabilities {
  @scala.inline
  def apply(browserName: String, platform: String, version: String): Capabilities = {
    val __obj = js.Dynamic.literal(browserName = browserName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capabilities]
  }
  @scala.inline
  implicit class CapabilitiesOps[Self <: Capabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationCacheEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationCacheEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationCacheEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationCacheEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenCookies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenCookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenCookies")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenCssTransformedSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenCssTransformedSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenCssTransformedSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenCssTransformedSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenDeleteCookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenDeleteCookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenDeleteCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenDeleteCookie")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenDoubleClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenDoubleClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenElementDisplayedOffscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenElementDisplayedOffscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenElementDisplayedOffscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenElementDisplayedOffscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenElementDisplayedOpacity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenElementDisplayedOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenElementDisplayedOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenElementDisplayedOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenElementPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenElementPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenElementPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenElementPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenExecuteElementReturn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenExecuteElementReturn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenExecuteElementReturn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenExecuteElementReturn")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenFlickFinger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenFlickFinger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenFlickFinger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenFlickFinger")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenHtmlTagName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenHtmlTagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenHtmlTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenHtmlTagName")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenLongTap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenLongTap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenLongTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenLongTap")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenMouseEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenMouseEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenMouseEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenMouseEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenMoveFinger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenMoveFinger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenMoveFinger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenMoveFinger")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenNullGetSpecAttribute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenNullGetSpecAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenNullGetSpecAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenNullGetSpecAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenSendKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenSendKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenSendKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenSendKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenSubmitElement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenSubmitElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenSubmitElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenSubmitElement")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenTouchScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenTouchScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenTouchScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenTouchScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenWindowPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenWindowPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenWindowPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenWindowPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokenWindowSwitch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenWindowSwitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenWindowSwitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenWindowSwitch")(js.undefined)
        ret
    }
    @scala.inline
    def withCssSelectorsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssSelectorsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssSelectorsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssSelectorsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicViewport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedLogTypes(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedLogTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedLogTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedLogTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withJavascriptEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascriptEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavascriptEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascriptEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationContextEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationContextEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationContextEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationContextEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withRotatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotatable")(js.undefined)
        ret
    }
    @scala.inline
    def withShortcutKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcutKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortcutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcutKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsCssTransforms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsCssTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsCssTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsCssTransforms")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsExecuteAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsExecuteAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsExecuteAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsExecuteAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsNavigationDataUris(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsNavigationDataUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsNavigationDataUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsNavigationDataUris")(js.undefined)
        ret
    }
    @scala.inline
    def withTakesScreenshot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takesScreenshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTakesScreenshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takesScreenshot")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withWebStorageEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webStorageEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebStorageEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webStorageEnabled")(js.undefined)
        ret
    }
  }
  
}

