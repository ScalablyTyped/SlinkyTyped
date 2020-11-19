package typingsSlinky.gulp.mod

import typingsSlinky.node.fsMod.FSWatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchMethod extends js.Object {
  
  def apply(globs: Globs): FSWatcher = js.native
  def apply(globs: Globs, fn: typingsSlinky.undertaker.mod.TaskFunction): FSWatcher = js.native
  def apply(globs: Globs, opts: js.UndefOr[scala.Nothing], fn: typingsSlinky.undertaker.mod.TaskFunction): FSWatcher = js.native
  def apply(globs: Globs, opts: WatchOptions): FSWatcher = js.native
  def apply(globs: Globs, opts: WatchOptions, fn: typingsSlinky.undertaker.mod.TaskFunction): FSWatcher = js.native
}
