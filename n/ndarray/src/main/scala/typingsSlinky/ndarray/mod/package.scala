package typingsSlinky.ndarray

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Data[T] = js.Array[T] | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.Uint8ClampedArray
}
