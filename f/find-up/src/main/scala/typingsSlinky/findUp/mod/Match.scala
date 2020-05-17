package typingsSlinky.findUp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.findUp.mod.StopSymbol
  - js.UndefOr[scala.Nothing]
*/
trait Match extends js.Object

object Match {
  @scala.inline
  implicit def apply(value: StopSymbol): Match = value.asInstanceOf[Match]
  @scala.inline
  implicit def apply(value: String): Match = value.asInstanceOf[Match]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Match): Match = value.asInstanceOf[Match]
}

