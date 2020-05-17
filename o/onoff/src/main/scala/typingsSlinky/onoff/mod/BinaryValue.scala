package typingsSlinky.onoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.onoff.mod.High
  - typingsSlinky.onoff.mod.Low
*/
trait BinaryValue extends js.Object

object BinaryValue {
  @scala.inline
  implicit def apply(value: High): BinaryValue = value.asInstanceOf[BinaryValue]
  @scala.inline
  implicit def apply(value: Low): BinaryValue = value.asInstanceOf[BinaryValue]
}

