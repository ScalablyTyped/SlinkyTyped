package typingsSlinky.bser.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.TypedArray
import typingsSlinky.std.SharedArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - java.lang.String
  - typingsSlinky.node.NodeJS.TypedArray
  - typingsSlinky.std.DataView
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.SharedArrayBuffer
*/
trait InputWrapper extends js.Object

object InputWrapper {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): InputWrapper = value.asInstanceOf[InputWrapper]
  @scala.inline
  implicit def apply(value: Buffer): InputWrapper = value.asInstanceOf[InputWrapper]
  @scala.inline
  implicit def apply(value: js.typedarray.DataView): InputWrapper = value.asInstanceOf[InputWrapper]
  @scala.inline
  implicit def apply(value: SharedArrayBuffer): InputWrapper = value.asInstanceOf[InputWrapper]
  @scala.inline
  implicit def apply(value: String): InputWrapper = value.asInstanceOf[InputWrapper]
  @scala.inline
  implicit def apply(value: TypedArray): InputWrapper = value.asInstanceOf[InputWrapper]
}

