package typingsSlinky.pkgDir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call extends js.Object {
    
    /**
    	Find the root directory of a Node.js project or npm package.
    	@param cwd - Directory to start from. Default: `process.cwd()`.
    	@returns The project root path or `undefined` if it couldn't be found.
    	@example
    	```
    	// /
    	// └── Users
    	//     └── sindresorhus
    	//         └── foo
    	//             ├── package.json
    	//             └── bar
    	//                 ├── baz
    	//                 └── example.js
    	// example.js
    	import pkgDir = require('pkg-dir');
    	(async () => {
    		const rootDir = await pkgDir(__dirname);
    		console.log(rootDir);
    		//=> '/Users/sindresorhus/foo'
    	})();
    	```
    	*/
    def apply(): js.Promise[js.UndefOr[String]] = js.native
    def apply(cwd: String): js.Promise[js.UndefOr[String]] = js.native
    
    /**
    	Synchronously find the root directory of a Node.js project or npm package.
    	@param cwd - Directory to start from. Default: `process.cwd()`.
    	@returns The project root path or `undefined` if it couldn't be found.
    	*/
    def sync(): js.UndefOr[String] = js.native
    def sync(cwd: String): js.UndefOr[String] = js.native
  }
}
