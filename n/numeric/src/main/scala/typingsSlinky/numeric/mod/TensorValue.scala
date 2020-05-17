package typingsSlinky.numeric.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.numeric.mod.Scalar
  - typingsSlinky.numeric.mod.Vector
  - typingsSlinky.numeric.mod.MultidimensionalMatrix
*/
trait TensorValue extends js.Object

object TensorValue {
  @scala.inline
  implicit def apply(value: MultidimensionalMatrix | Vector): TensorValue = value.asInstanceOf[TensorValue]
  @scala.inline
  implicit def apply(value: Scalar): TensorValue = value.asInstanceOf[TensorValue]
}

