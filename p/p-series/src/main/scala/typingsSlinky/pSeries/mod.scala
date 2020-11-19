package typingsSlinky.pSeries

import typingsSlinky.pSeries.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p-series", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	Run promise-returning & async functions in series.
  	@param tasks - Functions are expected to return a value. If a Promise is returned, it's awaited before continuing with the next task.
  	@returns A `Promise` that is fulfilled when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values.
  	@example
  	```
  	import pSeries = require('p-series');
  	import got = require('got');
  	(async () => {
  		const tasks = [
  			() => got('sindresorhus.com'),
  			() => checkSomething(),
  			() => doSomethingElse()
  		];
  		console.log(await pSeries(tasks));
  	})();
  	```
  	*/
  def apply[ValueType](tasks: js.Iterable[js.Function0[js.Promise[ValueType] | ValueType]]): js.Promise[js.Array[ValueType]] = js.native
  
  /**
  	Run promise-returning & async functions in series.
  	@param tasks - Functions are expected to return a value. If a Promise is returned, it's awaited before continuing with the next task.
  	@returns A `Promise` that is fulfilled when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values.
  	@example
  	```
  	import pSeries = require('p-series');
  	import got = require('got');
  	(async () => {
  		const tasks = [
  			() => got('sindresorhus.com'),
  			() => checkSomething(),
  			() => doSomethingElse()
  		];
  		console.log(await pSeries(tasks));
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pSeries<ValueType>(
  // 	tasks: Iterable<() => Promise<ValueType> | ValueType>
  // ): Promise<ValueType[]>;
  // export = pSeries;
  def default[ValueType](tasks: js.Iterable[js.Function0[js.Promise[ValueType] | ValueType]]): js.Promise[js.Array[ValueType]] = js.native
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pSeries<ValueType>(
  // 	tasks: Iterable<() => Promise<ValueType> | ValueType>
  // ): Promise<ValueType[]>;
  // export = pSeries;
  @JSName("default")
  var default_Original: Call = js.native
}
