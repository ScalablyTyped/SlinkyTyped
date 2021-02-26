package typingsSlinky.pLog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Log the value of a promise. Use this in a `.then()` method.
  	@param logger - The logger to use. Any return value or exception is ignored. Default: `console.log`.
  	@returns A [thunk](https://en.wikipedia.org/wiki/Thunk) that returns a `Promise`.
  	@example
  	```
  	import pLog = require('p-log');
  	Promise.resolve('unicorn')
  		.then(pLog()) // Logs `unicorn`
  		.then(value => {
  			// `value` is still `unicorn`
  		});
  	```
  	*/
  @JSImport("p-log", JSImport.Namespace)
  @js.native
  def apply[ValueType](): js.Function1[/* value */ ValueType, js.Promise[ValueType]] = js.native
  @JSImport("p-log", JSImport.Namespace)
  @js.native
  def apply[ValueType](logger: Logger): js.Function1[/* value */ ValueType, js.Promise[ValueType]] = js.native
  
  @JSImport("p-log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("p-log", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pLog */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pLog */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  type Logger = js.Function1[/* message */ js.Any, Unit]
  
  /**
  	Log the error of a promise. Use this in a `.catch()` method.
  	@param logger - The logger to use. Any return value or exception is ignored. Default: `console.log`.
  	@returns A [thunk](https://en.wikipedia.org/wiki/Thunk) that returns a `Promise`.
  	@example
  	```
  	const pLog = require('p-log');
  	Promise.resolve()
  		.then(() => {
  			throw new Error('pony');
  		})
  		.catch(pLog.catch()) // Logs `Error: pony`
  		.catch(error => {
  			// `error` is still `Error: pony`
  		});
  	```
  	*/
  @JSImport("p-log", "catch")
  @js.native
  def `catch`(): js.Function1[/* error */ js.Any, js.Promise[scala.Nothing]] = js.native
  @JSImport("p-log", "catch")
  @js.native
  def `catch`(logger: Logger): js.Function1[/* error */ js.Any, js.Promise[scala.Nothing]] = js.native
}
