package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rax.mod.RaxElement[js.Any, java.lang.String | typingsSlinky.rax.mod.JSXElementConstructor[js.Any]]
  - typingsSlinky.rax.mod.RaxText
*/
trait RaxChild extends RaxNode

object RaxChild {
  @scala.inline
  implicit def apply(value: RaxElement[js.Any, String | JSXElementConstructor[js.Any]]): RaxChild = value.asInstanceOf[RaxChild]
  @scala.inline
  implicit def apply(value: RaxText): RaxChild = value.asInstanceOf[RaxChild]
}

