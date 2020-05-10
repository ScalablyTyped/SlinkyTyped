package typingsSlinky.karma.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.log4js.mod.Appender
import typingsSlinky.node.httpsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  /**
    * @description Enable or disable watching files and executing the tests whenever one of these files changes.
    * @default true
    */
  var autoWatch: js.UndefOr[Boolean] = js.native
  /**
    * @description When Karma is watching the files for changes, it tries to batch multiple changes into a single run
    * so that the test runner doesn't try to start and restart running tests more than it should.
    * The configuration setting tells Karma how long to wait (in milliseconds) after any changes have occurred
    * before starting the test process again.
    * @default 250
    */
  var autoWatchBatchDelay: js.UndefOr[Double] = js.native
  /**
    * @default ''
    * @description The root path location that will be used to resolve all relative paths defined in <code>files</code> and <code>exclude</code>.
    * If the basePath configuration is a relative path then it will be resolved to
    * the <code>__dirname</code> of the configuration file.
    */
  var basePath: js.UndefOr[String] = js.native
  /**
    * This is the same as middleware except that these middleware will be run before karma's own middleware.
    * @default []
    */
  var beforeMiddleware: js.UndefOr[js.Array[String]] = js.native
  /**
    * Configure how the browser console is logged with the following properties, all of which are optional
    */
  var browserConsoleLogOptions: js.UndefOr[BrowserConsoleLogOptions] = js.native
  /**
    * @default 2000
    * @description How long does Karma wait for a browser to reconnect (in ms).
    * <p>
    * With a flaky connection it is pretty common that the browser disconnects,
    * but the actual test execution is still running without any problems. Karma does not treat a disconnection
    * as immediate failure and will wait <code>browserDisconnectTimeout</code> (ms).
    * If the browser reconnects during that time, everything is fine.
    * </p>
    */
  var browserDisconnectTimeout: js.UndefOr[Double] = js.native
  /**
    * @default 0
    * @description The number of disconnections tolerated.
    * <p>
    * The <code>disconnectTolerance</code> value represents the maximum number of tries a browser will attempt
    * in the case of a disconnection. Usually any disconnection is considered a failure,
    * but this option allows you to define a tolerance level when there is a flaky network link between
    * the Karma server and the browsers.
    * </p>
    */
  var browserDisconnectTolerance: js.UndefOr[Double] = js.native
  /**
    * @default 10000
    * @description How long will Karma wait for a message from a browser before disconnecting from it (in ms).
    * <p>
    * If, during test execution, Karma does not receive any message from a browser within
    * <code>browserNoActivityTimeout</code> (ms), it will disconnect from the browser
    * </p>
    */
  var browserNoActivityTimeout: js.UndefOr[Double] = js.native
  /**
    * Timeout for the client socket connection (in ms)
    * @default 20000
    */
  var browserSocketTimeout: js.UndefOr[Double] = js.native
  /**
    * @default []
    * Possible Values:
    * <ul>
    *     <li>Chrome (launcher comes installed with Karma)</li>
    *     <li>ChromeCanary (launcher comes installed with Karma)</li>
    *     <li>PhantomJS (launcher comes installed with Karma)</li>
    *     <li>Firefox (launcher requires karma-firefox-launcher plugin)</li>
    *     <li>Opera (launcher requires karma-opera-launcher plugin)</li>
    *     <li>Internet Explorer (launcher requires karma-ie-launcher plugin)</li>
    *     <li>Safari (launcher requires karma-safari-launcher plugin)</li>
    * </ul>
    * @description A list of browsers to launch and capture. When Karma starts up, it will also start up each browser
    * which is placed within this setting. Once Karma is shut down, it will shut down these browsers as well.
    * You can capture any browser manually by opening the browser and visiting the URL where
    * the Karma web server is listening (by default it is <code>http://localhost:9876/</code>).
    */
  var browsers: js.UndefOr[js.Array[AutomatedBrowsers | String]] = js.native
  /**
    * @default 60000
    * @description Timeout for capturing a browser (in ms).
    * <p>
    * The <code>captureTimeout</code> value represents the maximum boot-up time allowed for a
    * browser to start and connect to Karma. If any browser does not get captured within the timeout, Karma
    * will kill it and try to launch it again and, after three attempts to capture it, Karma will give up.
    * </p>
    */
  var captureTimeout: js.UndefOr[Double] = js.native
  var client: js.UndefOr[ClientOptions] = js.native
  /**
    * @default true
    * @description Enable or disable colors in the output (reporters and logs).
    */
  var colors: js.UndefOr[Boolean] = js.native
  /**
    * @default 'Infinity'
    * @description How many browsers Karma launches in parallel.
    * Especially on services like SauceLabs and Browserstack, it makes sense only to launch a limited
    * amount of browsers at once, and only start more when those have finished. Using this configuration,
    * you can specify how many browsers should be running at once at any given point in time.
    */
  var concurrency: js.UndefOr[Double] = js.native
  /**
    * When true, this will append the crossorigin attribute to generated script tags,
    * which enables better error reporting for JavaScript files served from a different origin
    * @default true
    */
  var crossOriginAttribute: js.UndefOr[Boolean] = js.native
  /**
    * If null (default), uses karma's own client_with_context.html file (which is used when client.runInParent set to true).
    * @default undefined
    */
  var customClientContextFile: js.UndefOr[String] = js.native
  /**
    * If null (default), uses karma's own context.html file.
    * @default undefined
    */
  var customContextFile: js.UndefOr[String] = js.native
  /**
    * If null (default), uses karma's own debug.html file.
    * @default undefined
    */
  var customDebugFile: js.UndefOr[String] = js.native
  /**
    * Custom HTTP headers that will be set upon serving files by Karma's web server.
    * Custom headers are useful, especially with upcoming browser features like Service Workers.
    * @default undefined
    */
  var customHeaders: js.UndefOr[js.Array[CustomHeaders]] = js.native
  var customLaunchers: js.UndefOr[StringDictionary[CustomLauncher]] = js.native
  /**
    * When true, this will start the karma server in another process, writing no output to the console.
    * The server can be stopped using the karma stop command.
    * @default false
    */
  var detached: js.UndefOr[Boolean] = js.native
  /**
    * @default []
    * @description List of files/patterns to exclude from loaded files.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * Enable or disable failure on running empty test-suites.
    * If disabled the program will return exit-code 0 and display a warning.
    * @default true
    */
  var failOnEmptyTestSuite: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable failure on failing tests.
    * @default true
    */
  var failOnFailingTestSuite: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable failure on tests deliberately disabled, eg fit() or xit() tests in jasmine.
    * Use this to prevent accidental disabling tests needed to validate production.
    * @default true
    */
  var failOnSkippedTests: js.UndefOr[Boolean] = js.native
  /**
    * @default []
    * @description List of files/patterns to load in the browser.
    */
  var files: js.UndefOr[js.Array[FilePattern | String]] = js.native
  /**
    * Force socket.io to use JSONP polling instead of XHR polling
    * @default false
    */
  var forceJSONP: js.UndefOr[Boolean] = js.native
  /**
    * A new error message line
    * @default undefined
    */
  var formatError: js.UndefOr[js.Function1[/* msg */ String, String]] = js.native
  /**
    * @default []
    * @description List of test frameworks you want to use. Typically, you will set this to ['jasmine'], ['mocha'] or ['qunit']...
    * Please note just about all frameworks in Karma require an additional plugin/framework library to be installed (via NPM).
    */
  var frameworks: js.UndefOr[js.Array[String]] = js.native
  /**
    * @default 'localhost'
    * @description Hostname to be used when capturing browsers.
    */
  var hostname: js.UndefOr[String] = js.native
  /**
    * Module used for Karma webserver
    * @default undefined
    */
  var httpModule: js.UndefOr[String] = js.native
  /**
    * @default {}
    * @description Options object to be used by Node's https class.
    * Object description can be found in the
    * [NodeJS.org API docs](https://nodejs.org/api/tls.html#tls_tls_createserver_options_secureconnectionlistener)
    */
  var httpsServerOptions: js.UndefOr[ServerOptions] = js.native
  /**
    * Address that the server will listen on. Change to 'localhost' to only listen to the loopback, or '::' to listen on all IPv6 interfaces
    * @default '0.0.0.0' or `LISTEN_ADDR`
    */
  var listenAddress: js.UndefOr[String] = js.native
  /**
    * @default config.LOG_INFO
    * Possible values:
    * <ul>
    *   <li>config.LOG_DISABLE</li>
    *   <li>config.LOG_ERROR</li>
    *   <li>config.LOG_WARN</li>
    *   <li>config.LOG_INFO</li>
    *   <li>config.LOG_DEBUG</li>
    * </ul>
    * @description Level of logging.
    */
  var logLevel: js.UndefOr[String] = js.native
  /**
    * @default [{type: 'console'}]
    * @description A list of log appenders to be used. See the documentation for [log4js] for more information.
    */
  var loggers: js.UndefOr[StringDictionary[Appender] | js.Array[Appender]] = js.native
  /**
    * @default []
    * @description List of names of additional middleware you want the
    * Karma server to use. Middleware will be used in the order listed.
    * You must have installed the middleware via a plugin/framework
    * (either inline or via NPM). Additional information can be found in
    * [plugins](http://karma-runner.github.io/2.0/config/plugins.html).
    * The plugin must provide an express/connect middleware function
    * (details about this can be found in the
    * [Express](http://expressjs.com/guide/using-middleware.html) docs).
    */
  var middleware: js.UndefOr[js.Array[String]] = js.native
  /**
    * @default {}
    * @description Redefine default mapping from file extensions to MIME-type.
    * Set property name to required MIME, provide Array of extensions (without dots) as it's value.
    */
  var mime: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
    * Socket.io pingTimeout in ms, https://socket.io/docs/server-api/#new-Server-httpServer-options.
    * Very slow networks may need values up to 60000. Larger values delay discovery of deadlock in tests or browser crashes.
    * @default 5000
    */
  var pingTimeout: js.UndefOr[Double] = js.native
  /**
    * @default ['karma-*']
    * @description List of plugins to load. A plugin can be a string (in which case it will be required
    * by Karma) or an inlined plugin - Object.
    * By default, Karma loads all sibling NPM modules which have a name starting with karma-*.
    * Note: Just about all plugins in Karma require an additional library to be installed (via NPM).
    */
  var plugins: js.UndefOr[js.Array[PluginName | InlinePluginDef]] = js.native
  /**
    * @default 9876
    * @description The port where the web server will be listening.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * @default {'**\/ *.coffee': 'coffee'}
    * @description A map of preprocessors to use.
    *
    * Preprocessors can be loaded through [plugins].
    *
    * Note: Just about all preprocessors in Karma (other than CoffeeScript and some other defaults)
    * require an additional library to be installed (via NPM).
    *
    * Be aware that preprocessors may be transforming the files and file types that are available at run time. For instance,
    * if you are using the "coverage" preprocessor on your source files, if you then attempt to interactively debug
    * your tests, you'll discover that your expected source code is completely changed from what you expected.  Because
    * of that, you'll want to engineer this so that your automated builds use the coverage entry in the "reporters" list,
    * but your interactive debugging does not.
    *
    */
  var preprocessors: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  /**
    * How long will Karma wait for browser process to terminate before sending a SIGKILL signal
    * @default 2000
    */
  var processKillTimeout: js.UndefOr[Double] = js.native
  /**
    * @default 'http:'
    * Possible Values:
    * <ul>
    *   <li>http:</li>
    *   <li>https:</li>
    * </ul>
    * @description Protocol used for running the Karma webserver.
    * Determines the use of the Node http or https class.
    * Note: Using <code>'https:'</code> requires you to specify <code>httpsServerOptions</code>.
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * @default {}
    * @description A map of path-proxy pairs
    * The proxy can be specified directly by the target url or path, or with an object to configure more options
    */
  var proxies: js.UndefOr[PathProxyPairs] = js.native
  /**
    * Called when requesting Proxy
    * @default undefined
    */
  var proxyReq: js.UndefOr[
    js.Function4[/* proxyReq */ js.Any, /* req */ js.Any, /* res */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
  /**
    * Called when respnsing Proxy
    * @default undefined
    */
  var proxyRes: js.UndefOr[js.Function3[/* proxyRes */ js.Any, /* req */ js.Any, /* res */ js.Any, Unit]] = js.native
  /**
    * @default true
    * @description Whether or not Karma or any browsers should raise an error when an inavlid SSL certificate is found.
    */
  var proxyValidateSSL: js.UndefOr[Boolean] = js.native
  /**
    * @default 0
    * @description Karma will report all the tests that are slower than given time limit (in ms).
    * This is disabled by default (since the default value is 0).
    */
  var reportSlowerThan: js.UndefOr[Double] = js.native
  /**
    * @default ['progress']
    * Possible Values:
    * <ul>
    *   <li>dots</li>
    *   <li>progress</li>
    * </ul>
    * @description A list of reporters to use.
    * Additional reporters, such as growl, junit, teamcity or coverage can be loaded through plugins.
    * Note: Just about all additional reporters in Karma (other than progress) require an additional library to be installed (via NPM).
    */
  var reporters: js.UndefOr[js.Array[String]] = js.native
  /**
    * When Karma is watching the files for changes, it will delay a new run
    * until the current run is finished. Enabling this setting
    * will cancel the current run and start a new run immediately when a change is detected.
    */
  var restartOnFileChange: js.UndefOr[Boolean] = js.native
  /**
    * When a browser crashes, karma will try to relaunch. This defines how many times karma should relaunch a browser before giving up.
    * @default 2
    */
  var retryLimit: js.UndefOr[Double] = js.native
  /**
    * @default false
    * @description Continuous Integration mode.
    * If true, Karma will start and capture all configured browsers, run tests and then exit with an exit code of 0 or 1 depending
    * on whether all tests passed or any tests failed.
    */
  var singleRun: js.UndefOr[Boolean] = js.native
  /**
    * @default ['polling', 'websocket']
    * @description An array of allowed transport methods between the browser and testing server. This configuration setting
    * is handed off to [socket.io](http://socket.io/) (which manages the communication
    * between browsers and the testing server).
    */
  var transports: js.UndefOr[js.Array[String]] = js.native
  /**
    * For use when the Karma server needs to be run behind a proxy that changes the base url, etc
    */
  var upstreamProxy: js.UndefOr[UpstreamProxy] = js.native
  /**
    * @default '/'
    * @description The base url, where Karma runs.
    * All of Karma's urls get prefixed with the urlRoot. This is helpful when using proxies, as
    * sometimes you might want to proxy a url that is already taken by Karma.
    */
  var urlRoot: js.UndefOr[String] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWatch")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoWatchBatchDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWatchBatchDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWatchBatchDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWatchBatchDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeMiddleware(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeMiddleware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeMiddleware")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserConsoleLogOptions(value: BrowserConsoleLogOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserConsoleLogOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserConsoleLogOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserConsoleLogOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserDisconnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserDisconnectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserDisconnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserDisconnectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserDisconnectTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserDisconnectTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserDisconnectTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserDisconnectTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserNoActivityTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserNoActivityTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserNoActivityTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserNoActivityTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserSocketTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserSocketTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserSocketTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserSocketTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowsers(value: js.Array[AutomatedBrowsers | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browsers")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withClient(value: ClientOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOriginAttribute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOriginAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOriginAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOriginAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomClientContextFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClientContextFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomClientContextFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClientContextFile")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomContextFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customContextFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomContextFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customContextFile")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDebugFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDebugFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDebugFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDebugFile")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomHeaders(value: js.Array[CustomHeaders]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLaunchers(value: StringDictionary[CustomLauncher]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLaunchers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLaunchers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLaunchers")(js.undefined)
        ret
    }
    @scala.inline
    def withDetached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(js.undefined)
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
    def withFailOnEmptyTestSuite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnEmptyTestSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOnEmptyTestSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnEmptyTestSuite")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOnFailingTestSuite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnFailingTestSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOnFailingTestSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnFailingTestSuite")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOnSkippedTests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnSkippedTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOnSkippedTests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnSkippedTests")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[FilePattern | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withForceJSONP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceJSONP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceJSONP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceJSONP")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatError(value: /* msg */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatError")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameworks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameworks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameworks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameworks")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpModule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpModule")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpsServerOptions(value: ServerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsServerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpsServerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsServerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withListenAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListenAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: String): Self = {
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
    def withLoggers(value: StringDictionary[Appender] | js.Array[Appender]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggers")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddleware(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(js.undefined)
        ret
    }
    @scala.inline
    def withMime(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(js.undefined)
        ret
    }
    @scala.inline
    def withPingTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPingTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[PluginName | InlinePluginDef]): Self = {
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
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocessors(value: StringDictionary[String | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreprocessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessors")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessKillTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processKillTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessKillTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processKillTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withProxies(value: PathProxyPairs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxies")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyReq(
      value: (/* proxyReq */ js.Any, /* req */ js.Any, /* res */ js.Any, /* options */ js.Object) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyReq")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutProxyReq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyReq")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyRes(value: (/* proxyRes */ js.Any, /* req */ js.Any, /* res */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyRes")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutProxyRes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyRes")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyValidateSSL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyValidateSSL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyValidateSSL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyValidateSSL")(js.undefined)
        ret
    }
    @scala.inline
    def withReportSlowerThan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportSlowerThan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportSlowerThan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportSlowerThan")(js.undefined)
        ret
    }
    @scala.inline
    def withReporters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporters")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartOnFileChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartOnFileChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartOnFileChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartOnFileChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleRun")(js.undefined)
        ret
    }
    @scala.inline
    def withTransports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transports")(js.undefined)
        ret
    }
    @scala.inline
    def withUpstreamProxy(value: UpstreamProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upstreamProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpstreamProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upstreamProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlRoot")(js.undefined)
        ret
    }
  }
  
}

