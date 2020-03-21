package typingsSlinky.agChannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.agChannel.agChannelStrings.pending
  - typingsSlinky.agChannel.agChannelStrings.subscribed
  - typingsSlinky.agChannel.agChannelStrings.unsubscribed
*/
trait ChannelState extends js.Object

object ChannelState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typingsSlinky.agChannel.agChannelStrings.pending = this.cast("pending")
  @scala.inline
  def subscribed: typingsSlinky.agChannel.agChannelStrings.subscribed = this.cast("subscribed")
  @scala.inline
  def unsubscribed: typingsSlinky.agChannel.agChannelStrings.unsubscribed = this.cast("unsubscribed")
}

