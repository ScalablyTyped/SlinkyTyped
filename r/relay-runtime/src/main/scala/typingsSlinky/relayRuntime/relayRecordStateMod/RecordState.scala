package typingsSlinky.relayRuntime.relayRecordStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayRuntime.relayRuntimeStrings.EXISTENT
  - typingsSlinky.relayRuntime.relayRuntimeStrings.NONEXISTENT
  - typingsSlinky.relayRuntime.relayRuntimeStrings.UNKNOWN
*/
trait RecordState extends js.Object

object RecordState {
  @scala.inline
  def EXISTENT: typingsSlinky.relayRuntime.relayRuntimeStrings.EXISTENT = this.cast("EXISTENT")
  @scala.inline
  def NONEXISTENT: typingsSlinky.relayRuntime.relayRuntimeStrings.NONEXISTENT = this.cast("NONEXISTENT")
  @scala.inline
  def UNKNOWN: typingsSlinky.relayRuntime.relayRuntimeStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

