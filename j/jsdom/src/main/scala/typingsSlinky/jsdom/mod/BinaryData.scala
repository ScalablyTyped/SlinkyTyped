package typingsSlinky.jsdom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.DataView
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
trait BinaryData extends js.Object

object BinaryData {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): BinaryData = value.asInstanceOf[BinaryData]
  @scala.inline
  implicit def apply(value: js.typedarray.DataView): BinaryData = value.asInstanceOf[BinaryData]
  @scala.inline
  implicit def apply(value: js.typedarray.Float32Array): BinaryData = value.asInstanceOf[BinaryData]
  @scala.inline
  implicit def apply(value: js.typedarray.Float64Array): BinaryData = value.asInstanceOf[BinaryData]
  @scala.inline
  implicit def apply(value: js.typedarray.Int16Array): BinaryData = value.asInstanceOf[BinaryData]
  @scala.inline
  implicit def apply(value: js.typedarray.Int32Array): BinaryData = value.asInstanceOf[BinaryData]
  @scala.inline
  implicit def apply(value: js.typedarray.Int8Array): BinaryData = value.asInstanceOf[BinaryData]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint16Array): BinaryData = value.asInstanceOf[BinaryData]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint32Array): BinaryData = value.asInstanceOf[BinaryData]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): BinaryData = value.asInstanceOf[BinaryData]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8ClampedArray): BinaryData = value.asInstanceOf[BinaryData]
}

