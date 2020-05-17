package typingsSlinky.intoStream.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.node.NodeJS.TypedArray
  - typingsSlinky.std.ArrayBuffer
  - java.lang.String
  - typingsSlinky.std.Iterable[typingsSlinky.node.Buffer | java.lang.String]
*/
trait Input extends js.Object

object Input {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: Buffer): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: js.Iterable[Buffer | String]): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: String): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: TypedArray): Input = value.asInstanceOf[Input]
}

