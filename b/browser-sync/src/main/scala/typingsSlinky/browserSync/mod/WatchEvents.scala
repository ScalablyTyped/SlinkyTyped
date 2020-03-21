package typingsSlinky.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.browserSync.browserSyncStrings.add
  - typingsSlinky.browserSync.browserSyncStrings.change
  - typingsSlinky.browserSync.browserSyncStrings.unlink
  - typingsSlinky.browserSync.browserSyncStrings.addDir
  - typingsSlinky.browserSync.browserSyncStrings.unlinkDir
*/
trait WatchEvents extends js.Object

object WatchEvents {
  @scala.inline
  def add: typingsSlinky.browserSync.browserSyncStrings.add = this.cast("add")
  @scala.inline
  def addDir: typingsSlinky.browserSync.browserSyncStrings.addDir = this.cast("addDir")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typingsSlinky.browserSync.browserSyncStrings.change = this.cast("change")
  @scala.inline
  def unlink: typingsSlinky.browserSync.browserSyncStrings.unlink = this.cast("unlink")
  @scala.inline
  def unlinkDir: typingsSlinky.browserSync.browserSyncStrings.unlinkDir = this.cast("unlinkDir")
}

