package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ably.ablyStrings.publish
  - typingsSlinky.ably.ablyStrings.subscribe
  - typingsSlinky.ably.ablyStrings.presence
  - typingsSlinky.ably.ablyStrings.history
  - typingsSlinky.ably.ablyStrings.stats
  - typingsSlinky.ably.ablyStrings.`channel-metadata`
  - typingsSlinky.ably.ablyStrings.`push-subscribe`
  - typingsSlinky.ably.ablyStrings.`push-admin`
*/
trait capabilityOp extends js.Object

object capabilityOp {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `channel-metadata`: typingsSlinky.ably.ablyStrings.`channel-metadata` = this.cast("channel-metadata")
  @scala.inline
  def history: typingsSlinky.ably.ablyStrings.history = this.cast("history")
  @scala.inline
  def presence: typingsSlinky.ably.ablyStrings.presence = this.cast("presence")
  @scala.inline
  def publish: typingsSlinky.ably.ablyStrings.publish = this.cast("publish")
  @scala.inline
  def `push-admin`: typingsSlinky.ably.ablyStrings.`push-admin` = this.cast("push-admin")
  @scala.inline
  def `push-subscribe`: typingsSlinky.ably.ablyStrings.`push-subscribe` = this.cast("push-subscribe")
  @scala.inline
  def stats: typingsSlinky.ably.ablyStrings.stats = this.cast("stats")
  @scala.inline
  def subscribe: typingsSlinky.ably.ablyStrings.subscribe = this.cast("subscribe")
}

