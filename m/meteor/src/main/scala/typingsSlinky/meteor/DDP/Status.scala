package typingsSlinky.meteor.DDP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.meteor.meteorStrings.connected
  - typings.meteor.meteorStrings.connecting
  - typings.meteor.meteorStrings.failed
  - typings.meteor.meteorStrings.waiting
  - typings.meteor.meteorStrings.offline
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

