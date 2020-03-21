package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ably.ablyStrings.ACTIVE
  - typingsSlinky.ably.ablyStrings.FAILING
  - typingsSlinky.ably.ablyStrings.FAILED
*/
trait DevicePushState extends js.Object

object DevicePushState {
  @scala.inline
  def ACTIVE: typingsSlinky.ably.ablyStrings.ACTIVE = this.cast("ACTIVE")
  @scala.inline
  def FAILED: typingsSlinky.ably.ablyStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def FAILING: typingsSlinky.ably.ablyStrings.FAILING = this.cast("FAILING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

