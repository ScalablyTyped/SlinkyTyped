package typingsSlinky.hasha.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - java.lang.String
  - js.Array[typingsSlinky.node.Buffer | java.lang.String]
*/
trait HashaInput extends js.Object

object HashaInput {
  @scala.inline
  implicit def apply(value: js.Array[Buffer | String]): HashaInput = value.asInstanceOf[HashaInput]
  @scala.inline
  implicit def apply(value: Buffer): HashaInput = value.asInstanceOf[HashaInput]
  @scala.inline
  implicit def apply(value: String): HashaInput = value.asInstanceOf[HashaInput]
}

