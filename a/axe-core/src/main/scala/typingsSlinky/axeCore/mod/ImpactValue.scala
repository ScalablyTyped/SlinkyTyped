package typingsSlinky.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.axeCore.axeCoreStrings.minor
  - typingsSlinky.axeCore.axeCoreStrings.moderate
  - typingsSlinky.axeCore.axeCoreStrings.serious
  - typingsSlinky.axeCore.axeCoreStrings.critical
*/
trait ImpactValue extends js.Object

object ImpactValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def critical: typingsSlinky.axeCore.axeCoreStrings.critical = this.cast("critical")
  @scala.inline
  def minor: typingsSlinky.axeCore.axeCoreStrings.minor = this.cast("minor")
  @scala.inline
  def moderate: typingsSlinky.axeCore.axeCoreStrings.moderate = this.cast("moderate")
  @scala.inline
  def serious: typingsSlinky.axeCore.axeCoreStrings.serious = this.cast("serious")
}

