package typingsSlinky.from2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.from2.mod.ReadCallback[typingsSlinky.from2.mod.NextCallback]
  - js.Array[typingsSlinky.from2.mod.Chunk]
*/
trait ReadInput extends js.Object

object ReadInput {
  @scala.inline
  implicit def apply(value: js.Array[Chunk]): ReadInput = value.asInstanceOf[ReadInput]
  @scala.inline
  implicit def apply(value: ReadCallback[NextCallback]): ReadInput = value.asInstanceOf[ReadInput]
}

