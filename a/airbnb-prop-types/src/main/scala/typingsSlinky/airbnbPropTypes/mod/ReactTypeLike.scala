package typingsSlinky.airbnbPropTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.airbnbPropTypes.mod.ReactClassComponentLike
  - typingsSlinky.airbnbPropTypes.mod.ReactFunctionComponentLike
*/
trait ReactTypeLike extends js.Object

object ReactTypeLike {
  @scala.inline
  implicit def apply(value: ReactClassComponentLike): ReactTypeLike = value.asInstanceOf[ReactTypeLike]
  @scala.inline
  implicit def apply(value: ReactFunctionComponentLike): ReactTypeLike = value.asInstanceOf[ReactTypeLike]
  @scala.inline
  implicit def apply(value: String): ReactTypeLike = value.asInstanceOf[ReactTypeLike]
}

