package typingsSlinky.scChannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.scChannel.scChannelStrings.pending
  - typingsSlinky.scChannel.scChannelStrings.subscribed
  - typingsSlinky.scChannel.scChannelStrings.unsubscribed
*/
trait ChannelState extends js.Object

object ChannelState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typingsSlinky.scChannel.scChannelStrings.pending = this.cast("pending")
  @scala.inline
  def subscribed: typingsSlinky.scChannel.scChannelStrings.subscribed = this.cast("subscribed")
  @scala.inline
  def unsubscribed: typingsSlinky.scChannel.scChannelStrings.unsubscribed = this.cast("unsubscribed")
}

