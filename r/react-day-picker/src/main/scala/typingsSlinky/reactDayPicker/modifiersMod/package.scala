package typingsSlinky.reactDayPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object modifiersMod {
  type FunctionModifier = js.Function1[/* date */ js.Date, scala.Boolean]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.std.Date
    - typingsSlinky.reactDayPicker.modifiersMod.RangeModifier
    - typingsSlinky.reactDayPicker.modifiersMod.BeforeModifier
    - typingsSlinky.reactDayPicker.modifiersMod.AfterModifier
    - typingsSlinky.reactDayPicker.modifiersMod.BeforeAfterModifier
    - typingsSlinky.reactDayPicker.modifiersMod.DaysOfWeekModifier
    - typingsSlinky.reactDayPicker.modifiersMod.FunctionModifier
    - js.UndefOr[scala.Nothing]
  */
  type Modifier = js.UndefOr[
    typingsSlinky.reactDayPicker.modifiersMod._Modifier | js.Date | typingsSlinky.reactDayPicker.modifiersMod.FunctionModifier
  ]
}
