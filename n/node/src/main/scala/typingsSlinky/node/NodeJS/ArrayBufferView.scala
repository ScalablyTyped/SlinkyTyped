package typingsSlinky.node.NodeJS

import typingsSlinky.node.cryptoMod.BinaryLike
import typingsSlinky.node.zlibMod.InputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.NodeJS.TypedArray
  - typingsSlinky.std.DataView
*/
trait ArrayBufferView
  extends BinaryLike
     with InputType

object ArrayBufferView {
  @scala.inline
  implicit def apply(value: js.typedarray.DataView): ArrayBufferView = value.asInstanceOf[ArrayBufferView]
  @scala.inline
  implicit def apply(value: TypedArray): ArrayBufferView = value.asInstanceOf[ArrayBufferView]
}

