package typingsSlinky.convertUnits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.convertUnits.convertUnitsStrings.metric
  - typingsSlinky.convertUnits.convertUnitsStrings.imperial
  - typingsSlinky.convertUnits.convertUnitsStrings.bits
  - typingsSlinky.convertUnits.convertUnitsStrings.bytes
*/
trait system extends js.Object

object system {
  @scala.inline
  def bits: typingsSlinky.convertUnits.convertUnitsStrings.bits = this.cast("bits")
  @scala.inline
  def bytes: typingsSlinky.convertUnits.convertUnitsStrings.bytes = this.cast("bytes")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imperial: typingsSlinky.convertUnits.convertUnitsStrings.imperial = this.cast("imperial")
  @scala.inline
  def metric: typingsSlinky.convertUnits.convertUnitsStrings.metric = this.cast("metric")
}

