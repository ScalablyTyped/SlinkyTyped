package typingsSlinky.pWhilst

import typingsSlinky.pWhilst.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p-whilst", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	While `condition` returns `true`, executes `action` repeatedly, and then resolves the promise. Rejects if `action` returns a promise that rejects or if an error is thrown anywhere.
  	@param condition - Expected to return a boolean of whether to execute `action`.
  	@param action - Action to run for each iteration. You can return a promise and it will be handled.
  	@example
  	```
  	import pWhilst = require('p-whilst');
  	(async () => {
  		let count = 0;
  		await pWhilst(
  			() => count < 5,
  			() => count++
  		);
  		console.log(count);
  		//=> 5
  	})();
  	```
  	*/
  def apply[ValueType](
    condition: js.Function1[/* value */ js.UndefOr[ValueType], Boolean],
    action: js.Function0[ValueType | js.Thenable[ValueType]]
  ): js.Promise[Unit] = js.native
  
  /**
  	While `condition` returns `true`, executes `action` repeatedly, and then resolves the promise. Rejects if `action` returns a promise that rejects or if an error is thrown anywhere.
  	@param condition - Expected to return a boolean of whether to execute `action`.
  	@param action - Action to run for each iteration. You can return a promise and it will be handled.
  	@example
  	```
  	import pWhilst = require('p-whilst');
  	(async () => {
  		let count = 0;
  		await pWhilst(
  			() => count < 5,
  			() => count++
  		);
  		console.log(count);
  		//=> 5
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pWhilst<ValueType>(
  // 	condition: (value: ValueType | undefined) => boolean,
  // 	action: () => ValueType | PromiseLike<ValueType>
  // ): Promise<void>;
  // export = pWhilst;
  def default[ValueType](
    condition: js.Function1[/* value */ js.UndefOr[ValueType], Boolean],
    action: js.Function0[ValueType | js.Thenable[ValueType]]
  ): js.Promise[Unit] = js.native
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pWhilst<ValueType>(
  // 	condition: (value: ValueType | undefined) => boolean,
  // 	action: () => ValueType | PromiseLike<ValueType>
  // ): Promise<void>;
  // export = pWhilst;
  @JSName("default")
  var default_Original: Call = js.native
}
