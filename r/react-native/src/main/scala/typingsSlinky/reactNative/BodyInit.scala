package typingsSlinky.reactNative

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Blob
  - typingsSlinky.std.Int8Array
  - typingsSlinky.std.Int16Array
  - typingsSlinky.std.Int32Array
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.std.Uint16Array
  - typingsSlinky.std.Uint32Array
  - typingsSlinky.std.Uint8ClampedArray
  - typingsSlinky.std.Float32Array
  - typingsSlinky.std.Float64Array
  - typingsSlinky.std.DataView
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.reactNative.FormData
  - java.lang.String
  - scala.Null
*/
trait BodyInit extends js.Object

object BodyInit {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: Blob): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: js.typedarray.DataView): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: js.typedarray.Float32Array): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: js.typedarray.Float64Array): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: FormData): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: js.typedarray.Int16Array): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: js.typedarray.Int32Array): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: js.typedarray.Int8Array): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: Null): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: String): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint16Array): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint32Array): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): BodyInit = value.asInstanceOf[BodyInit]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8ClampedArray): BodyInit = value.asInstanceOf[BodyInit]
}

