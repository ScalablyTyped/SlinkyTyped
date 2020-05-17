package typingsSlinky.routeRecognizer.dslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - scala.Unit
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait Opaque extends js.Object

object Opaque {
  @scala.inline
  implicit def apply(value: Null): Opaque = value.asInstanceOf[Opaque]
  @scala.inline
  implicit def apply(value: js.Object): Opaque = value.asInstanceOf[Opaque]
  @scala.inline
  implicit def apply(value: Unit): Opaque = value.asInstanceOf[Opaque]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Opaque): Opaque = value.asInstanceOf[Opaque]
}

