package typingsSlinky.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.motorHat.mod.PinDefinitionObject
  - js.Array[scala.Double]
*/
trait PinDefinition extends js.Object

object PinDefinition {
  @scala.inline
  implicit def apply(value: js.Array[Double]): PinDefinition = value.asInstanceOf[PinDefinition]
  @scala.inline
  implicit def apply(value: PinDefinitionObject): PinDefinition = value.asInstanceOf[PinDefinition]
}

