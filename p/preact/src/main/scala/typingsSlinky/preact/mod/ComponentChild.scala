package typingsSlinky.preact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.preact.mod.VNode[js.Any]
  - js.Object
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait ComponentChild extends ComponentChildren

object ComponentChild {
  @scala.inline
  implicit def apply(value: Boolean): ComponentChild = value.asInstanceOf[ComponentChild]
  @scala.inline
  implicit def apply(value: Double): ComponentChild = value.asInstanceOf[ComponentChild]
  @scala.inline
  implicit def apply(value: Null): ComponentChild = value.asInstanceOf[ComponentChild]
  @scala.inline
  implicit def apply(value: js.Object): ComponentChild = value.asInstanceOf[ComponentChild]
  @scala.inline
  implicit def apply(value: String): ComponentChild = value.asInstanceOf[ComponentChild]
  @scala.inline
  implicit def apply(value: VNode[js.Any]): ComponentChild = value.asInstanceOf[ComponentChild]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ComponentChild): ComponentChild = value.asInstanceOf[ComponentChild]
}

