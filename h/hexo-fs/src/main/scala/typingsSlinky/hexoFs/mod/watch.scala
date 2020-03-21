package typingsSlinky.hexoFs.mod

import typingsSlinky.chokidar.mod.FSWatcher
import typingsSlinky.chokidar.mod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "watch")
@js.native
object watch extends js.Object {
  def apply(path: String): typingsSlinky.bluebird.mod.^[FSWatcher] = js.native
  def apply(path: String, options: WatchOptions): typingsSlinky.bluebird.mod.^[FSWatcher] = js.native
  def apply(
    path: String,
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typingsSlinky.bluebird.mod.^[FSWatcher] = js.native
  def apply(path: js.Array[String]): typingsSlinky.bluebird.mod.^[FSWatcher] = js.native
  def apply(path: js.Array[String], options: WatchOptions): typingsSlinky.bluebird.mod.^[FSWatcher] = js.native
  def apply(
    path: js.Array[String],
    options: WatchOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[FSWatcher], Unit]
  ): typingsSlinky.bluebird.mod.^[FSWatcher] = js.native
}

