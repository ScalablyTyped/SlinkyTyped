package typingsSlinky.reactDayPicker.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Date
  - typingsSlinky.reactDayPicker.commonMod.RangeModifier
  - typingsSlinky.reactDayPicker.commonMod.BeforeModifier
  - typingsSlinky.reactDayPicker.commonMod.AfterModifier
  - typingsSlinky.reactDayPicker.commonMod.BeforeAfterModifier
  - typingsSlinky.reactDayPicker.commonMod.DaysOfWeekModifier
  - typingsSlinky.reactDayPicker.commonMod.FunctionModifier
  - js.UndefOr[scala.Nothing]
*/
trait Modifier extends js.Object

object Modifier {
  @scala.inline
  implicit def apply(value: AfterModifier): Modifier = value.asInstanceOf[Modifier]
  @scala.inline
  implicit def apply(value: BeforeAfterModifier): Modifier = value.asInstanceOf[Modifier]
  @scala.inline
  implicit def apply(value: BeforeModifier): Modifier = value.asInstanceOf[Modifier]
  @scala.inline
  implicit def apply(value: js.Date): Modifier = value.asInstanceOf[Modifier]
  @scala.inline
  implicit def apply(value: DaysOfWeekModifier): Modifier = value.asInstanceOf[Modifier]
  @scala.inline
  implicit def apply(value: FunctionModifier): Modifier = value.asInstanceOf[Modifier]
  @scala.inline
  implicit def apply(value: RangeModifier): Modifier = value.asInstanceOf[Modifier]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => Modifier): Modifier = value.asInstanceOf[Modifier]
}

