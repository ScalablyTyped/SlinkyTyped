package typingsSlinky.browserSync.mod

import typingsSlinky.chokidar.mod.WatchOptions
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.serveStatic.mod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The browser(s) to open
    * Default: default
    */
  var browser: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * ¯\_(ツ)_/¯
    * Best guess, when ghostMode (or SocketIO?) is setup the events
    * listed here will be emitted and able to hook into.
    */
  var clientEvents: js.UndefOr[js.Array[String]] = js.native
  /**
    * Send file-change events to the browser
    * Default: true
    */
  var codeSync: js.UndefOr[Boolean] = js.native
  /**
    * Add HTTP access control (CORS) headers to assets served by Browsersync.
    * Default: false
    * Note: Requires at least version 2.16.0.
    */
  var cors: js.UndefOr[Boolean] = js.native
  /**
    * ¯\_(ツ)_/¯
    */
  var excludeFileTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Browsersync can watch your files as you work. Changes you make will either be injected into the page (CSS
    * & images) or will cause all browsers to do a full-page refresh. See anymatch for more information on glob
    * patterns.
    * Default: false
    */
  var files: js.UndefOr[String | (js.Array[String | FileCallback | js.Object])] = js.native
  /**
    * Clicks, Scrolls & Form inputs on any device will be mirrored to all others.
    * clicks - Default: true
    * scroll - Default: true
    * forms - Default: true
    */
  var ghostMode: js.UndefOr[GhostOptions | Boolean] = js.native
  /**
    * Override host detection if you know the correct IP to use
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Override http module to allow using 3rd party server modules (such as http2).
    */
  var httpModule: js.UndefOr[String] = js.native
  /**
    * Enable https for localhost development.
    * Note: This may not be needed for proxy option as it will try to infer from your target url.
    * Note: If privacy error is encountered please see HttpsOptions below, setting those will resolve.
    * Note: Requires at least version 1.3.0.
    */
  var https: js.UndefOr[Boolean | HttpsOptions] = js.native
  /**
    * Patterns for any watchers to ignore.
    * Anything provided here will end up inside 'watchOptions.ignored'.
    */
  var ignore: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether to inject changes (rather than a page refresh)
    * Default: true
    */
  var injectChanges: js.UndefOr[Boolean] = js.native
  /**
    * ¯\_(ツ)_/¯
    */
  var injectFileTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Support environments where dynamic hostnames are not required (ie: electron).
    */
  var localOnly: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not to log connections
    * Default: false
    */
  var logConnections: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not to log information about changed files
    * Default: false
    */
  var logFileChanges: js.UndefOr[Boolean] = js.native
  /**
    * Can be either "info", "debug", "warn", or "silent"
    * Default: info
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  /**
    * Change the console logging prefix. Useful if you're creating your own project based on Browsersync
    * Default: BS
    * Note: Requires at least version 1.5.1.
    */
  var logPrefix: js.UndefOr[String] = js.native
  /**
    * Log the snippet to the console when you're in snippet mode (no proxy/server)
    * Default: true
    * Note: Requires at least version 1.5.2.
    */
  var logSnippet: js.UndefOr[Boolean] = js.native
  /**
    * Functions or actual plugins used as middleware.
    */
  var middleware: js.UndefOr[
    MiddlewareHandler | PerRouteMiddleware | (js.Array[MiddlewareHandler | PerRouteMiddleware])
  ] = js.native
  /**
    * Whether to minify the client script
    * Default: true
    */
  var minify: js.UndefOr[Boolean] = js.native
  /**
    * The small pop-over notifications in the browser are not always needed/wanted.
    * Default: true
    */
  @JSName("notify")
  var notify_FOptions: js.UndefOr[Boolean] = js.native
  /**
    * Some features of Browsersync (such as xip & tunnel) require an internet connection, but if you're
    * working offline, you can reduce start-up time by setting this option to false
    */
  var online: js.UndefOr[Boolean] = js.native
  /**
    * Default: true
    * Decide which URL to open automatically when Browsersync starts. Defaults to "local" if none set.
    * Can be true, local, external, ui, ui-external, tunnel or false
    */
  var open: js.UndefOr[OpenOptions | Boolean] = js.native
  /**
    * User provided plugins
    * Default: []
    * Note: Requires at least version 2.6.0.
    */
  var plugins: js.UndefOr[js.Array[_]] = js.native
  /**
    * Use a specific port (instead of the one auto-detected by Browsersync)
    * Default: 3000
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * Proxy an EXISTING vhost. Browsersync will wrap your vhost with a proxy URL to view your site.
    * Passing only a URL as a string equates to passing only target property of ProxyOptions type.
    * target - Default: undefined
    * ws - Default: undefined
    * middleware - Default: undefined
    * reqHeaders - Default: undefined
    * proxyRes - Default: undefined (http.ServerResponse if expecting single parameter)
    * proxyReq - Default: undefined
    */
  var proxy: js.UndefOr[String | ProxyOptions] = js.native
  /**
    * Restrict the frequency in which browser:reload events can be emitted to connected clients
    * Default: 0
    * Note: Requires at least version 2.6.0.
    */
  var reloadDebounce: js.UndefOr[Double] = js.native
  /**
    * Time, in milliseconds, to wait before instructing the browser to reload/inject following a file
    * change event
    * Default: 0
    */
  var reloadDelay: js.UndefOr[Double] = js.native
  /**
    * Reload each browser when Browsersync is restarted.
    * Default: false
    */
  var reloadOnRestart: js.UndefOr[Boolean] = js.native
  /**
    * Emit only the first event during sequential time windows of a specified duration.
    * Note: Requires at least version 2.13.0.
    */
  var reloadThrottle: js.UndefOr[Double] = js.native
  /**
    * Add additional HTML rewriting rules.
    * Default: false
    * Note: Requires at least version 2.4.0.
    */
  var rewriteRules: js.UndefOr[Boolean | js.Array[RewriteRules]] = js.native
  /**
    * Alter the script path for complete control over where the Browsersync Javascript is served
    * from. Whatever you return from this function will be used as the script path.
    * Note: Requires at least version 1.5.0.
    */
  var scriptPath: js.UndefOr[js.Function1[/* path */ String, String]] = js.native
  /**
    * Default: []
    * Note: Requires at least version 2.9.0.
    * Sync the scroll position of any element on the page - where any scrolled element will cause
    * all others to match scroll position. This is helpful when a breakpoint alters which element
    * is actually scrolling
    */
  var scrollElementMapping: js.UndefOr[js.Array[String]] = js.native
  /**
    * Sync the scroll position of any element on the page. Add any amount of CSS selectors
    * Default: []
    * Note: Requires at least version 2.9.0.
    */
  var scrollElements: js.UndefOr[js.Array[String]] = js.native
  /**
    * scrollProportionally: false // Sync viewports to TOP position
    * Default: true
    */
  var scrollProportionally: js.UndefOr[Boolean] = js.native
  /**
    * Decide which technique should be used to restore scroll position following a reload.
    * Can be window.name or cookie
    * Default: 'window.name'
    */
  var scrollRestoreTechnique: js.UndefOr[String] = js.native
  /**
    * How often to send scroll events
    * Default: 0
    */
  var scrollThrottle: js.UndefOr[Double] = js.native
  /**
    * Add additional directories from which static files should be served.
    * Should only be used in proxy or snippet mode.
    * Default: []
    * Note: Requires at least version 2.8.0.
    */
  var serveStatic: js.UndefOr[js.Array[StaticOptions | String]] = js.native
  /**
    * Options that are passed to the serve-static middleware when you use the
    * string[] syntax: eg: `serveStatic: ['./app']`.
    * Please see [serve-static](https://github.com/expressjs/serve-static) for details.
    */
  var serveStaticOptions: js.UndefOr[ServeStaticOptions] = js.native
  /**
    * Use the built-in static server for basic HTML/JS/CSS websites.
    * Default: false
    */
  var server: js.UndefOr[String | Boolean | js.Array[String] | ServerOptions] = js.native
  /**
    * Serve an index.html file for all non-asset routes.
    * Useful when using client-routers.
    */
  var single: js.UndefOr[Boolean] = js.native
  /**
    * You can control how the snippet is injected onto each page via a custom regex + function.
    * You can also provide patterns for certain urls that should be ignored from the snippet injection.
    * Note: Requires at least version 2.0.0.
    */
  var snippetOptions: js.UndefOr[SnippetOptions] = js.native
  /**
    * Configure the Socket.IO path and namespace & domain to avoid collisions.
    * path - Default: "/browser-sync/socket.io"
    * clientPath - Default: "/browser-sync"
    * namespace - Default: "/browser-sync"
    * domain - Default: undefined
    * port - Default: undefined
    * clients.heartbeatTimeout - Default: 5000
    * Note: Requires at least version 1.6.2.
    */
  var socket: js.UndefOr[SocketOptions] = js.native
  /**
    * The initial path to load
    */
  var startPath: js.UndefOr[String] = js.native
  /**
    * ¯\_(ツ)_/¯
    */
  var tagNames: js.UndefOr[TagNamesOptions] = js.native
  /**
    * Append timestamps to injected files
    * Default: true
    */
  var timestamps: js.UndefOr[Boolean] = js.native
  /**
    * Tunnel the Browsersync server through a random Public URL
    * Default: null
    */
  var tunnel: js.UndefOr[String | Boolean] = js.native
  /**
    * Browsersync includes a user-interface that is accessed via a separate port. The UI allows to controls
    * all devices, push sync updates and much more.
    *
    * port - Default: 3001
    * weinre.port - Default: 8080
    * Note: Requires at least version 2.0.0.
    */
  var ui: js.UndefOr[UIOptions | Boolean] = js.native
  /**
    * Watch files automatically.
    */
  var watch: js.UndefOr[Boolean] = js.native
  /**
    * Specify which file events to respond to.
    * Available events: `add`, `change`, `unlink`, `addDir`, `unlinkDir`
    */
  var watchEvents: js.UndefOr[WatchEvents | js.Array[String]] = js.native
  /**
    * File watching options that get passed along to Chokidar. Check their docs for available options
    * Default: undefined
    * Note: Requires at least version 2.6.0.
    */
  var watchOptions: js.UndefOr[WatchOptions] = js.native
  /**
    * Requires an internet connection - useful for services such as Typekit as it allows you to configure
    * domains such as *.xip.io in your kit settings
    * Default: false
    */
  var xip: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(js.undefined)
        ret
    }
    @scala.inline
    def withClientEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeSync")(js.undefined)
        ret
    }
    @scala.inline
    def withCors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeFileTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFileTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: String | (js.Array[String | FileCallback | js.Object])): Self = {
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
    def withGhostMode(value: GhostOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGhostMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
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
    def withHttps(value: Boolean | HttpsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withInjectChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjectChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withInjectFileTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectFileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjectFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectFileTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withLogConnections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withLogFileChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFileChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogFileChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFileChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: LogLevel): Self = {
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
    def withLogPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withLogSnippet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logSnippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logSnippet")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddlewareFunction3(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* next */ js.Function0[Unit]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMiddleware(value: MiddlewareHandler | PerRouteMiddleware | (js.Array[MiddlewareHandler | PerRouteMiddleware])): Self = {
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
    def withMinify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(js.undefined)
        ret
    }
    @scala.inline
    def withNotify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(js.undefined)
        ret
    }
    @scala.inline
    def withOnline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("online")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("online")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: OpenOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[_]): Self = {
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
    def withProxy(value: String | ProxyOptions): Self = {
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
    def withReloadDebounce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadDebounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReloadDebounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadDebounce")(js.undefined)
        ret
    }
    @scala.inline
    def withReloadDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReloadDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withReloadOnRestart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadOnRestart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReloadOnRestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadOnRestart")(js.undefined)
        ret
    }
    @scala.inline
    def withReloadThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadThrottle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReloadThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadThrottle")(js.undefined)
        ret
    }
    @scala.inline
    def withRewriteRules(value: Boolean | js.Array[RewriteRules]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewriteRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteRules")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptPath(value: /* path */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScriptPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptPath")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollElementMapping(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollElementMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollElementMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollElementMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollElements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollElements")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollProportionally(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollProportionally")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollProportionally: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollProportionally")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollRestoreTechnique(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollRestoreTechnique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollRestoreTechnique: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollRestoreTechnique")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollThrottle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollThrottle")(js.undefined)
        ret
    }
    @scala.inline
    def withServeStatic(value: js.Array[StaticOptions | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serveStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServeStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serveStatic")(js.undefined)
        ret
    }
    @scala.inline
    def withServeStaticOptions(value: ServeStaticOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serveStaticOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServeStaticOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serveStaticOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: String | Boolean | js.Array[String] | ServerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
    @scala.inline
    def withSingle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippetOptions(value: SnippetOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippetOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippetOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippetOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSocket(value: SocketOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTagNames(value: TagNamesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagNames")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamps")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel")(js.undefined)
        ret
    }
    @scala.inline
    def withUi(value: UIOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchEvents(value: WatchEvents | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchOptions(value: WatchOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withXip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xip")(js.undefined)
        ret
    }
  }
  
}

