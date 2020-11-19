package typingsSlinky.chokidar.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.chokidar.chokidarStrings.add
import typingsSlinky.chokidar.chokidarStrings.addDir
import typingsSlinky.chokidar.chokidarStrings.all
import typingsSlinky.chokidar.chokidarStrings.change
import typingsSlinky.chokidar.chokidarStrings.error
import typingsSlinky.chokidar.chokidarStrings.raw
import typingsSlinky.chokidar.chokidarStrings.ready
import typingsSlinky.chokidar.chokidarStrings.unlink
import typingsSlinky.chokidar.chokidarStrings.unlinkDir
import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chokidar", "FSWatcher")
@js.native
/**
  * Constructs a new FSWatcher instance with optional WatchOptions parameter.
  */
class FSWatcher ()
  extends typingsSlinky.node.fsMod.FSWatcher {
  def this(options: WatchOptions) = this()
  
  /**
    * Add files, directories, or glob patterns for tracking. Takes an array of strings or just one
    * string.
    */
  def add(paths: String): Unit = js.native
  def add(paths: js.Array[String]): Unit = js.native
  
  /**
    * Returns an object representing all the paths on the file system being watched by this
    * `FSWatcher` instance. The object's keys are all the directories (using absolute paths unless
    * the `cwd` option was used), and the values are arrays of the names of the items contained in
    * each directory.
    */
  def getWatched(): StringDictionary[js.Array[String]] = js.native
  
  def on(
    event: all,
    listener: js.Function3[
      /* eventName */ add | addDir | change | unlink | unlinkDir, 
      /* path */ String, 
      /* stats */ js.UndefOr[Stats], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_add(event: add, listener: js.Function2[/* path */ String, /* stats */ js.UndefOr[Stats], Unit]): this.type = js.native
  @JSName("on")
  def on_addDir(event: addDir, listener: js.Function2[/* path */ String, /* stats */ js.UndefOr[Stats], Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, listener: js.Function2[/* path */ String, /* stats */ js.UndefOr[Stats], Unit]): this.type = js.native
  /**
    * Error occurred
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  /**
    * Exposes the native Node `fs.FSWatcher events`
    */
  @JSName("on")
  def on_raw(
    event: raw,
    listener: js.Function3[/* eventName */ String, /* path */ String, /* details */ js.Any, Unit]
  ): this.type = js.native
  /**
    * Fires when the initial scan is complete
    */
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_unlink(event: unlink, listener: js.Function1[/* path */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_unlinkDir(event: unlinkDir, listener: js.Function1[/* path */ String, Unit]): this.type = js.native
  
  var options: WatchOptions = js.native
  
  /**
    * Stop watching files, directories, or glob patterns. Takes an array of strings or just one
    * string.
    */
  def unwatch(paths: String): Unit = js.native
  def unwatch(paths: js.Array[String]): Unit = js.native
}
