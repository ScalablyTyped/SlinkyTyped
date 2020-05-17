package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[scala.Double]
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.ArrayBufferView
*/
trait DataArray extends js.Object

object DataArray {
  @scala.inline
  implicit def apply(value: js.Array[Double]): DataArray = value.asInstanceOf[DataArray]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): DataArray = value.asInstanceOf[DataArray]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBufferView): DataArray = value.asInstanceOf[DataArray]
}

