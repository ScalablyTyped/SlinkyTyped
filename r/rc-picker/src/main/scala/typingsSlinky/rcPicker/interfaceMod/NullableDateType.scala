package typingsSlinky.rcPicker.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - DateType
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait NullableDateType[DateType] extends js.Object

object NullableDateType {
  @scala.inline
  implicit def apply[DateType](value: DateType): NullableDateType[DateType] = value.asInstanceOf[NullableDateType[DateType]]
  @scala.inline
  implicit def apply[DateType](value: Null): NullableDateType[DateType] = value.asInstanceOf[NullableDateType[DateType]]
  @scala.inline
  implicit def fromUndef[DateType, T](value: js.UndefOr[T])(implicit ev: T => NullableDateType[DateType]): NullableDateType[DateType] = value.asInstanceOf[NullableDateType[DateType]]
}

