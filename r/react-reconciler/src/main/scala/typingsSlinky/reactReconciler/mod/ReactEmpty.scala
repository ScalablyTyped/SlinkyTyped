package typingsSlinky.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// shared/ReactTypes
/* Rewritten from type alias, can be one of: 
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - scala.Boolean
*/
trait ReactEmpty extends ReactNodeList

object ReactEmpty {
  @scala.inline
  implicit def apply(value: Boolean): ReactEmpty = value.asInstanceOf[ReactEmpty]
  @scala.inline
  implicit def apply(value: Null): ReactEmpty = value.asInstanceOf[ReactEmpty]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ReactEmpty): ReactEmpty = value.asInstanceOf[ReactEmpty]
}

