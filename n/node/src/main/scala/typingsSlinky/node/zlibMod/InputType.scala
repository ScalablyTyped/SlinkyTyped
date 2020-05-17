package typingsSlinky.node.zlibMod

import typingsSlinky.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.node.NodeJS.ArrayBufferView
*/
trait InputType extends js.Object

object InputType {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): InputType = value.asInstanceOf[InputType]
  @scala.inline
  implicit def apply(value: ArrayBufferView): InputType = value.asInstanceOf[InputType]
  @scala.inline
  implicit def apply(value: String): InputType = value.asInstanceOf[InputType]
}

