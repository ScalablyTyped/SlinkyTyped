package typingsSlinky.pusherChatkitClient.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.online
  - typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.offline
  - typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.unknown
*/
trait PusherUserPresence extends js.Object

object PusherUserPresence {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def offline: typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.offline = this.cast("offline")
  @scala.inline
  def online: typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.online = this.cast("online")
  @scala.inline
  def unknown: typingsSlinky.pusherChatkitClient.pusherChatkitClientStrings.unknown = this.cast("unknown")
}

