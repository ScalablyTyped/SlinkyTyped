package typingsSlinky.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchTestSettingGeneric extends js.Object {
  /**
    * This field will be used together with username to compute the Authorization header.
    * Like username, the value can be also an environment variable: "access_key" : "${SAUCE_ACCESS_KEY}"
    */
  var access_key: js.UndefOr[String] = js.native
  /**
    * Same as Selenium settings cli_args. You can override the global cli_args on a per-environment basis.
    */
  var cli_args: js.UndefOr[js.Any] = js.native
  /**
    * An object which will be passed to the Selenium WebDriver when a new session will be created. You can specify browser name for instance along with other capabilities.
    * Example:
    *  "desiredCapabilities" : {
    *  "browserName" : "firefox",
    *  "acceptSslCerts" : true
    * }
    * You can view the complete list of capabilities https://code.google.com/p/selenium/wiki/DesiredCapabilities.
    */
  var desiredCapabilities: js.UndefOr[NightwatchDesiredCapabilities] = js.native
  /**
    * Use to disable colored output in the terminal.
    */
  var disable_colors: js.UndefOr[Boolean] = js.native
  /**
    * End the session automatically when the test is being terminated, usually after a failed assertion.
    */
  var end_session_on_fail: js.UndefOr[Boolean] = js.native
  /**
    * An array of folders or file patterns to be skipped (relative to the main source folder).
    * Example: "exclude" : ["excluded-folder"] or: "exclude" : ["test-folder/ *-smoke.js"]
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * Folder or file pattern to be used when loading the tests. Files that don't match this patter will be ignored.
    * Example: "filter" : "tests/ *-smoke.js"
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * An object which will be made available within the test and can be overwritten per environment. Example:"globals" : {  "myGlobal" : "some_global" }
    */
  var globals: js.UndefOr[NightwatchGlobals] = js.native
  /**
    * A url which can be used later in the tests as the main url to load. Can be useful if your tests will run on different environments, each one with a different url.
    */
  var launch_url: js.UndefOr[String] = js.native
  /**
    * Do not show the Base64 image data in the (verbose) log when taking screenshots.
    */
  var log_screenshot_data: js.UndefOr[Boolean] = js.native
  /**
    * Use to disable terminal output completely.
    */
  var output: js.UndefOr[Boolean] = js.native
  /**
    * Proxy requests to the selenium server. http, https, socks(v5), socks5, sock4, and pac are accepted. Uses node-proxy-agent. Example: http://user:pass@host:port
    */
  var proxy: js.UndefOr[String] = js.native
  /**
    * The hostname/IP on which the selenium server is accepting connections.
    */
  var selenium_host: js.UndefOr[String] = js.native
  /**
    * The port number on which the selenium server is accepting connections.
    */
  var selenium_port: js.UndefOr[Double] = js.native
  /**
    * Whether to show extended Selenium command logs.
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Skip the rest of testcases (if any) when one testcase fails..
    */
  var skip_testcases_on_fail: js.UndefOr[Boolean] = js.native
  /**
    * Use xpath as the default locator strategy
    */
  var use_xpath: js.UndefOr[Boolean] = js.native
  /**
    * In case the selenium server requires credentials this username will be used to compute the Authorization header.
    * The value can be also an environment variable, in which case it will look like this: "username" : "${SAUCE_USERNAME}"
    */
  var username: js.UndefOr[String] = js.native
}

object NightwatchTestSettingGeneric {
  @scala.inline
  def apply(): NightwatchTestSettingGeneric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchTestSettingGeneric]
  }
  @scala.inline
  implicit class NightwatchTestSettingGenericOps[Self <: NightwatchTestSettingGeneric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_key")(js.undefined)
        ret
    }
    @scala.inline
    def withCli_args(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cli_args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCli_args: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cli_args")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredCapabilities(value: NightwatchDesiredCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredCapabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_colors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_colors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_colors")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd_session_on_fail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_session_on_fail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_session_on_fail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_session_on_fail")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobals(value: NightwatchGlobals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunch_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunch_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch_url")(js.undefined)
        ret
    }
    @scala.inline
    def withLog_screenshot_data(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_screenshot_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog_screenshot_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_screenshot_data")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withSelenium_host(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selenium_host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelenium_host: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selenium_host")(js.undefined)
        ret
    }
    @scala.inline
    def withSelenium_port(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selenium_port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelenium_port: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selenium_port")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip_testcases_on_fail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_testcases_on_fail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip_testcases_on_fail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_testcases_on_fail")(js.undefined)
        ret
    }
    @scala.inline
    def withUse_xpath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_xpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_xpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_xpath")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

