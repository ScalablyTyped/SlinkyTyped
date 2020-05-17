package typingsSlinky.mkdirp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - js.UndefOr[scala.Nothing]
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  implicit def apply(value: Double): Mode = value.asInstanceOf[Mode]
  @scala.inline
  implicit def apply(value: String): Mode = value.asInstanceOf[Mode]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Mode): Mode = value.asInstanceOf[Mode]
}

