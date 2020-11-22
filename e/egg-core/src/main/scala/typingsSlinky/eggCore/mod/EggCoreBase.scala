package typingsSlinky.eggCore.mod

import typingsSlinky.depd.mod.Deprecate
import typingsSlinky.eggCore.anon.IsWeakDep
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.^
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
