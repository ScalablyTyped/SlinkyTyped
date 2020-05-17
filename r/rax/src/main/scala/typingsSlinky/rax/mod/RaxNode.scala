package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rax.mod.RaxChild
  - typingsSlinky.rax.mod.RaxFragment
  - typingsSlinky.rax.mod.RaxPortal
  - scala.Boolean
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait RaxNode extends js.Object

object RaxNode {
  @scala.inline
  implicit def apply(value: Boolean): RaxNode = value.asInstanceOf[RaxNode]
  @scala.inline
  implicit def apply(value: Null): RaxNode = value.asInstanceOf[RaxNode]
  @scala.inline
  implicit def apply(value: RaxChild): RaxNode = value.asInstanceOf[RaxNode]
  @scala.inline
  implicit def apply(value: RaxFragment): RaxNode = value.asInstanceOf[RaxNode]
  @scala.inline
  implicit def apply(value: RaxPortal): RaxNode = value.asInstanceOf[RaxNode]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => RaxNode): RaxNode = value.asInstanceOf[RaxNode]
}

