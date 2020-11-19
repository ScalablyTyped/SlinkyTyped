package typingsSlinky.pWaitFor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p-wait-for", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  	Wait for a condition to be true.
  	@returns A promise that resolves when `condition` returns `true`. Rejects if `condition` throws or returns a `Promise` that rejects.
  	@example
  	```
  	import pWaitFor = require('p-wait-for');
  	import pathExists = require('path-exists');
  	(async () => {
  		await pWaitFor(() => pathExists('unicorn.png'));
  		console.log('Yay! The file now exists.');
  	})();
  	```
  	*/
  def apply(condition: js.Function0[js.Thenable[Boolean] | Boolean]): js.Promise[Unit] = js.native
  def apply(condition: js.Function0[js.Thenable[Boolean] | Boolean], options: Options): js.Promise[Unit] = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pWaitFor(
  // 	condition: () => PromiseLike<boolean> | boolean,
  // 	options?: pWaitFor.Options
  // ): Promise<void>;
  // export = pWaitFor;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pWaitFor */ js.Any = js.native
}
