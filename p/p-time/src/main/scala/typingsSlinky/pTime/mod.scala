package typingsSlinky.pTime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p-time", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	Measure the time a promise takes to resolve.
  	@param asyncFunction - Promise-returning/async function.
  	@returns A decorated version of `asyncFunction`.
  	@example
  	```
  	import pTime = require('p-time');
  	import execa = require('execa');
  	(async () => {
  		const promise = pTime(execa)('sleep', ['1']);
  		await promise;
  		console.log(promise.time);
  		//=> 1016
  	})();
  	```
  	*/
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](asyncFunction: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]]): js.Function1[/* arguments */ ArgumentsType, PromiseWithTime[ReturnType]] = js.native
  
  // TODO: Remove this for the next major release
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pTime */ js.Any = js.native
  
  /**
  	Measure the time a promise takes to resolve. Logs the elapsed time.
  	@param asyncFunction - Promise-returning/async function.
  	@returns A decorated version of `asyncFunction`.
  	*/
  def log[ArgumentsType /* <: js.Array[_] */, ReturnType](asyncFunction: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ReturnType]]): js.Function1[/* arguments */ ArgumentsType, PromiseWithTime[ReturnType]] = js.native
  
  @js.native
  trait PromiseWithTime[ValueType]
    extends js.Promise[ValueType] {
    
    /**
    		The elapsed time in milliseconds.
    		*/
    val time: js.UndefOr[Double] = js.native
  }
}
