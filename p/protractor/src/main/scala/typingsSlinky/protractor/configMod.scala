package typingsSlinky.protractor

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
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
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterLaunch(value: /* exitCode */ Double => Unit): Self = StObject.set(x, "afterLaunch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterLaunchUndefined: Self = StObject.set(x, "afterLaunch", js.undefined)
      
      @scala.inline
      def setAllScriptsTimeout(value: Double): Self = StObject.set(x, "allScriptsTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllScriptsTimeoutUndefined: Self = StObject.set(x, "allScriptsTimeout", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setBeforeLaunch(value: () => Unit): Self = StObject.set(x, "beforeLaunch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeLaunchUndefined: Self = StObject.set(x, "beforeLaunch", js.undefined)
      
      @scala.inline
      def setBlockingProxyUrl(value: String): Self = StObject.set(x, "blockingProxyUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockingProxyUrlUndefined: Self = StObject.set(x, "blockingProxyUrl", js.undefined)
      
      @scala.inline
      def setBrowserstackKey(value: String): Self = StObject.set(x, "browserstackKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserstackKeyUndefined: Self = StObject.set(x, "browserstackKey", js.undefined)
      
      @scala.inline
      def setBrowserstackProxy(value: String): Self = StObject.set(x, "browserstackProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserstackProxyUndefined: Self = StObject.set(x, "browserstackProxy", js.undefined)
      
      @scala.inline
      def setBrowserstackUser(value: String): Self = StObject.set(x, "browserstackUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserstackUserUndefined: Self = StObject.set(x, "browserstackUser", js.undefined)
      
      @scala.inline
      def setCapabilities(value: Dictkey): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      @scala.inline
      def setChromeDriver(value: String): Self = StObject.set(x, "chromeDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeDriverUndefined: Self = StObject.set(x, "chromeDriver", js.undefined)
      
      @scala.inline
      def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigDirUndefined: Self = StObject.set(x, "configDir", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDebuggerServerPort(value: Double): Self = StObject.set(x, "debuggerServerPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebuggerServerPortUndefined: Self = StObject.set(x, "debuggerServerPort", js.undefined)
      
      @scala.inline
      def setDirectConnect(value: Boolean): Self = StObject.set(x, "directConnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectConnectUndefined: Self = StObject.set(x, "directConnect", js.undefined)
      
      @scala.inline
      def setDisableChecks(value: Boolean): Self = StObject.set(x, "disableChecks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableChecksUndefined: Self = StObject.set(x, "disableChecks", js.undefined)
      
      @scala.inline
      def setDisableEnvironmentOverrides(value: Boolean): Self = StObject.set(x, "disableEnvironmentOverrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEnvironmentOverridesUndefined: Self = StObject.set(x, "disableEnvironmentOverrides", js.undefined)
      
      @scala.inline
      def setElementExplorer(value: js.Any): Self = StObject.set(x, "elementExplorer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementExplorerUndefined: Self = StObject.set(x, "elementExplorer", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String] | String): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setFirefoxPath(value: String): Self = StObject.set(x, "firefoxPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirefoxPathUndefined: Self = StObject.set(x, "firefoxPath", js.undefined)
      
      @scala.inline
      def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameworkPath(value: String): Self = StObject.set(x, "frameworkPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameworkPathUndefined: Self = StObject.set(x, "frameworkPath", js.undefined)
      
      @scala.inline
      def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
      
      @scala.inline
      def setGeckoDriver(value: String): Self = StObject.set(x, "geckoDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeckoDriverUndefined: Self = StObject.set(x, "geckoDriver", js.undefined)
      
      @scala.inline
      def setGetMultiCapabilities(value: js.Any): Self = StObject.set(x, "getMultiCapabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetMultiCapabilitiesUndefined: Self = StObject.set(x, "getMultiCapabilities", js.undefined)
      
      @scala.inline
      def setGetPageTimeout(value: Double): Self = StObject.set(x, "getPageTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPageTimeoutUndefined: Self = StObject.set(x, "getPageTimeout", js.undefined)
      
      @scala.inline
      def setHighlightDelay(value: Double): Self = StObject.set(x, "highlightDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightDelayUndefined: Self = StObject.set(x, "highlightDelay", js.undefined)
      
      @scala.inline
      def setIgnoreUncaughtExceptions(value: Boolean): Self = StObject.set(x, "ignoreUncaughtExceptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUncaughtExceptionsUndefined: Self = StObject.set(x, "ignoreUncaughtExceptions", js.undefined)
      
      @scala.inline
      def setJasmineNodeOpts(value: DefaultTimeoutInterval): Self = StObject.set(x, "jasmineNodeOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJasmineNodeOptsUndefined: Self = StObject.set(x, "jasmineNodeOpts", js.undefined)
      
      @scala.inline
      def setJvmArgs(value: js.Array[String]): Self = StObject.set(x, "jvmArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJvmArgsUndefined: Self = StObject.set(x, "jvmArgs", js.undefined)
      
      @scala.inline
      def setJvmArgsVarargs(value: String*): Self = StObject.set(x, "jvmArgs", js.Array(value :_*))
      
      @scala.inline
      def setKobitonKey(value: String): Self = StObject.set(x, "kobitonKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKobitonKeyUndefined: Self = StObject.set(x, "kobitonKey", js.undefined)
      
      @scala.inline
      def setKobitonUser(value: String): Self = StObject.set(x, "kobitonUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKobitonUserUndefined: Self = StObject.set(x, "kobitonUser", js.undefined)
      
      @scala.inline
      def setLocalSeleniumStandaloneOpts(value: JvmArgs): Self = StObject.set(x, "localSeleniumStandaloneOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSeleniumStandaloneOptsUndefined: Self = StObject.set(x, "localSeleniumStandaloneOpts", js.undefined)
      
      @scala.inline
      def setLogLevel(value: ERROR | WARN | INFO | DEBUG): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setMaxSessions(value: Double): Self = StObject.set(x, "maxSessions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSessionsUndefined: Self = StObject.set(x, "maxSessions", js.undefined)
      
      @scala.inline
      def setMochaOpts(value: Reporter): Self = StObject.set(x, "mochaOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMochaOptsUndefined: Self = StObject.set(x, "mochaOpts", js.undefined)
      
      @scala.inline
      def setMockSelenium(value: Boolean): Self = StObject.set(x, "mockSelenium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMockSeleniumUndefined: Self = StObject.set(x, "mockSelenium", js.undefined)
      
      @scala.inline
      def setMultiCapabilities(value: js.Array[_]): Self = StObject.set(x, "multiCapabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiCapabilitiesUndefined: Self = StObject.set(x, "multiCapabilities", js.undefined)
      
      @scala.inline
      def setMultiCapabilitiesVarargs(value: js.Any*): Self = StObject.set(x, "multiCapabilities", js.Array(value :_*))
      
      @scala.inline
      def setNg12Hybrid(value: Boolean): Self = StObject.set(x, "ng12Hybrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNg12HybridUndefined: Self = StObject.set(x, "ng12Hybrid", js.undefined)
      
      @scala.inline
      def setNoGlobals(value: Boolean): Self = StObject.set(x, "noGlobals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoGlobalsUndefined: Self = StObject.set(x, "noGlobals", js.undefined)
      
      @scala.inline
      def setNodeDebug(value: Boolean): Self = StObject.set(x, "nodeDebug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeDebugUndefined: Self = StObject.set(x, "nodeDebug", js.undefined)
      
      @scala.inline
      def setOnCleanUp(value: /* exitCode */ Double => Unit): Self = StObject.set(x, "onCleanUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCleanUpUndefined: Self = StObject.set(x, "onCleanUp", js.undefined)
      
      @scala.inline
      def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnPrepare(value: () => Unit): Self = StObject.set(x, "onPrepare", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPrepareUndefined: Self = StObject.set(x, "onPrepare", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[PluginConfig]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: PluginConfig*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setRestartBrowserBetweenTests(value: Boolean): Self = StObject.set(x, "restartBrowserBetweenTests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestartBrowserBetweenTestsUndefined: Self = StObject.set(x, "restartBrowserBetweenTests", js.undefined)
      
      @scala.inline
      def setResultJsonOutputFile(value: js.Any): Self = StObject.set(x, "resultJsonOutputFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultJsonOutputFileUndefined: Self = StObject.set(x, "resultJsonOutputFile", js.undefined)
      
      @scala.inline
      def setRootElement(value: String): Self = StObject.set(x, "rootElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootElementUndefined: Self = StObject.set(x, "rootElement", js.undefined)
      
      @scala.inline
      def setSELENIUM_PROMISE_MANAGER(value: Boolean): Self = StObject.set(x, "SELENIUM_PROMISE_MANAGER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSELENIUM_PROMISE_MANAGERUndefined: Self = StObject.set(x, "SELENIUM_PROMISE_MANAGER", js.undefined)
      
      @scala.inline
      def setSauceAgent(value: js.Any): Self = StObject.set(x, "sauceAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSauceAgentUndefined: Self = StObject.set(x, "sauceAgent", js.undefined)
      
      @scala.inline
      def setSauceBuild(value: String): Self = StObject.set(x, "sauceBuild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSauceBuildUndefined: Self = StObject.set(x, "sauceBuild", js.undefined)
      
      @scala.inline
      def setSauceKey(value: String): Self = StObject.set(x, "sauceKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSauceKeyUndefined: Self = StObject.set(x, "sauceKey", js.undefined)
      
      @scala.inline
      def setSauceProxy(value: String): Self = StObject.set(x, "sauceProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSauceProxyUndefined: Self = StObject.set(x, "sauceProxy", js.undefined)
      
      @scala.inline
      def setSauceRegion(value: String): Self = StObject.set(x, "sauceRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSauceRegionUndefined: Self = StObject.set(x, "sauceRegion", js.undefined)
      
      @scala.inline
      def setSauceSeleniumAddress(value: String): Self = StObject.set(x, "sauceSeleniumAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSauceSeleniumAddressUndefined: Self = StObject.set(x, "sauceSeleniumAddress", js.undefined)
      
      @scala.inline
      def setSauceSeleniumUseHttp(value: Boolean): Self = StObject.set(x, "sauceSeleniumUseHttp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSauceSeleniumUseHttpUndefined: Self = StObject.set(x, "sauceSeleniumUseHttp", js.undefined)
      
      @scala.inline
      def setSauceUser(value: String): Self = StObject.set(x, "sauceUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSauceUserUndefined: Self = StObject.set(x, "sauceUser", js.undefined)
      
      @scala.inline
      def setSeleniumAddress(value: String): Self = StObject.set(x, "seleniumAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeleniumAddressUndefined: Self = StObject.set(x, "seleniumAddress", js.undefined)
      
      @scala.inline
      def setSeleniumArgs(value: js.Array[_]): Self = StObject.set(x, "seleniumArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeleniumArgsUndefined: Self = StObject.set(x, "seleniumArgs", js.undefined)
      
      @scala.inline
      def setSeleniumArgsVarargs(value: js.Any*): Self = StObject.set(x, "seleniumArgs", js.Array(value :_*))
      
      @scala.inline
      def setSeleniumPort(value: Double): Self = StObject.set(x, "seleniumPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeleniumPortUndefined: Self = StObject.set(x, "seleniumPort", js.undefined)
      
      @scala.inline
      def setSeleniumServerJar(value: String): Self = StObject.set(x, "seleniumServerJar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeleniumServerJarUndefined: Self = StObject.set(x, "seleniumServerJar", js.undefined)
      
      @scala.inline
      def setSeleniumServerStartTimeout(value: Double): Self = StObject.set(x, "seleniumServerStartTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeleniumServerStartTimeoutUndefined: Self = StObject.set(x, "seleniumServerStartTimeout", js.undefined)
      
      @scala.inline
      def setSeleniumSessionId(value: String): Self = StObject.set(x, "seleniumSessionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeleniumSessionIdUndefined: Self = StObject.set(x, "seleniumSessionId", js.undefined)
      
      @scala.inline
      def setSeleniumWebDriver(value: WebDriver): Self = StObject.set(x, "seleniumWebDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeleniumWebDriverUndefined: Self = StObject.set(x, "seleniumWebDriver", js.undefined)
      
      @scala.inline
      def setSkipSourceMapSupport(value: Boolean): Self = StObject.set(x, "skipSourceMapSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipSourceMapSupportUndefined: Self = StObject.set(x, "skipSourceMapSupport", js.undefined)
      
      @scala.inline
      def setSpecs(value: js.Array[String]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecsUndefined: Self = StObject.set(x, "specs", js.undefined)
      
      @scala.inline
      def setSpecsVarargs(value: String*): Self = StObject.set(x, "specs", js.Array(value :_*))
      
      @scala.inline
      def setSuite(value: String): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuiteUndefined: Self = StObject.set(x, "suite", js.undefined)
      
      @scala.inline
      def setSuites(value: js.Any): Self = StObject.set(x, "suites", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuitesUndefined: Self = StObject.set(x, "suites", js.undefined)
      
      @scala.inline
      def setTestobjectKey(value: String): Self = StObject.set(x, "testobjectKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestobjectKeyUndefined: Self = StObject.set(x, "testobjectKey", js.undefined)
      
      @scala.inline
      def setTestobjectUser(value: String): Self = StObject.set(x, "testobjectUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestobjectUserUndefined: Self = StObject.set(x, "testobjectUser", js.undefined)
      
      @scala.inline
      def setTroubleshoot(value: Boolean): Self = StObject.set(x, "troubleshoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTroubleshootUndefined: Self = StObject.set(x, "troubleshoot", js.undefined)
      
      @scala.inline
      def setUnknownFlags_(value: js.Array[String]): Self = StObject.set(x, "unknownFlags_", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnknownFlags_Undefined: Self = StObject.set(x, "unknownFlags_", js.undefined)
      
      @scala.inline
      def setUnknownFlags_Varargs(value: String*): Self = StObject.set(x, "unknownFlags_", js.Array(value :_*))
      
      @scala.inline
      def setUntrackOutstandingTimeouts(value: Boolean): Self = StObject.set(x, "untrackOutstandingTimeouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntrackOutstandingTimeoutsUndefined: Self = StObject.set(x, "untrackOutstandingTimeouts", js.undefined)
      
      @scala.inline
      def setUseBlockingProxy(value: Boolean): Self = StObject.set(x, "useBlockingProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBlockingProxyUndefined: Self = StObject.set(x, "useBlockingProxy", js.undefined)
      
      @scala.inline
      def setV8Debug(value: js.Any): Self = StObject.set(x, "v8Debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV8DebugUndefined: Self = StObject.set(x, "v8Debug", js.undefined)
      
      @scala.inline
      def setVerboseMultiSessions(value: Boolean): Self = StObject.set(x, "verboseMultiSessions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseMultiSessionsUndefined: Self = StObject.set(x, "verboseMultiSessions", js.undefined)
      
      @scala.inline
      def setWebDriverLogDir(value: String): Self = StObject.set(x, "webDriverLogDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebDriverLogDirUndefined: Self = StObject.set(x, "webDriverLogDir", js.undefined)
      
      @scala.inline
      def setWebDriverProxy(value: String): Self = StObject.set(x, "webDriverProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebDriverProxyUndefined: Self = StObject.set(x, "webDriverProxy", js.undefined)
    }
  }
}
