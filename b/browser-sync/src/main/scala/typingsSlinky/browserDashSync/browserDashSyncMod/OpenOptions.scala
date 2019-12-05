package typingsSlinky.browserDashSync.browserDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.browserDashSync.browserDashSyncStrings.local
  - typings.browserDashSync.browserDashSyncStrings.external
  - typings.browserDashSync.browserDashSyncStrings.ui
  - typings.browserDashSync.browserDashSyncStrings.`ui-external`
  - typings.browserDashSync.browserDashSyncStrings.tunnel
*/
trait OpenOptions extends js.Object

object OpenOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def external: typingsSlinky.browserDashSync.browserDashSyncStrings.external = this.cast("external")
  @scala.inline
  def local: typingsSlinky.browserDashSync.browserDashSyncStrings.local = this.cast("local")
  @scala.inline
  def tunnel: typingsSlinky.browserDashSync.browserDashSyncStrings.tunnel = this.cast("tunnel")
  @scala.inline
  def ui: typingsSlinky.browserDashSync.browserDashSyncStrings.ui = this.cast("ui")
  @scala.inline
  def `ui-external`: typingsSlinky.browserDashSync.browserDashSyncStrings.`ui-external` = this.cast("ui-external")
}

