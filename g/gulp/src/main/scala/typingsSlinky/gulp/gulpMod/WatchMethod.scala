package typingsSlinky.gulp.gulpMod

import typingsSlinky.node.fsMod.FSWatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchMethod extends js.Object {
  def apply(globs: Globs): FSWatcher = js.native
  def apply(globs: Globs, fn: typingsSlinky.undertaker.undertakerMod.TaskFunction): FSWatcher = js.native
  def apply(globs: Globs, opts: WatchOptions): FSWatcher = js.native
  def apply(globs: Globs, opts: WatchOptions, fn: typingsSlinky.undertaker.undertakerMod.TaskFunction): FSWatcher = js.native
}

