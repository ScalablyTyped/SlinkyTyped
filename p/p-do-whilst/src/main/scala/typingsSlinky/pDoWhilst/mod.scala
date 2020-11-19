package typingsSlinky.pDoWhilst

import typingsSlinky.pDoWhilst.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p-do-whilst", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	Executes `action` repeatedly while `condition` returns `true` and then resolves the promise. Rejects if `action` returns a promise that rejects or if an error is thrown anywhere.
  	@param action - Action to run for each iteration. You can return a promise and it will be handled.
  	@param condition - Expected to return a boolean of whether to continue.
  	@example
  	```
  	import pDoWhilst = require('p-do-whilst');
  	(async () => {
  		let count = 0;
  		await pDoWhilst(
  			() => count++,
  			() => count < 5
  		);
  		console.log(count);
  		//=> 5
  	})();
  	```
  	*/
  def apply[ValueType](
    action: js.Function0[ValueType | js.Thenable[ValueType]],
    condition: js.Function1[/* value */ ValueType, Boolean]
  ): js.Promise[Unit] = js.native
  
  /**
  	Executes `action` repeatedly while `condition` returns `true` and then resolves the promise. Rejects if `action` returns a promise that rejects or if an error is thrown anywhere.
  	@param action - Action to run for each iteration. You can return a promise and it will be handled.
  	@param condition - Expected to return a boolean of whether to continue.
  	@example
  	```
  	import pDoWhilst = require('p-do-whilst');
  	(async () => {
  		let count = 0;
  		await pDoWhilst(
  			() => count++,
  			() => count < 5
  		);
  		console.log(count);
  		//=> 5
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pDoWhilst<ValueType>(
  // 	action: () => ValueType | PromiseLike<ValueType>,
  // 	condition: (value: ValueType) => boolean
  // ): Promise<void>;
  // export = pDoWhilst;
  def default[ValueType](
    action: js.Function0[ValueType | js.Thenable[ValueType]],
    condition: js.Function1[/* value */ ValueType, Boolean]
  ): js.Promise[Unit] = js.native
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pDoWhilst<ValueType>(
  // 	action: () => ValueType | PromiseLike<ValueType>,
  // 	condition: (value: ValueType) => boolean
  // ): Promise<void>;
  // export = pDoWhilst;
  @JSName("default")
  var default_Original: Call = js.native
}
