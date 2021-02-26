package typingsSlinky.del

import typingsSlinky.globby.mod.GlobbyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Delete files and directories using glob patterns.
  	Note that glob patterns can only contain forward-slashes, not backward-slashes. Windows file paths can use backward-slashes as long as the path does not contain any glob-like characters, otherwise use `path.posix.join()` instead of `path.join()`.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	- [Pattern examples with expected matches](https://github.com/sindresorhus/multimatch/blob/master/test/test.js)
  	- [Quick globbing pattern overview](https://github.com/sindresorhus/multimatch#globbing-patterns)
  	@param options - You can specify any of the [`globby` options](https://github.com/sindresorhus/globby#options) in addition to the `del` options. In contrast to the `globby` defaults, `expandDirectories`, `onlyFiles`, and `followSymbolicLinks` are `false` by default.
  	@returns The deleted paths.
  	@example
  	```
  	import del = require('del');
  	(async () => {
  		const deletedPaths = await del(['temp/ *.js', '!temp/unicorn.js']);
  		console.log('Deleted files and directories:\n', deletedPaths.join('\n'));
  	})();
  	```
  	*/
  @JSImport("del", JSImport.Namespace)
  @js.native
  def apply(patterns: String): js.Promise[js.Array[String]] = js.native
  @JSImport("del", JSImport.Namespace)
  @js.native
  def apply(patterns: String, options: Options): js.Promise[js.Array[String]] = js.native
  @JSImport("del", JSImport.Namespace)
  @js.native
  def apply(patterns: js.Array[String]): js.Promise[js.Array[String]] = js.native
  @JSImport("del", JSImport.Namespace)
  @js.native
  def apply(patterns: js.Array[String], options: Options): js.Promise[js.Array[String]] = js.native
  
  /**
  	Synchronously delete files and directories using glob patterns.
  	Note that glob patterns can only contain forward-slashes, not backward-slashes. Windows file paths can use backward-slashes as long as the path does not contain any glob-like characters, otherwise use `path.posix.join()` instead of `path.join()`.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	- [Pattern examples with expected matches](https://github.com/sindresorhus/multimatch/blob/master/test/test.js)
  	- [Quick globbing pattern overview](https://github.com/sindresorhus/multimatch#globbing-patterns)
  	@param options - You can specify any of the [`globby` options](https://github.com/sindresorhus/globby#options) in addition to the `del` options. In contrast to the `globby` defaults, `expandDirectories`, `onlyFiles`, and `followSymbolicLinks` are `false` by default.
  	@returns The deleted paths.
  	*/
  @JSImport("del", "sync")
  @js.native
  def sync(patterns: String): js.Array[String] = js.native
  @JSImport("del", "sync")
  @js.native
  def sync(patterns: String, options: Options): js.Array[String] = js.native
  @JSImport("del", "sync")
  @js.native
  def sync(patterns: js.Array[String]): js.Array[String] = js.native
  @JSImport("del", "sync")
  @js.native
  def sync(patterns: js.Array[String], options: Options): js.Array[String] = js.native
  
  @js.native
  trait Options extends GlobbyOptions {
    
    /**
    		See what would be deleted.
    		@default false
    		@example
    		```
    		import del = require('del');
    		(async () => {
    			const deletedPaths = await del(['temp/ *.js'], {dryRun: true});
    			console.log('Files and directories that would be deleted:\n', deletedPaths.join('\n'));
    		})();
    		```
    		*/
    val dryRun: js.UndefOr[Boolean] = js.native
    
    /**
    		Allow deleting the current working directory and outside.
    		@default false
    		*/
    val force: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
}
