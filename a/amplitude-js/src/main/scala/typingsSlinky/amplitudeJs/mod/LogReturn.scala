package typingsSlinky.amplitudeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - js.UndefOr[scala.Nothing]
*/
trait LogReturn extends js.Object

object LogReturn {
  @scala.inline
  implicit def apply(value: Double): LogReturn = value.asInstanceOf[LogReturn]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => LogReturn): LogReturn = value.asInstanceOf[LogReturn]
}

