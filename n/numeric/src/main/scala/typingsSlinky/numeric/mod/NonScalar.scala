package typingsSlinky.numeric.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.numeric.mod.Vector
  - typingsSlinky.numeric.mod.MultidimensionalMatrix
*/
trait NonScalar extends js.Object

object NonScalar {
  @scala.inline
  implicit def apply(value: MultidimensionalMatrix | Vector): NonScalar = value.asInstanceOf[NonScalar]
}

