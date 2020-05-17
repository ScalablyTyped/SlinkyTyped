package typingsSlinky.nightwatch.mod

import typingsSlinky.nightwatch.anon.Browser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchDesiredCapabilities extends js.Object {
  /**
    * Whether the session should accept all SSL certs by default.
    */
  var acceptSslCerts: js.UndefOr[Boolean] = js.native
  /**
    * Whether the session can interact with the application cache.
    */
  var applicationCacheEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the session can query for the browser's connectivity and disable it if desired.
    */
  var browserConnectionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the browser being used; should be one of {android|chrome|firefox|htmlunit|internet explorer|iPhone|iPad|opera|safari}.
    */
  var browserName: js.UndefOr[String] = js.native
  /**
    * This is a list of all the Chrome-specific desired capabilities.
    */
  var chromeOptions: js.UndefOr[ChromeOptions] = js.native
  /**
    * Whether the session supports CSS selectors when searching for elements.
    */
  var cssSelectorsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the session can interact with database storage.
    */
  var databaseEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Allows the user to specify whether elements are scrolled into the viewport for interaction to align with the top (0) or bottom (1) of the viewport.
    * The default value is to align with the top of the viewport. Supported in IE and Firefox (since 2.36)
    */
  var elementScrollBehaviour: js.UndefOr[Double] = js.native
  /**
    * Whether the session can interact with modal popups, such as window.alert and window.confirm.
    */
  var handlesAlerts: js.UndefOr[Boolean] = js.native
  /**
    * Whether the session supports executing user supplied JavaScript in the context of the current page (only on HTMLUnitDriver).
    */
  var javascriptEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the session can set and query the browser's location context.
    */
  var locationContextEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A JSON object describing the logging level of different components in the browser, the driver, or any intermediary WebDriver servers.
    * Available values for most loggers are "OFF", "SEVERE", "WARNING", "INFO", "CONFIG", "FINE", "FINER", "FINEST", "ALL".
    * This produces a JSON object looking something like: {"loggingPrefs": {"driver": "INFO", "server": "OFF", "browser": "FINE"}}.
    */
  var loggingPrefs: js.UndefOr[Browser] = js.native
  /**
    * Whether the session is capable of generating native events when simulating user input.
    */
  var nativeEvents: js.UndefOr[Boolean] = js.native
  /**
    * A key specifying which platform the browser should be running on. This value should be one of {WINDOWS|XP|VISTA|MAC|LINUX|UNIX|ANDROID}.
    * When requesting a new session, the client may specify ANY to indicate any available platform may be used.
    * For more information see [GridPlatforms (https://code.google.com/p/selenium/wiki/GridPlatforms)]
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * Whether the session can rotate the current page's current layout between portrait and landscape orientations (only applies to mobile platforms).
    */
  var rotatable: js.UndefOr[Boolean] = js.native
  /**
    * Whether the session supports taking screenshots of the current page.
    */
  var takesScreenShot: js.UndefOr[Boolean] = js.native
  /**
    * What the browser should do with an unhandled alert before throwing out the UnhandledAlertException. Possible values are "accept", "dismiss" and "ignore"
    */
  var unexpectedAlertBehaviour: js.UndefOr[String] = js.native
  /**
    * The browser version, or the empty string if unknown.
    */
  var version: js.UndefOr[String] = js.native
  /**
    * Whether the session supports interactions with storage objects (http://www.w3.org/TR/2009/WD-webstorage-20091029/).
    */
  var webStorageEnabled: js.UndefOr[Boolean] = js.native
}

object NightwatchDesiredCapabilities {
  @scala.inline
  def apply(): NightwatchDesiredCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchDesiredCapabilities]
  }
  @scala.inline
  implicit class NightwatchDesiredCapabilitiesOps[Self <: NightwatchDesiredCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptSslCerts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptSslCerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptSslCerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptSslCerts")(js.undefined)
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
    def withBrowserConnectionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserConnectionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserConnectionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserConnectionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserName")(js.undefined)
        ret
    }
    @scala.inline
    def withChromeOptions(value: ChromeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeOptions")(js.undefined)
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
    def withDatabaseEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withElementScrollBehaviour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementScrollBehaviour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementScrollBehaviour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementScrollBehaviour")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlesAlerts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlesAlerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlesAlerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlesAlerts")(js.undefined)
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
    def withLoggingPrefs(value: Browser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingPrefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingPrefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingPrefs")(js.undefined)
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
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
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
    def withTakesScreenShot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takesScreenShot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTakesScreenShot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takesScreenShot")(js.undefined)
        ret
    }
    @scala.inline
    def withUnexpectedAlertBehaviour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unexpectedAlertBehaviour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnexpectedAlertBehaviour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unexpectedAlertBehaviour")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
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

