package typingsSlinky.ndarray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[T]
  - typingsSlinky.std.Int8Array
  - typingsSlinky.std.Int16Array
  - typingsSlinky.std.Int32Array
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.std.Uint16Array
  - typingsSlinky.std.Uint32Array
  - typingsSlinky.std.Float32Array
  - typingsSlinky.std.Float64Array
  - typingsSlinky.std.Uint8ClampedArray
*/
trait Data[T] extends js.Object

object Data {
  @scala.inline
  implicit def apply[T](value: js.Array[T]): Data[T] = value.asInstanceOf[Data[T]]
  @scala.inline
  implicit def apply[T](value: js.typedarray.Float32Array): Data[T] = value.asInstanceOf[Data[T]]
  @scala.inline
  implicit def apply[T](value: js.typedarray.Float64Array): Data[T] = value.asInstanceOf[Data[T]]
  @scala.inline
  implicit def apply[T](value: js.typedarray.Int16Array): Data[T] = value.asInstanceOf[Data[T]]
  @scala.inline
  implicit def apply[T](value: js.typedarray.Int32Array): Data[T] = value.asInstanceOf[Data[T]]
  @scala.inline
  implicit def apply[T](value: js.typedarray.Int8Array): Data[T] = value.asInstanceOf[Data[T]]
  @scala.inline
  implicit def apply[T](value: js.typedarray.Uint16Array): Data[T] = value.asInstanceOf[Data[T]]
  @scala.inline
  implicit def apply[T](value: js.typedarray.Uint32Array): Data[T] = value.asInstanceOf[Data[T]]
  @scala.inline
  implicit def apply[T](value: js.typedarray.Uint8Array): Data[T] = value.asInstanceOf[Data[T]]
  @scala.inline
  implicit def apply[T](value: js.typedarray.Uint8ClampedArray): Data[T] = value.asInstanceOf[Data[T]]
}

