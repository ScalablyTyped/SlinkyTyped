package typingsSlinky.onetime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("onetime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  	Ensure a function is only called once. When called multiple times it will return the return value from the first call.
  	@param fn - Function that should only be called once.
  	@returns A function that only calls `fn` once.
  	@example
  	```
  	import onetime = require('onetime');
  	let i = 0;
  	const foo = onetime(() => ++i);
  	foo(); //=> 1
  	foo(); //=> 1
  	foo(); //=> 1
  	onetime.callCount(foo); //=> 3
  	```
  	*/
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType]): js.Function1[/* arguments */ ArgumentsType, ReturnType] = js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](fn: js.Function1[/* arguments */ ArgumentsType, ReturnType], options: Options): js.Function1[/* arguments */ ArgumentsType, ReturnType] = js.native
  
  /**
  	Get the number of times `fn` has been called.
  	@param fn - Function to get call count from.
  	@returns A number representing how many times `fn` has been called.
  	@example
  	```
  	import onetime = require('onetime');
  	const foo = onetime(() => {});
  	foo();
  	foo();
  	foo();
  	console.log(onetime.callCount(foo));
  	//=> 3
  	```
  	*/
  def callCount(fn: js.Function1[/* repeated */ js.Any, _]): Double = js.native
  
  // TODO: Remove this for the next major release
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof onetime */ js.Any = js.native
}
