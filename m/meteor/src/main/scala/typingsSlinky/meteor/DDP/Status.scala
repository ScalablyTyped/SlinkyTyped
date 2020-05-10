package typingsSlinky.meteor.DDP

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
  def connected: typingsSlinky.meteor.meteorStrings.connected = "connected".asInstanceOf[typingsSlinky.meteor.meteorStrings.connected]
  @scala.inline
  def connecting: typingsSlinky.meteor.meteorStrings.connecting = "connecting".asInstanceOf[typingsSlinky.meteor.meteorStrings.connecting]
  @scala.inline
  def failed: typingsSlinky.meteor.meteorStrings.failed = "failed".asInstanceOf[typingsSlinky.meteor.meteorStrings.failed]
  @scala.inline
  def offline: typingsSlinky.meteor.meteorStrings.offline = "offline".asInstanceOf[typingsSlinky.meteor.meteorStrings.offline]
  @scala.inline
  def waiting: typingsSlinky.meteor.meteorStrings.waiting = "waiting".asInstanceOf[typingsSlinky.meteor.meteorStrings.waiting]
}

