package typingsSlinky.importFrom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("import-from", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	Import a module like with [`require()`](https://nodejs.org/api/modules.html#modules_require_id) but from a given path.
  	@param fromDirectory - Directory to import from.
  	@param moduleId - What you would use in `require()`.
  	@throws Like `require()`, throws when the module can't be found.
  	@example
  	```
  	import importFrom = require('import-from');
  	try {
  		const bar = importFrom('foo', './bar');
  		// Do something with `bar`
  	} catch (error) {
  		// `error` is thrown when `./bar` can't be found
  	}
  	```
  	*/
  def apply(fromDirectory: String, moduleId: String): js.Any = js.native
  
  /**
  	Import a module like with [`require()`](https://nodejs.org/api/modules.html#modules_require_id) but from a given path.
  	@param fromDirectory - Directory to import from.
  	@param moduleId - What you would use in `require()`.
  	@returns `undefined` instead of throwing when the module can't be found.
  	@example
  	```
  	import importFrom = require('import-from');
  	const bar = importFrom.silent('foo', './bar');
  	// Do something with `bar`, may be `undefined` when `./bar` can't be found
  	```
  	*/
  def silent(fromDirectory: String, moduleId: String): js.Any = js.native
}
