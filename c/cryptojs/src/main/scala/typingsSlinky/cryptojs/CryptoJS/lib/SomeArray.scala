package typingsSlinky.cryptojs.CryptoJS.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.Int8Array
  - typingsSlinky.std.Int16Array
  - typingsSlinky.std.Int32Array
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.std.Uint16Array
  - typingsSlinky.std.Uint32Array
*/
trait SomeArray extends js.Object

object SomeArray {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): SomeArray = value.asInstanceOf[SomeArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Int16Array): SomeArray = value.asInstanceOf[SomeArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Int32Array): SomeArray = value.asInstanceOf[SomeArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Int8Array): SomeArray = value.asInstanceOf[SomeArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint16Array): SomeArray = value.asInstanceOf[SomeArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint32Array): SomeArray = value.asInstanceOf[SomeArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): SomeArray = value.asInstanceOf[SomeArray]
}

