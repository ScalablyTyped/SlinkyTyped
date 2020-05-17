package typingsSlinky.distributionsPoissonQuantile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[scala.Double]
  - typingsSlinky.std.Int8Array
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.std.Uint8ClampedArray
  - typingsSlinky.std.Int16Array
  - typingsSlinky.std.Uint16Array
  - typingsSlinky.std.Int32Array
  - typingsSlinky.std.Uint32Array
  - typingsSlinky.std.Float32Array
  - typingsSlinky.std.Float64Array
*/
trait Data extends js.Object

object Data {
  @scala.inline
  implicit def apply(value: js.Array[Double]): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: js.typedarray.Float32Array): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: js.typedarray.Float64Array): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: js.typedarray.Int16Array): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: js.typedarray.Int32Array): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: js.typedarray.Int8Array): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint16Array): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint32Array): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8ClampedArray): Data = value.asInstanceOf[Data]
}

