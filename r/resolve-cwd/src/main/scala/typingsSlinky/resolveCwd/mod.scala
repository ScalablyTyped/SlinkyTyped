package typingsSlinky.resolveCwd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Resolve the path of a module like [`require.resolve()`](https://nodejs.org/api/globals.html#globals_require_resolve) but from the current working directory.
  	@param moduleId - What you would use in `require()`.
  	@returns The resolved module path.
  	@throws When the module can't be found.
  	@example
  	```
  	import resolveCwd = require('resolve-cwd');
  	console.log(__dirname);
  	//=> '/Users/sindresorhus/rainbow'
  	console.log(process.cwd());
  	//=> '/Users/sindresorhus/unicorn'
  	console.log(resolveCwd('./foo'));
  	//=> '/Users/sindresorhus/unicorn/foo.js'
  	```
  	*/
  @JSImport("resolve-cwd", JSImport.Namespace)
  @js.native
  def apply(moduleId: String): String = js.native
  
  /**
  	Resolve the path of a module like [`require.resolve()`](https://nodejs.org/api/globals.html#globals_require_resolve) but from the current working directory.
  	@param moduleId - What you would use in `require()`.
  	@returns The resolved module path. Returns `undefined` instead of throwing when the module can't be found.
  	@example
  	```
  	import resolveCwd = require('resolve-cwd');
  	console.log(__dirname);
  	//=> '/Users/sindresorhus/rainbow'
  	console.log(process.cwd());
  	//=> '/Users/sindresorhus/unicorn'
  	console.log(resolveCwd.silent('./foo'));
  	//=> '/Users/sindresorhus/unicorn/foo.js'
  	```
  	*/
  @JSImport("resolve-cwd", "silent")
  @js.native
  def silent(moduleId: String): js.UndefOr[String] = js.native
}
