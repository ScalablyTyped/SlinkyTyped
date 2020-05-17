package typingsSlinky.from2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.from2.mod.ReadCallback[typingsSlinky.from2.mod.NextObjectCallback]
  - js.Array[js.Any]
*/
trait ReadObjectInput extends js.Object

object ReadObjectInput {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): ReadObjectInput = value.asInstanceOf[ReadObjectInput]
  @scala.inline
  implicit def apply(value: ReadCallback[NextObjectCallback]): ReadObjectInput = value.asInstanceOf[ReadObjectInput]
}

