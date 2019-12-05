package typingsSlinky.hexoDashFs.hexoDashFsMod

import typingsSlinky.chokidar.chokidarMod.FSWatcher
import typingsSlinky.chokidar.chokidarMod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "watch")
@js.native
object watch extends js.Object {
  def apply(path: String): typingsSlinky.bluebird.bluebirdMod.^[FSWatcher] = js.native
  def apply(path: String, options: WatchOptions): typingsSlinky.bluebird.bluebirdMod.^[FSWatcher] = js.native
  def apply(
    path: String,
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typingsSlinky.bluebird.bluebirdMod.^[FSWatcher] = js.native
  def apply(path: js.Array[String]): typingsSlinky.bluebird.bluebirdMod.^[FSWatcher] = js.native
  def apply(path: js.Array[String], options: WatchOptions): typingsSlinky.bluebird.bluebirdMod.^[FSWatcher] = js.native
  def apply(
    path: js.Array[String],
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typingsSlinky.bluebird.bluebirdMod.^[FSWatcher] = js.native
}

