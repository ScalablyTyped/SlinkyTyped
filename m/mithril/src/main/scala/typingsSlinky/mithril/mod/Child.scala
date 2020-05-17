package typingsSlinky.mithril.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Vnode children types
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mithril.mod.Vnode[js.Any, js.Any]
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait Child extends Children

object Child {
  @scala.inline
  implicit def apply(value: Boolean): Child = value.asInstanceOf[Child]
  @scala.inline
  implicit def apply(value: Double): Child = value.asInstanceOf[Child]
  @scala.inline
  implicit def apply(value: Null): Child = value.asInstanceOf[Child]
  @scala.inline
  implicit def apply(value: String): Child = value.asInstanceOf[Child]
  @scala.inline
  implicit def apply(value: Vnode[js.Any, js.Any]): Child = value.asInstanceOf[Child]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Child): Child = value.asInstanceOf[Child]
}

