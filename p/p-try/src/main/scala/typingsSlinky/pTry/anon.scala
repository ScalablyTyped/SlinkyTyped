package typingsSlinky.pTry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call extends js.Object {
    
    /**
    	Start a promise chain.
    	@param fn - The function to run to start the promise chain.
    	@param arguments - Arguments to pass to `fn`.
    	@returns The value of calling `fn(...arguments)`. If the function throws an error, the returned `Promise` will be rejected with that error.
    	@example
    	```
    	import pTry = require('p-try');
    	(async () => {
    		try {
    			const value = await pTry(() => {
    				return synchronousFunctionThatMightThrow();
    			});
    			console.log(value);
    		} catch (error) {
    			console.error(error);
    		}
    	})();
    	```
    	*/
    def apply[ValueType, ArgumentsType /* <: js.Array[_] */](
      fn: js.Function1[/* arguments */ ArgumentsType, js.Thenable[ValueType] | ValueType],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type ArgumentsType is not an array type */ arguments: ArgumentsType
    ): js.Promise[ValueType] = js.native
  }
}
