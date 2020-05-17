package typingsSlinky.reactSelect.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - OptionType
  - typingsSlinky.reactSelect.typesMod.OptionsType[OptionType]
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait ValueType[OptionType /* <: OptionTypeBase */] extends js.Object

object ValueType {
  @scala.inline
  implicit def apply[OptionType](value: Null): ValueType[OptionType] = value.asInstanceOf[ValueType[OptionType]]
  @scala.inline
  implicit def apply[OptionType](value: OptionType): ValueType[OptionType] = value.asInstanceOf[ValueType[OptionType]]
  @scala.inline
  implicit def apply[OptionType](value: OptionsType[OptionType]): ValueType[OptionType] = value.asInstanceOf[ValueType[OptionType]]
  @scala.inline
  implicit def fromUndef[OptionType, T](value: js.UndefOr[T])(implicit ev: T => ValueType[OptionType]): ValueType[OptionType] = value.asInstanceOf[ValueType[OptionType]]
}

