package typingsSlinky.meteor.ddpMod.DDP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.meteor.meteorStrings.connected
  - typingsSlinky.meteor.meteorStrings.connecting
  - typingsSlinky.meteor.meteorStrings.failed
  - typingsSlinky.meteor.meteorStrings.waiting
  - typingsSlinky.meteor.meteorStrings.offline
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsSlinky.meteor.meteorStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typingsSlinky.meteor.meteorStrings.connecting = this.cast("connecting")
  @scala.inline
  def failed: typingsSlinky.meteor.meteorStrings.failed = this.cast("failed")
  @scala.inline
  def offline: typingsSlinky.meteor.meteorStrings.offline = this.cast("offline")
  @scala.inline
  def waiting: typingsSlinky.meteor.meteorStrings.waiting = this.cast("waiting")
}

