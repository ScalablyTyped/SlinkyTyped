package typingsSlinky.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait LabelValue extends js.Object

object LabelValue {
  @scala.inline
  implicit def apply(value: Boolean): LabelValue = value.asInstanceOf[LabelValue]
  @scala.inline
  implicit def apply(value: Double): LabelValue = value.asInstanceOf[LabelValue]
  @scala.inline
  implicit def apply(value: Null): LabelValue = value.asInstanceOf[LabelValue]
  @scala.inline
  implicit def apply(value: String): LabelValue = value.asInstanceOf[LabelValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => LabelValue): LabelValue = value.asInstanceOf[LabelValue]
}

