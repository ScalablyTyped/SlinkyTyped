package typingsSlinky.rlp.typesMod

import typingsSlinky.bnJs.mod.^
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - java.lang.String
  - scala.Double
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.bnJs.mod.^
  - typingsSlinky.rlp.typesMod.Dictionary
  - typingsSlinky.rlp.typesMod.List
  - scala.Null
*/
trait Input extends js.Object

object Input {
  @scala.inline
  implicit def apply(value: Buffer): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: Dictionary): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: Double): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: List): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: Null): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: String): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: ^): Input = value.asInstanceOf[Input]
}

