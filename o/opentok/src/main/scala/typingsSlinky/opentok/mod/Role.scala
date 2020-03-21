package typingsSlinky.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.opentok.opentokStrings.subscriber
  - typingsSlinky.opentok.opentokStrings.publisher
  - typingsSlinky.opentok.opentokStrings.moderator
*/
trait Role extends js.Object

object Role {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def moderator: typingsSlinky.opentok.opentokStrings.moderator = this.cast("moderator")
  @scala.inline
  def publisher: typingsSlinky.opentok.opentokStrings.publisher = this.cast("publisher")
  @scala.inline
  def subscriber: typingsSlinky.opentok.opentokStrings.subscriber = this.cast("subscriber")
}

