package typingsSlinky.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.relayRuntimeStrings.available
  - typingsSlinky.relayRuntime.relayRuntimeStrings.stale
  - typingsSlinky.relayRuntime.relayRuntimeStrings.missing
*/
trait OperationAvailability extends js.Object

object OperationAvailability {
  @scala.inline
  def available: typingsSlinky.relayRuntime.relayRuntimeStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def missing: typingsSlinky.relayRuntime.relayRuntimeStrings.missing = this.cast("missing")
  @scala.inline
  def stale: typingsSlinky.relayRuntime.relayRuntimeStrings.stale = this.cast("stale")
}

