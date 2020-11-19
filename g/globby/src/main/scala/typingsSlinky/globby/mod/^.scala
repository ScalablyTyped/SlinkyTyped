package typingsSlinky.globby.mod

import typingsSlinky.fastGlob.mod.Options
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("globby", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  	Find files and directories using glob patterns.
  	Note that glob patterns can only contain forward-slashes, not backward-slashes, so if you want to construct a glob pattern from path components, you need to use `path.posix.join()` instead of `path.join()`.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-3) in addition to the ones in this package.
  	@returns The matching paths.
  	@example
  	```
  	import globby = require('globby');
  	(async () => {
  		const paths = await globby(['*', '!cake']);
  		console.log(paths);
  		//=> ['unicorn', 'rainbow']
  	})();
  	```
  	*/
  def apply(patterns: String): js.Promise[js.Array[String]] = js.native
  def apply(patterns: String, options: GlobbyOptions): js.Promise[js.Array[String]] = js.native
  def apply(patterns: js.Array[String]): js.Promise[js.Array[String]] = js.native
  def apply(patterns: js.Array[String], options: GlobbyOptions): js.Promise[js.Array[String]] = js.native
  
  /**
  	Note that you should avoid running the same tasks multiple times as they contain a file system cache. Instead, run this method each time to ensure file system changes are taken into consideration.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-3) in addition to the ones in this package.
  	@returns An object in the format `{pattern: string, options: object}`, which can be passed as arguments to [`fast-glob`](https://github.com/mrmlnc/fast-glob). This is useful for other globbing-related packages.
  	*/
  def generateGlobTasks(patterns: String): js.Array[GlobTask] = js.native
  def generateGlobTasks(patterns: String, options: GlobbyOptions): js.Array[GlobTask] = js.native
  def generateGlobTasks(patterns: js.Array[String]): js.Array[GlobTask] = js.native
  def generateGlobTasks(patterns: js.Array[String], options: GlobbyOptions): js.Array[GlobTask] = js.native
  
  /**
  	`.gitignore` files matched by the ignore config are not used for the resulting filter function.
  	@returns A filter function indicating whether a given path is ignored via a `.gitignore` file.
  	@example
  	```
  	import {gitignore} from 'globby';
  	(async () => {
  		const isIgnored = await gitignore();
  		console.log(isIgnored('some/file'));
  	})();
  	```
  	*/
  def gitignore(): js.Promise[FilterFunction] = js.native
  def gitignore(options: GitignoreOptions): js.Promise[FilterFunction] = js.native
  @JSName("gitignore")
  val gitignore_Original: Gitignore = js.native
  
  /**
  	Note that the options affect the results.
  	This function is backed by [`fast-glob`](https://github.com/mrmlnc/fast-glob#isdynamicpatternpattern-options).
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-3).
  	@returns Whether there are any special glob characters in the `patterns`.
  	*/
  def hasMagic(patterns: String): Boolean = js.native
  def hasMagic(patterns: String, options: Options): Boolean = js.native
  def hasMagic(patterns: js.Array[String]): Boolean = js.native
  def hasMagic(patterns: js.Array[String], options: Options): Boolean = js.native
  
  /**
  	Find files and directories using glob patterns.
  	Note that glob patterns can only contain forward-slashes, not backward-slashes, so if you want to construct a glob pattern from path components, you need to use `path.posix.join()` instead of `path.join()`.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-3) in addition to the ones in this package.
  	@returns The stream of matching paths.
  	@example
  	```
  	import globby = require('globby');
  	(async () => {
  		for await (const path of globby.stream('*.tmp')) {
  			console.log(path);
  		}
  	})();
  	```
  	*/
  def stream(patterns: String): ReadableStream = js.native
  def stream(patterns: String, options: GlobbyOptions): ReadableStream = js.native
  def stream(patterns: js.Array[String]): ReadableStream = js.native
  def stream(patterns: js.Array[String], options: GlobbyOptions): ReadableStream = js.native
  
  /**
  	Find files and directories using glob patterns.
  	Note that glob patterns can only contain forward-slashes, not backward-slashes, so if you want to construct a glob pattern from path components, you need to use `path.posix.join()` instead of `path.join()`.
  	@param patterns - See the supported [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@param options - See the [`fast-glob` options](https://github.com/mrmlnc/fast-glob#options-3) in addition to the ones in this package.
  	@returns The matching paths.
  	*/
  def sync(patterns: String): js.Array[String] = js.native
  def sync(patterns: String, options: GlobbyOptions): js.Array[String] = js.native
  def sync(patterns: js.Array[String]): js.Array[String] = js.native
  def sync(patterns: js.Array[String], options: GlobbyOptions): js.Array[String] = js.native
}
