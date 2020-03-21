package typingsSlinky.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeHueApi.nodeHueApiStrings.idle
  - typingsSlinky.nodeHueApi.nodeHueApiStrings.startmigration
  - typingsSlinky.nodeHueApi.nodeHueApiStrings.fileready_disabled
  - typingsSlinky.nodeHueApi.nodeHueApiStrings.prepare_restore
  - typingsSlinky.nodeHueApi.nodeHueApiStrings.restoring
*/
trait BackupStatus extends js.Object

object BackupStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fileready_disabled: typingsSlinky.nodeHueApi.nodeHueApiStrings.fileready_disabled = this.cast("fileready_disabled")
  @scala.inline
  def idle: typingsSlinky.nodeHueApi.nodeHueApiStrings.idle = this.cast("idle")
  @scala.inline
  def prepare_restore: typingsSlinky.nodeHueApi.nodeHueApiStrings.prepare_restore = this.cast("prepare_restore")
  @scala.inline
  def restoring: typingsSlinky.nodeHueApi.nodeHueApiStrings.restoring = this.cast("restoring")
  @scala.inline
  def startmigration: typingsSlinky.nodeHueApi.nodeHueApiStrings.startmigration = this.cast("startmigration")
}

