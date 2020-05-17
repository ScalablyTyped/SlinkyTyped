package typingsSlinky.libraCore

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - java.lang.String
*/
trait BuffString extends js.Object

object BuffString {
  @scala.inline
  implicit def apply(value: Buffer): BuffString = value.asInstanceOf[BuffString]
  @scala.inline
  implicit def apply(value: String): BuffString = value.asInstanceOf[BuffString]
}

