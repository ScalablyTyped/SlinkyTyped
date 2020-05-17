package typingsSlinky.pulumiPulumi.outputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - js.UndefOr[scala.Nothing]
  - scala.Null
*/
trait primitive extends js.Object

object primitive {
  @scala.inline
  implicit def apply(value: Boolean): primitive = value.asInstanceOf[primitive]
  @scala.inline
  implicit def apply(value: Double): primitive = value.asInstanceOf[primitive]
  @scala.inline
  implicit def apply(value: js.Function): primitive = value.asInstanceOf[primitive]
  @scala.inline
  implicit def apply(value: Null): primitive = value.asInstanceOf[primitive]
  @scala.inline
  implicit def apply(value: String): primitive = value.asInstanceOf[primitive]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => primitive): primitive = value.asInstanceOf[primitive]
}

