package typingsSlinky.egg.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.egg.anon.Callback
import typingsSlinky.egg.anon.CookieField
import typingsSlinky.egg.anon.Csp
import typingsSlinky.egg.anon.Enable
import typingsSlinky.egg.anon.FastReady
import typingsSlinky.egg.anon.Ignore
import typingsSlinky.eggLogger.mod.EggLoggerOptions
import typingsSlinky.node.Buffer
import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EggAppConfig
  extends /* prop */ StringDictionary[js.Any] {
  /**
    * The current HOME directory
    */
  var HOME: String = js.native
  var baseDir: String = js.native
  /**
    * The option of `bodyParser` middleware
    *
    * @member Config#bodyParser
    * @property {Boolean} enable - enable bodyParser or not, default to true
    * @property {String | RegExp | Function | Array} ignore - won't parse request body when url path hit ignore pattern, can not set `ignore` when `match` presented
    * @property {String | RegExp | Function | Array} match - will parse request body only when url path hit match pattern
    * @property {String} encoding - body encoding config, default utf8
    * @property {String} formLimit - form body size limit, default 100kb
    * @property {String} jsonLimit - json body size limit, default 100kb
    * @property {Boolean} strict - json body strict mode, if set strict value true, then only receive object and array json body
    * @property {Number} queryString.arrayLimit - from item array length limit, default 100
    * @property {Number} queryString.depth - json value deep lenght, default 5
    * @property {Number} queryString.parameterLimit - paramter number limit ,default 1000
    * @property {string[]} enableTypes - parser will only parse when request type hits enableTypes, default is ['json', 'form']
    * @property {any} extendTypes - support extend types
    */
  var bodyParser: Enable = js.native
  /**
    * customLoader config
    */
  var customLoader: StringDictionary[CustomLoaderConfig] = js.native
  /** custom logger of egg */
  var customLogger: StringDictionary[EggLoggerOptions] = js.native
  var development: FastReady = js.native
  /**
    * It will ignore special keys when dumpConfig
    */
  var dump: Ignore = js.native
  /**
    * The environment of egg
    */
  var env: EggEnvType = js.native
  var hostHeaders: String = js.native
  /** Configuration of httpclient in egg. */
  var httpclient: HttpClientConfig = js.native
  /**
    * I18n options
    */
  var i18n: CookieField = js.native
  /**
    * Detect request' ip from specified headers, not case-sensitive. Only worked when config.proxy set to true.
    */
  var ipHeaders: String = js.native
  /**
    * jsonp options
    * @member Config#jsonp
    * @property {String} callback - jsonp callback method key, default to `_callback`
    * @property {Number} limit - callback method name's max length, default to `50`
    * @property {Boolean} csrf - enable csrf check or not. default to false
    * @property {String|RegExp|Array} whiteList - referrer white list
    */
  var jsonp: Callback = js.native
  /**
    * The key that signing cookies. It can contain multiple keys seperated by .
    */
  var keys: String = js.native
  /**
    * logger options
    * @member Config#logger
    * @property {String} dir - directory of log files
    * @property {String} encoding - log file encloding, defaults to utf8
    * @property {String} level - default log level, could be: DEBUG, INFO, WARN, ERROR or NONE, defaults to INFO in production
    * @property {String} consoleLevel - log level of stdout, defaults to INFO in local serverEnv, defaults to WARN in unittest, defaults to NONE elsewise
    * @property {Boolean} disableConsoleAfterReady - disable logger console after app ready. defaults to `false` on local and unittest env, others is `true`.
    * @property {Boolean} outputJSON - log as JSON or not, defaults to false
    * @property {Boolean} buffer - if enabled, flush logs to disk at a certain frequency to improve performance, defaults to true
    * @property {String} errorLogName - file name of errorLogger
    * @property {String} coreLogName - file name of coreLogger
    * @property {String} agentLogName - file name of agent worker log
    * @property {Object} coreLogger - custom config of coreLogger
    * @property {Boolean} allowDebugAtProd - allow debug log at prod, defaults to true
    */
  var logger: EggLoggerConfig = js.native
  var middleware: js.Array[String] = js.native
  /**
    * The name of the application
    */
  var name: String = js.native
  /**
    * package.json
    */
  var pkg: js.Any = js.native
  var rundir: String = js.native
  var security: Csp = js.native
  /**
    * server timeout in milliseconds, default to 2 minutes.
    *
    * for special request, just use `ctx.req.setTimeout(ms)`
    *
    * @see https://nodejs.org/api/http.html#http_server_timeout
    */
  var serverTimeout: Double | Null = js.native
  var siteFile: PlainObject[String | Buffer] = js.native
  var watcher: PlainObject[_] = js.native
  var workerStartTimeout: Double = js.native
  def onClientError(err: js.Error, socket: Socket, app: EggApplication): ClientErrorResponse | js.Promise[ClientErrorResponse] = js.native
}

object EggAppConfig {
  @scala.inline
  def apply(
    HOME: String,
    baseDir: String,
    bodyParser: Enable,
    customLoader: StringDictionary[CustomLoaderConfig],
    customLogger: StringDictionary[EggLoggerOptions],
    development: FastReady,
    dump: Ignore,
    env: EggEnvType,
    hostHeaders: String,
    httpclient: HttpClientConfig,
    i18n: CookieField,
    ipHeaders: String,
    jsonp: Callback,
    keys: String,
    logger: EggLoggerConfig,
    middleware: js.Array[String],
    name: String,
    onClientError: (js.Error, Socket, EggApplication) => ClientErrorResponse | js.Promise[ClientErrorResponse],
    pkg: js.Any,
    rundir: String,
    security: Csp,
    siteFile: PlainObject[String | Buffer],
    watcher: PlainObject[_],
    workerStartTimeout: Double
  ): EggAppConfig = {
    val __obj = js.Dynamic.literal(HOME = HOME.asInstanceOf[js.Any], baseDir = baseDir.asInstanceOf[js.Any], bodyParser = bodyParser.asInstanceOf[js.Any], customLoader = customLoader.asInstanceOf[js.Any], customLogger = customLogger.asInstanceOf[js.Any], development = development.asInstanceOf[js.Any], dump = dump.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], hostHeaders = hostHeaders.asInstanceOf[js.Any], httpclient = httpclient.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], ipHeaders = ipHeaders.asInstanceOf[js.Any], jsonp = jsonp.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onClientError = js.Any.fromFunction3(onClientError), pkg = pkg.asInstanceOf[js.Any], rundir = rundir.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any], siteFile = siteFile.asInstanceOf[js.Any], watcher = watcher.asInstanceOf[js.Any], workerStartTimeout = workerStartTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggAppConfig]
  }
  @scala.inline
  implicit class EggAppConfigOps[Self <: EggAppConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHOME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyParser(value: Enable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomLoader(value: StringDictionary[CustomLoaderConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomLogger(value: StringDictionary[EggLoggerOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLogger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevelopment(value: FastReady): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("development")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDump(value: Ignore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: EggEnvType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostHeaders(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpclient(value: HttpClientConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpclient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI18n(value: CookieField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpHeaders(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsonp(value: Callback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: EggLoggerConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiddleware(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClientError(value: (js.Error, Socket, EggApplication) => ClientErrorResponse | js.Promise[ClientErrorResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClientError")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPkg(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRundir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rundir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurity(value: Csp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSiteFile(value: PlainObject[String | Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatcher(value: PlainObject[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerStartTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerStartTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerTimeoutNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverTimeout")(null)
        ret
    }
  }
  
}

