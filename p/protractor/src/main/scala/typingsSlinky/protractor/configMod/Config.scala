package typingsSlinky.protractor.configMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protractor.anon.DefaultTimeoutInterval
import typingsSlinky.protractor.anon.Dictkey
import typingsSlinky.protractor.anon.JvmArgs
import typingsSlinky.protractor.anon.Reporter
import typingsSlinky.protractor.pluginsMod.PluginConfig
import typingsSlinky.protractor.protractorStrings.DEBUG
import typingsSlinky.protractor.protractorStrings.ERROR
import typingsSlinky.protractor.protractorStrings.INFO
import typingsSlinky.protractor.protractorStrings.WARN
import typingsSlinky.seleniumWebdriver.mod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Enable/disable the WebDriver Control Flow.
    *
    * WebDriverJS (and by extention, Protractor) uses a Control Flow to manage the order in which
    * commands are executed and promises are resolved (see docs/control-flow.md for details).
    * However, as syntax like `async`/`await` are being introduced, WebDriverJS has decided to
    * deprecate the control flow, and have users manage the asynchronous activity themselves
    * (details here: https://github.com/SeleniumHQ/selenium/issues/2969).
    *
    * At the moment, the WebDriver Control Flow is still enabled by default. You can disable it by
    * setting the environment variable `SELENIUM_PROMISE_MANAGER` to `0`.  In a webdriver release in
    * Q4 2017, the Control Flow will be disabled by default, but you will be able to re-enable it by
    * setting `SELENIUM_PROMISE_MANAGER` to `1`.  At a later point, the control flow will be removed
    * for good.
    *
    * If you don't like managing environment variables, you can set this option in your config file,
    * and Protractor will handle enabling/disabling the control flow for you.  Setting this option
    * is higher priority than the `SELENIUM_PROMISE_MANAGER` environment variable.
    *
    * @type {boolean=}
    */
  var SELENIUM_PROMISE_MANAGER: js.UndefOr[Boolean] = js.native
  /**
    * A callback function called once all tests have finished running and
    * the WebDriver instance has been shut down. It is passed the exit code
    * (0 if the tests passed). afterLaunch must return a promise if you want
    * asynchronous code to be executed before the program exits.
    * This is called only once before the program exits (after onCleanUp).
    */
  var afterLaunch: js.UndefOr[js.Function1[/* exitCode */ Double, Unit]] = js.native
  /**
    * The timeout in milliseconds for each script run on the browser. This
    * should be longer than the maximum time your application needs to
    * stabilize between tasks.
    */
  var allScriptsTimeout: js.UndefOr[Double] = js.native
  /**
    * A base URL for your application under test. Calls to protractor.get()
    * with relative paths will be resolved against this URL (via url.resolve)
    */
  var baseUrl: js.UndefOr[String] = js.native
  /**
    * A callback function called once configs are read but before any
    * environment setup. This will only run once, and before onPrepare.
    *
    * You can specify a file containing code to run by setting beforeLaunch to
    * the filename string.
    *
    * At this point, global variable 'protractor' object will NOT be set up,
    * and globals from the test framework will NOT be available. The main
    * purpose of this function should be to bring up test dependencies.
    */
  var beforeLaunch: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If specified, Protractor will connect to the Blocking Proxy at the given
    * url instead of starting it's own.
    */
  var blockingProxyUrl: js.UndefOr[String] = js.native
  /**
    * If browserstackUser and browserstackKey are specified, seleniumServerJar
    * will be ignored. The tests will be run remotely using BrowserStack.
    */
  var browserstackKey: js.UndefOr[String] = js.native
  /**
    * Proxy server to be used for connecting to BrowserStack APIs
    * e.g. "http://proxy.example.com:1234".
    * This should be used when you are behind a proxy server.
    */
  var browserstackProxy: js.UndefOr[String] = js.native
  /**
    * If browserstackUser and browserstackKey are specified, seleniumServerJar
    * will be ignored. The tests will be run remotely using BrowserStack.
    */
  var browserstackUser: js.UndefOr[String] = js.native
  /**
    * Protractor can launch your tests on one or more browsers. If you are
    * testing on a single browser, use the capabilities option. If you are
    * testing on multiple browsers, use the multiCapabilities array.
    *
    * For a list of available capabilities, see
    * https://github.com/SeleniumHQ/selenium/wiki/DesiredCapabilities
    * In addition, you may specify count, shardTestFiles, and maxInstances.
    *
    * Example:
    * capabilities: {
    *   browserName: 'chrome',
    *   name: 'Unnamed Job',
    *   logName: 'Chrome - English',
    *   count: 1,
    *   shardTestFiles: false,
    *   maxInstances: 1,
    *   specs: ['spec/chromeOnlySpec.js'],
    *   exclude: ['spec/doNotRunInChromeSpec.js'],
    *   seleniumAddress: 'http://localhost:4444/wd/hub'
    * }
    */
  var capabilities: js.UndefOr[Dictkey] = js.native
  /**
    * ChromeDriver location is used to help find the chromedriver binary. This will be passed to the
    * Selenium jar as the system property webdriver.chrome.driver. If the value is not set when
    * launching locally, it will use the default values downloaded from webdriver-manager.
    *
    * example:
    * chromeDriver: './node_modules/webdriver-manager/selenium/chromedriver_2.20'
    */
  var chromeDriver: js.UndefOr[String] = js.native
  var configDir: js.UndefOr[String] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var debuggerServerPort: js.UndefOr[Double] = js.native
  /**
    * If true, Protractor will connect directly to the browser Drivers
    * at the locations specified by chromeDriver and firefoxPath. Only Chrome
    * and Firefox are supported for direct connect.
    *
    * default: false
    */
  var directConnect: js.UndefOr[Boolean] = js.native
  /**
    * Protractor will exit with an error if it sees any command line flags it doesn't
    * recognize. Set disableChecks true to disable this check.
    */
  var disableChecks: js.UndefOr[Boolean] = js.native
  /**
    * Turns off WebDriver's environment variables overrides to ignore any
    * environment variable and to only use the configuration in this file.
    * Defaults to `false`
    */
  var disableEnvironmentOverrides: js.UndefOr[Boolean] = js.native
  var elementExplorer: js.UndefOr[js.Any] = js.native
  /**
    * Patterns to exclude specs.
    */
  var exclude: js.UndefOr[js.Array[String] | String] = js.native
  /**
    * Path to the firefox application binary. If null, will attempt to find
    * firefox in the default locations.
    */
  var firefoxPath: js.UndefOr[String] = js.native
  /**
    * Test framework to use. This may be one of: jasmine, mocha or custom.
    * Default value is 'jasmine'
    *
    * When the framework is set to "custom" you'll need to additionally
    * set frameworkPath with the path relative to the config file or absolute:
    *
    *   framework: 'custom',
    *   frameworkPath: './frameworks/my_custom_jasmine.js',
    *
    * See github.com/angular/protractor/blob/master/lib/frameworks/README.md
    * to comply with the interface details of your custom implementation.
    *
    * Jasmine is fully supported as test and assertion frameworks.
    * Mocha has limited support. You will need to include your
    * own assertion framework (such as Chai) if working with Mocha.
    */
  var framework: js.UndefOr[String] = js.native
  var frameworkPath: js.UndefOr[String] = js.native
  /**
    * geckoDriver location is used to help find the gecko binary. This will be passed to the Selenium
    * jar as the system property webdriver.gecko.driver. If the value is not set when launching
    * locally, it will use the default values downloaded from webdriver-manager.
    */
  var geckoDriver: js.UndefOr[String] = js.native
  /**
    * If you need to resolve multiCapabilities asynchronously (i.e. wait for
    * server/proxy, set firefox profile, etc), you can specify a function here
    * which will return either `multiCapabilities` or a promise to
    * `multiCapabilities`.
    *
    * If this returns a promise, it is resolved immediately after
    * `beforeLaunch` is run, and before any driver is set up. If this is
    * specified, both capabilities and multiCapabilities will be ignored.
    */
  var getMultiCapabilities: js.UndefOr[js.Any] = js.native
  /**
    * How long to wait for a page to load.
    */
  var getPageTimeout: js.UndefOr[Double] = js.native
  /**
    * If set, Protractor will pause the specified amount of time (in milliseconds)
    * before interactions with browser elements (ie, sending keys, clicking). It will
    * also highlight the element it's about to interact with.
    *
    * This is an experimental feature. Enabling this will also turn on Blocking Proxy
    * synchronization, which is also experimental.
    */
  var highlightDelay: js.UndefOr[Double] = js.native
  /**
    * If set, Protractor will ignore uncaught exceptions instead of exiting
    * without an error code. The exceptions will still be logged as warnings.
    */
  var ignoreUncaughtExceptions: js.UndefOr[Boolean] = js.native
  /**
    * Options to be passed to jasmine.
    *
    * See https://github.com/jasmine/jasmine-npm/blob/master/lib/jasmine.js
    * for the exact options available.
    */
  var jasmineNodeOpts: js.UndefOr[DefaultTimeoutInterval] = js.native
  var jvmArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * If kobitonUser and kobitonKey are specified, testobjectUser, testojbectKey, browserStackUser,
    * browserStackKey and seleniumServerJar will be ignored. The tests will be run remotely using
    * TestObject.
    */
  var kobitonKey: js.UndefOr[String] = js.native
  /**
    * If kobitonUser and kobitonKey are specified, testobjectUser, testojbectKey, browserstackUser,
    * browserStackKey and seleniumServerJar will be ignored. The tests will be run remotely using
    * TestObject.
    */
  var kobitonUser: js.UndefOr[String] = js.native
  /**
    * Can be an object which will be passed to the SeleniumServer class as args.
    * See a full list of options at
    * https://github.com/SeleniumHQ/selenium/blob/master/javascript/node/selenium-webdriver/remote/index.js
    * If you specify `args` or `port` in this object, it will overwrite the
    * values set via the deprecated config values `seleniumPort` and
    * `seleniumArgs`.
    */
  var localSeleniumStandaloneOpts: js.UndefOr[JvmArgs] = js.native
  /**
    * Protractor log level
    *
    * default: INFO
    */
  var logLevel: js.UndefOr[ERROR | WARN | INFO | DEBUG] = js.native
  /**
    * Maximum number of total browser sessions to run. Tests are queued in
    * sequence if number of browser sessions is limited by this parameter.
    * Use a number less than 1 to denote unlimited. Default is unlimited.
    */
  var maxSessions: js.UndefOr[Double] = js.native
  /**
    * Options to be passed to Mocha.
    *
    * See the full list at http://mochajs.org/
    */
  var mochaOpts: js.UndefOr[Reporter] = js.native
  var mockSelenium: js.UndefOr[Boolean] = js.native
  /**
    * If you would like to run more than one instance of WebDriver on the same
    * tests, use multiCapabilities, which takes an array of capabilities.
    * If this is specified, capabilities will be ignored.
    */
  var multiCapabilities: js.UndefOr[js.Array[_]] = js.native
  /**
    * Tells Protractor to interpret any angular apps it comes across as hybrid
    * angular1/angular2 apps (i.e. apps using ngUpgrade)
    * Defaults to `false`
    *
    * @type {boolean}
    */
  var ng12Hybrid: js.UndefOr[Boolean] = js.native
  /**
    * Use default globals: 'protractor', 'browser', '$', '$$', 'element', 'by'.
    * These also exist as properties of the protractor namespace:
    * 'protractor.browser', 'protractor.$', 'protractor.$$',
    * 'protractor.element', 'protractor.by', and 'protractor.By'.
    *
    * When no globals is set to true, the only available global variable will be
    * 'protractor'.
    */
  var noGlobals: js.UndefOr[Boolean] = js.native
  var nodeDebug: js.UndefOr[Boolean] = js.native
  /**
    * A callback function called once the tests have finished running and
    * the WebDriver instance has been shut down. It is passed the exit code
    * (0 if the tests passed). This is called once per capability.
    */
  var onCleanUp: js.UndefOr[js.Function1[/* exitCode */ Double, Unit]] = js.native
  /**
    * A callback function called once tests are finished. onComplete can
    * optionally return a promise, which Protractor will wait for before
    * shutting down webdriver.
    *
    * At this point, tests will be done but global objects will still be
    * available.
    */
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A callback function called once protractor is ready and available, and
    * before the specs are executed. If multiple capabilities are being run,
    * this will run once per capability.
    *
    * You can specify a file containing code to run by setting onPrepare to
    * the filename string. onPrepare can optionally return a promise, which
    * Protractor will wait for before continuing execution. This can be used if
    * the preparation involves any asynchronous calls, e.g. interacting with
    * the browser. Otherwise Protractor cannot guarantee order of execution
    * and may start the tests before preparation finishes.
    *
    * At this point, global variable 'protractor' object will be set up, and
    * globals from the test framework will be available. For example, if you
    * are using Jasmine, you can add a reporter with:
    *
    *    jasmine.getEnv().addReporter(new jasmine.JUnitXmlReporter(
    *      'outputdir/', true, true));
    *
    * If you need access back to the current configuration object,
    * use a pattern like the following:
    *
    *    return browser.getProcessedConfig().then(function(config) {
    *      // config.capabilities is the CURRENT capability being run, if
    *      // you are using multiCapabilities.
    *      console.log('Executing capability', config.capabilities);
    *    });
    */
  var onPrepare: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The params object will be passed directly to the Protractor instance,
    * and can be accessed from your test as browser.params. It is an arbitrary
    * object and can contain anything you may need in your test.
    * This can be changed via the command line as:
    *   --params.login.user "Joe"
    *
    * Example:
    * params: {
    *   login: {
    *     user: 'Jane',
    *     password: '1234'
    *   }
    * }
    */
  var params: js.UndefOr[js.Any] = js.native
  /**
    * See docs/plugins.md
    */
  var plugins: js.UndefOr[js.Array[PluginConfig]] = js.native
  /**
    * If true, protractor will restart the browser between each test. Default
    * value is false.
    *
    * CAUTION: This will cause your tests to slow down drastically.
    */
  var restartBrowserBetweenTests: js.UndefOr[Boolean] = js.native
  /**
    * If set, protractor will save the test output in json format at this path.
    * The path is relative to the location of this config.
    */
  var resultJsonOutputFile: js.UndefOr[js.Any] = js.native
  /**
    * A CSS Selector for a DOM element within your Angular application.
    * Protractor will attempt to automatically find your application, but it is
    * necessary to set rootElement in certain cases.
    *
    * In Angular 1, Protractor will use the element your app bootstrapped to by
    * default.  If that doesn't work, it will then search for hooks in `body` or
    * `ng-app` elements (details here: https://git.io/v1b2r).
    *
    * In later versions of Angular, Protractor will try to hook into all angular
    * apps on the page. Use rootElement to limit the scope of which apps
    * Protractor waits for and searches within.
    */
  var rootElement: js.UndefOr[String] = js.native
  /**
    * Use sauceAgent if you need custom HTTP agent to connect to saucelabs.com APIs.
    * This is needed if your computer is behind a corporate proxy.
    *
    * To match sauce agent implementation, use
    * [HttpProxyAgent](https://github.com/TooTallNate/node-http-proxy-agent)
    * to generate the agent or use sauceProxy as an alternative. If a
    * sauceProxy is provided, the sauceAgent will be overridden.
    */
  var sauceAgent: js.UndefOr[js.Any] = js.native
  /**
    * Use sauceBuild if you want to group test capabilites by a build ID
    */
  var sauceBuild: js.UndefOr[String] = js.native
  /**
    * If the sauceUser and sauceKey are specified, seleniumServerJar will be
    * ignored. The tests will be run remotely using Sauce Labs.
    */
  var sauceKey: js.UndefOr[String] = js.native
  /**
    * The address of a proxy server to use for communicating to Sauce Labs REST APIs via the
    * saucelabs node module. For example, the Sauce Labs Proxy can be setup with: sauceProxy:
    * 'http://localhost:3128'
    */
  var sauceProxy: js.UndefOr[String] = js.native
  /**
    * If you run your tests on SauceLabs you can specify the region you want to run your tests
    * in via the `sauceRegion` property. Available short handles for regions are:
    * us: us-west-1 (default)
    * eu: eu-central-1
    */
  var sauceRegion: js.UndefOr[String] = js.native
  /**
    * Use sauceSeleniumAddress if you need to customize the URL Protractor
    * uses to connect to sauce labs (for example, if you are tunneling selenium
    * traffic through a sauce connect tunnel). Default is
    * ondemand.saucelabs.com:443/wd/hub
    */
  var sauceSeleniumAddress: js.UndefOr[String] = js.native
  /**
    * If true, Protractor will use http:// protocol instead of https:// to
    * connect to Sauce Labs defined by sauceSeleniumAddress.
    *
    * default: false
    */
  var sauceSeleniumUseHttp: js.UndefOr[Boolean] = js.native
  /**
    * If the sauceUser and sauceKey are specified, seleniumServerJar will be
    * ignored. The tests will be run remotely using Sauce Labs.
    */
  var sauceUser: js.UndefOr[String] = js.native
  /**
    * The address of a running Selenium Server. If specified, Protractor will
    * connect to an already running instance of Selenium. This usually looks like
    * seleniumAddress: 'http://localhost:4444/wd/hub'
    */
  var seleniumAddress: js.UndefOr[String] = js.native
  var seleniumArgs: js.UndefOr[js.Array[_]] = js.native
  var seleniumPort: js.UndefOr[Double] = js.native
  /**
    * The location of the standalone Selenium Server jar file, relative
    * to the location of webdriver-manager. If no other method of starting
    * Selenium Server is found, this will default to
    * node_modules/protractor/node_modules/webdriver-manager/selenium/<jar file>
    */
  var seleniumServerJar: js.UndefOr[String] = js.native
  /**
    * The timeout milliseconds waiting for a local standalone Selenium Server to start.
    *
    * default: 30000ms
    */
  var seleniumServerStartTimeout: js.UndefOr[Double] = js.native
  /**
    * The selenium session id allows Protractor to attach to an existing selenium
    * browser session. The selenium session is maintained after the test has
    * completed. Ignored if seleniumAddress is null.
    */
  var seleniumSessionId: js.UndefOr[String] = js.native
  var seleniumWebDriver: js.UndefOr[WebDriver] = js.native
  /**
    * Turns off source map support.  Stops protractor from registering global
    * variable `source-map-support`.  Defaults to `false`
    */
  var skipSourceMapSupport: js.UndefOr[Boolean] = js.native
  /**
    * Required. Spec patterns are relative to the location of this config.
    *
    * Example:
    * specs: [
    *   'spec/ *_spec.js'
    * ]
    */
  var specs: js.UndefOr[js.Array[String]] = js.native
  /**
    * If you would like protractor to use a specific suite by default instead of
    * all suites, you can put that in the config file as well.
    */
  var suite: js.UndefOr[String] = js.native
  /**
    * Alternatively, suites may be used. When run without a command line
    * parameter, all suites will run. If run with --suite=smoke or
    * --suite=smoke,full only the patterns matched by the specified suites will
    * run.
    *
    * Example:
    * suites: {
    *   smoke: 'spec/smoketests/ *.js',
    *   full: 'spec/ *.js'
    * }
    */
  var suites: js.UndefOr[js.Any] = js.native
  /**
    * If testobjectUser and testobjectKey are specified, kobitonUser, kobitonKey, browserStackUser,
    * browserStackKey and seleniumServerJar will be ignored. The tests will be run remotely using
    * TestObject.
    */
  var testobjectKey: js.UndefOr[String] = js.native
  /**
    * If testobjectUser and testobjectKey are specified, kobitonUser, kobitonKey, browserstackUser,
    * browserStackKey and seleniumServerJar will be ignored. The tests will be run remotely using
    * TestObject.
    */
  var testobjectUser: js.UndefOr[String] = js.native
  var troubleshoot: js.UndefOr[Boolean] = js.native
  var unknownFlags_ : js.UndefOr[js.Array[String]] = js.native
  /**
    * Protractor will track outstanding $timeouts by default, and report them
    * in the error message if Protractor fails to synchronize with Angular in
    * time. In order to do this Protractor needs to decorate $timeout.
    *
    * CAUTION: If your app decorates $timeout, you must turn on this flag. This
    * is false by default.
    */
  var untrackOutstandingTimeouts: js.UndefOr[Boolean] = js.native
  /**
    * If specified, connect to webdriver through a proxy that manages client-side
    * synchronization. Blocking Proxy is an experimental feature and may change
    * without notice.
    */
  var useBlockingProxy: js.UndefOr[Boolean] = js.native
  var v8Debug: js.UndefOr[js.Any] = js.native
  /**
    * Whether or not to buffer output when running tests on multiple browsers
    * in parallel. By default, when running multiple browser sessions, the
    * results are buffered and not logged until the test run finishes. If true,
    * when running multiple sessions in parallel results will be logged when
    * each test finishes.
    */
  var verboseMultiSessions: js.UndefOr[Boolean] = js.native
  /**
    * If set, will create a log file in the given directory with a readable log of
    * the webdriver commands it executes.
    *
    * This is an experimental feature. Enabling this will also turn on Blocking Proxy
    * synchronization, which is also experimental.
    */
  var webDriverLogDir: js.UndefOr[String] = js.native
  /**
    * The proxy address that WebDriver (e.g. Selenium commands) traffic will go through
    * which is tied to the browser session.
    */
  var webDriverProxy: js.UndefOr[String] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSELENIUM_PROMISE_MANAGER(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SELENIUM_PROMISE_MANAGER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSELENIUM_PROMISE_MANAGER: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SELENIUM_PROMISE_MANAGER")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLaunch(value: /* exitCode */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLaunch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLaunch")(js.undefined)
        ret
    }
    @scala.inline
    def withAllScriptsTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allScriptsTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllScriptsTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allScriptsTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeLaunch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLaunch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLaunch")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockingProxyUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockingProxyUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockingProxyUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockingProxyUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserstackKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserstackKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserstackKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserstackKey")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserstackProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserstackProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserstackProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserstackProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserstackUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserstackUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserstackUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserstackUser")(js.undefined)
        ret
    }
    @scala.inline
    def withCapabilities(value: Dictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withChromeDriver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeDriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromeDriver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeDriver")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configDir")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDebuggerServerPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debuggerServerPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebuggerServerPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debuggerServerPort")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectConnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableChecks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableEnvironmentOverrides(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEnvironmentOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableEnvironmentOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEnvironmentOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withElementExplorer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementExplorer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementExplorer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementExplorer")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[String] | String): Self = {
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
    def withFirefoxPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefoxPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirefoxPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefoxPath")(js.undefined)
        ret
    }
    @scala.inline
    def withFramework(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameworkPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameworkPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameworkPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameworkPath")(js.undefined)
        ret
    }
    @scala.inline
    def withGeckoDriver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geckoDriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeckoDriver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geckoDriver")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMultiCapabilities(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMultiCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetMultiCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMultiCapabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPageTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetPageTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUncaughtExceptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUncaughtExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUncaughtExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUncaughtExceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withJasmineNodeOpts(value: DefaultTimeoutInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jasmineNodeOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJasmineNodeOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jasmineNodeOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withJvmArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jvmArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJvmArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jvmArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withKobitonKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kobitonKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKobitonKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kobitonKey")(js.undefined)
        ret
    }
    @scala.inline
    def withKobitonUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kobitonUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKobitonUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kobitonUser")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalSeleniumStandaloneOpts(value: JvmArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localSeleniumStandaloneOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalSeleniumStandaloneOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localSeleniumStandaloneOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: ERROR | WARN | INFO | DEBUG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSessions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSessions")(js.undefined)
        ret
    }
    @scala.inline
    def withMochaOpts(value: Reporter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mochaOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMochaOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mochaOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withMockSelenium(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockSelenium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMockSelenium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockSelenium")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiCapabilities(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiCapabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withNg12Hybrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ng12Hybrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNg12Hybrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ng12Hybrid")(js.undefined)
        ret
    }
    @scala.inline
    def withNoGlobals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noGlobals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoGlobals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noGlobals")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDebug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDebug")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCleanUp(value: /* exitCode */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCleanUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCleanUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCleanUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrepare(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrepare")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPrepare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrepare")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[PluginConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartBrowserBetweenTests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartBrowserBetweenTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartBrowserBetweenTests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartBrowserBetweenTests")(js.undefined)
        ret
    }
    @scala.inline
    def withResultJsonOutputFile(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultJsonOutputFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultJsonOutputFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultJsonOutputFile")(js.undefined)
        ret
    }
    @scala.inline
    def withRootElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootElement")(js.undefined)
        ret
    }
    @scala.inline
    def withSauceAgent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSauceAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withSauceBuild(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSauceBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceBuild")(js.undefined)
        ret
    }
    @scala.inline
    def withSauceKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSauceKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSauceProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSauceProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withSauceRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSauceRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withSauceSeleniumAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceSeleniumAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSauceSeleniumAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceSeleniumAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSauceSeleniumUseHttp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceSeleniumUseHttp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSauceSeleniumUseHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceSeleniumUseHttp")(js.undefined)
        ret
    }
    @scala.inline
    def withSauceUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSauceUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sauceUser")(js.undefined)
        ret
    }
    @scala.inline
    def withSeleniumAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeleniumAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSeleniumArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeleniumArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withSeleniumPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeleniumPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumPort")(js.undefined)
        ret
    }
    @scala.inline
    def withSeleniumServerJar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumServerJar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeleniumServerJar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumServerJar")(js.undefined)
        ret
    }
    @scala.inline
    def withSeleniumServerStartTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumServerStartTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeleniumServerStartTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumServerStartTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSeleniumSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumSessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeleniumSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumSessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSeleniumWebDriver(value: WebDriver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumWebDriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeleniumWebDriver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumWebDriver")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipSourceMapSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipSourceMapSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipSourceMapSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipSourceMapSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(js.undefined)
        ret
    }
    @scala.inline
    def withSuite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suite")(js.undefined)
        ret
    }
    @scala.inline
    def withSuites(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suites")(js.undefined)
        ret
    }
    @scala.inline
    def withTestobjectKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testobjectKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestobjectKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testobjectKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTestobjectUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testobjectUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestobjectUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testobjectUser")(js.undefined)
        ret
    }
    @scala.inline
    def withTroubleshoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("troubleshoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTroubleshoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("troubleshoot")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownFlags_(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownFlags_")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownFlags_ : Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownFlags_")(js.undefined)
        ret
    }
    @scala.inline
    def withUntrackOutstandingTimeouts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untrackOutstandingTimeouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUntrackOutstandingTimeouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untrackOutstandingTimeouts")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBlockingProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBlockingProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBlockingProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBlockingProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withV8Debug(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v8Debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV8Debug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v8Debug")(js.undefined)
        ret
    }
    @scala.inline
    def withVerboseMultiSessions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verboseMultiSessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerboseMultiSessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verboseMultiSessions")(js.undefined)
        ret
    }
    @scala.inline
    def withWebDriverLogDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webDriverLogDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebDriverLogDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webDriverLogDir")(js.undefined)
        ret
    }
    @scala.inline
    def withWebDriverProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webDriverProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebDriverProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webDriverProxy")(js.undefined)
        ret
    }
  }
  
}

