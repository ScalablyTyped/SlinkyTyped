package typingsSlinky.gulp

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.gulp.anon.FnCall
import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.node.fsMod.FSWatcher
import typingsSlinky.vinyl.mod.File
import typingsSlinky.vinylFs.mod.DestOptions
import typingsSlinky.vinylFs.mod.SrcOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp", JSImport.Namespace)
  @js.native
  val ^ : Gulp = js.native
  
  @js.native
  trait DestMethod extends StObject {
    
    def apply(folder: String): ReadWriteStream = js.native
    def apply(folder: String, opt: DestOptions): ReadWriteStream = js.native
    def apply(getFolderPath: js.Function1[/* file */ File, String]): ReadWriteStream = js.native
  }
  
  type Globs = String | js.Array[String]
  
  @js.native
  trait Gulp
    extends typingsSlinky.undertaker.mod.^ {
    
    /**
      * Can be piped to and it will write files. Re-emits all data passed to it so you can pipe to multiple folders.
      * Folders that don't exist will be created.
      * @param path The path (output folder) to write files to. Or a function that returns it, the function will be provided a vinyl File instance.
      */
    var dest: DestMethod = js.native
    
    /**
      * Emits files matching provided glob or array of globs. Returns a stream of Vinyl files that can be piped to plugins.
      * @param globs Glob or array of globs to read.
      * @param options Options to pass to node-glob through glob-stream.
      */
    var src: SrcMethod = js.native
    
    /**
      * Functions exactly like gulp.dest, but will create symlinks instead of copying a directory.
      * @param folder A folder path or a function that receives in a file and returns a folder path.
      */
    var symlink: FnCall = js.native
    
    /**
      * Takes a path string, an array of path strings, a glob string or an array of glob strings as globs to watch on the filesystem.
      * Also optionally takes options to configure the watcher and a fn to execute when a file changes.
      * @globs A path string, an array of path strings, a glob string or an array of glob strings that indicate which files to watch for changes.
      * @opts Options that are passed to chokidar.
      * @fn Once async completion is signalled, if another run is queued, it will be executed.
      */
    var watch: WatchMethod = js.native
  }
  
  @js.native
  trait SrcMethod extends StObject {
    
    def apply(globs: String): ReadWriteStream = js.native
    def apply(globs: String, opt: SrcOptions): ReadWriteStream = js.native
    def apply(globs: js.Array[String]): ReadWriteStream = js.native
    def apply(globs: js.Array[String], opt: SrcOptions): ReadWriteStream = js.native
  }
  
  /**
    * @deprecated - Now use `TaskFunction`.
    */
  type TaskCallback = TaskFunction
  
  type TaskFunction = typingsSlinky.undertaker.mod.TaskFunction
  
  @js.native
  trait WatchMethod extends StObject {
    
    def apply(globs: Globs): FSWatcher = js.native
    def apply(globs: Globs, fn: typingsSlinky.undertaker.mod.TaskFunction): FSWatcher = js.native
    def apply(globs: Globs, opts: js.UndefOr[scala.Nothing], fn: typingsSlinky.undertaker.mod.TaskFunction): FSWatcher = js.native
    def apply(globs: Globs, opts: WatchOptions): FSWatcher = js.native
    def apply(globs: Globs, opts: WatchOptions, fn: typingsSlinky.undertaker.mod.TaskFunction): FSWatcher = js.native
  }
  
  @js.native
  trait WatchOptions
    extends typingsSlinky.chokidar.mod.WatchOptions {
    
    /**
      * The delay to wait before triggering the fn.
      * Useful for waiting on many changes before doing the work on changed files, e.g. find-and-replace on many files.
      * @default 200
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Whether or not a file change should queue the fn execution if the fn is already running. Useful for a long running fn.
      * @default true
      */
    var queue: js.UndefOr[Boolean] = js.native
  }
  object WatchOptions {
    
    @scala.inline
    def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    @scala.inline
    implicit class WatchOptionsMutableBuilder[Self <: WatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    }
  }
  
  type _To = Gulp
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Gulp = ^
}
