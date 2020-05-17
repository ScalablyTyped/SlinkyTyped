package typingsSlinky.karmaViewport.inspectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Null
  - scala.Double
  - java.lang.String
  - js.Object
  - typingsSlinky.karmaViewport.inspectMod.InspectFunction
*/
trait InspectValue extends js.Object

object InspectValue {
  @scala.inline
  implicit def apply(value: Double): InspectValue = value.asInstanceOf[InspectValue]
  @scala.inline
  implicit def apply(value: InspectFunction): InspectValue = value.asInstanceOf[InspectValue]
  @scala.inline
  implicit def apply(value: Null): InspectValue = value.asInstanceOf[InspectValue]
  @scala.inline
  implicit def apply(value: js.Object): InspectValue = value.asInstanceOf[InspectValue]
  @scala.inline
  implicit def apply(value: String): InspectValue = value.asInstanceOf[InspectValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => InspectValue): InspectValue = value.asInstanceOf[InspectValue]
}

