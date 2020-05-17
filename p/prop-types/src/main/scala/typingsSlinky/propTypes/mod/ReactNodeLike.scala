package typingsSlinky.propTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - typingsSlinky.propTypes.mod.ReactElementLike
  - typingsSlinky.propTypes.mod.ReactNodeArray
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait ReactNodeLike extends js.Object

object ReactNodeLike {
  @scala.inline
  implicit def apply(value: Boolean): ReactNodeLike = value.asInstanceOf[ReactNodeLike]
  @scala.inline
  implicit def apply(value: Double): ReactNodeLike = value.asInstanceOf[ReactNodeLike]
  @scala.inline
  implicit def apply(value: Null): ReactNodeLike = value.asInstanceOf[ReactNodeLike]
  @scala.inline
  implicit def apply(value: js.Object): ReactNodeLike = value.asInstanceOf[ReactNodeLike]
  @scala.inline
  implicit def apply(value: ReactElementLike): ReactNodeLike = value.asInstanceOf[ReactNodeLike]
  @scala.inline
  implicit def apply(value: ReactNodeArray): ReactNodeLike = value.asInstanceOf[ReactNodeLike]
  @scala.inline
  implicit def apply(value: String): ReactNodeLike = value.asInstanceOf[ReactNodeLike]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ReactNodeLike): ReactNodeLike = value.asInstanceOf[ReactNodeLike]
}

