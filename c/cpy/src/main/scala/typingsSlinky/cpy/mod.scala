package typingsSlinky.cpy

import typingsSlinky.cpy.cpyStrings.progress
import typingsSlinky.fastGlob.anon.PartialFileSystemAdapter
import typingsSlinky.fastGlob.typesMod.Pattern
import typingsSlinky.globby.mod.ExpandDirectoriesOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Copy files.
  @param source - Files to copy. If any of the files do not exist, an error will be thrown (does not apply to globs).
  @param destination - Destination directory.
  @param options - In addition to the options defined here, options are passed to [globby](https://github.com/sindresorhus/globby#options).
  @example
  ```
  import cpy = require('cpy');
  (async () => {
  	await cpy(['source/ *.png', '!source/goat.png'], 'destination');
  	console.log('Files copied!');
  })();
  ```
  */
  @JSImport("cpy", JSImport.Namespace)
  @js.native
  def apply(source: String, destination: String): js.Promise[js.Array[String]] with ProgressEmitter = js.native
  @JSImport("cpy", JSImport.Namespace)
  @js.native
  def apply(source: String, destination: String, options: Options): js.Promise[js.Array[String]] with ProgressEmitter = js.native
  @JSImport("cpy", JSImport.Namespace)
  @js.native
  def apply(source: js.Array[String], destination: String): js.Promise[js.Array[String]] with ProgressEmitter = js.native
  @JSImport("cpy", JSImport.Namespace)
  @js.native
  def apply(source: js.Array[String], destination: String, options: Options): js.Promise[js.Array[String]] with ProgressEmitter = js.native
  
  /* Inlined parent std.Readonly<globby.globby.GlobbyOptions> */
  /* Inlined parent cp-file.cp-file.Options */
  @js.native
  trait Options extends StObject {
    
    val absolute: js.UndefOr[Boolean] = js.native
    
    val baseNameMatch: js.UndefOr[Boolean] = js.native
    
    val braceExpansion: js.UndefOr[Boolean] = js.native
    
    val caseSensitiveMatch: js.UndefOr[Boolean] = js.native
    
    /**
    		Number of files being copied concurrently.
    		@default (os.cpus().length || 1) * 2
    		*/
    val concurrency: js.UndefOr[Double] = js.native
    
    /**
    		Working directory to find source files.
    		@default process.cwd()
    		*/
    val cwd: js.UndefOr[String] = js.native
    
    val deep: js.UndefOr[Double] = js.native
    
    val dot: js.UndefOr[Boolean] = js.native
    
    val expandDirectories: js.UndefOr[ExpandDirectoriesOption] = js.native
    
    val extglob: js.UndefOr[Boolean] = js.native
    
    /**
    		Function to filter files to copy.
    		Receives a source file object as the first argument.
    		Return true to include, false to exclude. You can also return a Promise that resolves to true or false.
    		@example
    		```
    		import cpy = require('cpy');
    		(async () => {
    			await cpy('foo', 'destination', {
    				filter: file => file.extension !== '.nocopy'
    			});
    		})();
    		```
    		*/
    val filter: js.UndefOr[js.Function1[/* file */ SourceFile, Boolean | js.Promise[Boolean]]] = js.native
    
    val followSymbolicLinks: js.UndefOr[Boolean] = js.native
    
    val fs: js.UndefOr[PartialFileSystemAdapter] = js.native
    
    val gitignore: js.UndefOr[Boolean] = js.native
    
    val globstar: js.UndefOr[Boolean] = js.native
    
    val ignore: js.UndefOr[js.Array[Pattern]] = js.native
    
    /**
    		Ignore junk files.
    		@default true
    		*/
    val ignoreJunk: js.UndefOr[Boolean] = js.native
    
    val markDirectories: js.UndefOr[Boolean] = js.native
    
    val objectMode: js.UndefOr[Boolean] = js.native
    
    val onlyDirectories: js.UndefOr[Boolean] = js.native
    
    val onlyFiles: js.UndefOr[Boolean] = js.native
    
    /**
    		Overwrite existing destination file.
    		@default true
    		*/
    val overwrite: js.UndefOr[Boolean] = js.native
    
    /**
    		Preserve path structure.
    		@default false
    		*/
    val parents: js.UndefOr[Boolean] = js.native
    
    /**
    		Filename or function returning a filename used to rename every file in `source`.
    		@example
    		```
    		import cpy = require('cpy');
    		(async () => {
    			await cpy('foo.js', 'destination', {
    				rename: basename => `prefix-${basename}`
    			});
    		})();
    		```
    		*/
    val rename: js.UndefOr[String | (js.Function1[/* basename */ String, String])] = js.native
    
    val stats: js.UndefOr[Boolean] = js.native
    
    val suppressErrors: js.UndefOr[Boolean] = js.native
    
    val throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.native
    
    val unique: js.UndefOr[Boolean] = js.native
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
      def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      @scala.inline
      def setBaseNameMatch(value: Boolean): Self = StObject.set(x, "baseNameMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseNameMatchUndefined: Self = StObject.set(x, "baseNameMatch", js.undefined)
      
      @scala.inline
      def setBraceExpansion(value: Boolean): Self = StObject.set(x, "braceExpansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBraceExpansionUndefined: Self = StObject.set(x, "braceExpansion", js.undefined)
      
      @scala.inline
      def setCaseSensitiveMatch(value: Boolean): Self = StObject.set(x, "caseSensitiveMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveMatchUndefined: Self = StObject.set(x, "caseSensitiveMatch", js.undefined)
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDeep(value: Double): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setExpandDirectories(value: ExpandDirectoriesOption): Self = StObject.set(x, "expandDirectories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandDirectoriesUndefined: Self = StObject.set(x, "expandDirectories", js.undefined)
      
      @scala.inline
      def setExpandDirectoriesVarargs(value: String*): Self = StObject.set(x, "expandDirectories", js.Array(value :_*))
      
      @scala.inline
      def setExtglob(value: Boolean): Self = StObject.set(x, "extglob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtglobUndefined: Self = StObject.set(x, "extglob", js.undefined)
      
      @scala.inline
      def setFilter(value: /* file */ SourceFile => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFollowSymbolicLinks(value: Boolean): Self = StObject.set(x, "followSymbolicLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowSymbolicLinksUndefined: Self = StObject.set(x, "followSymbolicLinks", js.undefined)
      
      @scala.inline
      def setFs(value: PartialFileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setGitignore(value: Boolean): Self = StObject.set(x, "gitignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitignoreUndefined: Self = StObject.set(x, "gitignore", js.undefined)
      
      @scala.inline
      def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobstarUndefined: Self = StObject.set(x, "globstar", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Array[Pattern]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreJunk(value: Boolean): Self = StObject.set(x, "ignoreJunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreJunkUndefined: Self = StObject.set(x, "ignoreJunk", js.undefined)
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: Pattern*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setMarkDirectories(value: Boolean): Self = StObject.set(x, "markDirectories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkDirectoriesUndefined: Self = StObject.set(x, "markDirectories", js.undefined)
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      @scala.inline
      def setOnlyDirectories(value: Boolean): Self = StObject.set(x, "onlyDirectories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyDirectoriesUndefined: Self = StObject.set(x, "onlyDirectories", js.undefined)
      
      @scala.inline
      def setOnlyFiles(value: Boolean): Self = StObject.set(x, "onlyFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyFilesUndefined: Self = StObject.set(x, "onlyFiles", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setParents(value: Boolean): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
      
      @scala.inline
      def setRename(value: String | (js.Function1[/* basename */ String, String])): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenameFunction1(value: /* basename */ String => String): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      @scala.inline
      def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      @scala.inline
      def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressErrorsUndefined: Self = StObject.set(x, "suppressErrors", js.undefined)
      
      @scala.inline
      def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowErrorOnBrokenSymbolicLinkUndefined: Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", js.undefined)
      
      @scala.inline
      def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
  
  @js.native
  trait ProgressData extends StObject {
    
    /**
    		Copied file count.
    		*/
    var completedFiles: Double = js.native
    
    /**
    		Completed size in bytes.
    		*/
    var completedSize: Double = js.native
    
    /**
    		Completed percentage. A value between `0` and `1`.
    		*/
    var percent: Double = js.native
    
    /**
    		Overall file count.
    		*/
    var totalFiles: Double = js.native
  }
  object ProgressData {
    
    @scala.inline
    def apply(completedFiles: Double, completedSize: Double, percent: Double, totalFiles: Double): ProgressData = {
      val __obj = js.Dynamic.literal(completedFiles = completedFiles.asInstanceOf[js.Any], completedSize = completedSize.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], totalFiles = totalFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressData]
    }
    
    @scala.inline
    implicit class ProgressDataMutableBuilder[Self <: ProgressData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompletedFiles(value: Double): Self = StObject.set(x, "completedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletedSize(value: Double): Self = StObject.set(x, "completedSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalFiles(value: Double): Self = StObject.set(x, "totalFiles", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProgressEmitter extends StObject {
    
    @JSName("on")
    def on_progress(event: progress, handler: js.Function1[/* progress */ ProgressData, Unit]): js.Promise[js.Array[String]] = js.native
  }
  object ProgressEmitter {
    
    @scala.inline
    def apply(on: (progress, js.Function1[/* progress */ ProgressData, Unit]) => js.Promise[js.Array[String]]): ProgressEmitter = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[ProgressEmitter]
    }
    
    @scala.inline
    implicit class ProgressEmitterMutableBuilder[Self <: ProgressEmitter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOn(value: (progress, js.Function1[/* progress */ ProgressData, Unit]) => js.Promise[js.Array[String]]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait SourceFile extends StObject {
    
    /**
    		File extension.
    		@example 'js'
    		*/
    val extension: String = js.native
    
    /**
    		Filename with extension.
    		@example 'foo.js'
    		*/
    val name: String = js.native
    
    /**
    		Filename without extension.
    		@example 'foo'
    		*/
    val nameWithoutExtension: String = js.native
    
    /**
    		Resolved path to the file.
    		@example '/tmp/dir/foo.js'
    		*/
    val path: String = js.native
    
    /**
    		Relative path to the file from `cwd`.
    		@example 'dir/foo.js' if `cwd` was '/tmp'
    		*/
    val relativePath: String = js.native
  }
  object SourceFile {
    
    @scala.inline
    def apply(extension: String, name: String, nameWithoutExtension: String, path: String, relativePath: String): SourceFile = {
      val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameWithoutExtension = nameWithoutExtension.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceFile]
    }
    
    @scala.inline
    implicit class SourceFileMutableBuilder[Self <: SourceFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameWithoutExtension(value: String): Self = StObject.set(x, "nameWithoutExtension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    }
  }
}
