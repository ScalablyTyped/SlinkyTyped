package typingsSlinky.countdown.countdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.std.Date
  - typingsSlinky.countdown.countdown.DateFunction
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait DateTime extends js.Object

object DateTime {
  @scala.inline
  implicit def apply(value: js.Date): DateTime = value.asInstanceOf[DateTime]
  @scala.inline
  implicit def apply(value: DateFunction): DateTime = value.asInstanceOf[DateTime]
  @scala.inline
  implicit def apply(value: Double): DateTime = value.asInstanceOf[DateTime]
  @scala.inline
  implicit def apply(value: Null): DateTime = value.asInstanceOf[DateTime]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => DateTime): DateTime = value.asInstanceOf[DateTime]
}

