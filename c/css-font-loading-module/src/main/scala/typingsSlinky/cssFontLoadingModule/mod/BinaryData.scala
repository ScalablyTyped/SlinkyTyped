package typingsSlinky.cssFontLoadingModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.ArrayBufferView
*/
trait BinaryData extends js.Object

object BinaryData {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): BinaryData = value.asInstanceOf[BinaryData]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBufferView): BinaryData = value.asInstanceOf[BinaryData]
}

