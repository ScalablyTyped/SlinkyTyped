package typingsSlinky.nightwatch.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeOptions extends js.Object {
  /**
    * 	List of command-line arguments to use when starting Chrome. Arguments with an associated value should be separated by a '=' sign
    * (e.g., ['start-maximized', 'user-data-dir=/tmp/temp_profile']).
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * Path to the Chrome executable to use (on Mac OS X, this should be the actual binary, not just the app. e.g.,
    * '/Applications/Google Chrome.app/Contents/MacOS/Google Chrome')
    */
  var binary: js.UndefOr[String] = js.native
  /**
    * An address of a Chrome debugger server to connect to, in the form of <hostname/ip:port>, e.g. '127.0.0.1:38947'
    */
  var debuggerAddress: js.UndefOr[String] = js.native
  /**
    * Default: false. If false, Chrome will be quit when ChromeDriver is killed, regardless of whether the session is quit.
    * If true, Chrome will only be quit if the session is quit (or closed). Note, if true, and the session is not quit,
    * ChromeDriver cannot clean up the temporary user data directory that the running Chrome instance is using.
    */
  var detach: js.UndefOr[Boolean] = js.native
  /**
    * List of Chrome command line switches to exclude that ChromeDriver by default passes when starting Chrome.
    * Do not prefix switches with --.
    */
  var excludeSwitches: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of Chrome extensions to install on startup. Each item in the list should be a base-64 encoded packed Chrome extension (.crx)
    */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * A dictionary with each entry consisting of the name of the preference and its value. These preferences are applied
    * to the Local State file in the user data folder.
    */
  var localState: js.UndefOr[Record[String, String]] = js.native
  /**
    * Directory to store Chrome minidumps . (Supported only on Linux.)
    */
  var minidumpPath: js.UndefOr[String] = js.native
  /**
    * A dictionary with either a value for “deviceName,” or values for “deviceMetrics” and “userAgent.” Refer to Mobile Emulation for more information.
    */
  var mobileEmulation: js.UndefOr[Record[String, String]] = js.native
  /**
    * An optional dictionary that specifies performance logging preferences. See below for more information.
    */
  var perfLoggingPrefs: js.UndefOr[ChromePerfLoggingPrefs] = js.native
  /**
    * A dictionary with each entry consisting of the name of the preference and its value. These preferences are only applied
    * to the user profile in use.
    */
  var prefs: js.UndefOr[Record[String, String]] = js.native
  /**
    * Flag to activate W3C WebDriver API. Chromedriver (as of version 2.41 at least) simply does not support the W3C WebDriver API.
    */
  var w3c: js.UndefOr[Boolean] = js.native
  /**
    * A list of window types that will appear in the list of window handles. For access to <webview> elements, include "webview" in this list.
    */
  var windowTypes: js.UndefOr[js.Array[String]] = js.native
}

object ChromeOptions {
  @scala.inline
  def apply(): ChromeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOptions]
  }
  @scala.inline
  implicit class ChromeOptionsOps[Self <: ChromeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withBinary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
        ret
    }
    @scala.inline
    def withDebuggerAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debuggerAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebuggerAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debuggerAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withDetach(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeSwitches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeSwitches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeSwitches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeSwitches")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalState(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localState")(js.undefined)
        ret
    }
    @scala.inline
    def withMinidumpPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minidumpPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinidumpPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minidumpPath")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileEmulation(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileEmulation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileEmulation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileEmulation")(js.undefined)
        ret
    }
    @scala.inline
    def withPerfLoggingPrefs(value: ChromePerfLoggingPrefs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfLoggingPrefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerfLoggingPrefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfLoggingPrefs")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefs(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefs")(js.undefined)
        ret
    }
    @scala.inline
    def withW3c(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w3c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutW3c: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w3c")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTypes")(js.undefined)
        ret
    }
  }
  
}

