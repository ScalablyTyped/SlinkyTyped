package typingsSlinky.pDebounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p-debounce", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  	[Debounce](https://css-tricks.com/debouncing-throttling-explained-examples/) promise-returning & async functions.
  	@param fn - Promise-returning/async function to debounce.
  	@param wait - Milliseconds to wait before calling `fn`.
  	@returns A function that delays calling `fn` until after `wait` milliseconds have elapsed since the last time it was called.
  	@example
  	```
  	import pDebounce = require('p-debounce');
  	const expensiveCall = async input => input;
  	const debouncedFn = pDebounce(expensiveCall, 200);
  	for (const i of [1, 2, 3]) {
  		debouncedFn(i).then(console.log);
  	}
  	//=> 3
  	//=> 3
  	//=> 3
  	```
  	*/
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](
    fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType] | ReturnType],
    wait: Double
  ): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](
    fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType] | ReturnType],
    wait: Double,
    options: Options
  ): js.Function1[/* arguments */ ArgumentsType, js.Promise[ReturnType]] = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pDebounce<ArgumentsType extends unknown[], ReturnType>(
  // 	fn: (...arguments: ArgumentsType) => PromiseLike<ReturnType> | ReturnType,
  // 	wait: number,
  // 	options?: pDebounce.Options
  // ): (...arguments: ArgumentsType) => Promise<ReturnType>;
  // export = pDebounce;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pDebounce */ js.Any = js.native
}
