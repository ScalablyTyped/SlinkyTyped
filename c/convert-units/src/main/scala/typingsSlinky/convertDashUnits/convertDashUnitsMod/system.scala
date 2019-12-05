package typingsSlinky.convertDashUnits.convertDashUnitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.convertDashUnits.convertDashUnitsStrings.metric
  - typings.convertDashUnits.convertDashUnitsStrings.imperial
  - typings.convertDashUnits.convertDashUnitsStrings.bits
  - typings.convertDashUnits.convertDashUnitsStrings.bytes
*/
trait system extends js.Object

object system {
  @scala.inline
  def bits: typingsSlinky.convertDashUnits.convertDashUnitsStrings.bits = this.cast("bits")
  @scala.inline
  def bytes: typingsSlinky.convertDashUnits.convertDashUnitsStrings.bytes = this.cast("bytes")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imperial: typingsSlinky.convertDashUnits.convertDashUnitsStrings.imperial = this.cast("imperial")
  @scala.inline
  def metric: typingsSlinky.convertDashUnits.convertDashUnitsStrings.metric = this.cast("metric")
}

