package typingsSlinky.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.azdata.azdataStrings.unknown
  - typingsSlinky.azdata.azdataStrings.starting
  - typingsSlinky.azdata.azdataStrings.reconnecting
  - typingsSlinky.azdata.azdataStrings.idle
  - typingsSlinky.azdata.azdataStrings.busy
  - typingsSlinky.azdata.azdataStrings.restarting
  - typingsSlinky.azdata.azdataStrings.dead
  - typingsSlinky.azdata.azdataStrings.connected
*/
trait KernelStatus extends js.Object

object KernelStatus {
  @scala.inline
  def busy: typingsSlinky.azdata.azdataStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsSlinky.azdata.azdataStrings.connected = this.cast("connected")
  @scala.inline
  def dead: typingsSlinky.azdata.azdataStrings.dead = this.cast("dead")
  @scala.inline
  def idle: typingsSlinky.azdata.azdataStrings.idle = this.cast("idle")
  @scala.inline
  def reconnecting: typingsSlinky.azdata.azdataStrings.reconnecting = this.cast("reconnecting")
  @scala.inline
  def restarting: typingsSlinky.azdata.azdataStrings.restarting = this.cast("restarting")
  @scala.inline
  def starting: typingsSlinky.azdata.azdataStrings.starting = this.cast("starting")
  @scala.inline
  def unknown: typingsSlinky.azdata.azdataStrings.unknown = this.cast("unknown")
}

