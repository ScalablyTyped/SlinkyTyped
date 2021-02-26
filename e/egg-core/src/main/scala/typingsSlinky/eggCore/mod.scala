package typingsSlinky.eggCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.depd.mod.Deprecate
import typingsSlinky.eggCore.anon.Exports
import typingsSlinky.eggCore.anon.IsWeakDep
import typingsSlinky.eggCore.anon.PartialContextLoaderOptio
import typingsSlinky.eggCore.anon.PartialFileLoaderOption
import typingsSlinky.eggCore.anon.Path
import typingsSlinky.eggCore.anon.Type
import typingsSlinky.eggLogger.mod.Logger
import typingsSlinky.eggLogger.mod.LoggerOptions
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.^
import typingsSlinky.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("egg-core", "BaseContextClass")
  @js.native
  class BaseContextClass[Context, Application, EggAppConfig, Service] protected () extends StObject {
    def this(ctx: Context) = this()
    
    /** Application */
    var app: Application = js.native
    
    /** Application config object */
    var config: EggAppConfig = js.native
    
    /** request context */
    var ctx: Context = js.native
    
    /** service */
    var service: Service = js.native
  }
  
  @JSImport("egg-core", "EggCore")
  @js.native
  /**
    * @constructor
    * @param {Object} options - options
    * @param {String} [options.baseDir=process.cwd()] - the directory of application
    * @param {String} [options.type=application|agent] - whether it's running in app worker or agent worker
    * @param {Object} [options.plugins] - custom plugins
    * @since 1.0.0
    */
  class EggCore[Config] () extends EggCoreBase[Config] {
    def this(options: EggCoreOptions) = this()
    
    var Controller: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Context */ /* ctx */ js.Any, 
        BaseContextClass[js.Object, js.Object, js.Object, js.Object]
      ] = js.native
    
    var Service: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Context */ /* ctx */ js.Any, 
        BaseContextClass[js.Object, js.Object, js.Object, js.Object]
      ] = js.native
  }
  
  @JSImport("egg-core", "EggLoader")
  @js.native
  class EggLoader[T, Config, Options /* <: EggLoaderOptions */] protected () extends StObject {
    /**
      * @constructor
      * @param {Object} options - options
      * @param {String} options.baseDir - the directory of application
      * @param {EggCore} options.app - Application instance
      * @param {Logger} options.logger - logger
      * @param {Object} [options.plugins] - custom plugins
      * @since 1.0.0
      */
    def this(options: EggLoaderOptions) = this()
    
    var ContextLoader: typingsSlinky.eggCore.mod.ContextLoader = js.native
    
    var FileLoader: typingsSlinky.eggCore.mod.FileLoader = js.native
    
    var app: T = js.native
    
    var appInfo: EggAppInfo = js.native
    
    var config: Config = js.native
    
    var eggPaths: js.Array[String] = js.native
    
    /**
      * Get app info
      * @return {EggAppInfo} appInfo
      * @since 1.0.0
      */
    def getAppInfo(): EggAppInfo = js.native
    
    def getEggPaths(): js.Array[String] = js.native
    
    /**
      * Get home directory
      * @return {String} home directory
      * @since 3.4.0
      */
    def getHomedir(): String = js.native
    
    /**
      * Get all loadUnit
      *
      * loadUnit is a directory that can be loaded by EggLoader, it has the same structure.
      * loadUnit has a path and a type(app, framework, plugin).
      *
      * The order of the loadUnits:
      *
      * 1. plugin
      * 2. framework
      * 3. app
      *
      * @return {Array} loadUnits
      * @since 1.0.0
      */
    def getLoadUnits(): js.Array[Type] = js.native
    
    def getServerEnv(): String = js.native
    
    def getTypeFiles(filename: String): js.Array[String] = js.native
    
    /* protected */ def loadAgentExtend(): Unit = js.native
    
    /* protected */ def loadApplicationExtend(): Unit = js.native
    
    // load methods
    /* protected */ def loadConfig(): Unit = js.native
    
    /* protected */ def loadContextExtend(): Unit = js.native
    
    /* protected */ def loadController(): Unit = js.native
    /* protected */ def loadController(opt: PartialFileLoaderOption): Unit = js.native
    
    /* protected */ def loadCustomAgent(): Unit = js.native
    
    /* protected */ def loadCustomApp(): Unit = js.native
    
    /* protected */ def loadCustomLoader(): Unit = js.native
    
    // Low Level API
    /**
      * Load single file, will invoke when export is function
      *
      * @param {String} filepath - fullpath
      * @param {Array} arguments - pass rest arguments into the function when invoke
      * @return {Object} exports
      * @example
      * ```js
      * app.loader.loadFile(path.join(app.options.baseDir, 'config/router.js'));
      * ```
      * @since 1.0.0
      */
    def loadFile[T](filepath: String, inject: js.Any*): T = js.native
    
    /* protected */ def loadHelperExtend(): Unit = js.native
    
    /* protected */ def loadMiddleware(): Unit = js.native
    /* protected */ def loadMiddleware(opt: PartialFileLoaderOption): Unit = js.native
    
    /* protected */ def loadPlugin(): Unit = js.native
    
    /* protected */ def loadRequestExtend(): Unit = js.native
    
    /* protected */ def loadResponseExtend(): Unit = js.native
    
    /* protected */ def loadRouter(): Unit = js.native
    
    /* protected */ def loadService(): Unit = js.native
    /* protected */ def loadService(opt: PartialContextLoaderOptio): Unit = js.native
    
    /**
      * Load files using {@link FileLoader}, inject to {@link Application}
      * @param {String|Array} directory - see {@link FileLoader}
      * @param {String} property - see {@link FileLoader}
      * @param {Object} opt - see {@link FileLoader}
      * @since 1.0.0
      */
    def loadToApp(directory: String, property: String): Unit = js.native
    def loadToApp(directory: String, property: String, opt: PartialFileLoaderOption): Unit = js.native
    def loadToApp(directory: js.Array[String], property: String): Unit = js.native
    def loadToApp(directory: js.Array[String], property: String, opt: PartialFileLoaderOption): Unit = js.native
    
    /**
      * Load files using {@link ContextLoader}
      * @param {String|Array} directory - see {@link ContextLoader}
      * @param {String} property - see {@link ContextLoader}
      * @param {Object} opt - see {@link ContextLoader}
      * @since 1.0.0
      */
    def loadToContext(directory: String, property: String): Unit = js.native
    def loadToContext(directory: String, property: String, opt: PartialContextLoaderOptio): Unit = js.native
    def loadToContext(directory: js.Array[String], property: String): Unit = js.native
    def loadToContext(directory: js.Array[String], property: String, opt: PartialContextLoaderOptio): Unit = js.native
    
    var options: Options = js.native
    
    var pkg: PlainObject[_] = js.native
    
    var plugins: Plugins = js.native
    
    def resolveModule(filepath: String): js.UndefOr[String] = js.native
    
    var serverScope: String = js.native
  }
  
  @js.native
  trait ContextLoader
    extends /**
    * Same as {@link FileLoader}, but it will attach file to `inject[fieldClass]`. The exports will be lazy loaded, such as `ctx.group.repository`.
    * @extends FileLoader
    * @since 1.0.0
    */
  Instantiable1[/* options */ ContextLoaderOption, ContextLoaderBase]
  
  type ContextLoaderBase = FileLoaderBase
  
  /* Inlined parent std.Partial<egg-core.egg-core.FileLoaderOption> */
  @js.native
  trait ContextLoaderOption extends StObject {
    
    var call: js.UndefOr[Boolean] = js.native
    
    var caseStyle: js.UndefOr[String | (js.Function1[/* str */ String, js.Array[String]])] = js.native
    
    /** directories to be loaded */
    var directory: String | js.Array[String] = js.native
    
    /** determine the field name of inject object. */
    var fieldClass: js.UndefOr[String] = js.native
    
    var filter: js.UndefOr[js.Function1[/* obj */ js.Object, Boolean]] = js.native
    
    var ignore: js.UndefOr[String | js.Array[String]] = js.native
    
    var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ Path, _]] = js.native
    
    /** required inject */
    var inject: js.Object = js.native
    
    var `match`: js.UndefOr[String | js.Array[String]] = js.native
    
    var `override`: js.UndefOr[Boolean] = js.native
    
    /** property name defined to target */
    var property: String = js.native
    
    var target: js.UndefOr[js.Object] = js.native
  }
  object ContextLoaderOption {
    
    @scala.inline
    def apply(directory: String | js.Array[String], inject: js.Object, property: String): ContextLoaderOption = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], inject = inject.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextLoaderOption]
    }
    
    @scala.inline
    implicit class ContextLoaderOptionMutableBuilder[Self <: ContextLoaderOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: Boolean): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
      
      @scala.inline
      def setCaseStyle(value: String | (js.Function1[/* str */ String, js.Array[String]])): Self = StObject.set(x, "caseStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseStyleFunction1(value: /* str */ String => js.Array[String]): Self = StObject.set(x, "caseStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCaseStyleUndefined: Self = StObject.set(x, "caseStyle", js.undefined)
      
      @scala.inline
      def setDirectory(value: String | js.Array[String]): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryVarargs(value: String*): Self = StObject.set(x, "directory", js.Array(value :_*))
      
      @scala.inline
      def setFieldClass(value: String): Self = StObject.set(x, "fieldClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldClassUndefined: Self = StObject.set(x, "fieldClass", js.undefined)
      
      @scala.inline
      def setFilter(value: /* obj */ js.Object => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setInitializer(value: (/* obj */ js.Object, /* options */ Path) => _): Self = StObject.set(x, "initializer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInitializerUndefined: Self = StObject.set(x, "initializer", js.undefined)
      
      @scala.inline
      def setInject(value: js.Object): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatch(value: String | js.Array[String]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setMatchVarargs(value: String*): Self = StObject.set(x, "match", js.Array(value :_*))
      
      @scala.inline
      def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait EggAppInfo extends StObject {
    
    /** home directory of the OS */
    var HOME: String = js.native
    
    /** current directory of application */
    var baseDir: String = js.native
    
    /** equals to serverEnv */
    var env: String = js.native
    
    /** the application name from package.json */
    var name: String = js.native
    
    /** package.json */
    var pkg: PlainObject[_] = js.native
    
    /** baseDir when local and unittest, HOME when other environment */
    var root: String = js.native
  }
  object EggAppInfo {
    
    @scala.inline
    def apply(HOME: String, baseDir: String, env: String, name: String, pkg: PlainObject[_], root: String): EggAppInfo = {
      val __obj = js.Dynamic.literal(HOME = HOME.asInstanceOf[js.Any], baseDir = baseDir.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pkg = pkg.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[EggAppInfo]
    }
    
    @scala.inline
    implicit class EggAppInfoMutableBuilder[Self <: EggAppInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHOME(value: String): Self = StObject.set(x, "HOME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkg(value: PlainObject[_]): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EggCoreBase[Config] extends ^[DefaultState, DefaultContext] {
    
    /**
      * The current directory of application
      * @member {String}
      * @see {@link EggAppInfo#baseDir}
      * @since 1.0.0
      */
    var baseDir: String = js.native
    
    /**
      * Register a function that will be called when app close
      */
    def beforeClose(fn: js.Function0[Unit]): Unit = js.native
    
    /**
      * Execute scope after loaded and before app start
      */
    def beforeStart(scope: js.Function0[Unit]): Unit = js.native
    
    /**
      * Close all, it wil close
      * - callbacks registered by beforeClose
      * - emit `close` event
      * - remove add listeners
      *
      * If error is thrown when it's closing, the promise will reject.
      * It will also reject after following call.
      * @return {Promise} promise
      * @since 1.0.0
      */
    def close(): js.Promise[_] = js.native
    
    /**
      * The configuration of application
      * @member {Config}
      * @since 1.0.0
      */
    var config: Config = js.native
    
    /**
      * Alias to {@link https://npmjs.com/package/depd}
      * @member {Function}
      * @since 1.0.0
      */
    def deprecate(message: String): Unit = js.native
    /**
      * Alias to {@link https://npmjs.com/package/depd}
      * @member {Function}
      * @since 1.0.0
      */
    @JSName("deprecate")
    var deprecate_Original: Deprecate = js.native
    
    /**
      * The loader instance, the default class is {@link EggLoader}.
      * If you want define
      * @member {EggLoader} EggCore#loader
      * @since 1.0.0
      */
    var loader: EggLoader[this.type, Config, EggLoaderOptions] = js.native
    
    /**
      * The name of application
      * @member {String}
      * @see {@link EggAppInfo#name}
      * @since 1.0.0
      */
    var name: String = js.native
    
    /**
      * Retrieve enabled plugins
      * @member {Object}
      * @since 1.0.0
      */
    var plugins: Plugins = js.native
    
    /**
      * register an callback function that will be invoked when application is ready.
      * @see https://github.com/node-modules/ready
      * @since 1.0.0
      * @param {boolean|Error|Function} flagOrFunction -
      * @return {Promise|null} return promise when argument is undefined
      * @example
      * const app = new Application(...);
      * app.ready(err => {
      *   if (err) throw err;
      *   console.log('done');
      * });
      */
    def ready(): js.Any = js.native
    def ready(fn: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): js.Any = js.native
    
    /**
      * If a client starts asynchronously, you can register `readyCallback`,
      * then the application will wait for the callback to ready
      *
      * It will log when the callback is not invoked after 10s
      *
      * Recommend to use {@link EggCore#beforeStart}
      * @since 1.0.0
      *
      * @param {String} name - readyCallback task name
      * @param {object} opts -
      *   - {Number} [timeout=10000] - emit `ready_timeout` when it doesn't finish but reach the timeout
      *   - {Boolean} [isWeakDep=false] - whether it's a weak dependency
      * @return {Function} - a callback
      * @example
      * const done = app.readyCallback('mysql');
      * mysql.ready(done);
      */
    def readyCallback(name: String): js.Function0[Unit] = js.native
    def readyCallback(name: String, opts: IsWeakDep): js.Function0[Unit] = js.native
    
    /**
      * Convert a generator function to a promisable one.
      *
      * Notice: for other kinds of functions, it directly returns you what it is.
      *
      * @param  {Function} fn The inputted function.
      * @return {AsyncFunction} An async promise-based function.
      * @example
      * ```javascript
      *  const fn = function* (arg) {
      return arg;
      };
      const wrapped = app.toAsyncFunction(fn);
      wrapped(true).then((value) => console.log(value));
      * ```
      */
    def toAsyncFunction[T](fn: js.Function1[/* repeated */ js.Any, IterableIterator[T]]): js.Function1[/* repeated */ js.Any, js.Promise[T]] = js.native
    
    /**
      * Convert an object with generator functions to a Promisable one.
      * @param  {Mixed} obj The inputted object.
      * @return {Promise} A Promisable result.
      * @example
      * ```javascript
      *  const fn = function* (arg) {
      return arg;
      };
      const arr = [ fn(1), fn(2) ];
      const promise = app.toPromise(arr);
      promise.then(res => console.log(res));
      * ```
      */
    def toPromise[T](obj: js.Any): js.Promise[T] = js.native
    
    /**
      * Whether `application` or `agent`
      * @member {String}
      * @since 1.0.0
      */
    var `type`: EggType = js.native
  }
  
  @js.native
  trait EggCoreOptions extends StObject {
    
    /** the directory of application */
    var baseDir: js.UndefOr[String] = js.native
    
    /** custom plugins */
    var plugins: js.UndefOr[Plugins] = js.native
    
    /** server scope */
    var serverScope: js.UndefOr[String] = js.native
    
    /** egg type, application or agent */
    var `type`: js.UndefOr[EggType] = js.native
  }
  object EggCoreOptions {
    
    @scala.inline
    def apply(): EggCoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EggCoreOptions]
    }
    
    @scala.inline
    implicit class EggCoreOptionsMutableBuilder[Self <: EggCoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
      
      @scala.inline
      def setPlugins(value: Plugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setServerScope(value: String): Self = StObject.set(x, "serverScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerScopeUndefined: Self = StObject.set(x, "serverScope", js.undefined)
      
      @scala.inline
      def setType(value: EggType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait EggLoaderOptions extends StObject {
    
    /** Application instance */
    var app: EggCore[PlainObject[_]] = js.native
    
    /** the directory of application */
    var baseDir: String = js.native
    
    /** egg logger */
    var logger: Logger[LoggerOptions] = js.native
    
    /** custom plugins */
    var plugins: js.UndefOr[Plugins] = js.native
    
    /** server scope */
    var serverScope: js.UndefOr[String] = js.native
  }
  object EggLoaderOptions {
    
    @scala.inline
    def apply(app: EggCore[PlainObject[_]], baseDir: String, logger: Logger[LoggerOptions]): EggLoaderOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], baseDir = baseDir.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
      __obj.asInstanceOf[EggLoaderOptions]
    }
    
    @scala.inline
    implicit class EggLoaderOptionsMutableBuilder[Self <: EggLoaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: EggCore[PlainObject[_]]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogger(value: Logger[LoggerOptions]): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugins(value: Plugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setServerScope(value: String): Self = StObject.set(x, "serverScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerScopeUndefined: Self = StObject.set(x, "serverScope", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.eggCore.eggCoreStrings.application
    - typingsSlinky.eggCore.eggCoreStrings.agent
  */
  trait EggType extends StObject
  object EggType {
    
    @scala.inline
    def agent: typingsSlinky.eggCore.eggCoreStrings.agent = "agent".asInstanceOf[typingsSlinky.eggCore.eggCoreStrings.agent]
    
    @scala.inline
    def application: typingsSlinky.eggCore.eggCoreStrings.application = "application".asInstanceOf[typingsSlinky.eggCore.eggCoreStrings.application]
  }
  
  @js.native
  trait FileLoader
    extends /**
    * Load files from directory to target object.
    * @since 1.0.0
    */
  Instantiable1[/* options */ FileLoaderOption, FileLoaderBase]
  
  @js.native
  trait FileLoaderBase extends StObject {
    
    /**
      * attach items to target object. Mapping the directory to properties.
      * `app/controller/group/repository.js` => `target.group.repository`
      * @return {Object} target
      * @since 1.0.0
      */
    def load(): js.Object = js.native
    
    /**
      * Parse files from given directories, then return an items list, each item contains properties and exports.
      *
      * For example, parse `app/controller/group/repository.js`
      *
      * ```js
      * module.exports = app => {
      *   return class RepositoryController extends app.Controller {};
      * }
      * ```
      *
      * It returns a item
      *
      * ```js
      * {
      *   properties: [ 'group', 'repository' ],
      *   exports: app => { ... },
      * }
      * ```
      *
      * `Properties` is an array that contains the directory of a filepath.
      *
      * `Exports` depends on type, if exports is a function, it will be called. if initializer is specified, it will be called with exports for customizing.
      * @return {Array} items
      * @since 1.0.0
      */
    def parse(): js.Array[Exports] = js.native
  }
  object FileLoaderBase {
    
    @scala.inline
    def apply(load: () => js.Object, parse: () => js.Array[Exports]): FileLoaderBase = {
      val __obj = js.Dynamic.literal(load = js.Any.fromFunction0(load), parse = js.Any.fromFunction0(parse))
      __obj.asInstanceOf[FileLoaderBase]
    }
    
    @scala.inline
    implicit class FileLoaderBaseMutableBuilder[Self <: FileLoaderBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoad(value: () => js.Object): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParse(value: () => js.Array[Exports]): Self = StObject.set(x, "parse", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FileLoaderOption extends StObject {
    
    /** determine whether invoke when exports is function */
    var call: js.UndefOr[Boolean] = js.native
    
    /** set property's case when converting a filepath to property list. */
    var caseStyle: js.UndefOr[String | (js.Function1[/* str */ String, js.Array[String]])] = js.native
    
    /** directories to be loaded */
    var directory: String | js.Array[String] = js.native
    
    /** a function that filter the exports which can be loaded */
    var filter: js.UndefOr[js.Function1[/* obj */ js.Object, Boolean]] = js.native
    
    /** ignore the files when load, support glob */
    var ignore: js.UndefOr[String | js.Array[String]] = js.native
    
    /** custom file exports, receive two parameters, first is the inject object(if not js file, will be content buffer), second is an `options` object that contain `path` */
    var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ Path, _]] = js.native
    
    /** an object that be the argument when invoke the function */
    var inject: js.UndefOr[js.Object] = js.native
    
    /** match the files when load, support glob, default to all js files */
    var `match`: js.UndefOr[String | js.Array[String]] = js.native
    
    /** determine whether override the property when get the same name */
    var `override`: js.UndefOr[Boolean] = js.native
    
    /** attach the target object from loaded files */
    var target: js.Object = js.native
  }
  object FileLoaderOption {
    
    @scala.inline
    def apply(directory: String | js.Array[String], target: js.Object): FileLoaderOption = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileLoaderOption]
    }
    
    @scala.inline
    implicit class FileLoaderOptionMutableBuilder[Self <: FileLoaderOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: Boolean): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
      
      @scala.inline
      def setCaseStyle(value: String | (js.Function1[/* str */ String, js.Array[String]])): Self = StObject.set(x, "caseStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseStyleFunction1(value: /* str */ String => js.Array[String]): Self = StObject.set(x, "caseStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCaseStyleUndefined: Self = StObject.set(x, "caseStyle", js.undefined)
      
      @scala.inline
      def setDirectory(value: String | js.Array[String]): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryVarargs(value: String*): Self = StObject.set(x, "directory", js.Array(value :_*))
      
      @scala.inline
      def setFilter(value: /* obj */ js.Object => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setInitializer(value: (/* obj */ js.Object, /* options */ Path) => _): Self = StObject.set(x, "initializer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInitializerUndefined: Self = StObject.set(x, "initializer", js.undefined)
      
      @scala.inline
      def setInject(value: js.Object): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      @scala.inline
      def setMatch(value: String | js.Array[String]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setMatchVarargs(value: String*): Self = StObject.set(x, "match", js.Array(value :_*))
      
      @scala.inline
      def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type PlainObject[T] = StringDictionary[T]
  
  @js.native
  trait PluginInfo extends StObject {
    
    /** the package name of plugin */
    @JSName("package")
    var _package: String = js.native
    
    /** the dependent plugins, you can use the plugin name */
    var dependencies: js.Array[String] = js.native
    
    /** whether enabled */
    var enable: Boolean = js.native
    
    /** specify the serverEnv that only enable the plugin in it */
    var env: js.Array[String] = js.native
    
    /** the file plugin config in. */
    var from: String = js.native
    
    /** the plugin name, it can be used in `dep` */
    var name: String = js.native
    
    /** the optional dependent plugins. */
    var optionalDependencies: js.Array[String] = js.native
    
    /** the directory of the plugin package */
    var path: String = js.native
  }
  object PluginInfo {
    
    @scala.inline
    def apply(
      _package: String,
      dependencies: js.Array[String],
      enable: Boolean,
      env: js.Array[String],
      from: String,
      name: String,
      optionalDependencies: js.Array[String],
      path: String
    ): PluginInfo = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalDependencies = optionalDependencies.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginInfo]
    }
    
    @scala.inline
    implicit class PluginInfoMutableBuilder[Self <: PluginInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value :_*))
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalDependencies(value: js.Array[String]): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalDependenciesVarargs(value: String*): Self = StObject.set(x, "optionalDependencies", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
  
  type Plugins = PlainObject[PluginInfo]
}
