package typingsSlinky.jsonMl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - Array[java.lang.String | js.Any]
*/
trait Node extends js.Object

object Node {
  @scala.inline
  implicit def apply(value: Array[String | js.Any]): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: String): Node = value.asInstanceOf[Node]
}

