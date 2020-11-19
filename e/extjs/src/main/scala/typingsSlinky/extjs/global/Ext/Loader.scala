package typingsSlinky.extjs.global.Ext

import typingsSlinky.extjs.Ext.ILoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Loader")
@js.native
class Loader ()
  extends typingsSlinky.extjs.Ext.Loader
/* static members */
@JSGlobal("Ext.Loader")
@js.native
object Loader extends js.Object {
  
  /** [Method] Sets a batch of path entries
    * @param paths Object a set of className: path mappings
    * @returns Ext.Loader this
    */
  def addClassPathMappings(): ILoader = js.native
  def addClassPathMappings(paths: typingsSlinky.extjs.Ext.Object): ILoader = js.native
  
  /** [Config Option] (Boolean) */
  var disableCaching: Boolean = js.native
  
  /** [Config Option] (String) */
  var disableCachingParam: java.lang.String = js.native
  
  /** [Config Option] (Boolean) */
  var enabled: Boolean = js.native
  
  /** [Method] Explicitly exclude files from being loaded
    * @param excludes Array
    * @returns Object object contains require method for chaining
    */
  def exclude(): js.Any = js.native
  def exclude(excludes: typingsSlinky.extjs.Ext.Array): js.Any = js.native
  
  /** [Config Option] (Boolean) */
  var garbageCollect: Boolean = js.native
  
  /** [Method] Get the config value corresponding to the specified name
    * @param name String The config property name
    * @returns Object
    */
  def getConfig(): js.Any = js.native
  def getConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] Translates a className to a file path by adding the the proper prefix and converting the  s to  s
    * @param className String
    * @returns String path
    */
  def getPath(): java.lang.String = js.native
  def getPath(className: java.lang.String): java.lang.String = js.native
  
  /** [Property] (Array) */
  var history: typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Loads the specified script URL and calls the supplied callbacks
    * @param options Object/String The options object or simply the URL to load.
    */
  def loadScript(): Unit = js.native
  def loadScript(options: js.Any): Unit = js.native
  
  /** [Method] Add a new listener to be executed when all required scripts are fully loaded
    * @param fn Function The function callback to be executed
    * @param scope Object The execution scope (this) of the callback function
    * @param withDomReady Boolean Whether or not to wait for document dom ready as well
    */
  def onReady(): Unit = js.native
  def onReady(fn: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], withDomReady: Boolean): Unit = js.native
  def onReady(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def onReady(fn: js.UndefOr[scala.Nothing], scope: js.Any, withDomReady: Boolean): Unit = js.native
  def onReady(fn: js.Any): Unit = js.native
  def onReady(fn: js.Any, scope: js.UndefOr[scala.Nothing], withDomReady: Boolean): Unit = js.native
  def onReady(fn: js.Any, scope: js.Any): Unit = js.native
  def onReady(fn: js.Any, scope: js.Any, withDomReady: Boolean): Unit = js.native
  
  /** [Config Option] (Object) */
  var paths: js.Any = js.native
  
  /** [Config Option] (Boolean) */
  var preserveScripts: Boolean = js.native
  
  /** [Method] Loads all classes by the given names and all their direct dependencies optionally executes the given callback functi
    * @param expressions String/Array Can either be a string or an array of string
    * @param fn Function The callback function
    * @param scope Object The execution scope (this) of the callback function
    * @param excludes String/Array Classes to be excluded, useful when being used with expressions
    */
  def require(): Unit = js.native
  def require(
    expressions: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    excludes: js.Any
  ): Unit = js.native
  def require(expressions: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def require(
    expressions: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    excludes: js.Any
  ): Unit = js.native
  def require(expressions: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  def require(
    expressions: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    excludes: js.Any
  ): Unit = js.native
  def require(expressions: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  def require(expressions: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, excludes: js.Any): Unit = js.native
  def require(expressions: js.Any): Unit = js.native
  def require(
    expressions: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    excludes: js.Any
  ): Unit = js.native
  def require(expressions: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def require(expressions: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, excludes: js.Any): Unit = js.native
  def require(expressions: js.Any, fn: js.Any): Unit = js.native
  def require(expressions: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], excludes: js.Any): Unit = js.native
  def require(expressions: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def require(expressions: js.Any, fn: js.Any, scope: js.Any, excludes: js.Any): Unit = js.native
  
  /** [Config Option] (Boolean) */
  var scriptChainDelay: Boolean = js.native
  
  /** [Config Option] (String) */
  var scriptCharset: java.lang.String = js.native
  
  /** [Method] Set the configuration for the loader
    * @param config Object The config object to override the default values
    * @returns Ext.Loader this
    */
  def setConfig(): ILoader = js.native
  def setConfig(config: js.Any): ILoader = js.native
  
  /** [Method] Sets the path of a namespace
    * @param name String/Object See flexSetter
    * @param path String See flexSetter
    * @returns Ext.Loader this
    */
  def setPath(): ILoader = js.native
  def setPath(name: js.UndefOr[scala.Nothing], path: java.lang.String): ILoader = js.native
  def setPath(name: js.Any): ILoader = js.native
  def setPath(name: js.Any, path: java.lang.String): ILoader = js.native
  
  /** [Method] Synchronously loads all classes by the given names and all their direct dependencies optionally executes the given c
    * @param expressions String/Array Can either be a string or an array of string
    * @param fn Function The callback function
    * @param scope Object The execution scope (this) of the callback function
    * @param excludes String/Array Classes to be excluded, useful when being used with expressions
    */
  def syncRequire(): Unit = js.native
  def syncRequire(
    expressions: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    excludes: js.Any
  ): Unit = js.native
  def syncRequire(expressions: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def syncRequire(
    expressions: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    excludes: js.Any
  ): Unit = js.native
  def syncRequire(expressions: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  def syncRequire(
    expressions: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    excludes: js.Any
  ): Unit = js.native
  def syncRequire(expressions: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  def syncRequire(expressions: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, excludes: js.Any): Unit = js.native
  def syncRequire(expressions: js.Any): Unit = js.native
  def syncRequire(
    expressions: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    excludes: js.Any
  ): Unit = js.native
  def syncRequire(expressions: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def syncRequire(expressions: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, excludes: js.Any): Unit = js.native
  def syncRequire(expressions: js.Any, fn: js.Any): Unit = js.native
  def syncRequire(expressions: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], excludes: js.Any): Unit = js.native
  def syncRequire(expressions: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def syncRequire(expressions: js.Any, fn: js.Any, scope: js.Any, excludes: js.Any): Unit = js.native
}
