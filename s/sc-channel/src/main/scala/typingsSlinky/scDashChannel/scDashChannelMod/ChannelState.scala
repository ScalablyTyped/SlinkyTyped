package typingsSlinky.scDashChannel.scDashChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.scDashChannel.scDashChannelStrings.pending
  - typings.scDashChannel.scDashChannelStrings.subscribed
  - typings.scDashChannel.scDashChannelStrings.unsubscribed
*/
trait ChannelState extends js.Object

object ChannelState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typingsSlinky.scDashChannel.scDashChannelStrings.pending = this.cast("pending")
  @scala.inline
  def subscribed: typingsSlinky.scDashChannel.scDashChannelStrings.subscribed = this.cast("subscribed")
  @scala.inline
  def unsubscribed: typingsSlinky.scDashChannel.scDashChannelStrings.unsubscribed = this.cast("unsubscribed")
}

