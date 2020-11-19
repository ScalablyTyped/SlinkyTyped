package typingsSlinky.cordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cordova extends js.Object {
  
  /** Defines custom logic as a Cordova module. Other modules can later access it using module name provided. */
  def define(
    moduleName: String,
    factory: js.Function3[/* require */ js.Any, /* exports */ js.Any, /* module */ js.Any, _]
  ): Unit = js.native
  
  /** Invokes native functionality by specifying corresponding service name, action and optional parameters.
    * @param success A success callback function.
    * @param fail An error callback function.
    * @param service The service name to call on the native side (corresponds to a native class).
    * @param action The action name to call on the native side (generally corresponds to the native class method).
    * @param args An array of arguments to pass into the native environment.
    */
  def exec(
    success: js.Function1[/* data */ js.Any, _],
    fail: js.Function1[/* err */ js.Any, _],
    service: String,
    action: String
  ): Unit = js.native
  def exec(
    success: js.Function1[/* data */ js.Any, _],
    fail: js.Function1[/* err */ js.Any, _],
    service: String,
    action: String,
    args: js.Array[_]
  ): Unit = js.native
  
  /** Gets the operating system name. */
  var platformId: String = js.native
  
  /** Namespace for Cordova plugin functionality */
  var plugins: CordovaPlugins = js.native
  
  /** Access a Cordova module by name. */
  def require(moduleName: String): js.Any = js.native
  
  /** Gets Cordova framework version */
  var version: String = js.native
}
