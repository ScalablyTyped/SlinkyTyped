package typingsSlinky.airbnbPropTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * instance * / T | scala.Null, scala.Unit]
  - typingsSlinky.airbnbPropTypes.mod.ReactRefLike[T]
*/
trait ReactLegacyRefLike[T] extends js.Object

object ReactLegacyRefLike {
  @scala.inline
  implicit def apply[T](value: js.Function1[/* instance */ T | Null, Unit]): ReactLegacyRefLike[T] = value.asInstanceOf[ReactLegacyRefLike[T]]
  @scala.inline
  implicit def apply[T](value: ReactRefLike[T]): ReactLegacyRefLike[T] = value.asInstanceOf[ReactLegacyRefLike[T]]
}

