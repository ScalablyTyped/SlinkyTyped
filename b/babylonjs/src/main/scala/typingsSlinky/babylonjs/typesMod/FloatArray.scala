package typingsSlinky.babylonjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[scala.Double]
  - typingsSlinky.std.Float32Array
*/
trait FloatArray extends js.Object

object FloatArray {
  @scala.inline
  implicit def apply(value: js.Array[Double]): FloatArray = value.asInstanceOf[FloatArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Float32Array): FloatArray = value.asInstanceOf[FloatArray]
}

