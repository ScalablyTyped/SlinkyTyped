package typingsSlinky.babylonjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[scala.Double]
  - typingsSlinky.std.Int32Array
  - typingsSlinky.std.Uint32Array
  - typingsSlinky.std.Uint16Array
*/
trait IndicesArray extends js.Object

object IndicesArray {
  @scala.inline
  implicit def apply(value: js.Array[Double]): IndicesArray = value.asInstanceOf[IndicesArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Int32Array): IndicesArray = value.asInstanceOf[IndicesArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint16Array): IndicesArray = value.asInstanceOf[IndicesArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint32Array): IndicesArray = value.asInstanceOf[IndicesArray]
}

