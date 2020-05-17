package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - typingsSlinky.rax.mod.RaxNodeArray
*/
trait RaxFragment extends RaxNode

object RaxFragment {
  @scala.inline
  implicit def apply(value: js.Object): RaxFragment = value.asInstanceOf[RaxFragment]
  @scala.inline
  implicit def apply(value: RaxNodeArray): RaxFragment = value.asInstanceOf[RaxFragment]
}

