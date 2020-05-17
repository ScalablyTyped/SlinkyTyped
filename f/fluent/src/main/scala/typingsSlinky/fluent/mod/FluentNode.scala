package typingsSlinky.fluent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fluent.mod.FluentType
  - java.lang.String
*/
trait FluentNode extends js.Object

object FluentNode {
  @scala.inline
  implicit def apply(value: FluentType): FluentNode = value.asInstanceOf[FluentNode]
  @scala.inline
  implicit def apply(value: String): FluentNode = value.asInstanceOf[FluentNode]
}

