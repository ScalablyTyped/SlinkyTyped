package typingsSlinky.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.browserSync.browserSyncStrings.local
  - typingsSlinky.browserSync.browserSyncStrings.external
  - typingsSlinky.browserSync.browserSyncStrings.ui
  - typingsSlinky.browserSync.browserSyncStrings.`ui-external`
  - typingsSlinky.browserSync.browserSyncStrings.tunnel
*/
trait OpenOptions extends js.Object

object OpenOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def external: typingsSlinky.browserSync.browserSyncStrings.external = this.cast("external")
  @scala.inline
  def local: typingsSlinky.browserSync.browserSyncStrings.local = this.cast("local")
  @scala.inline
  def tunnel: typingsSlinky.browserSync.browserSyncStrings.tunnel = this.cast("tunnel")
  @scala.inline
  def ui: typingsSlinky.browserSync.browserSyncStrings.ui = this.cast("ui")
  @scala.inline
  def `ui-external`: typingsSlinky.browserSync.browserSyncStrings.`ui-external` = this.cast("ui-external")
}

