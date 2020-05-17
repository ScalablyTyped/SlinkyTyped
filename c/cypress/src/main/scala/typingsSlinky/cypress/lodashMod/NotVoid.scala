package typingsSlinky.cypress.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait NotVoid extends js.Object

object NotVoid {
  @scala.inline
  implicit def apply(value: Null): NotVoid = value.asInstanceOf[NotVoid]
  @scala.inline
  implicit def apply(value: js.Object): NotVoid = value.asInstanceOf[NotVoid]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => NotVoid): NotVoid = value.asInstanceOf[NotVoid]
}

